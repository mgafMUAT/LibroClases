/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2.orm.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import v2.orm.Apoderado;
import v2.orm.ApoderadoDAO;
import v2.orm.Curso;
import v2.orm.CursoDAO;
import v2.orm.Directivo;
import v2.orm.DirectivoDAO;
import v2.orm.Institucion;
import v2.orm.InstitucionDAO;
import v2.orm.Persona;
import v2.orm.PersonaDAO;

/**
 * Ventana para ingresar un nuevo ramo, con respectivo profesor.
 *
 * @author Mauricio Acencio
 */
public class ElegirColegio extends javax.swing.JFrame {
    
    private final Institucion[] colegios;

    /**
     * Creates new form nuevoAlumno
     */
    public ElegirColegio() throws PersistentException {
        colegios = InstitucionDAO.listInstitucionByQuery(null, null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        colNuevo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        nombreCol = new javax.swing.JTextField();
        colExistente = new javax.swing.JRadioButton();
        listaCol = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dirColegio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rutDirColegio = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nuevo Ramo");
        setResizable(false);

        buttonGroup1.add(colNuevo);
        colNuevo.setSelected(true);
        colNuevo.setText("Colegio nuevo:");

        jLabel3.setText("Nombre:");

        buttonGroup1.add(colExistente);
        colExistente.setText("Colegio ya registrado");
        colExistente.setEnabled(colegios.length > 0);

        for (Institucion col : colegios) {
            listaCol.addItem(col.getNombre());
        }
        listaCol.setEnabled(colegios.length > 0);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel5.setText("Rut:");

        jLabel6.setText("Director(a):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rutDirColegio)
                    .addComponent(dirColegio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreCol, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colExistente)
                                .addComponent(btnAceptar)
                                .addComponent(jLabel3)
                                .addComponent(colNuevo)
                                .addComponent(jLabel5)
                                .addComponent(listaCol, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rutDirColegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colExistente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            listo();
        } catch (PersistentException ex) {
            Logger.getLogger(ElegirColegio.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    private void listo() throws PersistentException {
        Principal.iniciarSesion();
        Institucion ins;
        if (colNuevo.isSelected()) {
            ins = new Institucion();
            ins.setNombre(nombreCol.getText());
            Persona p = new Persona();
            p.setNombre(dirColegio.getText());
            p.setRut(rutDirColegio.getText());
            Directivo dir = new Directivo();
            p.setDirectivo(dir);
            dir.setInstitucion_id_fk(ins);
            for (int i = 2; i < 18; i++) {
                Curso cur = CursoDAO.createCurso();
                cur.setNivel((byte) (i / 2));
                cur.setLetra((i % 2 == 0) ? 'A' : 'B');
                cur.setInstitucion_id_fk(ins);
                CursoDAO.save(cur);
            }
            PersonaDAO.save(p);
            DirectivoDAO.save(dir);
            InstitucionDAO.save(ins);
        } else {
            ins = colegios[listaCol.getSelectedIndex()];
        }
        Principal.colegio = ins;
        Apoderado[] apods = ApoderadoDAO.listApoderadoByQuery(null, null);
        Principal.apoderados = new ArrayList<>(Arrays.asList(apods));
        this.dispose();
        new Principal().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElegirColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ElegirColegio().setVisible(true);
                } catch (PersistentException ex) {
                    Logger.getLogger(ElegirColegio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton colExistente;
    private javax.swing.JRadioButton colNuevo;
    private javax.swing.JTextField dirColegio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> listaCol;
    private javax.swing.JTextField nombreCol;
    private javax.swing.JTextField rutDirColegio;
    // End of variables declaration//GEN-END:variables
}
