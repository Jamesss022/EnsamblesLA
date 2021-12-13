package vista;

//librerías de conexión.
import java.sql.Connection;//Conexión a base de datos.
import java.sql.DriverManager;//driver de conexión.
import java.sql.ResultSet;//resultado final de datos.
import java.sql.ResultSetMetaData;//resultado de metadatos.
import java.sql.SQLException;//Tratamiento de errores de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//Fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imágenes
import javax.swing.JOptionPane;//Ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import pojos.Ensambles;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

public class CRUDEnsambles extends javax.swing.JFrame {
    
    Ensambles objEnsambles = new Ensambles();
    
        public Connection cn;
        public Statement stmt;
        public ResultSet rs;
        public CRUDEnsambles() {initComponents();}
        
        //Método para conectar a base de datos
    public void conectarBase(){
        try{//inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdlunaaguirreproyectois","root","");
            JOptionPane.showMessageDialog(null,"Conexion a BD OK\n\nLuna Aguirre");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1:\n"+ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:\n"+e);
        }
    }//termina método conectar.


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCaptura = new javax.swing.JPanel();
        lblIdLA = new javax.swing.JLabel();
        lblMarcaLA = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        txtIdLA = new javax.swing.JTextField();
        txtMarcaLA = new javax.swing.JTextField();
        txtIModeloLA = new javax.swing.JTextField();
        txtPrecioLA = new javax.swing.JTextField();
        btnRegistrarEquipo = new javax.swing.JButton();
        lblAutor1 = new javax.swing.JLabel();
        lblAutor2 = new javax.swing.JLabel();
        lblAutor3 = new javax.swing.JLabel();
        lblAutor4 = new javax.swing.JLabel();
        txtPrecioLA1 = new javax.swing.JTextField();
        txtPrecioLA2 = new javax.swing.JTextField();
        txtPrecioLA3 = new javax.swing.JTextField();
        txtPrecioLA4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        txtLibroEliminar = new javax.swing.JTextField();
        lblCapturaId = new javax.swing.JLabel();
        btnEliminarLibro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        panCaptura.setBackground(new java.awt.Color(255, 102, 0));
        panCaptura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Captura datos de nuevo ensamble", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(204, 0, 204))); // NOI18N

        lblIdLA.setForeground(new java.awt.Color(0, 0, 0));
        lblIdLA.setText("Id:");

        lblMarcaLA.setForeground(new java.awt.Color(0, 0, 0));
        lblMarcaLA.setText("Marca:");

        lblISBN.setForeground(new java.awt.Color(0, 0, 0));
        lblISBN.setText("Modelo:");

        lblAutor.setForeground(new java.awt.Color(0, 0, 0));
        lblAutor.setText("Precio:");

        txtIdLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdLAActionPerformed(evt);
            }
        });

        btnRegistrarEquipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarEquipo.setText("Registrar equipo");
        btnRegistrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEquipoActionPerformed(evt);
            }
        });

        lblAutor1.setForeground(new java.awt.Color(0, 0, 0));
        lblAutor1.setText("Precio:");

        lblAutor2.setForeground(new java.awt.Color(0, 0, 0));
        lblAutor2.setText("Precio:");

        lblAutor3.setForeground(new java.awt.Color(0, 0, 0));
        lblAutor3.setText("Precio:");

        lblAutor4.setForeground(new java.awt.Color(0, 0, 0));
        lblAutor4.setText("Precio:");

        javax.swing.GroupLayout panCapturaLayout = new javax.swing.GroupLayout(panCaptura);
        panCaptura.setLayout(panCapturaLayout);
        panCapturaLayout.setHorizontalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCapturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panCapturaLayout.createSequentialGroup()
                                    .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMarcaLA)
                                        .addComponent(lblIdLA))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMarcaLA)
                                        .addComponent(txtIdLA)))
                                .addGroup(panCapturaLayout.createSequentialGroup()
                                    .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAutor)
                                        .addComponent(lblISBN))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIModeloLA)
                                        .addComponent(txtPrecioLA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panCapturaLayout.createSequentialGroup()
                                .addComponent(lblAutor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecioLA1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panCapturaLayout.createSequentialGroup()
                                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAutor2)
                                    .addComponent(lblAutor3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioLA3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioLA2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panCapturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAutor4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioLA4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCapturaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnRegistrarEquipo)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panCapturaLayout.setVerticalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdLA)
                    .addComponent(txtIdLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarcaLA))
                .addGap(18, 18, 18)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(txtIModeloLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtPrecioLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor1)
                    .addComponent(txtPrecioLA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor2)
                    .addComponent(txtPrecioLA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioLA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAutor3))
                .addGap(18, 18, 18)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor4)
                    .addComponent(txtPrecioLA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEquipo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jtConsulta.setBackground(new java.awt.Color(255, 153, 51));
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Ensamble", "Fabricante", "Modelo", "Precio", "Existencia", "Ram", "Almacenamiento", "Gama"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizar.setText("Visualizar lista de ensambles");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblCapturaId.setText("Captura el ID del ensamble a eliminar");

        btnEliminarLibro.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminarLibro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarLibro.setForeground(new java.awt.Color(204, 0, 204));
        btnEliminarLibro.setText("Eliminar Libro");
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });

        jButton2.setText("Ver reporte PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCapturaId)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarLibro))
                                .addGap(20, 20, 20)))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCapturaId)
                        .addGap(8, 8, 8)
                        .addComponent(txtLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarLibro))
                    .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdLAActionPerformed

    private void btnRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEquipoActionPerformed

        conectarBase();

        //Almacenar los valores de formulario en el objeto.
        objEnsambles.setId_compu(Integer.parseInt(txtIdLA.getText()));
        objEnsambles.setFabricante(txtMarcaLA.getText());
        objEnsambles.setModelo(txtIModeloLA.getText());
        objEnsambles.setPrecio(Integer.parseInt(txtPrecioLA.getText()));
        objEnsambles.setExistencia(Integer.parseInt(txtPrecioLA1.getText()));
        objEnsambles.setRam(txtPrecioLA2.getText());
        objEnsambles.setAlmacenamiento(txtPrecioLA3.getText());
        objEnsambles.setGama(txtPrecioLA4.getText());
        // Variable objeto para registrar un equipo
        String altaEquipo="INSERT INTO ensambles(`id_compu`,`fabricante`,`modelo`,`precio`,`existencia`,`ram`,`almacenamiento`,`gama`) VALUES ('"+objEnsambles.getId_compu()+"','"+objEnsambles.getFabricante()+"','"+objEnsambles.getModelo()+"','"+objEnsambles.getPrecio()+"','"+objEnsambles.getExistencia()+"','"+objEnsambles.getRam()+"','"+objEnsambles.getAlmacenamiento()+"','"+objEnsambles.getGama()+"')";
        // Estructura de tratamiento de errores en ejecución.

        try {
            stmt.executeUpdate(altaEquipo);
            JOptionPane.showMessageDialog(null,"Se registró un equipo de forma exitosa.\n\n"+objEnsambles.getModelo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error 1 de base de datos al general alta equipo\n\n Verifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarEquipoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            conectarBase(); //llamada a la conexión.
            //Declaración de un Objeto de almacenamiento lógico de datos "Modelo de datos".
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsulta.setModel(modeloDatos);

            rs=stmt.executeQuery("SELECT * FROM ENSAMBLES");

            //Imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Id Ensamble");
            modeloDatos.addColumn("Fabricante");
            modeloDatos.addColumn("Modelo");
            modeloDatos.addColumn("Precio");
            modeloDatos.addColumn("Existencia");
            modeloDatos.addColumn("Ram");
            modeloDatos.addColumn("Almacenamiento");
            modeloDatos.addColumn("Gama");

            //Imprimir filas o registros.
            while(rs.next()){ //Inicia while
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                modeloDatos.addRow(fila);
            } //Termina while.

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error 2 de BD Consulta" +e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        int confirmaBaja;
        try {
            conectarBase();
            int ensambleBaja=Integer.parseInt(txtLibroEliminar.getText());

            confirmaBaja=stmt.executeUpdate("DELETE FROM ensambles WHERE ID_COMPU = '"+ensambleBaja+"' ");

            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el ensamble de BD\n\n"+ensambleBaja+"\nVerifica consulta");

            } else {
                JOptionPane.showMessageDialog(null, "Error, no existe Id de Libro en BD\n\n"+ensambleBaja+"\nVerifica consulta");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar baja de BD\n\n"+ex);
        }
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        conectarBase();
        try {
            String rutaReporte="src/reportes/rptEnsambles.jasper";
            JasperPrint rptequipoPDF = JasperFillManager.fillReport(rutaReporte,null,cn);
            JasperViewer ventanaVisor = new JasperViewer(rptequipoPDF,false);
            ventanaVisor.setTitle("Reporte de Assemble Mex Luna");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDEnsambles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDEnsambles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDEnsambles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDEnsambles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDEnsambles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnRegistrarEquipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutor1;
    private javax.swing.JLabel lblAutor2;
    private javax.swing.JLabel lblAutor3;
    private javax.swing.JLabel lblAutor4;
    private javax.swing.JLabel lblCapturaId;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblIdLA;
    private javax.swing.JLabel lblMarcaLA;
    private javax.swing.JPanel panCaptura;
    private javax.swing.JTextField txtIModeloLA;
    private javax.swing.JTextField txtIdLA;
    private javax.swing.JTextField txtLibroEliminar;
    private javax.swing.JTextField txtMarcaLA;
    private javax.swing.JTextField txtPrecioLA;
    private javax.swing.JTextField txtPrecioLA1;
    private javax.swing.JTextField txtPrecioLA2;
    private javax.swing.JTextField txtPrecioLA3;
    private javax.swing.JTextField txtPrecioLA4;
    // End of variables declaration//GEN-END:variables
}
