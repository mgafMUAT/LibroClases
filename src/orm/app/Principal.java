/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import orm.*;

/**
 * Ventana principal de la GUI del Libro de clases. Por el momento queda
 * limitado a registrar s\u00f3lo un colegio, pero queda abierto a cambios
 * futuros.
 *
 * @author Mauricio Acencio
 */
public class Principal extends javax.swing.JFrame {
    
    private static PersistentTransaction t;
    private static byte seleccion = 0;
    
    public static int cu_id;

    /**
     * \u00cdndice seleccionado de la lista de ramos del curso actualmente
     * seleccionado.
     */
    public static int numRamo;

    /**
     * \u00cdndice seleccionado de la lista de alumnos del curso actualmente
     * seleccionado.
     */
    public static int numAlumno;

    /**
     * Lista de apoderados, conexi\u00f3n directa.
     */
    public static ArrayList<Apoderado> apoderados;

    /**
     * Colegio ascociado a esta ventana
     */
    public static Institucion colegio;
    private static ArrayList<Estudiante> almns;
    private static ArrayList<Asignatura> ramos;

    /**
     * Creates new form Ventana
     */
    public Principal() throws PersistentException {
        t.commit();
        initComponents();
        if (seleccion > 0) {
            cursos.setSelectedIndex(seleccion);
        }
       setPanel();
    }
    
    public static void iniciarTransaccion() throws PersistentException {
        t = orm.LibroClasePersistentManager.instance().getSession().beginTransaction();
    }
    
    private int getCursoID() throws PersistentException {
        String sel = (String) cursos.getSelectedItem();
        String cond = "letra = '" + sel.charAt(3) + "' and nivel = " + sel.charAt(0)
                + " and institucion_id_fk = " + colegio.getId();
        Curso cur = CursoDAO.loadCursoByQuery(cond, null);
        cu_id = cur.getId();
        return cu_id;
    }
    
    public static Estudiante getEstudianteSeleccionado() {
        return almns.get(numAlumno);
    }
    
