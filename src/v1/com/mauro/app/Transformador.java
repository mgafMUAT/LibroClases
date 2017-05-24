package v1.com.mauro.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.orm.PersistentException;
import v1.com.mauro.librodeclases.*;

/**
 * Clase creada para guardar / transformar los datos almacenados en documentos
 * varios de texto.
 *
 * @author Mauricio Acencio
 * @see Poblador
 */
public class Transformador {

    /**
     * Guarda el registro actual del libro en archivos xml y json.
     *
     * @throws Exception Errores posibles de m\u00e9todoa implementados
     */
    public static void guardar() throws Exception {
        String nl = System.getProperty("line.separator");
        BufferedWriter gxml = new BufferedWriter(new FileWriter("data\\libro.xml"));
        Colegio col = Principal.colegio;
        gxml.write("<?xml version=\"1.0\"?>" + nl);
        gxml.write("<registro>" + nl);
        gxml.write("    <colegio nombre=\"" + col.getNombre() + "\" direccion=\""
                + col.getDireccion() + "\">" + nl);
        for (Curso cur : col.cursos) {
            gxml.write("        <curso nivel=\"" + cur.getNivel() + "\" letra=\""
                    + cur.getLetra() + "\">" + nl);
            for (Ramo ramo : cur.ramos) {
                Profesor p = ramo.getProfesor();
                gxml.write("            <profesor nombre=\"" + p.getNombre()
                        + "\" rut=\"" + p.getRut() + "\"/>" + nl);
                gxml.write("            <ramo nombre=\"" + ramo.getNombre()
                        + "\">" + nl);
                for (Actividad actv : ramo.planificacion) {
                    gxml.write("                <actividad nombre=\""
                            + actv.getNombre() + "\">" + nl);
                    gxml.write("                    <tipo>" + actv.getTipo()
                            + "</tipo>" + nl);
                    gxml.write("                    <descripcion>"
                            + actv.getDescripcion() + "</descripcion>" + nl);
                    String[] f = actv.getFecha();
                    gxml.write("                    <fechaA>" + f[0] + "-" + f[1]
                            + "-" + f[2] + "</fechaA>" + nl);
                    gxml.write("                    <evaluado>" + actv.isEvaluado()
                            + "</evaluado>" + nl);
                    gxml.write("                </actividad>" + nl);
                }
                gxml.write("            </ramo>" + nl);
            }
            for (Alumno al : cur.alumnos) {
                gxml.write("            <alumno>" + nl);
                Apoderado ap = al.apoderado;
                gxml.write("                <apoderado nombre=\"" + ap.getNombre()
                        + "\" rut=\"" + ap.getRut() + "\"/>" + nl);
                gxml.write("                <nombre>" + al.getNombre() + "</nombre>"
                        + nl);
                gxml.write("                <rut>" + al.getRut() + "</rut>" + nl);
                gxml.write("                <ingreso>" + al.getIngreso()
                        + "</ingreso>" + nl);
                gxml.write("                <anotaciones>" + nl);
                for (Anotacion an : al.anotaciones) {
                    gxml.write("                    <anotacion p=\"" + an.
                            esPositiva() + "\">" + an.getObservacion() + "</anot"
                            + "acion>" + nl);
                }
                gxml.write("                </anotaciones>" + nl);
                gxml.write("                <asistencia>" + nl);
                for (Asistencia reg : al.registro) {
                    String[] f = reg.getFecha();
                    gxml.write("                    <fecha presente=\""
                            + reg.getPresente() + "\">" + f[0]
                            + "-" + f[1] + "-" + f[2]
                            + "</fecha>" + nl);
                }
                gxml.write("                </asistencia>" + nl);
                gxml.write("                <notas>" + nl);
                for (Float nota : al.notas) {
                    gxml.write("                    <nota>" + nota + "</nota>" + nl);
                }
                gxml.write("                </notas>" + nl);
                gxml.write("            </alumno>" + nl);
            }
            gxml.write("        </curso>" + nl);
        }
        gxml.write("    </colegio>" + nl);
        gxml.write("</registro>");
        gxml.close();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer(new StreamSource("data\\"
                + "style\\xml2json.xslt"));
        transformer.transform(new StreamSource("data\\libro.xml"), new StreamResult(
                "data\\libro.json"));
        pasarABD();
    }
    
