/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.Helper;

/**
 *
 * @author walbonis1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
     String ruta;
    public Principal() {
        initComponents();
          ruta = "src/datos/personas.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpciones = new javax.swing.JMenu();
        mnAgregar = new javax.swing.JMenuItem();
        mnReportes = new javax.swing.JMenu();
        mnListados = new javax.swing.JMenu();
        mnListadoporsexo = new javax.swing.JMenuItem();
        mnListadoPersona = new javax.swing.JMenuItem();
        mnCantiidades = new javax.swing.JMenu();
        mnCantidadPerosnasIngresadas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/805175.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 500, 420));

        mnOpciones.setText("Opciones");
        mnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpcionesActionPerformed(evt);
            }
        });

        mnAgregar.setText("Agregar");
        mnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarActionPerformed(evt);
            }
        });
        mnOpciones.add(mnAgregar);

        mnReportes.setText("Reportes");

        mnListados.setText("Listados");

        mnListadoporsexo.setText("Listado por sexo");
        mnListadoporsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoporsexoActionPerformed(evt);
            }
        });
        mnListados.add(mnListadoporsexo);

        mnListadoPersona.setText("Listado por Persona");
        mnListadoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListadoPersonaActionPerformed(evt);
            }
        });
        mnListados.add(mnListadoPersona);

        mnReportes.add(mnListados);

        mnCantiidades.setText("Cantidades");

        mnCantidadPerosnasIngresadas.setText("Cantidad de personas ingresadas");
        mnCantidadPerosnasIngresadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCantidadPerosnasIngresadasActionPerformed(evt);
            }
        });
        mnCantiidades.add(mnCantidadPerosnasIngresadas);

        mnReportes.add(mnCantiidades);

        mnOpciones.add(mnReportes);
        mnOpciones.add(jSeparator1);

        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        mnOpciones.add(mnSalir);

        jMenuBar1.add(mnOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(516, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarActionPerformed
        Agregar a = new Agregar(this, true);
     a.setVisible(true);
    }//GEN-LAST:event_mnAgregarActionPerformed

    private void mnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpcionesActionPerformed
    
    }//GEN-LAST:event_mnOpcionesActionPerformed

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_mnSalirActionPerformed

    private void mnListadoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoPersonaActionPerformed
       ListadoCompleto lc = new ListadoCompleto(this,true);
        lc.setVisible(true);
    }//GEN-LAST:event_mnListadoPersonaActionPerformed

    private void mnListadoporsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListadoporsexoActionPerformed
        ListadoPorSexo lps = new ListadoPorSexo(this,true);
       lps.setVisible(true);
       
    }//GEN-LAST:event_mnListadoporsexoActionPerformed

    private void mnCantidadPerosnasIngresadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCantidadPerosnasIngresadasActionPerformed
        int cont;
        cont = Helper.traerDatos(ruta).size();
        Helper.mensaje(this, "El número de personas ingresadas es: "+cont, 1);
    }//GEN-LAST:event_mnCantidadPerosnasIngresadasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnAgregar;
    private javax.swing.JMenuItem mnCantidadPerosnasIngresadas;
    private javax.swing.JMenu mnCantiidades;
    private javax.swing.JMenuItem mnListadoPersona;
    private javax.swing.JMenuItem mnListadoporsexo;
    private javax.swing.JMenu mnListados;
    private javax.swing.JMenu mnOpciones;
    private javax.swing.JMenu mnReportes;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables
}
