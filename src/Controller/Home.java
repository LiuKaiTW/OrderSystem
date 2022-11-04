
package Controller;

import Dao.MemberM.implMember;
import Dao.OrderO.implOrder;
import Model.Meals;
import Model.Member;
import Model.RedBall;
import javax.swing.JFrame;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
 public static String Date()
    {
        SimpleDateFormat s=new SimpleDateFormat("MM/dd/yyyy");
        Date d=new Date();      
        return s.format(d);  
    }
    public static String Timer()
    {
        SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
        //Timer t=new Timer();         
        Date t=new Date(); 
        return time.format(t);          
    }
    
    public Home() {
        initComponents();
        
        setUndecorated(true); //隱藏上方列
        init();
        showtime.setText(Date()); 
         new java.util.Timer().schedule(new TimerTask()  {
            @Override
            public void run() {
                showtime.setText(Timer());
            }
        },0,1000);
         showdate.setText(Date());
        
        memberUI.setVisible(false);
        menuUI.setVisible(false);
        registerPanel.setVisible(false);
        checkoutUI.setVisible(false);
        backstageUI.setVisible(false);
    }
    int memberid=0;
    //設定背景透明
    private void init(){
        setBackground(new Color(0,0,0,0));
    }
    
    //設定顯示點餐方法
     void showtemporder()
    {{showorder.setText("目前點餐:"
                       + "\n帶骨牛小排:\t"+beefnu.getValue()+"個"
                       +"\n戰斧豬排佐鮮蔬:\t"+porknu.getValue()+"個"
                       +"\n雞腿排佐鮮蝦:\t"+chickennu.getValue()+"個"
                       +"\n抹茶鬆餅:\t"+mochanu.getValue()+"個"
                       +"\n泰奶鬆餅:\t"+milkteanu.getValue()+"個"
                       +"\n芒果鬆餅:\t"+mangonu.getValue()+"個");
    
    showorder.append("\n小計:"+((int)beefnu.getValue()*480+ (int)porknu.getValue()*400+(int)chickennu.getValue()*350+
            (int)mochanu.getValue()*250+(int)milkteanu.getValue()*220+(int)mangonu.getValue()*220)*0.8);}
    }

     boolean isorder=true;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backpanel1 = new Controller.backpanel();
        backstageUI = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backstagetotal = new javax.swing.JLabel();
        backstagetotal1 = new javax.swing.JLabel();
        deleteOrder = new javax.swing.JTextField();
        deleteBT = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        menuUI = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        beefimg = new javax.swing.JLabel();
        mangoimg = new javax.swing.JLabel();
        porkimg = new javax.swing.JLabel();
        mochaimg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chickenimg = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        milkteaimg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        porknu = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        beefnu = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        chickennu = new javax.swing.JSpinner();
        mochanu = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        milkteanu = new javax.swing.JSpinner();
        mangonu = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        menutitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        showorder = new javax.swing.JTextArea();
        menuadd = new javax.swing.JButton();
        ShowAddOk = new javax.swing.JLabel();
        checkoutUI = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        showorder1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        street = new javax.swing.JLabel();
        linepay = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        tempuser = new javax.swing.JLabel();
        background1 = new Controller.background1();
        memberLB = new javax.swing.JLabel();
        orderLB = new javax.swing.JLabel();
        menuLB = new javax.swing.JLabel();
        gameLB = new javax.swing.JLabel();
        payLB = new javax.swing.JLabel();
        indexLB = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        showdate = new javax.swing.JLabel();
        memberUI = new javax.swing.JPanel();
        memberPanel1 = new javax.swing.JPanel();
        registerbt = new javax.swing.JButton();
        loginbt = new javax.swing.JButton();
        passwordTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        RGusername = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        RGpassword = new javax.swing.JTextField();
        RGphone = new javax.swing.JTextField();
        registeradd = new javax.swing.JButton();
        memberPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        memberPanel3 = new javax.swing.JPanel();
        mainpageUI = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backpanel1.setBackground(new java.awt.Color(255, 255, 255));
        backpanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        backpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backstageUI.setBackground(new java.awt.Color(0, 0, 0));
        backstageUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 48)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("管理訂單系統");
        backstageUI.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jTable1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "username", "泰奶鬆餅", "芒果鬆餅", "抹茶鬆餅", "牛排", "雞排", "豬排", "金額"
            }
        ));
        jTable1.setAlignmentX(2.0F);
        jTable1.setAlignmentY(2.0F);
        jTable1.setRowHeight(50);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane3.setViewportView(jTable1);

        backstageUI.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 1030, 440));

        backstagetotal.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        backstagetotal.setForeground(new java.awt.Color(255, 255, 255));
        backstagetotal.setText("總收入:");
        backstageUI.add(backstagetotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, -1, -1));

        backstagetotal1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        backstagetotal1.setForeground(new java.awt.Color(255, 255, 255));
        backstageUI.add(backstagetotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 150, 40));
        backstageUI.add(deleteOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 80, -1));

        deleteBT.setText("刪除");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });
        backstageUI.add(deleteBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 60, 25));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("輸入要刪除的ID");
        backstageUI.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("輸入要查詢的username");
        backstageUI.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, -1));
        backstageUI.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 140, 20));

        search.setText("查詢");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        backstageUI.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 60, -1));

        refresh.setText("重新整理");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        backstageUI.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        backpanel1.add(backstageUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1110, 720));

        menuUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 217, 184));
        jLabel9.setText("芒果鬆餅  $220");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2900, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(230, 217, 184));
        jLabel14.setText("泰奶鬆餅  $220");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        jLabel11.setText("鬆餅");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1480, 120, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(230, 217, 184));
        jLabel13.setText("蒜酥雞腿排佐鮮蝦  $350");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1020, -1, -1));

        chickenimg.setForeground(new java.awt.Color(230, 217, 184));
        chickenimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chicken.png"))); // NOI18N
        jPanel3.add(chickenimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1060, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(230, 217, 184));
        jLabel15.setText("戰斧豬排佐鮮蔬  $400");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(230, 217, 184));
        jLabel16.setText("帶骨牛小排佐鮮蝦  $480");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        milkteaimg.setForeground(new java.awt.Color(230, 217, 184));
        milkteaimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/milktea.png"))); // NOI18N
        jPanel3.add(milkteaimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        jLabel2.setText("主餐");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        porknu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        porknu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                porknuStateChanged(evt);
            }
        });
        jPanel3.add(porknu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 760, 80, 60));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("數量");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 720, -1, -1));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("數量");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        beefnu.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        beefnu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                beefnuStateChanged(evt);
            }
        });
        jPanel3.add(beefnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 80, 60));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("數量");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1200, -1, -1));

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

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("數量");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1760, -1, -1));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("數量");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 2490, -1, -1));

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

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setText("數量");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 3150, -1, -1));

        jScrollPane1.setViewportView(jPanel3);

        menuUI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 600));

        jPanel1.setBackground(new java.awt.Color(250, 190, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menutitle.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 36)); // NOI18N
        menutitle.setText("肚子餓就快點!!!");
        jPanel1.add(menutitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, -1, -1));

        menuUI.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(195, 125, 146));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showorder.setBackground(new java.awt.Color(195, 125, 146));
        showorder.setColumns(12);
        showorder.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        showorder.setForeground(new java.awt.Color(255, 204, 102));
        showorder.setRows(5);
        showorder.setAutoscrolls(false);
        jScrollPane2.setViewportView(showorder);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));

        menuadd.setText("送出訂單");
        menuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddActionPerformed(evt);
            }
        });
        jPanel2.add(menuadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 130, 30));

        ShowAddOk.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        ShowAddOk.setForeground(new java.awt.Color(230, 217, 184));
        jPanel2.add(ShowAddOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 130, 40));

        menuUI.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 310, 600));

        backpanel1.add(menuUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        checkoutUI.setBackground(new java.awt.Color(195, 125, 146));
        checkoutUI.setToolTipText("");
        checkoutUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showorder1.setBackground(new java.awt.Color(195, 125, 146));
        showorder1.setColumns(12);
        showorder1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 36)); // NOI18N
        showorder1.setForeground(new java.awt.Color(255, 204, 102));
        showorder1.setRows(5);
        showorder1.setAutoscrolls(false);
        jScrollPane4.setViewportView(showorder1);

        checkoutUI.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 700, 600));

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jButton3.setText("確定結帳");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        checkoutUI.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 160, 70));

        street.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/streetqr.png"))); // NOI18N
        checkoutUI.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 180, 180));

        linepay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/linepayqr.png"))); // NOI18N
        checkoutUI.add(linepay, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 180, 180));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 255, 0));
        jLabel25.setText("LinePay付款");
        checkoutUI.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 51));
        jLabel26.setText("街口支付");
        checkoutUI.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 255, 255));
        jLabel27.setText("到座位協助結帳");
        checkoutUI.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 255, 255));
        jLabel28.setText("點擊後將有服務生");
        checkoutUI.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        jPanel4.setBackground(new java.awt.Color(244, 213, 144));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 36)); // NOI18N
        jLabel29.setText("吃飽不一定會成功，但想要成功一定要先吃飽");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel31.setText("這餐有吃飽，你已經成功一半了");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        checkoutUI.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 120));

        backpanel1.add(checkoutUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1110, 720));

        welcome.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        welcome.setText("歡迎您來LazyDay用餐，記得登入後開始操作點餐程式");
        backpanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 45, -1, -1));
        welcome.getAccessibleContext().setAccessibleName("");

        tempuser.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 3)); // NOI18N
        tempuser.setText("1");
        backpanel1.add(tempuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1279, 719, -1, -1));

        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberLB.setFont(new java.awt.Font("標楷體", 0, 48)); // NOI18N
        memberLB.setForeground(new java.awt.Color(255, 255, 255));
        memberLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberLB.setText("會員");
        memberLB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                memberLBMouseMoved(evt);
            }
        });
        memberLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberLBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memberLBMouseExited(evt);
            }
        });
        background1.add(memberLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 100));

        orderLB.setFont(new java.awt.Font("標楷體", 0, 24)); // NOI18N
        orderLB.setForeground(new java.awt.Color(255, 255, 255));
        orderLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderLB.setText("明細(施工中)");
        orderLB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                orderLBMouseMoved(evt);
            }
        });
        orderLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderLBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderLBMouseExited(evt);
            }
        });
        background1.add(orderLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 170, 100));

        menuLB.setFont(new java.awt.Font("標楷體", 0, 48)); // NOI18N
        menuLB.setForeground(new java.awt.Color(255, 255, 255));
        menuLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLB.setText("菜單");
        menuLB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menuLBMouseMoved(evt);
            }
        });
        menuLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuLBMouseExited(evt);
            }
        });
        background1.add(menuLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 170, 100));

        gameLB.setFont(new java.awt.Font("標楷體", 0, 48)); // NOI18N
        gameLB.setForeground(new java.awt.Color(255, 255, 255));
        gameLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameLB.setText("小遊戲");
        gameLB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                gameLBMouseMoved(evt);
            }
        });
        gameLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameLBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameLBMouseExited(evt);
            }
        });
        background1.add(gameLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 170, 100));

        payLB.setFont(new java.awt.Font("標楷體", 0, 48)); // NOI18N
        payLB.setForeground(new java.awt.Color(255, 255, 255));
        payLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payLB.setText("結帳");
        payLB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                payLBMouseMoved(evt);
            }
        });
        payLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payLBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payLBMouseExited(evt);
            }
        });
        background1.add(payLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 170, 100));

        indexLB.setFont(new java.awt.Font("標楷體", 0, 48)); // NOI18N
        indexLB.setForeground(new java.awt.Color(255, 255, 255));
        indexLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indexLB.setText("主頁");
        indexLB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                indexLBMouseMoved(evt);
            }
        });
        indexLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indexLBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                indexLBMouseExited(evt);
            }
        });
        background1.add(indexLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 100));

        showtime.setFont(new java.awt.Font("Source Serif Pro ExtraLight", 0, 24)); // NOI18N
        showtime.setForeground(new java.awt.Color(255, 255, 255));
        showtime.setText("10.11");
        background1.add(showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 30));

        showdate.setFont(new java.awt.Font("Source Code Pro Light", 0, 16)); // NOI18N
        showdate.setForeground(new java.awt.Color(255, 255, 255));
        showdate.setText("22/10/18");
        background1.add(showdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        backpanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 720));

        memberUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberPanel1.setBackground(new java.awt.Color(0, 109, 119));
        memberPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerbt.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        registerbt.setText("成為會員");
        registerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtActionPerformed(evt);
            }
        });
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

        memberUI.add(memberPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 770, 600));

        registerPanel.setBackground(new java.awt.Color(221, 131, 97));
        registerPanel.setPreferredSize(new java.awt.Dimension(340, 600));
        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RGusername.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        RGusername.setText("請輸入註冊的帳號");
        RGusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RGusernameMouseClicked(evt);
            }
        });
        registerPanel.add(RGusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 200, 50));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setText("會員註冊");
        registerPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        RGpassword.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        RGpassword.setText("請輸入註冊的密碼");
        RGpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RGpasswordMouseClicked(evt);
            }
        });
        registerPanel.add(RGpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 200, 50));

        RGphone.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        RGphone.setText("請輸入您的手機");
        RGphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RGphoneMouseClicked(evt);
            }
        });
        registerPanel.add(RGphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 200, 50));

        registeradd.setText("註冊");
        registeradd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeraddActionPerformed(evt);
            }
        });
        registerPanel.add(registeradd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 110, 50));

        memberUI.add(registerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 340, 600));

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

        memberUI.add(memberPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 340, 600));

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

        memberUI.add(memberPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 120));

        backpanel1.add(memberUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1110, 720));

        mainpageUI.setBackground(new java.awt.Color(211, 192, 136));
        mainpageUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainpage.png"))); // NOI18N
        mainpageUI.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        backpanel1.add(mainpageUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1110, 720));

        getContentPane().add(backpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payLBMouseExited
        payLB.setForeground(Color.white);
    }//GEN-LAST:event_payLBMouseExited

    private void payLBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payLBMouseMoved
        payLB.setForeground(Color.red);
    }//GEN-LAST:event_payLBMouseMoved

    private void gameLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameLBMouseExited
        gameLB.setForeground(Color.white);
    }//GEN-LAST:event_gameLBMouseExited

    private void gameLBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameLBMouseMoved
        gameLB.setForeground(Color.red);
    }//GEN-LAST:event_gameLBMouseMoved

    private void menuLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLBMouseExited
        menuLB.setForeground(Color.white);
    }//GEN-LAST:event_menuLBMouseExited

    private void menuLBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLBMouseMoved
        menuLB.setForeground(Color.red);
    }//GEN-LAST:event_menuLBMouseMoved

    private void orderLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderLBMouseExited
        orderLB.setForeground(Color.white);
    }//GEN-LAST:event_orderLBMouseExited

    private void orderLBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderLBMouseMoved
        orderLB.setForeground(Color.red);
    }//GEN-LAST:event_orderLBMouseMoved

    private void memberLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberLBMouseExited
        memberLB.setForeground(Color.white);
    }//GEN-LAST:event_memberLBMouseExited

    private void memberLBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberLBMouseMoved
        memberLB.setForeground(Color.red);
    }//GEN-LAST:event_memberLBMouseMoved

    private void memberLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberLBMouseClicked
        mainpageUI.setVisible(false);
        memberUI.setVisible(true);
        menuUI.setVisible(false);
        registerPanel.setVisible(false);
        backstageUI.setVisible(false);
        checkoutUI.setVisible(false);
    }//GEN-LAST:event_memberLBMouseClicked

    private void menuLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLBMouseClicked
    if(tempuser.getText()!="1")
    {memberUI.setVisible(false);
    mainpageUI.setVisible(false);
    menuUI.setVisible(true);
    checkoutUI.setVisible(false);
    registerPanel.setVisible(false);
    backstageUI.setVisible(false);}
    else
    {JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "登入後才能使用此功能");}
    }//GEN-LAST:event_menuLBMouseClicked

    private void indexLBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexLBMouseMoved
    indexLB.setForeground(Color.red);
    }//GEN-LAST:event_indexLBMouseMoved

    private void indexLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexLBMouseClicked
    mainpageUI.setVisible(true);
    memberUI.setVisible(false);
    menuUI.setVisible(false);
    backstageUI.setVisible(false);
    checkoutUI.setVisible(false);
    
    }//GEN-LAST:event_indexLBMouseClicked

    private void indexLBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexLBMouseExited
     indexLB.setForeground(Color.white);
    }//GEN-LAST:event_indexLBMouseExited

    private void porknuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_porknuStateChanged
        if ((int)porknu.getValue()>=0)
        {showtemporder();}
        else{
            porknu.setValue(0);}
    }//GEN-LAST:event_porknuStateChanged

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

    private void menuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddActionPerformed
        if(isorder)
        {//點餐並計算，且回傳資料庫
        int beef=(int)beefnu.getValue();
        int chicken=(int)chickennu.getValue();
        int pork=(int)porknu.getValue();
        int mocha=(int)mochanu.getValue();
        int milktea=(int)milkteanu.getValue();
        int mango=(int)mangonu.getValue();
        int sum=(int)(((int)beefnu.getValue()*480+ (int)porknu.getValue()*400+(int)chickennu.getValue()*350+
            (int)mochanu.getValue()*250+(int)milkteanu.getValue()*220+(int)mangonu.getValue()*220)*0.9);
        Meals M=new Meals(milktea,mango,mocha,beef,chicken,pork,sum);
        new implOrder().ordermeal2(M,memberid);
        isorder=false;
        ShowAddOk.setText("訂單已送出");
        beefnu.setEnabled(false);porknu.setEnabled(false);chickennu.setEnabled(false);
        mochanu.setEnabled(false);milkteanu.setEnabled(false);mangonu.setEnabled(false);
        }
        else
        { {
          JFrame frame = new JFrame();
            int result = JOptionPane.showConfirmDialog
            (frame,"您已經點過餐，是否要修改訂單？", "通知",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    {JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "稍後由服務生為您修改");}
                }else if (result == JOptionPane.NO_OPTION){
            }}
        }
    }//GEN-LAST:event_menuaddActionPerformed

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtActionPerformed
        String Username=usernameTF.getText();
        String Password=passwordTF.getText();
       
        //確認是會員後登入，且登入後會新增一筆
        if(new implMember().query(Username, Password))
        {   //登入後會新增一比同帳號的欄位，用於之後找資料
            Member M=new Member(Username,"******","******");
            new implMember().add(M);
            List<Member> l=new implMember().querySum2(Username);
            Member[] s1=l.toArray(new Member[l.size()]);
          memberid=s1[s1.length-1].getID();
          welcome.setText("歡迎 "+Username+" 來LazyDay用餐，祝您有美好的一天"); 
          tempuser.setText(Username);
          
          JFrame jFrame = new JFrame();
          JOptionPane.showMessageDialog(jFrame, "登入成功");
          menuUI.setVisible(true);
          memberUI.setVisible(false);
        }
        //設定關閉程式的方法
	else if(usernameTF.getText().equals("exit")&&passwordTF.getText().equals("exit"))
        {
          JFrame frame = new JFrame();
            int result = JOptionPane.showConfirmDialog
            (frame,"是否要關閉程式？", "您是管理員",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                System.exit(0);
                }else if (result == JOptionPane.NO_OPTION){
            }}
        //設定進到後台看行銷狀況，並且有刪除帳號功能
         else if(usernameTF.getText().equals("admin")&&passwordTF.getText().equals("data"))
          { backstageUI.setVisible(true);
            memberUI.setVisible(false);
            int total=0;
            List<Meals> l=new implOrder().query1();
            Meals[] s1=l.toArray(new Meals[l.size()]);
            List<Member> M=new implMember().querySum();
            
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            Object[] row=new Object[9];
            for(int i=0;i<s1.length;i++)
            {
            row[0]=M.get(i).getID();
            row[1]=M.get(i).getUSERNAME();
                
            row[2]=l.get(i).getMILKTEA();
            row[3]=l.get(i).getMANGO();
            row[4]=l.get(i).getMOCHA();
            row[5]=l.get(i).getBEEF();
            row[6]=l.get(i).getCHICKEN();
            row[7]=l.get(i).getPORK();
            row[8]=l.get(i).getMEMBERSUM();
            model.addRow(row);
            total+=l.get(i).getMEMBERSUM();
            }
            backstagetotal1.setText(""+total);
        }
        //設定非會員，且非管理員，跳出通知
        else
        {
            JFrame frame = new JFrame();
            int result = JOptionPane.showConfirmDialog
            (frame,"您是否要註冊？", "輸入帳號密碼有誤",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                registerPanel.setVisible(true);
            }else if (result == JOptionPane.NO_OPTION){
            }
        }
    }//GEN-LAST:event_loginbtActionPerformed

    private void passwordTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTFMouseClicked
        passwordTF.setText("");
    }//GEN-LAST:event_passwordTFMouseClicked

    private void usernameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTFMouseClicked
        usernameTF.setText("");
    }//GEN-LAST:event_usernameTFMouseClicked

    private void registerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtActionPerformed
 registerPanel.setVisible(true);
    }//GEN-LAST:event_registerbtActionPerformed

    private void RGusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RGusernameMouseClicked
    RGusername.setText("");
    }//GEN-LAST:event_RGusernameMouseClicked

    private void RGpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RGpasswordMouseClicked
    RGpassword.setText("");
    }//GEN-LAST:event_RGpasswordMouseClicked

    private void RGphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RGphoneMouseClicked
    RGphone.setText("");
    }//GEN-LAST:event_RGphoneMouseClicked

    private void registeraddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeraddActionPerformed
    String username=RGusername.getText();
    String password=RGpassword.getText();
    String phone=RGphone.getText();
    
  
    //註冊會員，並判斷是否重複註冊
    if(new implMember().query(username)||
            RGusername.getText().isEmpty()||
            RGpassword.getText().isEmpty()||
            RGphone.getText().isEmpty()||
            RGphone.getText().length()<10)
    {JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "註冊失敗，資料有誤");
    }
    else
    {Member M=new Member(username,password,phone);
    new implMember().add(M);
    usernameTF.setText(RGusername.getText());
    passwordTF.setText(RGpassword.getText());
    JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "註冊成功，請在左側登入");}
    
    }//GEN-LAST:event_registeraddActionPerformed

    private void payLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payLBMouseClicked
    if(tempuser.getText()!="1"&& !isorder)
    {mainpageUI.setVisible(false);
    memberUI.setVisible(false);
    menuUI.setVisible(false);
    checkoutUI.setVisible(true);
    showorder1.setText("今日用餐內容:"
                       + "\n帶骨牛小排:\t"+beefnu.getValue()+"個"
                       +"\n戰斧豬排佐鮮蔬:\t"+porknu.getValue()+"個"
                       +"\n雞腿排佐鮮蝦:\t"+chickennu.getValue()+"個"
                       +"\n抹茶鬆餅:\t"+mochanu.getValue()+"個"
                       +"\n泰奶鬆餅:\t"+milkteanu.getValue()+"個"
                       +"\n芒果鬆餅:\t"+mangonu.getValue()+"個");
    
    showorder1.append("\n\n會員打折後總共:"+((int)beefnu.getValue()*480+ (int)porknu.getValue()*400+(int)chickennu.getValue()*350+
            (int)mochanu.getValue()*250+(int)milkteanu.getValue()*220+(int)mangonu.getValue()*220)*0.8+"元");}
    else
    {JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "你還沒登入或是還沒點餐");}
        
        
        
    }//GEN-LAST:event_payLBMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "感謝您今日的用餐，服務生馬上為您結帳");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void orderLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderLBMouseClicked
        
    }//GEN-LAST:event_orderLBMouseClicked

    private void gameLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameLBMouseClicked
       if(tempuser.getText()!="1")
       {
        JPanel JP=new JPanel();
        
        JFrame wind = new JFrame("RedBall/GamePinfo");
        
        
        RedBall g = new RedBall();
        
        wind.add(g);
        wind.pack();
        wind.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        wind.setLocationRelativeTo(null);
       
        wind.setVisible(true);
        wind.addMouseMotionListener(g);

        Timer tt = new Timer(10, g);
        tt.start();}
       
       else
    {JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "你還沒登入");}
    }//GEN-LAST:event_gameLBMouseClicked

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
     int Did=Integer.parseInt(deleteOrder.getText());
        new implOrder().delete(Did);
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.getDataVector().removeAllElements();
     
         int total=0;
            List<Meals> l=new implOrder().query1();
            Meals[] s1=l.toArray(new Meals[l.size()]);
            List<Member> M=new implMember().querySum();
          
            Object[] row=new Object[9];
            
            
            for(int i=0;i<s1.length;i++)
            {
            row[0]=M.get(i).getID();
            row[1]=M.get(i).getUSERNAME();
                
            row[2]=l.get(i).getMILKTEA();
            row[3]=l.get(i).getMANGO();
            row[4]=l.get(i).getMOCHA();
            row[5]=l.get(i).getBEEF();
            row[6]=l.get(i).getCHICKEN();
            row[7]=l.get(i).getPORK();
            row[8]=l.get(i).getMEMBERSUM();
            
            model.addRow(row);
            total+=l.get(i).getMEMBERSUM();
            }
            backstagetotal1.setText(""+total);   
    }//GEN-LAST:event_deleteBTActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
            List<Meals> l=new implOrder().query1();
            Meals[] s1=l.toArray(new Meals[l.size()]);
            List<Member> M=new implMember().querySum2(jTextField1.getText());
            
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.getDataVector().removeAllElements();
            Object[] row=new Object[9];
            for(int i=0;i<s1.length;i++)
            {
            row[0]=M.get(i).getID();
            row[1]=M.get(i).getUSERNAME();
                
            row[2]=l.get(i).getMILKTEA();
            row[3]=l.get(i).getMANGO();
            row[4]=l.get(i).getMOCHA();
            row[5]=l.get(i).getBEEF();
            row[6]=l.get(i).getCHICKEN();
            row[7]=l.get(i).getPORK();
            row[8]=l.get(i).getMEMBERSUM();
            model.addRow(row);
            }
        
    }//GEN-LAST:event_searchActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
            int total=0;
        List<Meals> l=new implOrder().query1();
            Meals[] s1=l.toArray(new Meals[l.size()]);
            List<Member> M=new implMember().querySum();
            
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.getDataVector().removeAllElements();
            Object[] row=new Object[9];
            for(int i=0;i<s1.length;i++)
            {
            row[0]=M.get(i).getID();
            row[1]=M.get(i).getUSERNAME();
                
            row[2]=l.get(i).getMILKTEA();
            row[3]=l.get(i).getMANGO();
            row[4]=l.get(i).getMOCHA();
            row[5]=l.get(i).getBEEF();
            row[6]=l.get(i).getCHICKEN();
            row[7]=l.get(i).getPORK();
            row[8]=l.get(i).getMEMBERSUM();
            model.addRow(row);
            total+=l.get(i).getMEMBERSUM();
            }
            backstagetotal1.setText(""+total);
        
    }//GEN-LAST:event_refreshActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RGpassword;
    private javax.swing.JTextField RGphone;
    private javax.swing.JTextField RGusername;
    private javax.swing.JLabel ShowAddOk;
    private Controller.background1 background1;
    private Controller.backpanel backpanel1;
    private javax.swing.JPanel backstageUI;
    private javax.swing.JLabel backstagetotal;
    private javax.swing.JLabel backstagetotal1;
    private javax.swing.JLabel beefimg;
    private javax.swing.JSpinner beefnu;
    private javax.swing.JPanel checkoutUI;
    private javax.swing.JLabel chickenimg;
    private javax.swing.JSpinner chickennu;
    private javax.swing.JButton deleteBT;
    private javax.swing.JTextField deleteOrder;
    private javax.swing.JLabel gameLB;
    private javax.swing.JLabel indexLB;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel linepay;
    private javax.swing.JButton loginbt;
    private javax.swing.JPanel mainpageUI;
    private javax.swing.JLabel mangoimg;
    private javax.swing.JSpinner mangonu;
    private javax.swing.JLabel memberLB;
    private javax.swing.JPanel memberPanel1;
    private javax.swing.JPanel memberPanel2;
    private javax.swing.JPanel memberPanel3;
    private javax.swing.JPanel memberUI;
    private javax.swing.JLabel menuLB;
    private javax.swing.JPanel menuUI;
    private javax.swing.JButton menuadd;
    private javax.swing.JLabel menutitle;
    private javax.swing.JLabel milkteaimg;
    private javax.swing.JSpinner milkteanu;
    private javax.swing.JLabel mochaimg;
    private javax.swing.JSpinner mochanu;
    private javax.swing.JLabel orderLB;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JLabel payLB;
    private javax.swing.JLabel porkimg;
    private javax.swing.JSpinner porknu;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton registeradd;
    private javax.swing.JButton registerbt;
    private javax.swing.JButton search;
    private javax.swing.JLabel showdate;
    private javax.swing.JTextArea showorder;
    private javax.swing.JTextArea showorder1;
    private javax.swing.JLabel showtime;
    private javax.swing.JLabel street;
    private javax.swing.JLabel tempuser;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

}
