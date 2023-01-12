package app_udp_monitor;

public class FrmMain extends javax.swing.JFrame {

    public boolean isConnect = false;
    public UdpControl udpControl = new UdpControl();

    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        ip0 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ip1 = new javax.swing.JTextField();
        ip2 = new javax.swing.JTextField();
        ip3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buff = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mem0 = new javax.swing.JLabel();
        seq0 = new javax.swing.JLabel();
        mem1 = new javax.swing.JLabel();
        seq1 = new javax.swing.JLabel();
        pes1 = new javax.swing.JLabel();
        pes2 = new javax.swing.JLabel();
        seq2 = new javax.swing.JLabel();
        mem2 = new javax.swing.JLabel();
        pes3 = new javax.swing.JLabel();
        seq3 = new javax.swing.JLabel();
        mem3 = new javax.swing.JLabel();
        mem4 = new javax.swing.JLabel();
        seq4 = new javax.swing.JLabel();
        pes4 = new javax.swing.JLabel();
        mem5 = new javax.swing.JLabel();
        seq5 = new javax.swing.JLabel();
        pes5 = new javax.swing.JLabel();
        mem6 = new javax.swing.JLabel();
        seq6 = new javax.swing.JLabel();
        pes6 = new javax.swing.JLabel();
        mem7 = new javax.swing.JLabel();
        seq7 = new javax.swing.JLabel();
        pes7 = new javax.swing.JLabel();
        mem8 = new javax.swing.JLabel();
        seq8 = new javax.swing.JLabel();
        pes8 = new javax.swing.JLabel();
        mem9 = new javax.swing.JLabel();
        seq9 = new javax.swing.JLabel();
        pes9 = new javax.swing.JLabel();
        pes0 = new javax.swing.JLabel();
        pes11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LENKE LOG - UDP MONITORING");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn.setBackground(new java.awt.Color(204, 204, 204));
        btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn.setText("CONECTAR");
        btn.setPreferredSize(new java.awt.Dimension(85, 20));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        ip0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ip0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip0.setText("192");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("IP");

        ip1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ip1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip1.setText("168");
        ip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip1ActionPerformed(evt);
            }
        });

        ip2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ip2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip2.setText("0");
        ip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip2ActionPerformed(evt);
            }
        });

        ip3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ip3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip3.setText("96");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText(".");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText(".");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText(".");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText(":");

        port.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        port.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        port.setText("1883");
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("PORTA");

        buff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buff.setText("-");
        buff.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ip0, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(port))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ip0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buff, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SEQUÊNCIA");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MEMORIA");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem0.setText("0");
        mem0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq0.setText("0");
        seq0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem1.setText("1");
        mem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq1.setText("0");
        seq1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes1.setText("0");
        pes1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes2.setText("0");
        pes2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq2.setText("0");
        seq2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem2.setText("2");
        mem2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes3.setText("0");
        pes3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq3.setText("0");
        seq3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem3.setText("3");
        mem3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem4.setText("4");
        mem4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq4.setText("0");
        seq4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes4.setText("0");
        pes4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem5.setText("5");
        mem5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq5.setText("0");
        seq5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes5.setText("0");
        pes5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem6.setText("6");
        mem6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq6.setText("0");
        seq6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes6.setText("0");
        pes6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem7.setText("7");
        mem7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq7.setText("0");
        seq7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes7.setText("0");
        pes7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem8.setText("8");
        mem8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq8.setText("0");
        seq8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes8.setText("0");
        pes8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mem9.setText("9");
        mem9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seq9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seq9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seq9.setText("0");
        seq9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes9.setText("0");
        pes9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes0.setText("0");
        pes0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pes11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pes11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pes11.setText("PESO");
        pes11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mem9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seq9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pes9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pes11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(pes11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem0)
                    .addComponent(seq0)
                    .addComponent(pes0, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem1)
                    .addComponent(seq1)
                    .addComponent(pes1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem2)
                    .addComponent(seq2)
                    .addComponent(pes2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem3)
                    .addComponent(seq3)
                    .addComponent(pes3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem4)
                    .addComponent(seq4)
                    .addComponent(pes4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem5)
                    .addComponent(seq5)
                    .addComponent(pes5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem6)
                    .addComponent(seq6)
                    .addComponent(pes6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem7)
                    .addComponent(seq7)
                    .addComponent(pes7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem8)
                    .addComponent(seq8)
                    .addComponent(pes8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mem9)
                    .addComponent(seq9)
                    .addComponent(pes9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        if (isConnect) {
            udpControl.stop = true;
            btn.setText("CONECTAR");
        }else{
            udpControl = new UdpControl();
            btn.setText("DESCONECTAR");
            udpControl.host = ip0.getText() + "." + ip1.getText() + "." + ip2.getText() + "." + ip3.getText();
            udpControl.port = Integer.parseInt(port.getText());
            udpControl.infoPanel = info;
            udpControl.buff = buff;
            udpControl.seq0 = seq0;
            udpControl.pes0 = pes0;
            udpControl.seq1 = seq1;
            udpControl.pes1 = pes1;
            udpControl.seq2 = seq2;
            udpControl.pes2 = pes2;
            udpControl.seq3 = seq3;
            udpControl.pes3 = pes3;
            udpControl.seq4 = seq4;
            udpControl.pes4 = pes4;
            udpControl.seq5 = seq5;
            udpControl.pes5 = pes5;
            udpControl.seq6 = seq6;
            udpControl.pes6 = pes6;
            udpControl.seq7 = seq7;
            udpControl.pes7 = pes7;
            udpControl.seq8 = seq8;
            udpControl.pes8 = pes8;
            udpControl.seq9 = seq9;
            udpControl.pes9 = pes9;
            udpControl.start();
        }
        isConnect = !isConnect;
    }//GEN-LAST:event_btnActionPerformed

    private void ip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip1ActionPerformed

    private void ip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip2ActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel buff;
    private javax.swing.JPanel info;
    private javax.swing.JTextField ip0;
    private javax.swing.JTextField ip1;
    private javax.swing.JTextField ip2;
    private javax.swing.JTextField ip3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mem0;
    private javax.swing.JLabel mem1;
    private javax.swing.JLabel mem2;
    private javax.swing.JLabel mem3;
    private javax.swing.JLabel mem4;
    private javax.swing.JLabel mem5;
    private javax.swing.JLabel mem6;
    private javax.swing.JLabel mem7;
    private javax.swing.JLabel mem8;
    private javax.swing.JLabel mem9;
    private javax.swing.JLabel pes0;
    private javax.swing.JLabel pes1;
    private javax.swing.JLabel pes11;
    private javax.swing.JLabel pes2;
    private javax.swing.JLabel pes3;
    private javax.swing.JLabel pes4;
    private javax.swing.JLabel pes5;
    private javax.swing.JLabel pes6;
    private javax.swing.JLabel pes7;
    private javax.swing.JLabel pes8;
    private javax.swing.JLabel pes9;
    private javax.swing.JTextField port;
    private javax.swing.JLabel seq0;
    private javax.swing.JLabel seq1;
    private javax.swing.JLabel seq2;
    private javax.swing.JLabel seq3;
    private javax.swing.JLabel seq4;
    private javax.swing.JLabel seq5;
    private javax.swing.JLabel seq6;
    private javax.swing.JLabel seq7;
    private javax.swing.JLabel seq8;
    private javax.swing.JLabel seq9;
    // End of variables declaration//GEN-END:variables
}
