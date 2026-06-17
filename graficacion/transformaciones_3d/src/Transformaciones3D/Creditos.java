
package Transformaciones3D;


public class Creditos extends javax.swing.JFrame {

    public Creditos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        integrante = new javax.swing.JLabel();
        alumno = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        linea1 = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();
        linea3 = new javax.swing.JLabel();
        linea4 = new javax.swing.JLabel();
        linea5 = new javax.swing.JLabel();
        software = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 10));

        menu.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(51, 51, 51));
        menu.setText("Menú");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 153));
        titulo.setText("Software Utilizado para el Desarrollo de Transformaciones Geometricas 3D");

        integrante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        integrante.setText("Integrante equipo:");

        alumno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alumno.setText("19380527 - Hugo Emiliano Vargas Briones         ");

        copyright.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        copyright.setText("Copyright");

        linea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        linea1.setText("Este software es una obra intelectual creada por alumnos de la carrera de Ingeniería");

        linea2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        linea2.setText("Sistemas Computacionales del Instituto Tecnológico de Ciudad Victoria. Prohibida su");

        linea3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        linea3.setText("reproduccion total o parcial sin consentimiento de los autores. Los autores de este ");

        linea4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        linea4.setText("tipo de producto no se hacen responsables por el uso indebido de esta información.");

        linea5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        linea5.setText("Prohibida su comercialización, ya que es un software de propósito educativo.");

        software.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        software.setText("Apache Netbeans IDE 12.5 (Java)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(software)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(300, 300, 300)
                                    .addComponent(copyright))
                                .addComponent(linea1)
                                .addComponent(linea2)
                                .addComponent(linea3)
                                .addComponent(linea4)
                                .addComponent(linea5))
                            .addComponent(menu))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alumno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(integrante)
                                .addGap(144, 144, 144)))
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titulo)
                .addGap(36, 36, 36)
                .addComponent(software)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(integrante)
                .addGap(18, 18, 18)
                .addComponent(alumno)
                .addGap(28, 28, 28)
                .addComponent(copyright)
                .addGap(18, 18, 18)
                .addComponent(linea1)
                .addGap(8, 8, 8)
                .addComponent(linea2)
                .addGap(8, 8, 8)
                .addComponent(linea3)
                .addGap(8, 8, 8)
                .addComponent(linea4)
                .addGap(8, 8, 8)
                .addComponent(linea5)
                .addGap(40, 40, 40)
                .addComponent(menu)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        this.setVisible(false);
        Menu vista = new Menu();
        vista.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creditos().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alumno;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel integrante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel linea3;
    private javax.swing.JLabel linea4;
    private javax.swing.JLabel linea5;
    public javax.swing.JButton menu;
    private javax.swing.JLabel software;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
