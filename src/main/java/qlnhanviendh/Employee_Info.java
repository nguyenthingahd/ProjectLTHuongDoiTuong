package qlnhanviendh;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class Employee_Info extends javax.swing.JFrame {

    DefaultTableModel tablemodel;
    public Employee_Info() {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_nv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Thong Tin Nhan Vien Truong Dai Hoc Phenikaa");

        table_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "So thu Tu", "Ma Nhan Vien", "Ho Va Ten", "Gioi Tinh", "Ngay Sinh", "So Dien Thoai", "Email", "Chuc Vu", "Luong"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_nv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void info_nv() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (Connect_mysql.connect_mysql() == null) {
                    System.out.println("Loi ket noi voi mysql!");
                    return;
                }
                
                Employee_Modify.set_connect(Connect_mysql.connect_mysql());
                Account_Activity.set_connect_mysql(Connect_mysql.connect_mysql());
                new Employee_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_nv;
    // End of variables declaration//GEN-END:variables
}