    private static void pasarABD() throws PersistentException{
        org.orm.PersistentTransaction t = LibroClasesPersistentManager.instance().getSession().beginTransaction();
        Colegio col = Principal.colegio;
        try {
            agregarABD(col);
            for (Apoderado apoderado : Principal.apoderados) {
                agregarABD(apoderado);
            }
            for (Curso cur : col.cursos) {
                for (Ramo ramo : cur.ramos) {
                    for (Actividad actv : ramo.planificacion) {
                        agregarABD(actv);
                    }
                    agregarABD(ramo);
                }
                for (Alumno al : cur.alumnos) {
                    for (Anotacion anot : al.anotaciones) {
                        agregarABD(anot);
                    }
                    for (Asistencia asist : al.registro) {
                        agregarABD(asist);
                    }
                    agregarABD(al);
                }
                agregarABD(cur);
            }
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
        }
    }
    
    private static void agregarABD(Colegio col) throws PersistentException {
        String query = "ID = " + Integer.toString(col.getID());
        Colegio[] existente = ColegioDAO.listColegioByQuery(query, null);
        if (existente.length == 0) {
            ColegioDAO.save(col);
        }
    }
    
    private static void agregarABD(Apoderado ap) throws PersistentException {
        String query = "ID = " + Integer.toString(ap.getID());
        Apoderado[] existente = ApoderadoDAO.listApoderadoByQuery(query, null);
        if (existente.length == 0) {
            ApoderadoDAO.save(ap);
        }
    }
    
    private static void agregarABD(Curso cur) throws PersistentException {
        String query = "ID = " + Integer.toString(cur.getID());
        Curso[] existente = CursoDAO.listCursoByQuery(query, null);
        if (existente.length == 0) {
            CursoDAO.save(cur);
        }
    }
    
    private static void agregarABD(Alumno al) throws PersistentException {
        String query = "ID = " + Integer.toString(al.getID());
        Alumno[] existente = AlumnoDAO.listAlumnoByQuery(query, null);
        if (existente.length == 0) {
            AlumnoDAO.save(al);
            for (Float nota1 : al.notas) {
                Nota nota = new Nota();
                nota.setNota(nota1);
                NotaDAO.save(nota);
            }
        }
    }
    
    private static void agregarABD(Ramo r) throws PersistentException {
        String query = "ID = " + Integer.toString(r.getID());
        Ramo[] existente = RamoDAO.listRamoByQuery(query, null);
        if (existente.length == 0) {
            RamoDAO.save(r);
        }
    }
    
    private static void agregarABD(Actividad actv) throws PersistentException {
        String query = "ID = " + Integer.toString(actv.getID());
        Actividad[] existente = ActividadDAO.listActividadByQuery(query, null);
        if (existente.length == 0) {
            ActividadDAO.save(actv);
        }
    }
    
    private static void agregarABD(Anotacion anot) throws PersistentException {
        String query = "ID = " + Integer.toString(anot.getID());
        Anotacion[] existente = AnotacionDAO.listAnotacionByQuery(query, null);
        if (existente.length == 0) {
            AnotacionDAO.save(anot);
        }
    }
    
    private static void agregarABD(Asistencia as) throws PersistentException {
        String query = "ID = " + Integer.toString(as.getID());
        Asistencia[] existente = AsistenciaDAO.listAsistenciaByQuery(query, null);
        if (existente.length == 0) {
            AsistenciaDAO.save(as);
        }
    }

