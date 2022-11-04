/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Controller;

import Dao.MemberM.implMember;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kai
 */
public class memberUI extends javax.swing.JPanel {

    /**
     * Creates new form memberUI
     */
    public memberUI() {
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

        memberPanel1 = new javax.swing.JPanel();
        registerbt = new javax.swing.JButton();
        loginbt = new javax.swing.JButton();
        passwordTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        memberPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        memberPanel3 = new javax.swing.JPanel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberPanel1.setBackground(new java.awt.Color(0, 109, 119));
        memberPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerbt.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        registerbt.setText("成為會員");
        memberPanel1.add(registerbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 100, 40));

        loginbt.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        loginbt.setText("登入");
        loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtActionPerformed(evt);
            }
        });
        memberPanel1.add(loginbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 100, 60));

        passwordTF.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        passwordTF.setText("請輸入密碼");
        passwordTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTFMouseClicked(evt);
            }
        });
        memberPanel1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 200, 50));

        usernameTF.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        usernameTF.setText("請輸入帳號");
        usernameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTFMouseClicked(evt);
            }
        });
        memberPanel1.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 200, 50));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 233, 251));
        jLabel1.setText("會員登入");
        memberPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        add(memberPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 770, 600));

        memberPanel2.setBackground(new java.awt.Color(226, 149, 120));
        memberPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/res.png"))); // NOI18N
        memberPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel4.setText("LazyDay");
        memberPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel5.setText("restaurant");
        memberPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 109, 119));
        jLabel6.setText("本餐廳採取會員制");
        memberPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 109, 119));
        jLabel7.setText("新菜色陸續上市");
        memberPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 109, 119));
        jLabel8.setText("加入會員即享有會員優惠");
        memberPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 109, 119));
        jLabel10.setText("感謝您的光臨");
        memberPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        add(memberPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 340, 600));

        memberPanel3.setBackground(new java.awt.Color(227, 217, 133));

        javax.swing.GroupLayout memberPanel3Layout = new javax.swing.GroupLayout(memberPanel3);
        memberPanel3.setLayout(memberPanel3Layout);
        memberPanel3Layout.setHorizontalGroup(
            memberPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        memberPanel3Layout.setVerticalGroup(
            memberPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        add(memberPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTFMouseClicked
    usernameTF.setText("");
    }//GEN-LAST:event_usernameTFMouseClicked

    private void passwordTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTFMouseClicked
    passwordTF.setText("");
    }//GEN-LAST:event_passwordTFMouseClicked

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtActionPerformed
        /*1.username,password-->getText()
        2.--->new implmember().query(帳號,密碼)
        3.true-->porderUI
        4.false->訊息方塊
        */
       String Username=usernameTF.getText();
       String Password=passwordTF.getText();
       
       if(new implMember().query(Username, Password))
       {
          
       }
       else
       {
           /*JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "帳號密碼有誤,請先註冊");*/
           JFrame frame = new JFrame();
            int result = JOptionPane.showConfirmDialog
            (frame,"您是否要註冊？", "輸入帳號密碼有誤",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
            
            }else if (result == JOptionPane.NO_OPTION){
            
            }
        
       } 
    }//GEN-LAST:event_loginbtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton loginbt;
    private javax.swing.JPanel memberPanel1;
    private javax.swing.JPanel memberPanel2;
    private javax.swing.JPanel memberPanel3;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton registerbt;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}