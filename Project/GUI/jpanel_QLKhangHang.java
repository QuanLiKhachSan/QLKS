/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.KhachHangBLL;
import BLL.PhieuThuePhongBLL;
import Utilities.ControlFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author RumIT
 */
public class jpanel_QLKhangHang extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_QLKhangHang
     */
    public jpanel_QLKhangHang() {
        initComponents();
        control.bindingKhachHang(table_DSKhachHang, khachhangBLL.layDanhSach());
        table_DSKhachHang.getTableHeader().setReorderingAllowed(false);
        cbb_GioiTinh.removeAllItems();
        cbb_GioiTinh.addItem("");
        cbb_GioiTinh.addItem("Nam");
        cbb_GioiTinh.addItem("Nữ");
        cbb_GioiTinh.addItem("Không rõ");
        cbb_GioiTinh.setSelectedItem("");
        btn_Sua.setEnabled(false);
        btn_Xoa.setEnabled(false);
        btn_XacNhan.setEnabled(false);
        
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
        table_DSKhachHang = new javax.swing.JTable();
        panel_ThongTin = new javax.swing.JPanel();
        lb_TenKH = new javax.swing.JLabel();
        lb_CMND = new javax.swing.JLabel();
        lb_GioiTinh = new javax.swing.JLabel();
        lb_DiaChi = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        txt_CMND = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        cbb_GioiTinh = new javax.swing.JComboBox<>();
        btn_Xoa = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_XacNhan = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        panel_TimKiem = new javax.swing.JPanel();
        btn_TimKiem = new javax.swing.JButton();
        txt_TimKiem = new javax.swing.JTextField();
        lb_TimKiem = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(954, 438));
        setMinimumSize(new java.awt.Dimension(954, 438));
        setPreferredSize(new java.awt.Dimension(954, 438));

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));

        table_DSKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        table_DSKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DSKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_DSKhachHang);

        panel_ThongTin.setBackground(new java.awt.Color(255, 255, 255));
        panel_ThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN KHÁCH HÀNG"));

        lb_TenKH.setText("TÊN KHÁCH HÀNG");

        lb_CMND.setText("CMND");

        lb_GioiTinh.setText("GIỚI TÍNH");

        lb_DiaChi.setText("ĐỊA CHỈ");

        txt_DiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiaChiActionPerformed(evt);
            }
        });

        cbb_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Xoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/delete.png"))); // NOI18N
        btn_Xoa.setText("XÓA");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/plus.png"))); // NOI18N
        btn_Them.setText("THÊM");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_XacNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_XacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/xacnhan-24.png"))); // NOI18N
        btn_XacNhan.setText("XÁC NHẬN");
        btn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanActionPerformed(evt);
            }
        });

        btn_Sua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libs/image/pencil.png"))); // NOI18N
        btn_Sua.setText("SỬA");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ThongTinLayout = new javax.swing.GroupLayout(panel_ThongTin);
        panel_ThongTin.setLayout(panel_ThongTinLayout);
        panel_ThongTinLayout.setHorizontalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongTinLayout.createSequentialGroup()
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongTinLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_TenKH, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_GioiTinh)
                                .addComponent(lb_DiaChi))
                            .addComponent(lb_CMND))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongTinLayout.createSequentialGroup()
                        .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_XacNhan)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel_ThongTinLayout.setVerticalGroup(
            panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongTinLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TenKH)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_CMND)
                    .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_GioiTinh)
                    .addComponent(cbb_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_DiaChi)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        panel_TimKiem.setBackground(new java.awt.Color(255, 255, 255));

        btn_TimKiem.setText("TÌM KIẾM");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        lb_TimKiem.setText("TÌM KIẾM");

        javax.swing.GroupLayout panel_TimKiemLayout = new javax.swing.GroupLayout(panel_TimKiem);
        panel_TimKiem.setLayout(panel_TimKiemLayout);
        panel_TimKiemLayout.setHorizontalGroup(
            panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_TimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_TimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_TimKiemLayout.setVerticalGroup(
            panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_TimKiem)
                    .addComponent(btn_TimKiem))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //Khởi tạo các đối tượng cần thiết
    ControlFormat control = new ControlFormat();
    KhachHangBLL khachhangBLL = new KhachHangBLL();
    PhieuThuePhongBLL phieuthueBLL = new PhieuThuePhongBLL();   
    private void txt_DiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiaChiActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String key = txt_TimKiem.getText();
        control.bindingKhachHang(table_DSKhachHang, khachhangBLL.timkiem(key));
        txt_TimKiem.setText("");
        txt_TenKH.setText("");
        txt_CMND.setText("");
        cbb_GioiTinh.setSelectedItem("");
        txt_DiaChi.setText("");
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void table_DSKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DSKhachHangMouseClicked
        int row = table_DSKhachHang.getSelectedRow();
        txt_TenKH.setText(table_DSKhachHang.getValueAt(row, 0).toString());
        txt_CMND.setText(table_DSKhachHang.getValueAt(row, 1).toString());
        cbb_GioiTinh.setSelectedItem(table_DSKhachHang.getValueAt(row,2).toString());
        txt_DiaChi.setText(table_DSKhachHang.getValueAt(row, 3).toString());
        btn_Sua.setEnabled(true);
        btn_Xoa.setEnabled(true);

    }//GEN-LAST:event_table_DSKhachHangMouseClicked

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
 
        int row = table_DSKhachHang.getSelectedRow();
        String ten = txt_TenKH.getText();
        String cmnd = txt_CMND.getText();
        //kiểm tra cmnd mới này có hợp lệ k
        if(!control.kiemtraCMND(cmnd)){
            JOptionPane.showMessageDialog(this, "CMND không hợp lệ");
        }else{
        String gioitinh = cbb_GioiTinh.getSelectedItem().toString();
        String diachi = txt_DiaChi.getText();
        String cmndCu = table_DSKhachHang.getValueAt(row,1).toString();
        if(cmnd.equals(cmndCu)){
            //sửa bình thường
            if(khachhangBLL.suaKhachHang(ten, cmnd, gioitinh, diachi, cmndCu)){
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                //load lại dữ liệu
                control.bindingKhachHang(table_DSKhachHang, khachhangBLL.layDanhSach());
                //xóa dứ liệu trong textfield
                txt_TenKH.setText("");
                txt_CMND.setText("");
                cbb_GioiTinh.setSelectedItem("");
                txt_DiaChi.setText("");
                btn_Sua.setEnabled(false);
                btn_Xoa.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(this, "Không sửa được");
            }
        }else{
            //kiểm tra xem cmnd mới này có trùng với cmnd của các khách hàng khác k
            //nếu không => sửa bình thường
            if(khachhangBLL.layMaKH(cmnd).equals("")){
                if(khachhangBLL.suaKhachHang(ten, cmnd, gioitinh, diachi, cmndCu)){
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                //load lại dữ liệu
                control.bindingKhachHang(table_DSKhachHang, khachhangBLL.layDanhSach());
                //xóa dứ liệu trong textfield
                txt_TenKH.setText("");
                txt_CMND.setText("");
                cbb_GioiTinh.setSelectedItem("");
                txt_DiaChi.setText("");
                btn_Sua.setEnabled(false);
                btn_Xoa.setEnabled(false);

                }else{
                JOptionPane.showMessageDialog(this, "Không sửa được");
                }
            }else{//nếu có => báo lỗi   
                JOptionPane.showMessageDialog(this, "CMND mới sửa này bị trùng với người khác");
            }             
        }
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        //Lấy mã khách hàng của khách hàng ảo cmnd = 0;
        String makhAo = khachhangBLL.layMaTuCMND("0");
        String cmnd = txt_CMND.getText();
        String makhXoa = khachhangBLL.layMaTuCMND(cmnd);
        //chuyển mã khách hàng trong phiếu thuê phòng
        if(!phieuthueBLL.suaMaKH(makhAo, makhXoa))
                JOptionPane.showMessageDialog(this, "Lỗi khi chuyển mã khách hàng trong phiếu thuê");
        else{
            if(!khachhangBLL.xoaKhachHang(cmnd))
            JOptionPane.showMessageDialog(this, "Không xóa được khách hàng");
            else{
                JOptionPane.showMessageDialog(this, "Đã xóa khách hàng");
                //load lại dữ liệu
                control.bindingKhachHang(table_DSKhachHang, khachhangBLL.layDanhSach());
                //xóa dứ liệu trong textfield
                txt_TenKH.setText("");
                txt_CMND.setText("");
                cbb_GioiTinh.setSelectedItem("");
                txt_DiaChi.setText("");
                btn_Sua.setEnabled(false);
                btn_Xoa.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        txt_TenKH.setText("");
        txt_CMND.setText("");
        cbb_GioiTinh.setSelectedItem("");
        txt_DiaChi.setText("");
        btn_Sua.setEnabled(false);
        btn_Xoa.setEnabled(false);
        btn_Them.setEnabled(false);
        btn_XacNhan.setEnabled(true);
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanActionPerformed
        String ten = txt_TenKH.getText();
        String CMND = txt_CMND.getText();
        if(!control.kiemtraCMND(CMND)||!khachhangBLL.layMaKH(CMND).equals(""))
        {
            JOptionPane.showMessageDialog(this, "CMND không hợp lên hoặc bị trùng");
        }else{
        String gioitinh = cbb_GioiTinh.getSelectedItem().toString();
        String diachi = txt_DiaChi.getText();
        //thêm khách hàng mới
        if(gioitinh.equals("")||diachi.equals("")||ten.equals("")){
            JOptionPane.showMessageDialog(this, "Bạn nhập thiếu dữ liệu");
        }else{
        khachhangBLL.themKH(CMND, ten, gioitinh, diachi);
        //load lại dữ liệu
        control.bindingKhachHang(table_DSKhachHang, khachhangBLL.layDanhSach());
        //xóa dứ liệu trong textfield
        txt_TenKH.setText("");
        txt_CMND.setText("");
        cbb_GioiTinh.setSelectedItem("");
        txt_DiaChi.setText("");
        btn_Sua.setEnabled(false);
        btn_Xoa.setEnabled(false);
        btn_XacNhan.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
        }
    }//GEN-LAST:event_btn_XacNhanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_XacNhan;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbb_GioiTinh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_CMND;
    private javax.swing.JLabel lb_DiaChi;
    private javax.swing.JLabel lb_GioiTinh;
    private javax.swing.JLabel lb_TenKH;
    private javax.swing.JLabel lb_TimKiem;
    private javax.swing.JPanel panel_ThongTin;
    private javax.swing.JPanel panel_TimKiem;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JTable table_DSKhachHang;
    private javax.swing.JTextField txt_CMND;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