    public static Asignatura getRamoSeleccionado() {
        return ramos.get(numRamo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        letraCurso = new javax.swing.ButtonGroup();
        jPanelSeleccionador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listaAlumnos = new javax.swing.JComboBox<>();
        listaRamos = new javax.swing.JComboBox<>();
        cursos = new javax.swing.JComboBox<>();
        jPanelRamo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombreRamo = new javax.swing.JLabel();
        nombreProfesor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloActv = new DefaultListModel();
        listaActividades = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        agregarActividad = new javax.swing.JButton();
        detalleActividad = new javax.swing.JButton();
        jPanelAlumno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreAlumno = new javax.swing.JLabel();
        nombreApoderado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        matriculaAlumno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        agregarAnotacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        modeloAnot = new DefaultListModel();
        listaAnotaciones = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        agregarAsistencia = new javax.swing.JButton();
        verAsistencia = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        jMenuRegistro = new javax.swing.JMenu();
        itemGuardar = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        jMenuNuevo = new javax.swing.JMenu();
        nuevoAlumno = new javax.swing.JMenuItem();
        nuevoRamo = new javax.swing.JMenuItem();
        jMenuInfrome = new javax.swing.JMenu();
        itemInfGeneralApods = new javax.swing.JCheckBoxMenuItem();
        itemInfApodPupilos = new javax.swing.JCheckBoxMenuItem();
        itemInforme = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libro de Clases");
        setResizable(false);

        jLabel1.setText("Curso:");

        listaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlumnosActionPerformed(evt);
            }
        });

        listaRamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaRamosActionPerformed(evt);
            }
        });

        cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º A", "1º B", "2º A", "2º B", "3º A", "3º B", "4º A", "4º B", "5º A", "5º B", "6º A", "6º B", "7º A", "7º B", "8º A", "8º B" }));
        cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSeleccionadorLayout = new javax.swing.GroupLayout(jPanelSeleccionador);
        jPanelSeleccionador.setLayout(jPanelSeleccionadorLayout);
        jPanelSeleccionadorLayout.setHorizontalGroup(
            jPanelSeleccionadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaRamos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelSeleccionadorLayout.setVerticalGroup(
            jPanelSeleccionadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSeleccionadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(listaRamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelRamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Ramo:");

        nombreRamo.setText("jLabel3");

        nombreProfesor.setText("jLabel3");

        jLabel3.setText("Profesor:");

        listaActividades.setModel(modeloActv);
        jScrollPane1.setViewportView(listaActividades);

        jLabel6.setText("Actividades:");

        agregarActividad.setText("Agregar...");
        agregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActividadActionPerformed(evt);
            }
        });

        detalleActividad.setText("Ver más...");
        detalleActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalleActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRamoLayout = new javax.swing.GroupLayout(jPanelRamo);
        jPanelRamo.setLayout(jPanelRamoLayout);
        jPanelRamoLayout.setHorizontalGroup(
            jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelRamoLayout.createSequentialGroup()
                        .addGroup(jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelRamoLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nombreProfesor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRamoLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nombreRamo)))
                            .addComponent(jLabel6)
                            .addGroup(jPanelRamoLayout.createSequentialGroup()
                                .addComponent(agregarActividad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detalleActividad)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRamoLayout.setVerticalGroup(
            jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreRamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProfesor)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarActividad)
                    .addComponent(detalleActividad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Alumno:");

        jLabel5.setText("Apoderado:");

        nombreAlumno.setText("jLabel6");

        nombreApoderado.setText("jLabel7");

        jLabel7.setText("Matrícula:");

        matriculaAlumno.setText("jLabel8");

        jLabel8.setText("Anotaciones / observaciones:");

        agregarAnotacion.setText("Agregar...");
        agregarAnotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAnotacionActionPerformed(evt);
            }
        });

        listaActividades.setModel(modeloAnot);
        jScrollPane3.setViewportView(listaAnotaciones);

        jLabel11.setText("Registro de asistencias:");

        agregarAsistencia.setText("Agregar...");
        agregarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAsistenciaActionPerformed(evt);
            }
        });

        verAsistencia.setText("Ver");
        verAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlumnoLayout = new javax.swing.GroupLayout(jPanelAlumno);
        jPanelAlumno.setLayout(jPanelAlumnoLayout);
        jPanelAlumnoLayout.setHorizontalGroup(
            jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                        .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreAlumno))
                            .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreApoderado))
                            .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriculaAlumno))
                            .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agregarAnotacion)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verAsistencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarAsistencia)))
                .addContainerGap())
        );
        jPanelAlumnoLayout.setVerticalGroup(
            jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(matriculaAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombreApoderado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(agregarAnotacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(agregarAsistencia)
                    .addComponent(verAsistencia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuRegistro.setText("Registro");

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itemGuardar.setText("Guardar");
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        jMenuRegistro.add(itemGuardar);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        jMenuRegistro.add(itemSalir);

        menu.add(jMenuRegistro);

        jMenuNuevo.setText("Nuevo...");

        nuevoAlumno.setText("Alumno...");
        nuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlumnoActionPerformed(evt);
            }
        });
        jMenuNuevo.add(nuevoAlumno);

        nuevoRamo.setText("Ramo...");
        nuevoRamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRamoActionPerformed(evt);
            }
        });
        jMenuNuevo.add(nuevoRamo);

        menu.add(jMenuNuevo);

        jMenuInfrome.setText("Infrome");

        itemInfGeneralApods.setSelected(true);
        itemInfGeneralApods.setText("Informe general para apoderados");
        jMenuInfrome.add(itemInfGeneralApods);

        itemInfApodPupilos.setText("Apoderados con más de un pupilo");
        itemInfApodPupilos.setEnabled(false);
        jMenuInfrome.add(itemInfApodPupilos);

        itemInforme.setText("Generar Infrome(s)");
        itemInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInformeActionPerformed(evt);
            }
        });
        jMenuInfrome.add(itemInforme);

        menu.add(jMenuInfrome);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSeleccionador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSeleccionador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarActionPerformed
        try {
            Transformador.guardar();
        } catch (Exception ex) {
            error(ex);
        }
    }//GEN-LAST:event_itemGuardarActionPerformed

    private void itemInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInformeActionPerformed
