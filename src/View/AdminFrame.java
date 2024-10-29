package View;

import Control.BookControl;
import java.sql.*;
import Control.DBconnection;
import Control.MemberControl;
import Model.Book;
import Model.Member;
import javax.swing.JOptionPane;

public final class AdminFrame extends javax.swing.JFrame {

    BookControl bc = new BookControl();
    MemberControl mc = new MemberControl();

    String bSearch;
    String mSearch;

    public AdminFrame() {
        initComponents();
        panBook.setVisible(true);
        panMember.setVisible(false);
        bc.showOnTable(bTable, bSearch);
        mc.showOnTable(mTable, mSearch);
        
        
    }
    Connection conn = (Connection) DBconnection.connect();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panContent = new javax.swing.JPanel();
        panBook = new javax.swing.JPanel();
        panBookTab1 = new javax.swing.JPanel();
        lblBookTab1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bTable = new javax.swing.JTable();
        txtBSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBAuthor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBYear = new com.toedter.calendar.JYearChooser();
        btnBUpgrade = new javax.swing.JButton();
        btnBDelete = new javax.swing.JButton();
        btnBAdd = new javax.swing.JButton();
        panMember = new javax.swing.JPanel();
        panBookTab3 = new javax.swing.JPanel();
        lblBookTab3 = new javax.swing.JLabel();
        txtMSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        checkMember = new javax.swing.JRadioButton();
        checkAdmin = new javax.swing.JRadioButton();
        txtMConNo = new javax.swing.JTextField();
        txtMName = new javax.swing.JTextField();
        btnMAdd = new javax.swing.JButton();
        btnMUpgrade = new javax.swing.JButton();
        btnMDelete = new javax.swing.JButton();
        panDetails = new javax.swing.JPanel();
        panBookTab4 = new javax.swing.JPanel();
        lblBookTab4 = new javax.swing.JLabel();
        panMenu = new javax.swing.JPanel();
        panBookTab = new javax.swing.JPanel();
        lblBookTab = new javax.swing.JLabel();
        panMemberTab = new javax.swing.JPanel();
        lblMemberTab = new javax.swing.JLabel();
        panDetailTab = new javax.swing.JPanel();
        lblDetailsTab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        panBook.setBackground(new java.awt.Color(251, 179, 135));
        panBook.setToolTipText("rtr");

        panBookTab1.setBackground(new java.awt.Color(233, 112, 93));
        panBookTab1.setForeground(new java.awt.Color(51, 51, 51));

        lblBookTab1.setBackground(new java.awt.Color(102, 102, 102));
        lblBookTab1.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        lblBookTab1.setForeground(new java.awt.Color(51, 51, 51));
        lblBookTab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookTab1.setText("Books");

        javax.swing.GroupLayout panBookTab1Layout = new javax.swing.GroupLayout(panBookTab1);
        panBookTab1.setLayout(panBookTab1Layout);
        panBookTab1Layout.setHorizontalGroup(
            panBookTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBookTab1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(lblBookTab1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(321, 321, 321))
        );
        panBookTab1Layout.setVerticalGroup(
            panBookTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookTab1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblBookTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bTable.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        bTable.setForeground(new java.awt.Color(0, 0, 0));
        bTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        bTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bTable.setRowHeight(25);
        bTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bTable);

