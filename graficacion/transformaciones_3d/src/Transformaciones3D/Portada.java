
package Transformaciones3D;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Portada extends javax.swing.JFrame {
    
    public Portada() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    class dosd extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint (Graphics g)
        {
        imagen = new ImageIcon(getClass().getResource("")).getImage();
        g.drawImage(imagen,0,0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        BtnAv = new javax.swing.JButton();
        integrante = new javax.swing.JLabel();
        integrante1 = new javax.swing.JLabel();
        integrante2 = new javax.swing.JLabel();
        integrante3 = new javax.swing.JLabel();
        integrante4 = new javax.swing.JLabel();
        integrante5 = new javax.swing.JLabel();
        integrante6 = new javax.swing.JLabel();
        integrante7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        BtnAv.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        BtnAv.setText("Menú");
        BtnAv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvActionPerformed(evt);
            }
        });

        integrante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        integrante.setText("Tecnológico Nacional de México");

        integrante1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        integrante1.setText("Instituto Tecnologico de Ciudad Victoria");

        integrante2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        integrante2.setText("Ingeniería en Sistemas Computacionales");

        integrante3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        integrante3.setText("Graficación");

        integrante4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        integrante4.setText("Transformaciones Geométricas 3D");

        integrante5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        integrante5.setText("Asesor: Jose Lino Hernandez Omaña");

        integrante6.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        integrante6.setText("6 de Diciembre, 2021");

        integrante7.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        integrante7.setText("Ciudad Victoria, Tamaulipas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(integrante7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(integrante6)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(integrante3)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(integrante)
                            .addComponent(integrante1)
                            .addComponent(integrante2))
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(integrante5)
                            .addComponent(integrante4))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAv, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(integrante)
                .addGap(26, 26, 26)
                .addComponent(integrante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integrante2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integrante3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integrante4)
                .addGap(23, 23, 23)
                .addComponent(integrante5)
                .addGap(55, 55, 55)
                .addComponent(BtnAv, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(integrante7)
                    .addComponent(integrante6))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvActionPerformed
        this.setVisible(false);
        Menu vista = new Menu();
        vista.setVisible(true);
    }//GEN-LAST:event_BtnAvActionPerformed

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
                new Portada().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAv;
    private javax.swing.JLabel integrante;
    private javax.swing.JLabel integrante1;
    private javax.swing.JLabel integrante2;
    private javax.swing.JLabel integrante3;
    private javax.swing.JLabel integrante4;
    private javax.swing.JLabel integrante5;
    private javax.swing.JLabel integrante6;
    private javax.swing.JLabel integrante7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
