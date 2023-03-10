/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListifyUI;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public Start() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/project/Saly-26.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Head = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        minusButton = new javax.swing.JLabel();
        bgHead = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        Hero = new javax.swing.JPanel();
        BgBody = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Head.setLayout(null);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Close.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        Head.add(closeButton);
        closeButton.setBounds(760, 0, 30, 30);

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Minus.png"))); // NOI18N
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusButtonMouseClicked(evt);
            }
        });
        Head.add(minusButton);
        minusButton.setBounds(730, 0, 28, 30);

        bgHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/head.png"))); // NOI18N
        bgHead.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Head.add(bgHead);
        bgHead.setBounds(0, -20, 800, 60);

        getContentPane().add(Head);
        Head.setBounds(0, 0, 800, 35);

        Body.setLayout(null);

        Hero.setLayout(null);

        Loading.setForeground(new java.awt.Color(102, 0, 255));
        Hero.add(Loading);
        Loading.setBounds(80, 350, 650, 20);

        BgBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/bg-start.png"))); // NOI18N
        BgBody.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Hero.add(BgBody);
        BgBody.setBounds(0, 0, 800, 470);

        Body.add(Hero);
        Hero.setBounds(0, 0, 800, 470);

        getContentPane().add(Body);
        Body.setBounds(-1, 30, 830, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusButtonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        Start st = new Start();
        st.setVisible(true);

        Main login = new Main();
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(60);
                st.Loading.setValue(i);
            }

        } catch (Exception e) {
        }

        st.setVisible(false);
        login.setVisible(true);

        st.dispose();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BgBody;
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel Hero;
    public static final javax.swing.JProgressBar Loading = new javax.swing.JProgressBar();
    private javax.swing.JLabel bgHead;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel minusButton;
    // End of variables declaration//GEN-END:variables

}