        txtBSearch.setBackground(new java.awt.Color(251, 179, 135));
        txtBSearch.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        txtBSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtBSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBSearchKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(251, 179, 135));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Book Name");

        txtBName.setBackground(new java.awt.Color(255, 204, 204));
        txtBName.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtBName.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Author");

        txtBAuthor.setBackground(new java.awt.Color(255, 204, 204));
        txtBAuthor.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtBAuthor.setForeground(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Year Published");

        txtBYear.setBackground(new java.awt.Color(255, 204, 204));
        txtBYear.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBName, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(138, Short.MAX_VALUE)))
        );

        btnBUpgrade.setBackground(new java.awt.Color(233, 112, 93));
        btnBUpgrade.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnBUpgrade.setForeground(new java.awt.Color(51, 51, 51));
        btnBUpgrade.setLabel("Update Details");
        btnBUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUpgradeActionPerformed(evt);
            }
        });

        btnBDelete.setBackground(new java.awt.Color(233, 112, 93));
        btnBDelete.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnBDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnBDelete.setText("Delete Book");
        btnBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDeleteActionPerformed(evt);
            }
        });

        btnBAdd.setBackground(new java.awt.Color(233, 112, 93));
        btnBAdd.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnBAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnBAdd.setLabel("Add Book");
        btnBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBookLayout = new javax.swing.GroupLayout(panBook);
        panBook.setLayout(panBookLayout);
        panBookLayout.setHorizontalGroup(
            panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBookTab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookLayout.createSequentialGroup()
                        .addComponent(txtBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBUpgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))))
        );
        panBookLayout.setVerticalGroup(
            panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBookLayout.createSequentialGroup()
                .addComponent(panBookTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookLayout.createSequentialGroup()
                        .addComponent(btnBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBUpgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(22, 22, 22))
        );

        panMember.setBackground(new java.awt.Color(251, 179, 135));

        panBookTab3.setBackground(new java.awt.Color(233, 112, 93));

        lblBookTab3.setBackground(new java.awt.Color(102, 102, 102));
        lblBookTab3.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        lblBookTab3.setForeground(new java.awt.Color(51, 51, 51));
        lblBookTab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookTab3.setText("Members");

        javax.swing.GroupLayout panBookTab3Layout = new javax.swing.GroupLayout(panBookTab3);
        panBookTab3.setLayout(panBookTab3Layout);
        panBookTab3Layout.setHorizontalGroup(
            panBookTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBookTab3Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(lblBookTab3, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(321, 321, 321))
        );
        panBookTab3Layout.setVerticalGroup(
            panBookTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookTab3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblBookTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtMSearch.setBackground(new java.awt.Color(251, 179, 135));
        txtMSearch.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        txtMSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtMSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMSearchKeyReleased(evt);
            }
        });

        mTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mTable.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        mTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mTable.setRowHeight(25);
        mTable.setRowMargin(5);
        mTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mTable);

        jPanel2.setBackground(new java.awt.Color(251, 179, 135));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Member Name");

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Contact No");

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Member Type");

        checkMember.setBackground(new java.awt.Color(251, 179, 135));
        checkMember.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        checkMember.setSelected(true);
        checkMember.setText("Member");

        checkAdmin.setBackground(new java.awt.Color(251, 179, 135));
        checkAdmin.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        checkAdmin.setText("Admin");

        txtMConNo.setBackground(new java.awt.Color(255, 204, 204));
        txtMConNo.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N

        txtMName.setBackground(new java.awt.Color(255, 204, 204));
        txtMName.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(checkMember, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(checkAdmin)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMConNo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMConNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMember)
                    .addComponent(checkAdmin))
                .addGap(18, 18, 18))
        );

        btnMAdd.setBackground(new java.awt.Color(233, 112, 93));
        btnMAdd.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnMAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnMAdd.setText("Add Member");
        btnMAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAddActionPerformed(evt);
            }
        });

        btnMUpgrade.setBackground(new java.awt.Color(233, 112, 93));
        btnMUpgrade.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnMUpgrade.setForeground(new java.awt.Color(51, 51, 51));
        btnMUpgrade.setLabel("Update Details");
        btnMUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUpgradeActionPerformed(evt);
            }
        });

        btnMDelete.setBackground(new java.awt.Color(233, 112, 93));
        btnMDelete.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnMDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnMDelete.setText("Delete Member");
        btnMDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMemberLayout = new javax.swing.GroupLayout(panMember);
        panMember.setLayout(panMemberLayout);
        panMemberLayout.setHorizontalGroup(
            panMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBookTab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMemberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(panMemberLayout.createSequentialGroup()
                .addGroup(panMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMemberLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMemberLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(panMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMUpgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panMemberLayout.setVerticalGroup(
            panMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMemberLayout.createSequentialGroup()
                .addComponent(panBookTab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMemberLayout.createSequentialGroup()
                        .addComponent(btnMAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnMUpgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnMDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(29, 29, 29))
        );

        panDetails.setBackground(new java.awt.Color(251, 179, 135));

        panBookTab4.setBackground(new java.awt.Color(233, 112, 93));
        panBookTab4.setForeground(new java.awt.Color(51, 51, 51));

        lblBookTab4.setBackground(new java.awt.Color(102, 102, 102));
        lblBookTab4.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
        lblBookTab4.setForeground(new java.awt.Color(51, 51, 51));
        lblBookTab4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookTab4.setText("Details");

        javax.swing.GroupLayout panBookTab4Layout = new javax.swing.GroupLayout(panBookTab4);
        panBookTab4.setLayout(panBookTab4Layout);
        panBookTab4Layout.setHorizontalGroup(
            panBookTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBookTab4Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(lblBookTab4, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addGap(321, 321, 321))
        );
        panBookTab4Layout.setVerticalGroup(
            panBookTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookTab4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblBookTab4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panDetailsLayout = new javax.swing.GroupLayout(panDetails);
        panDetails.setLayout(panDetailsLayout);
        panDetailsLayout.setHorizontalGroup(
            panDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBookTab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panDetailsLayout.setVerticalGroup(
            panDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDetailsLayout.createSequentialGroup()
                .addComponent(panBookTab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 625, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panContentLayout = new javax.swing.GroupLayout(panContent);
        panContent.setLayout(panContentLayout);
        panContentLayout.setHorizontalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panContentLayout.setVerticalGroup(
            panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panMenu.setBackground(new java.awt.Color(251, 147, 114));

        lblBookTab.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lblBookTab.setText("Books");
        lblBookTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookTabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panBookTabLayout = new javax.swing.GroupLayout(panBookTab);
        panBookTab.setLayout(panBookTabLayout);
        panBookTabLayout.setHorizontalGroup(
            panBookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBookTabLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblBookTab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panBookTabLayout.setVerticalGroup(
            panBookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBookTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBookTab, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblMemberTab.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lblMemberTab.setText("Members");
        lblMemberTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMemberTabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panMemberTabLayout = new javax.swing.GroupLayout(panMemberTab);
        panMemberTab.setLayout(panMemberTabLayout);
        panMemberTabLayout.setHorizontalGroup(
            panMemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMemberTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMemberTab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panMemberTabLayout.setVerticalGroup(
            panMemberTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMemberTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMemberTab, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDetailsTab.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lblDetailsTab.setText("Details");
        lblDetailsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDetailsTabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panDetailTabLayout = new javax.swing.GroupLayout(panDetailTab);
        panDetailTab.setLayout(panDetailTabLayout);
        panDetailTabLayout.setHorizontalGroup(
            panDetailTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDetailTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDetailsTab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panDetailTabLayout.setVerticalGroup(
            panDetailTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDetailTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDetailsTab, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panMenuLayout = new javax.swing.GroupLayout(panMenu);
        panMenu.setLayout(panMenuLayout);
        panMenuLayout.setHorizontalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBookTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panMemberTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panDetailTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMenuLayout.setVerticalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMenuLayout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(panBookTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panMemberTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panDetailTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void lblBookTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookTabMouseClicked
        panBook.setVisible(true);
        panMember.setVisible(false);
        panDetails.setVisible(false);
    }//GEN-LAST:event_lblBookTabMouseClicked

    private void lblMemberTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMemberTabMouseClicked
        panBook.setVisible(false);
        panMember.setVisible(true);
        panDetails.setVisible(false);
    }//GEN-LAST:event_lblMemberTabMouseClicked

    private void lblDetailsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetailsTabMouseClicked
        panBook.setVisible(false);
        panMember.setVisible(false);
        panDetails.setVisible(true);
    }//GEN-LAST:event_lblDetailsTabMouseClicked


    private void btnBUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUpgradeActionPerformed
        String btd[] = bc.getDataFromtable(bTable);

        String name = txtBName.getText();
        String author = txtBAuthor.getText();
        int year = txtBYear.getYear();

        if (name.isEmpty() || author.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select, You Need to Update Row!");
        } else {
            Book b = new Book(name, author, year);
            bc.updateBookDetails(b, bTable, bSearch, btd);
            bc.textFieldClear(txtBName, txtBAuthor, txtBYear);
        }
    }//GEN-LAST:event_btnBUpgradeActionPerformed

    private void btnBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBAddActionPerformed
        String name = txtBName.getText();
        String author = txtBAuthor.getText();
        int year = txtBYear.getYear();

        Book b = new Book(name, author, year);
        bc.addBook(b, bTable, bSearch);
        bc.textFieldClear(txtBName, txtBAuthor, txtBYear);
    }//GEN-LAST:event_btnBAddActionPerformed

    private void txtBSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBSearchKeyReleased
        bSearch = txtBSearch.getText();
        bc.searchBook(bSearch, bSearch, bTable);
    }//GEN-LAST:event_txtBSearchKeyReleased

    private void bTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTableMouseClicked

        String td[] = bc.getDataFromtable(bTable);
        txtBName.setText(td[0]);
        txtBAuthor.setText(td[1]);
        txtBYear.setYear(Integer.parseInt(td[2]));
    }//GEN-LAST:event_bTableMouseClicked

    private void btnBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDeleteActionPerformed
        String td[] = bc.getDataFromtable(bTable);
        int x = JOptionPane.showConfirmDialog(null, "Are you want to delete Book Details");

        if (x == 0) {
            bc.deleteBook(bTable, bSearch, td);
            JOptionPane.showMessageDialog(null, "Book Details Delete successfully.");
            bc.showOnTable(bTable, bSearch); // Refresh table data if necessary
            bc.textFieldClear(txtBName, txtBAuthor, txtBYear);
        }
    }//GEN-LAST:event_btnBDeleteActionPerformed


    private void btnMAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAddActionPerformed
        String name = txtMName.getText();
        String conNo = txtMConNo.getText();
        String type = "";

        if (checkMember.isSelected() && checkAdmin.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please Select Single Member Type!");
        } else if (checkAdmin.isSelected()) {
            type = "a";
        } else if (checkMember.isSelected()) {
            type = "u";
        }

        if (!name.isEmpty() && !conNo.isEmpty() && !type.isEmpty()) {

            Member m = new Member(name, conNo, type);
            mc.addMember(m, mTable, mSearch);
            mc.showOnTable(mTable, mSearch);
            mc.textFieldClear(txtMName, txtMConNo, checkAdmin, checkMember);

        } else {
            JOptionPane.showMessageDialog(null, "Please Insert Valid Details!");
        }
    }//GEN-LAST:event_btnMAddActionPerformed

    private void btnMUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUpgradeActionPerformed
        String mtd[] = mc.getDataFromtable(mTable);

        String name = txtMName.getText();
        String conNo = txtMConNo.getText();
        String type = "";

        if (checkMember.isSelected() && checkAdmin.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please Select Single Member Type!");
        } else if (checkAdmin.isSelected()) {
            type = "a";
        } else if (checkMember.isSelected()) {
            type = "u";
        }

        if (name.isEmpty() || conNo.isEmpty() || type.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select, You Need to Update Row!");
        } else {
            Member m = new Member(name, conNo, type);
            mc.updateMemberDetails(m, mTable, mSearch, mtd);
            mc.textFieldClear(txtMName, txtMConNo, checkAdmin, checkMember);
        }
    }//GEN-LAST:event_btnMUpgradeActionPerformed

    private void btnMDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDeleteActionPerformed
        String mtd[] = mc.getDataFromtable(mTable);
        int x = JOptionPane.showConfirmDialog(null, "Are you want to delete The Member Details");

        if (x == 0) {
            mc.deleteMember(mTable, mSearch, mtd);
            JOptionPane.showMessageDialog(null, "Member Details Delete successfully.");
            mc.showOnTable(mTable, mSearch); // Refresh table data if necessary
            mc.textFieldClear(txtMName, txtMConNo, checkAdmin, checkMember);
        }
    }//GEN-LAST:event_btnMDeleteActionPerformed

    private void txtMSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMSearchKeyReleased
        mSearch = txtMSearch.getText();
        mc.searchMember(mSearch, mSearch, mTable);
    }//GEN-LAST:event_txtMSearchKeyReleased

    private void mTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTableMouseClicked
        String mtd[] = mc.getDataFromtable(mTable);
        txtMName.setText(mtd[0]);
        txtMConNo.setText(mtd[1]);
        if ("a".equals(mtd[2])) {
            checkAdmin.setSelected(true);
            checkMember.setSelected(false);

        } else {
            checkAdmin.setSelected(false);
            checkMember.setSelected(true);
        }
    }//GEN-LAST:event_mTableMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminFrame().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bTable;
    private javax.swing.JButton btnBAdd;
    private javax.swing.JButton btnBDelete;
    private javax.swing.JButton btnBUpgrade;
    private javax.swing.JButton btnMAdd;
    private javax.swing.JButton btnMDelete;
    private javax.swing.JButton btnMUpgrade;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton checkAdmin;
    private javax.swing.JRadioButton checkMember;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBookTab;
    private javax.swing.JLabel lblBookTab1;
    private javax.swing.JLabel lblBookTab3;
    private javax.swing.JLabel lblBookTab4;
    private javax.swing.JLabel lblDetailsTab;
    private javax.swing.JLabel lblMemberTab;
    private javax.swing.JTable mTable;
    private javax.swing.JPanel panBook;
    private javax.swing.JPanel panBookTab;
    private javax.swing.JPanel panBookTab1;
    private javax.swing.JPanel panBookTab3;
    private javax.swing.JPanel panBookTab4;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panDetailTab;
    private javax.swing.JPanel panDetails;
    private javax.swing.JPanel panMember;
    private javax.swing.JPanel panMemberTab;
    private javax.swing.JPanel panMenu;
    private javax.swing.JTextField txtBAuthor;
    private javax.swing.JTextField txtBName;
    private javax.swing.JTextField txtBSearch;
    private com.toedter.calendar.JYearChooser txtBYear;
    private javax.swing.JTextField txtMConNo;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMSearch;
    // End of variables declaration//GEN-END:variables

    private void updateBookDetails(String name, String author, int year) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
