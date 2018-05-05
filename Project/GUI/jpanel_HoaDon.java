/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.CT_PhieuDichVuBLL;
import BLL.HoaDonBLL;
import BLL.KhachHangBLL;
import BLL.PhieuDichVuBLL;
import BLL.PhieuThuePhongBLL;
import Entity.PhieuThuePhong;
import Utilities.ControlFormat;

/**
 *
 * @author RumIT
 */
public class jpanel_HoaDon extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_HoaDon
     */
    public jpanel_HoaDon() {
        initComponents();
        control.bindingHoaDon(table_HoaDon, hoadonBLL.layDanhSach());
        //cài đặt cbb tháng
        cbb_Thang.removeAllItems();
        cbb_Thang.addItem("Tất cả");
        cbb_Thang.addItem("1");
        cbb_Thang.addItem("2");
        cbb_Thang.addItem("3");
        cbb_Thang.addItem("4");
        cbb_Thang.addItem("5");
        cbb_Thang.addItem("6");
        cbb_Thang.addItem("7");
        cbb_Thang.addItem("8");
        cbb_Thang.addItem("9");
        cbb_Thang.addItem("10");
        cbb_Thang.addItem("11");
        cbb_Thang.addItem("12");
        cbb_Thang.setSelectedItem("Tất cả");
        
        //Cài đặt cbb năm
        cbb_Nam.removeAllItems();
        cbb_Nam.addItem("Tất cả");
        //Lấy tất cả các năm hóa đơn trong CSDL
        for(String nam : hoadonBLL.layDSNam()){
            cbb_Nam.addItem(nam);
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

        panel_bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_HoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_CTDV = new javax.swing.JTable();
        panel_PhieuThue = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_NgayKT = new javax.swing.JLabel();
        lb_NgayBD = new javax.swing.JLabel();
        lb_KhachNuocNgoai = new javax.swing.JLabel();
        lb_CMND = new javax.swing.JLabel();
        lb_TenKH = new javax.swing.JLabel();
        panel_TimKiem = new javax.swing.JPanel();
        lb_TimKiem = new javax.swing.JLabel();
        cbb_Thang = new javax.swing.JComboBox<>();
        cbb_Nam = new javax.swing.JComboBox<>();
        btn_Loc = new javax.swing.JButton();
        lb_Thang = new javax.swing.JLabel();
        lb_Nam = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1054, 491));
        setMinimumSize(new java.awt.Dimension(1054, 491));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1054, 491));

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));

        table_HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_HoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_HoaDon);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("CHI TIẾT PHIẾU DỊCH VỤ"));

        table_CTDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_CTDV);

        panel_PhieuThue.setBackground(new java.awt.Color(255, 255, 255));
        panel_PhieuThue.setBorder(javax.swing.BorderFactory.createTitledBorder("CHI TIẾT PHIẾU PHÒNG"));
        panel_PhieuThue.setMaximumSize(new java.awt.Dimension(432, 181));
        panel_PhieuThue.setMinimumSize(new java.awt.Dimension(432, 181));

        jLabel5.setText("CMND");

        jLabel3.setText("Khách nước ngoài?");

        jLabel2.setText("Ngày bắt đầu");

        jLabel1.setText("Tên khách hàng");

        jLabel4.setText("Ngày trả phòng");

        lb_NgayKT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_NgayBD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_KhachNuocNgoai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_CMND.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lb_TenKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout panel_PhieuThueLayout = new javax.swing.GroupLayout(panel_PhieuThue);
        panel_PhieuThue.setLayout(panel_PhieuThueLayout);
        panel_PhieuThueLayout.setHorizontalGroup(
            panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PhieuThueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PhieuThueLayout.createSequentialGroup()
                        .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_CMND, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_TenKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_NgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_PhieuThueLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(43, 43, 43)
                            .addComponent(lb_NgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_PhieuThueLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(lb_KhachNuocNgoai, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel_PhieuThueLayout.setVerticalGroup(
            panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PhieuThueLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TenKH)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lb_CMND))
                .addGap(18, 18, 18)
                .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_KhachNuocNgoai))
                .addGap(18, 18, 18)
                .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_NgayBD))
                .addGap(18, 18, 18)
                .addGroup(panel_PhieuThueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_NgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_PhieuThue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panel_PhieuThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_TimKiem.setBackground(new java.awt.Color(255, 255, 255));

        lb_TimKiem.setText("LỌC DANH SÁCH");

        cbb_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbb_Nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Loc.setText("LỌC");
        btn_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocActionPerformed(evt);
            }
        });

        lb_Thang.setForeground(new java.awt.Color(51, 51, 255));
        lb_Thang.setText("THÁNG");

        lb_Nam.setForeground(new java.awt.Color(0, 0, 153));
        lb_Nam.setText("NĂM");

        javax.swing.GroupLayout panel_TimKiemLayout = new javax.swing.GroupLayout(panel_TimKiem);
        panel_TimKiem.setLayout(panel_TimKiemLayout);
        panel_TimKiemLayout.setHorizontalGroup(
            panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_TimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Thang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbb_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Nam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbb_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Loc)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        panel_TimKiemLayout.setVerticalGroup(
            panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TimKiem)
                    .addComponent(cbb_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Loc)
                    .addComponent(lb_Thang)
                    .addComponent(lb_Nam))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    //Khởi tạo các đối tượng cần thiết
    ControlFormat control = new ControlFormat();
    HoaDonBLL hoadonBLL = new HoaDonBLL();
    KhachHangBLL khachBLL = new KhachHangBLL();
    PhieuThuePhongBLL phieuthueBLL = new PhieuThuePhongBLL();
    CT_PhieuDichVuBLL ctPhieuDVBLL = new CT_PhieuDichVuBLL();
    PhieuDichVuBLL phieudichvuBLL = new PhieuDichVuBLL();
    
    private void table_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_HoaDonMouseClicked
        int row = table_HoaDon.getSelectedRow();
        String maPhieuThue = table_HoaDon.getValueAt(row, 1).toString();
        //load dữ liệu
        //Lấy thông tin phiếu thuê
        PhieuThuePhong phieu = phieuthueBLL.layThongTin(maPhieuThue);
        //Lấy mã phòng ứng với mã phiếu thuê
        String maPhong = phieu.getMaPhong();
        //tên phòng
        //lb_TenPhong.setText(phongBLL.layTenPhong(maPhong));
        //
        lb_NgayBD.setText(phieu.getNgayBD());
        lb_NgayKT.setText(control.getToDay());
        if(phieu.getKHNgoaiQuoc().equals("1"))
            lb_KhachNuocNgoai.setText("Có");
        else
            lb_KhachNuocNgoai.setText("Không");
        String maKH = phieu.getMaKH();
        //từ mã khách hàng lấy tên
        lb_TenKH.setText(khachBLL.layTen(maKH));
        //từ mã khách hàng lấy cmnd
        lb_CMND.setText(khachBLL.layCMND(maKH));
        
        //
        //

        String mahd = hoadonBLL.getMaHD(maPhieuThue);
        String maPhieuDV = phieudichvuBLL.layMaPhieuDV(mahd);
        //lấy danh sách order và load lên bảng
        control.bindingOrder(table_CTDV, ctPhieuDVBLL.layDichVuTheoPhieu(maPhieuDV));
    }//GEN-LAST:event_table_HoaDonMouseClicked

    private void btn_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocActionPerformed
        //
        String thang = cbb_Thang.getSelectedItem().toString();
        String nam = cbb_Nam.getSelectedItem().toString();
        if(thang.equals("Tất cả")){
            if(nam.equals("Tất cả")){
                control.bindingHoaDon(table_HoaDon, hoadonBLL.layDanhSach());
            }else{
                control.bindingHoaDon(table_HoaDon, hoadonBLL.layDanhSachTheoNam(nam));
            }
        }else{
            if(nam.equals("Tất cả")){
                control.bindingHoaDon(table_HoaDon, hoadonBLL.layDanhSachTheoThang(thang));
            }else{
                control.bindingHoaDon(table_HoaDon, hoadonBLL.layDanhSachTheoThangVaNam(thang,nam));
            }
        }
    }//GEN-LAST:event_btn_LocActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Loc;
    private javax.swing.JComboBox<String> cbb_Nam;
    private javax.swing.JComboBox<String> cbb_Thang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_CMND;
    private javax.swing.JLabel lb_KhachNuocNgoai;
    private javax.swing.JLabel lb_Nam;
    private javax.swing.JLabel lb_NgayBD;
    private javax.swing.JLabel lb_NgayKT;
    private javax.swing.JLabel lb_TenKH;
    private javax.swing.JLabel lb_Thang;
    private javax.swing.JLabel lb_TimKiem;
    private javax.swing.JPanel panel_PhieuThue;
    private javax.swing.JPanel panel_TimKiem;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JTable table_CTDV;
    private javax.swing.JTable table_HoaDon;
    // End of variables declaration//GEN-END:variables
}