//        try {
//            if (itemInfGeneralApods.isSelected()) {
//                Transformador.generarInforme(1);
//            }
//            if (itemInfApodPupilos.isSelected()) {
//                Transformador.generarInforme(2);
//            }
//        } catch (Exception e) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
//        }

    }//GEN-LAST:event_itemInformeActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void nuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlumnoActionPerformed
        agregarAlumno();
    }//GEN-LAST:event_nuevoAlumnoActionPerformed

    private void nuevoRamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRamoActionPerformed
        try {
            agregarRamo();
        } catch (PersistentException ex) {
            error(ex);
        }
    }//GEN-LAST:event_nuevoRamoActionPerformed

    private void agregarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActividadActionPerformed
        agregarActividad();
    }//GEN-LAST:event_agregarActividadActionPerformed

    private void detalleActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalleActividadActionPerformed
        if (listaActividades.getSelectedIndex() > -1) {
            new VerActividad(listaActividades.getSelectedIndex()).setVisible(true);
        }
    }//GEN-LAST:event_detalleActividadActionPerformed

    private void listaRamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaRamosActionPerformed
        numRamo = listaRamos.getSelectedIndex();
        setTextoRamo();
    }//GEN-LAST:event_listaRamosActionPerformed

    private void agregarAnotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAnotacionActionPerformed
        agregarAnotacion();
    }//GEN-LAST:event_agregarAnotacionActionPerformed

    private void agregarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAsistenciaActionPerformed
        agregarAsistencia();
    }//GEN-LAST:event_agregarAsistenciaActionPerformed

    private void verAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAsistenciaActionPerformed
        new VerAsistencia().setVisible(true);
    }//GEN-LAST:event_verAsistenciaActionPerformed

    private void listaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlumnosActionPerformed
        numAlumno = listaAlumnos.getSelectedIndex();
        setTextoAlumno();
    }//GEN-LAST:event_listaAlumnosActionPerformed

    private void cursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursosActionPerformed
        seleccion = (byte) cursos.getSelectedIndex();
        try {
            setPanel();
        } catch (PersistentException ex) {
            error(ex);
        }
    }//GEN-LAST:event_cursosActionPerformed

    private void agregarAlumno() {
        this.dispose();
        new NuevoAlumno().setVisible(true);
    }

    private void agregarRamo() throws PersistentException {
        this.dispose();
        new NuevoRamo().setVisible(true);
    }

    private void agregarActividad() {
        this.dispose();
        new NuevaActividad().setVisible(true);
    }

    private void agregarAnotacion() {
        this.dispose();
        new NuevaAnotacion().setVisible(true);
    }

    private void agregarAsistencia() {
        this.dispose();
        new NuevaAsistencia().setVisible(true);
    }
    
    private void setAlumnos() throws PersistentException {
        int cid = getCursoID();
        Curso_estudiante[] ces = Curso_estudianteDAO.listCurso_estudianteByQuery("curso_id_fk = " + cid, null);
        almns = new ArrayList<>();
        for (Curso_estudiante ce : ces) {
            almns.add(ce.getEstudiante_id_fk());
        }
    }
    
    private void setRamos() throws PersistentException {
        int cid = getCursoID();
        Asignatura[] asigs = AsignaturaDAO.listAsignaturaByQuery("curso_id_fk = " + cid, null);
        ramos = new ArrayList<>(Arrays.asList(asigs));
    }

    private void setPanel() throws PersistentException {
        listaAlumnos.removeAllItems();
        setAlumnos();
        listaAlumnos.setEnabled(!almns.isEmpty());
        almns.forEach((alumno) -> {
            listaAlumnos.addItem(alumno.getPersona_id_fk().getNombre());
        });
        listaAlumnos.setSelectedIndex(almns.isEmpty() ? -1 : numAlumno);
        listaRamos.removeAllItems();
        setRamos();
        listaRamos.setEnabled(!ramos.isEmpty());
        ramos.forEach((ramo) -> {
            listaRamos.addItem(ramo.getNombre());
        });
        listaRamos.setSelectedIndex(ramos.isEmpty() ? -1 : numRamo);
        setTextoRamo();
        setTextoAlumno();
    }

    private void setTextoRamo() {
        modeloActv.clear();
        if (listaRamos.getSelectedIndex() == -1) {
            nombreRamo.setText("");
            nombreProfesor.setText("");
            detalleActividad.setEnabled(false);
            agregarActividad.setEnabled(false);
            nuevoAlumno.setEnabled(false);
        } else {
            Asignatura r = ramos.get(numRamo);
            nombreRamo.setText(r.getNombre());
            nombreProfesor.setText(r.getProfesorid_pk().getPersona_id_fk().getNombre());
            for (Actividad actv : r.actividad.toArray()) {
                modeloActv.addElement(actv.getNombre());
            }
            listaActividades.setModel(modeloActv);
            detalleActividad.setEnabled(!r.actividad.isEmpty());
            agregarActividad.setEnabled(true);
            nuevoAlumno.setEnabled(true);
        }
    }

    private void setTextoAlumno() {
        modeloAnot.removeAllElements();
        if (listaAlumnos.getSelectedIndex() == -1) {
            nombreAlumno.setText("");
            matriculaAlumno.setText("");
            nombreApoderado.setText("");
            agregarAnotacion.setEnabled(false);
            verAsistencia.setEnabled(false);
            agregarAsistencia.setEnabled(false);
        } else {
            Estudiante al = almns.get(numAlumno);
            nombreAlumno.setText(al.getPersona_id_fk().getNombre());
            matriculaAlumno.setText(al.getMatricula());
            nombreApoderado.setText(al.getApoderado_id_fk().getPersona_id_fk().getNombre());
            for (Anotaciones anot : al.anotaciones.toArray()) {
                String anotacion = (anot.getEsPositiva() ? "+" : "-") + ": "
                        + anot.getObservacion();
                modeloAnot.addElement(anotacion);
            }
            listaAnotaciones.setModel(modeloAnot);
            agregarAnotacion.setEnabled(true);
            verAsistencia.setEnabled(!al.asistencia.isEmpty());
            agregarAsistencia.setEnabled(true);
        }
    }
    
    public static void error(Exception pe){
        pe.printStackTrace();
        try {
            t.rollback();
        } catch (PersistentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//
//        seleccion = 0;
//        numRamo = 0;
//        apoderados = new ArrayList<>();
//        if (new java.io.File("data\\libro.xml").exists()) {
//            String info = "Existe un registro anterior.\n¿Desea poblarlo ahora?";
//            if (JOptionPane.showConfirmDialog(null, info, "Carga", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//                try {
//                    SAXParser sp = SAXParserFactory.newInstance().newSAXParser();
//                    Poblador p = new Poblador();
//                    sp.parse("data\\libro.xml", p);
//                } catch (Exception ex) {
//                    error(ex);
//                }
//            }
//        }
//        if (colegio == null) {
//            colegio = new Colegio("GeorgeChaytor", "Av. Gabriela Mistra 43589");
//            colegio.generarCursos();
//        }
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    new Principal().setVisible(true);
//                } catch (PersistentException ex) {
//                    error(ex);
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarActividad;
    private javax.swing.JButton agregarAnotacion;
    private javax.swing.JButton agregarAsistencia;
    private javax.swing.JComboBox<String> cursos;
    private javax.swing.JButton detalleActividad;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JCheckBoxMenuItem itemInfApodPupilos;
    private javax.swing.JCheckBoxMenuItem itemInfGeneralApods;
    private javax.swing.JMenuItem itemInforme;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenuInfrome;
    private javax.swing.JMenu jMenuNuevo;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JPanel jPanelAlumno;
    private javax.swing.JPanel jPanelRamo;
    private javax.swing.JPanel jPanelSeleccionador;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup letraCurso;
    private javax.swing.JList<String> listaActividades;
    private DefaultListModel modeloActv;
    private javax.swing.JComboBox<String> listaAlumnos;
    private javax.swing.JList<String> listaAnotaciones;
    private DefaultListModel modeloAnot;
    private javax.swing.JComboBox<String> listaRamos;
    private javax.swing.JLabel matriculaAlumno;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel nombreAlumno;
    private javax.swing.JLabel nombreApoderado;
    private javax.swing.JLabel nombreProfesor;
    private javax.swing.JLabel nombreRamo;
    private javax.swing.JMenuItem nuevoAlumno;
    private javax.swing.JMenuItem nuevoRamo;
    private javax.swing.JButton verAsistencia;
    // End of variables declaration//GEN-END:variables
}
