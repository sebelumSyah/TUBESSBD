/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;

import com.sun.glass.events.KeyEvent;
import paneles.CambiaPanel;

public class menu2 extends javax.swing.JFrame {

    
    String bisa;
    public menu2(){
        initComponents();
        
        new CambiaPanel(pnlHome, new home());
    }
   
    public menu2(nampung a) {
        initComponents();
        halloText.setText("Hai,"+a.getValue(0)+"!");
        bisa=a.getValue(0).toString();
        new CambiaPanel(pnlHome, new home((String) a.getValue(0)));
    }
    private void jalan(){
        int posisi = this.pnlMenu.getX();
        if(posisi>-1) {
            //Animacion.Animacion.mover_izquierda(0, -220, 2, 2, pnlMenu);
        } else {
            //Animacion.Animacion.mover_derecha(-220, 0, 2, 2, pnlMenu);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        home = new rsbuttom.RSButtonMetro();
        karyawan = new rsbuttom.RSButtonMetro();
        div = new rsbuttom.RSButtonMetro();
        ahli = new rsbuttom.RSButtonMetro();
        pang = new rsbuttom.RSButtonMetro();
        berpang = new rsbuttom.RSButtonMetro();
        pro = new rsbuttom.RSButtonMetro();
        rencana = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        home1 = new rsbuttom.RSButtonMetro();
        karyawan1 = new rsbuttom.RSButtonMetro();
        div1 = new rsbuttom.RSButtonMetro();
        ahli1 = new rsbuttom.RSButtonMetro();
        pang1 = new rsbuttom.RSButtonMetro();
        berpang1 = new rsbuttom.RSButtonMetro();
        pro1 = new rsbuttom.RSButtonMetro();
        rencana1 = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        halloText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlHome = new javax.swing.JPanel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(97, 212, 195));

        home.setBackground(new java.awt.Color(97, 212, 195));
        home.setText("HOME");
        home.setColorBorde(null);
        home.setColorHover(new java.awt.Color(36, 47, 65));
        home.setColorNormal(new java.awt.Color(97, 212, 195));
        home.setColorPressed(new java.awt.Color(153, 153, 153));
        home.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        karyawan.setBackground(new java.awt.Color(97, 212, 195));
        karyawan.setText("KARYAWAN");
        karyawan.setColorBorde(null);
        karyawan.setColorHover(new java.awt.Color(36, 47, 65));
        karyawan.setColorNormal(new java.awt.Color(97, 212, 195));
        karyawan.setColorPressed(new java.awt.Color(153, 153, 153));
        karyawan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        div.setBackground(new java.awt.Color(97, 212, 195));
        div.setText("DIVISI");
        div.setColorBorde(null);
        div.setColorHover(new java.awt.Color(36, 47, 65));
        div.setColorNormal(new java.awt.Color(97, 212, 195));
        div.setColorPressed(new java.awt.Color(153, 153, 153));
        div.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        ahli.setBackground(new java.awt.Color(97, 212, 195));
        ahli.setText("KEAHLIAN");
        ahli.setColorBorde(null);
        ahli.setColorHover(new java.awt.Color(36, 47, 65));
        ahli.setColorNormal(new java.awt.Color(97, 212, 195));
        ahli.setColorPressed(new java.awt.Color(153, 153, 153));
        ahli.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        pang.setBackground(new java.awt.Color(97, 212, 195));
        pang.setText("PANGKAT");
        pang.setColorBorde(null);
        pang.setColorHover(new java.awt.Color(36, 47, 65));
        pang.setColorNormal(new java.awt.Color(97, 212, 195));
        pang.setColorPressed(new java.awt.Color(153, 153, 153));
        pang.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        berpang.setBackground(new java.awt.Color(97, 212, 195));
        berpang.setText("BERPANGKAT");
        berpang.setColorBorde(null);
        berpang.setColorHover(new java.awt.Color(36, 47, 65));
        berpang.setColorNormal(new java.awt.Color(97, 212, 195));
        berpang.setColorPressed(new java.awt.Color(153, 153, 153));
        berpang.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        pro.setBackground(new java.awt.Color(97, 212, 195));
        pro.setText("PROGRAM KERJA");
        pro.setColorBorde(null);
        pro.setColorHover(new java.awt.Color(36, 47, 65));
        pro.setColorNormal(new java.awt.Color(97, 212, 195));
        pro.setColorPressed(new java.awt.Color(153, 153, 153));
        pro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        rencana.setBackground(new java.awt.Color(97, 212, 195));
        rencana.setText("RENCANA");
        rencana.setColorBorde(null);
        rencana.setColorHover(new java.awt.Color(36, 47, 65));
        rencana.setColorNormal(new java.awt.Color(97, 212, 195));
        rencana.setColorPressed(new java.awt.Color(153, 153, 153));
        rencana.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ahli, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(berpang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rencana, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ahli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(berpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(rencana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        rSButtonMetro1.setBackground(new java.awt.Color(36, 47, 65));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(97, 212, 195));

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/house-24.png"))); // NOI18N
        home1.setText("   HOME");
        home1.setColorBorde(null);
        home1.setColorHover(new java.awt.Color(36, 47, 65));
        home1.setColorNormal(new java.awt.Color(97, 212, 195));
        home1.setColorPressed(new java.awt.Color(153, 153, 153));
        home1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        home1.setHideActionText(true);
        home1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        karyawan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/group-24.png"))); // NOI18N
        karyawan1.setText("   KARYAWAN");
        karyawan1.setColorBorde(null);
        karyawan1.setColorHover(new java.awt.Color(36, 47, 65));
        karyawan1.setColorNormal(new java.awt.Color(97, 212, 195));
        karyawan1.setColorPressed(new java.awt.Color(153, 153, 153));
        karyawan1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        karyawan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        karyawan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawan1ActionPerformed(evt);
            }
        });

