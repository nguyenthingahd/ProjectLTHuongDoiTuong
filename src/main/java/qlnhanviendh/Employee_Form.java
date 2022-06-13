package qlnhanviendh;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

public class Employee_Form extends JFrame {
    DefaultTableModel tablemodel;

    public Employee_Form() {
        initComponents();
        setLocationRelativeTo(null);
        table_nv.setRowHeight(table_nv.getRowHeight() + 10);
        tablemodel = (DefaultTableModel) table_nv.getModel();
        show_list_nv();
    }

    private void show_list_nv() {
        tablemodel = (DefaultTableModel) table_nv.getModel();
        ArrayList<Employee> list_nv = Employee_Modify.nhanvien_list();
        tablemodel.setNumRows(0);

        table_nv.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 18));

        for (Employee nv : list_nv) {
            tablemodel.addRow(new Object[]{
                tablemodel.getRowCount() + 1 , nv.getManv(), nv.getTennv(), nv.getGioitinh(), nv.getChucvu(), nv.getNgaysinh(), nv.getSdt(), nv.getEmail(), nv.getLuong()
            }
            );
        }
    }

    private void resetForm() {
        txtmanv.setText("");
        txthoten.setText("");
        cbgioitinh.setSelectedIndex(0);
        cbchucvu.setSelectedIndex(0);
        txtngaysinh.setText("");
        txtsodt.setText("");
        txtemail.setText("");
        txtluong.setText("");
    }

    private boolean checkValidForm() {
        if (txtmanv.getText().isEmpty() || txthoten.getText().isEmpty() || txtngaysinh.getText().isEmpty() || txtsodt.getText().isEmpty() || txtemail.getText().isEmpty() || txtluong.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void setmodel(Employee nv) {
        txtmanv.setText(nv.getManv());
        txthoten.setText(nv.getTennv());
        cbgioitinh.setSelectedItem(nv.getGioitinh());
        txtngaysinh.setText(nv.getNgaysinh());
        txtsodt.setText(nv.getSdt());
        txtemail.setText(nv.getEmail());
        cbchucvu.setSelectedItem(nv.getChucvu());
        txtluong.setText(String.valueOf(nv.getLuong()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_gioitinh = new javax.swing.ButtonGroup();
        label_header = new javax.swing.JLabel();
        labelmanv = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        labelhoten = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        labelgioitinh = new javax.swing.JLabel();
        labelchucvu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbchucvu = new javax.swing.JComboBox<>();
        labelngaysinh = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        labelsdt = new javax.swing.JLabel();
        txtsodt = new javax.swing.JTextField();
        labelemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        labelluong = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        button_add = new javax.swing.JButton();
        button_update = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_nv = new javax.swing.JTable();
        button_reset = new javax.swing.JButton();
        cbgioitinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_header.setText("Phần mềm quản lý nhân viên trường đại học PKA");

        labelmanv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelmanv.setText("Mã nhân viên");

        txtmanv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelhoten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelhoten.setText("Họ và tên");

        txthoten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelgioitinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelgioitinh.setText("Giới tính");

        labelchucvu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelchucvu.setText("Chức vụ");

        cbchucvu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbchucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảng viên", "Phòng đào tạo", "Phòng hành chính", "Bảo vệ", "Phòng cộng tác sinh viên" }));
        cbchucvu.setToolTipText("");

        labelngaysinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelngaysinh.setText("Ngày sinh");

        txtngaysinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelsdt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelsdt.setText("Số điện thoại");

        txtsodt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelemail.setText("Email");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelluong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelluong.setText("Lương");

        txtluong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        button_add.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button_add.setText("Thêm");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_update.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button_update.setText("Chỉnh sửa");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        button_delete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button_delete.setText("Xóa");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_search.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button_search.setText("Tìm kiếm");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        table_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã nhân viên", "Họ tên", "Giới tính", "Chức vụ", "Ngày sinh", "SDT", "Email", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_nv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_nvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_nv);

        button_reset.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button_reset.setText("Làm mới");
        button_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resetActionPerformed(evt);
            }
        });

        cbgioitinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelhoten)
                    .addComponent(labelmanv)
                    .addComponent(labelgioitinh)
                    .addComponent(labelchucvu))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelsdt)
                    .addComponent(labelluong)
                    .addComponent(labelngaysinh)
                    .addComponent(labelemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(button_update)
                        .addGap(85, 85, 85)
                        .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(button_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(button_search))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(label_header)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_header)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelmanv)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(labelngaysinh)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelhoten)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsdt)
                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelgioitinh)
                    .addComponent(labelemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelchucvu)
                    .addComponent(cbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelluong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_delete)
                    .addComponent(button_search)
                    .addComponent(button_update)
                    .addComponent(button_reset)
                    .addComponent(button_add))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        if (!checkValidForm()) {
            JOptionPane.showMessageDialog(this, "Ban chua nhap du thong tin!");
            return;
        } else {
            ArrayList<Employee> arr_sv = Employee_Modify.querry_manv();
            try {
                Employee nv = new Employee();
                nv.setManv(txtmanv.getText());
                nv.setTennv(txthoten.getText());
                nv.setGioitinh(cbgioitinh.getSelectedItem().toString());
                nv.setChucvu(cbchucvu.getSelectedItem().toString());
                nv.setNgaysinh(txtngaysinh.getText());
                nv.setSdt(txtsodt.getText());
                nv.setEmail(txtemail.getText());
                nv.setLuong(Integer.parseInt(txtluong.getText()));

                for (Employee nv_ : arr_sv) {
                    if (nv_.getManv().equals(nv.getManv()) == true) {
                        JOptionPane.showMessageDialog(this, "Ma Nhan Vien Da Ton Tai , Vui Long Nhap Lai Ma Nhan Vien!");
                        return;
                    }
                }

                Employee_Modify.insert_nv(nv);
                JOptionPane.showMessageDialog(this, "Da Them Thong Tin Thanh Cong!");

                show_list_nv();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        resetForm();
    }//GEN-LAST:event_button_addActionPerformed

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        if (!checkValidForm()) {
            JOptionPane.showMessageDialog(this, "Ban Chua Nhap Du Thong Tin!");
        } else {
            Employee nv_querry = Employee_Modify.get_Info_NV_by_manv(txtmanv.getText());
            if(nv_querry.getManv() == null){
                JOptionPane.showMessageDialog(this, "Thong Tin Nhan Vien Chua Duoc Tao Lap!");
                show_list_nv();
                return;
            }
            if(nv_querry.getManv().equals(txtmanv.getText()) == true && 
                    (nv_querry.getTennv().equals(txthoten.getText()) == true && 
                    (nv_querry.getGioitinh().equals(cbgioitinh.getSelectedItem().toString()) == true) && 
                    (nv_querry.getChucvu().equals(cbchucvu.getSelectedItem().toString())) == true && 
                    (nv_querry.getNgaysinh().equals(txtngaysinh.getText())) == true) && 
                    (nv_querry.getSdt().equals(txtsodt.getText())) == true && 
                    (nv_querry.getEmail().equals(txtemail.getText())) == true &&
                    (nv_querry.getLuong() == (Integer.parseInt(txtluong.getText())))) 
            {
                JOptionPane.showMessageDialog(this, "Cac Truong Thong Tin Nhan Vien Chua Duoc Thay Doi!");
                show_list_nv();
                return;
            }
            
            String manv_querry = Employee_Modify.querry_one_manv(txtmanv.getText());
            if (manv_querry != null) {
                Employee nv = new Employee();
                nv.setManv(txtmanv.getText());
                nv.setTennv(txthoten.getText());
                nv.setGioitinh(cbgioitinh.getSelectedItem().toString());
                nv.setChucvu(cbchucvu.getSelectedItem().toString());
                nv.setNgaysinh(txtngaysinh.getText());
                nv.setSdt(txtsodt.getText());
                nv.setEmail(txtemail.getText());
                nv.setLuong(Integer.parseInt(txtluong.getText()));

                Employee_Modify.update_nv(nv);
                JOptionPane.showMessageDialog(this, "Da Chinh Sua Thanh Cong!");
            } else {
                JOptionPane.showMessageDialog(this, "Thong Tin Nhan Vien Chua Duoc Tao Lap!");
                show_list_nv();
                return;
            }
            show_list_nv();
            resetForm();
        }
    }//GEN-LAST:event_button_updateActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        if (txtmanv.getText().isEmpty() == true) {
            String input = JOptionPane.showInputDialog(this, "Nhap Ma Nhan Vien Can Xoa : ");
            if (input != null && input.length() > 0) {
                String manv_input = input;
                String manv_querry = Employee_Modify.querry_one_manv(manv_input);
                if (manv_querry != null) {
                    manv_input = input;
                    int select = JOptionPane.showConfirmDialog(this, "Ban Co Muon Xoa Thong Tin Khong?");
                    if (select == 0) {
                        Employee_Modify.delete_nv(manv_input);
                        JOptionPane.showMessageDialog(this, "Da Xoa Thanh Cong!");
                    } else {
                        resetForm();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ma Nhan Vien Nhap Chua Dung , Vui Long Nhap Lai!");
                }
            }
        } else {
            String manv_ = txtmanv.getText();

            String querry_manv = Employee_Modify.querry_one_manv(manv_);

            if (querry_manv != null) {
                int select = JOptionPane.showConfirmDialog(this, "Ban Co Muon Xoa Thong Tin Khong?");
                if (select == 0) {
                    Employee_Modify.delete_nv(manv_);
                    JOptionPane.showMessageDialog(this, "Da Xoa Thanh Cong!");
                    resetForm();
                } else {
                    resetForm();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ma Nhan Vien Nhap Chua Dung , Vui Long Nhap Lai!");
            }
        }
        show_list_nv();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhap Ma Nhan Vien / Ho Ten Nhan Vien Can Tim Kiem : ");
        if (input != null && input.length() > 0) {
            Employee nv = new Employee();
            nv.setManv(input);
            nv.setTennv(input);

            ArrayList<Employee> nv_list = Employee_Modify.search_nv(nv);

            if (nv_list.isEmpty() == true) {
                JOptionPane.showMessageDialog(this, "Khong Tim Kiem Duoc Thong Tin!");
                resetForm();
                show_list_nv();
            } else {
                tablemodel.setNumRows(0);
                for (Employee nv_ : nv_list) {
                    setmodel(nv_);
                    tablemodel.addRow(new Object[]{
                        tablemodel.getRowCount() + 1 , nv_.getManv(), nv_.getTennv(), nv_.getGioitinh(), nv_.getChucvu(), nv_.getNgaysinh(), nv_.getSdt(), nv_.getEmail(), nv_.getLuong()
                    }
                    );
                }
            }
        } else {
            show_list_nv();
        }
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resetActionPerformed
        resetForm();
        show_list_nv();
    }//GEN-LAST:event_button_resetActionPerformed

    private void table_nvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nvMouseClicked
        int manv = table_nv.rowAtPoint(evt.getPoint());
        String str_manv = table_nv.getValueAt(manv, 1).toString();
        Employee nv = Employee_Modify.get_Info_NV_by_manv(str_manv);
        setmodel(nv);
    }//GEN-LAST:event_table_nvMouseClicked

    public static void get_employee_form() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (Connect_mysql.connect_mysql() == null) {
                    System.out.println("Loi ket noi voi mysql!");
                    return;
                }

                Employee_Modify.set_connect(Connect_mysql.connect_mysql());
                new Employee_Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gioitinh;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_reset;
    private javax.swing.JButton button_search;
    private javax.swing.JButton button_update;
    private javax.swing.JComboBox<String> cbchucvu;
    private javax.swing.JComboBox<String> cbgioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_header;
    private javax.swing.JLabel labelchucvu;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labelgioitinh;
    private javax.swing.JLabel labelhoten;
    private javax.swing.JLabel labelluong;
    private javax.swing.JLabel labelmanv;
    private javax.swing.JLabel labelngaysinh;
    private javax.swing.JLabel labelsdt;
    private javax.swing.JTable table_nv;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtsodt;
    // End of variables declaration//GEN-END:variables
}