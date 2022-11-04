
package Controller;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class menuUI extends javax.swing.JPanel {
       
    
    public menuUI() {
        initComponents();
       
    }
    
    //顯示點餐的方法
    void showtemporder()
    {{showorder.setText("目前點餐:"
                       + "\n帶骨牛小排:\t"+beefnu.getValue()+"個"
                       +"\n戰斧豬排佐鮮蔬:\t"+porknu.getValue()+"個"
                       +"\n雞腿排佐鮮蝦:\t"+chickennu.getValue()+"個"
                       +"\n抹茶鬆餅:\t"+mochanu.getValue()+"個"
                       +"\n泰奶鬆餅:\t"+milkteanu.getValue()+"個"
                       +"\n芒果鬆餅:\t"+mangonu.getValue()+"個");
    
    showorder.append("\n小計:"+((int)beefnu.getValue()*480+ (int)porknu.getValue()*400+(int)chickennu.getValue()*350+
            (int)mochanu.getValue()*250+(int)milkteanu.getValue()*220+(int)mangonu.getValue()*220));}
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        beefimg = new javax.swing.JLabel();
        mangoimg = new javax.swing.JLabel();
        porkimg = new javax.swing.JLabel();
        mochaimg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        chickenimg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        milkteaimg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        porknu = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        beefnu = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        chickennu = new javax.swing.JSpinner();
        mochanu = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        milkteanu = new javax.swing.JSpinner();
        mangonu = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        showorder = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(216, 154, 158));
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(216, 154, 158));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 3540));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        beefimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/beef.png"))); // NOI18N
        jPanel3.add(beefimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        mangoimg.setForeground(new java.awt.Color(230, 217, 184));
        mangoimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mango.png"))); // NOI18N
        jPanel3.add(mangoimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2940, -1, -1));

        porkimg.setForeground(new java.awt.Color(230, 217, 184));
        porkimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pork.png"))); // NOI18N
        jPanel3.add(porkimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        mochaimg.setForeground(new java.awt.Color(230, 217, 184));
        mochaimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mocha.png"))); // NOI18N
        jPanel3.add(mochaimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(230, 217, 184));
        jLabel12.setText("抹茶鬆餅  $250");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 217, 184));
        jLabel3.setText("芒果鬆餅  $220");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2900, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(230, 217, 184));
        jLabel14.setText("泰奶鬆餅  $220");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        jLabel9.setText("鬆餅");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1480, 120, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(230, 217, 184));
        jLabel8.setText("蒜酥雞腿排佐鮮蝦  $350");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1020, -1, -1));

        chickenimg.setForeground(new java.awt.Color(230, 217, 184));
        chickenimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chicken.png"))); // NOI18N
        jPanel3.add(chickenimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1060, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 217, 184));
        jLabel6.setText("戰斧豬排佐鮮蔬  $400");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 217, 184));
        jLabel4.setText("帶骨牛小排佐鮮蝦  $480");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        milkteaimg.setForeground(new java.awt.Color(230, 217, 184));
        milkteaimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/milktea.png"))); // NOI18N
        jPanel3.add(milkteaimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        jLabel1.setText("主餐");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        porknu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        porknu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                porknuStateChanged(evt);
            }
        });
        jPanel3.add(porknu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 760, 80, 60));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("數量");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 720, -1, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("數量");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        beefnu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        beefnu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                beefnuStateChanged(evt);
            }
        });
        jPanel3.add(beefnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 80, 60));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("數量");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1200, -1, -1));

        chickennu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        chickennu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickennuStateChanged(evt);
            }
        });
        jPanel3.add(chickennu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1240, 80, 60));

        mochanu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        mochanu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mochanuStateChanged(evt);
            }
        });
        jPanel3.add(mochanu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1800, 80, 60));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("數量");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1760, -1, -1));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("數量");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 2490, -1, -1));

        milkteanu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        milkteanu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                milkteanuStateChanged(evt);
            }
        });
        jPanel3.add(milkteanu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 2530, 80, 60));

        mangonu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        mangonu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mangonuStateChanged(evt);
            }
        });
        jPanel3.add(mangonu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 3190, 80, 60));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("數量");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 3150, -1, -1));

        jScrollPane1.setViewportView(jPanel3);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 600));

        jPanel1.setBackground(new java.awt.Color(250, 190, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 120));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(195, 125, 146));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showorder.setBackground(new java.awt.Color(195, 125, 146));
        showorder.setColumns(12);
        showorder.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        showorder.setForeground(new java.awt.Color(255, 204, 102));
        showorder.setRows(5);
        showorder.setAutoscrolls(false);
        jScrollPane2.setViewportView(showorder);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 530));

        jButton1.setText("送出訂單");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 130, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 310, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void beefnuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_beefnuStateChanged
     if ((int)beefnu.getValue()>=0)
     {showtemporder();}
     else{
     beefnu.setValue(0);}
    }//GEN-LAST:event_beefnuStateChanged

    private void chickennuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickennuStateChanged
    if ((int)chickennu.getValue()>=0)
     {showtemporder();}
     else{
     chickennu.setValue(0);}
    }//GEN-LAST:event_chickennuStateChanged

    private void porknuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_porknuStateChanged
     if ((int)porknu.getValue()>=0)
     {showtemporder();}
     else{
     porknu.setValue(0);}
    }//GEN-LAST:event_porknuStateChanged

    private void mochanuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mochanuStateChanged
    if ((int)mochanu.getValue()>=0)
     {showtemporder();}
     else{
     mochanu.setValue(0);}
    }//GEN-LAST:event_mochanuStateChanged

    private void milkteanuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_milkteanuStateChanged
    if ((int)milkteanu.getValue()>=0)
     {showtemporder();}
     else{
     milkteanu.setValue(0);}
    }//GEN-LAST:event_milkteanuStateChanged

    private void mangonuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mangonuStateChanged
    if ((int)mangonu.getValue()>=0)
     {showtemporder();}
     else{
     mangonu.setValue(0);}
    }//GEN-LAST:event_mangonuStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int beef=(int)beefnu.getValue();
    int chicken=(int)chickennu.getValue();
    int pork=(int)porknu.getValue();
    int mocha=(int)mochanu.getValue();
    int milktea=(int)milkteanu.getValue();
    int mango=(int)mangonu.getValue();
    
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beefimg;
    private javax.swing.JSpinner beefnu;
    private javax.swing.JLabel chickenimg;
    private javax.swing.JSpinner chickennu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mangoimg;
    private javax.swing.JSpinner mangonu;
    private javax.swing.JLabel milkteaimg;
    private javax.swing.JSpinner milkteanu;
    private javax.swing.JLabel mochaimg;
    private javax.swing.JSpinner mochanu;
    private javax.swing.JLabel porkimg;
    private javax.swing.JSpinner porknu;
    private javax.swing.JTextArea showorder;
    // End of variables declaration//GEN-END:variables
}