    /**
     * Genera un informe del tipo especificado a partir del registro actual a
     * varios formatos.
     *
     * @param n Nº que representa el tipo de informe a generar: 1 = informe para
     * apoderados, 2 = informe sobre apoderados con m\u00e1s de un pupilo
     * @throws Exception Errores posibles de m\u00e9todoa implementados
     */
    public static void generarInforme(int n) throws Exception {
        String nl = System.getProperty("line.separator");
        String name = "data\\informe" + n;
        BufferedWriter gxml = new BufferedWriter(new FileWriter(name + ".xml"));
        Colegio col = Principal.colegio;
        ArrayList<Apoderado> aps = Principal.apoderados;
        gxml.write("<?xml version=\"1.0\"?>" + nl);
        gxml.write("<informe>" + nl);
        if (n == 1) {
            for (Apoderado ap : aps) {
                gxml.write("    <apoderado nombre=\"" + ap.getNombre() + "\" rut"
                        + "=\"" + ap.getRut() + "\">" + nl);
                for (Alumno al : ap.pupilos) {
                    gxml.write("        <alumno nombre=\"" + al.getNombre() + "\">"
                            + nl);
                    for (Ramo ramo : al.curso.ramos) {
                        for (Actividad actv : ramo.planificacion) {
                            gxml.write("                    <actividad nombre=\""
                                    + actv.getNombre() + "\">" + nl);
                            gxml.write("                        <ramo>" + ramo.getNombre()
                                    + "</ramo>" + nl);
                            gxml.write("                        <tipo>" + actv.getTipo()
                                    + "</tipo>" + nl);
                            gxml.write("                        <descripcion>" + nl);
                            gxml.write("                            " + actv.getDescripcion() + nl);
                            gxml.write("                        </descripcion>" + nl);
                            String[] f = actv.getFecha();
                            gxml.write("                        <fechaA>" + f[0]
                                    + "-" + f[1] + "-" + f[2] + "</fechaA>" + nl);
                            gxml.write("                        <evaluado>"
                                    + (actv.isEvaluado() ? "si" : "no") + "</evaluado>" + nl);
                            gxml.write("                    </actividad>" + nl);
                        }
                    }
                    String prom = null;
                    if (!al.notas.isEmpty()) {
                        gxml.write("            <notas>" + nl);
                        float sum = 0;
                        for (Float nota : al.notas) {
                            gxml.write("                <nota>" + nota + "</nota>" + nl);
                            sum += nota;
                        }
                        prom = String.format("%.1f", sum / al.notas.size());
                        boolean apr = prom.compareTo("4.0") < 0;
                        gxml.write("                <promedio aprueba=\"" + (apr
                                ? "si" : "no") + "\">" + prom + "</promedio>" + nl);
                        gxml.write("            </notas>" + nl);
                    }
                    for (Anotacion anot : al.anotaciones) {
                        gxml.write("                <anotacion>" + nl);
                        gxml.write("                    " + anot + nl);
                        gxml.write("                </anotacion>" + nl);
                    }
                    gxml.write("            <asistencia>" + nl);
                    if (!al.registro.isEmpty()) {
                        int pres = 0;
                        for (Asistencia reg : al.registro) {
                            String[] f = reg.getFecha();
                            gxml.write("                    <fecha presente=\""
                                    + (reg.getPresente() ? "presente" : "ausente")
                                    + "\">" + f[0] + "-" + f[1] + "-" + f[2]
                                    + "</fecha>" + nl);
                            if (reg.getPresente()) {
                                pres++;
                            }
                        }
                        prom = String.format("%.0f", (float) pres * 100 / al.registro.size());
                        gxml.write("                <porcentaje>" + prom
                                + "%</porcentaje>" + nl);
                        gxml.write("            </asistencia>" + nl);
                    }
                    gxml.write("        </alumno>" + nl);
                }
                gxml.write("    </apoderado>" + nl);
            }
        } else if (n == 2) {
            for (Apoderado ap : aps) {
                if (ap.pupilos.size() > 1) {
                    gxml.write("    <apoderado nombre=\"" + ap.getNombre() + "\" rut"
                            + "=\"" + ap.getRut() + "\"/>" + nl);
                    for (Alumno al : ap.pupilos) {
                        gxml.write("        <alumno>" + al.getNombre() + "</alumno>"
                                + nl);
                    }
                    gxml.write("    </apoderado>" + nl);
                }
            }
        }
        gxml.write("</informe>" + nl);
        gxml.close();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer(new StreamSource("data\\"
                + "style\\xml2json.xslt"));
        transformer.transform(new StreamSource(name + ".xml"), new StreamResult(
                name + ".json"));
        tf = TransformerFactory.newInstance();
        transformer = tf.newTransformer(new StreamSource("data\\"
                + "style\\informe" + n + "html.xsl"));
        transformer.transform(new StreamSource(name + ".xml"), new StreamResult(
                name + ".html"));
        tf = TransformerFactory.newInstance();
        transformer = tf.newTransformer(new StreamSource("data\\"
                + "style\\informe" + n + "doc.xsl"));
        transformer.transform(new StreamSource(name + ".xml"), new StreamResult(
                name + ".doc"));
        tf = TransformerFactory.newInstance();
        transformer = tf.newTransformer(new StreamSource("data\\"
                + "style\\informe" + n + "xls.xsl"));
        transformer.transform(new StreamSource(name + ".xml"), new StreamResult(
                name + ".xls"));
    }
}