        div1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/badge-2-24.png"))); // NOI18N
        div1.setText("   DIVISI");
        div1.setColorBorde(null);
        div1.setColorHover(new java.awt.Color(36, 47, 65));
        div1.setColorNormal(new java.awt.Color(97, 212, 195));
        div1.setColorPressed(new java.awt.Color(153, 153, 153));
        div1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        div1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        div1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div1ActionPerformed(evt);
            }
        });

        ahli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/computer-24.png"))); // NOI18N
        ahli1.setText("   KEAHLIAN");
        ahli1.setColorBorde(null);
        ahli1.setColorHover(new java.awt.Color(36, 47, 65));
        ahli1.setColorNormal(new java.awt.Color(97, 212, 195));
        ahli1.setColorPressed(new java.awt.Color(153, 153, 153));
        ahli1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ahli1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ahli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahli1ActionPerformed(evt);
            }
        });

        pang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/medal-24.png"))); // NOI18N
        pang1.setText("   PANGKAT");
        pang1.setColorBorde(null);
        pang1.setColorHover(new java.awt.Color(36, 47, 65));
        pang1.setColorNormal(new java.awt.Color(97, 212, 195));
        pang1.setColorPressed(new java.awt.Color(153, 153, 153));
        pang1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pang1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pang1ActionPerformed(evt);
            }
        });

        berpang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/businessman-24.png"))); // NOI18N
        berpang1.setText("   BERPANGKAT");
        berpang1.setColorBorde(null);
        berpang1.setColorHover(new java.awt.Color(36, 47, 65));
        berpang1.setColorNormal(new java.awt.Color(97, 212, 195));
        berpang1.setColorPressed(new java.awt.Color(153, 153, 153));
        berpang1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        berpang1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        berpang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berpang1ActionPerformed(evt);
            }
        });

        pro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/combo-24.png"))); // NOI18N
        pro1.setText("   PROGRAM KERJA");
        pro1.setColorBorde(null);
        pro1.setColorHover(new java.awt.Color(36, 47, 65));
        pro1.setColorNormal(new java.awt.Color(97, 212, 195));
        pro1.setColorPressed(new java.awt.Color(153, 153, 153));
        pro1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pro1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro1ActionPerformed(evt);
            }
        });

        rencana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/clock-5-24.png"))); // NOI18N
        rencana1.setText("   RENCANA");
        rencana1.setColorBorde(null);
        rencana1.setColorHover(new java.awt.Color(36, 47, 65));
        rencana1.setColorNormal(new java.awt.Color(97, 212, 195));
        rencana1.setColorPressed(new java.awt.Color(153, 153, 153));
        rencana1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rencana1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rencana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rencana1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/administrator-64.png"))); // NOI18N

        halloText.setBackground(new java.awt.Color(36, 47, 65));
        halloText.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        halloText.setText("Hai, Shafira!");

        jLabel3.setBackground(new java.awt.Color(36, 47, 65));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel3.setText("Keluar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel5.setText("ADMIN |");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rencana1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(berpang1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pang1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ahli1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(karyawan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(halloText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(halloText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(karyawan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(div1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ahli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(berpang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(rencana1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 460));

        jPanel7.setBackground(new java.awt.Color(36, 47, 65));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(813, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setLayout(new javax.swing.BoxLayout(pnlHome, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 870, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divActionPerformed

    private void div1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div1ActionPerformed
        jalan();
        new CambiaPanel(pnlHome, new divisi());
    }//GEN-LAST:event_div1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jalan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        jalan();
        
        new CambiaPanel(pnlHome, new home(bisa));
        
    }//GEN-LAST:event_home1ActionPerformed

    private void karyawan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawan1ActionPerformed
         jalan();
        new CambiaPanel(pnlHome, new karyawan());
    }//GEN-LAST:event_karyawan1ActionPerformed

    private void ahli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahli1ActionPerformed
    
        jalan();
        new CambiaPanel(pnlHome, new ahli());
    }//GEN-LAST:event_ahli1ActionPerformed

    private void pang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pang1ActionPerformed
    jalan();
        new CambiaPanel(pnlHome, new pang());
    }//GEN-LAST:event_pang1ActionPerformed

    private void berpang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berpang1ActionPerformed
    jalan();
        new CambiaPanel(pnlHome, new berpang());
    }//GEN-LAST:event_berpang1ActionPerformed

    private void pro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro1ActionPerformed
    jalan();
        new CambiaPanel(pnlHome, new pro());
    }//GEN-LAST:event_pro1ActionPerformed

    private void rencana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rencana1ActionPerformed
    jalan();
        new CambiaPanel(pnlHome, new rencana());
    }//GEN-LAST:event_rencana1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        sbd1 ak = new sbd1();
        ak.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        
    }//GEN-LAST:event_jLabel3KeyPressed

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
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro ahli;
    private rsbuttom.RSButtonMetro ahli1;
    private rsbuttom.RSButtonMetro berpang;
    private rsbuttom.RSButtonMetro berpang1;
    private rsbuttom.RSButtonMetro div;
    private rsbuttom.RSButtonMetro div1;
    private javax.swing.JLabel halloText;
    private rsbuttom.RSButtonMetro home;
    private rsbuttom.RSButtonMetro home1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private rsbuttom.RSButtonMetro karyawan;
    private rsbuttom.RSButtonMetro karyawan1;
    private rsbuttom.RSButtonMetro pang;
    private rsbuttom.RSButtonMetro pang1;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlMenu;
    private rsbuttom.RSButtonMetro pro;
    private rsbuttom.RSButtonMetro pro1;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rencana;
    private rsbuttom.RSButtonMetro rencana1;
    // End of variables declaration//GEN-END:variables
}
