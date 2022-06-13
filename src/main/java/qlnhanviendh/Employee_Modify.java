package qlnhanviendh;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Employee_Modify {
    private static Connection conn;

    public static void set_connect(Connection connect) {
        conn = connect;
    }
    
    public static ArrayList<Employee> querry_manv() {
        ArrayList<Employee> arr_manv = new ArrayList<Employee>();
        try {
            Statement statement = conn.createStatement();

            String sql = "SELECT Manv FROM nhanvien";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Employee sv = new Employee();
                sv.setManv(result.getString("Manv"));
                arr_manv.add(sv);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return arr_manv;
    }
    
    public static String querry_one_manv(String manv_) {
        String querry_manv = null;
        try {
            Statement statement = conn.createStatement();

            String sql = "SELECT Manv FROM nhanvien WHERE Manv LIKE '" + manv_ + "'";
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                querry_manv = result.getString("Manv");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return querry_manv;
    }
    
    public static Employee get_Info_NV_by_manv(String manv_) {
        Employee nv = new Employee();
        try {
            String sql = "SELECT * FROM nhanvien WHERE Manv LIKE '" + manv_ + "'";

            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);

            while (result.next()) {
                nv.setManv(result.getString(1));
                nv.setTennv(result.getString(2));
                nv.setGioitinh(result.getString(3));
                nv.setNgaysinh(result.getString(4));
                nv.setSdt(result.getString(5));
                nv.setEmail(result.getString(6));
                nv.setChucvu(result.getString(7));
                nv.setLuong(Integer.parseInt(result.getString(8)));
            }
            st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return nv;
    }

    public static ArrayList<Employee> nhanvien_list() {
        ArrayList<Employee> list_nv = new ArrayList<Employee>();
        try {
            String sql = "SELECT * FROM nhanvien";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()) {
                Employee n = new Employee();
                n.setManv(result.getString("Manv"));
                n.setTennv(result.getString("Hoten"));
                n.setGioitinh(result.getString("Gioitinh"));
                n.setNgaysinh(result.getString("Ngaysinh"));
                n.setSdt(result.getString("SDT"));
                n.setEmail(result.getNString("Email"));
                n.setChucvu(result.getString("Chucvu"));
                n.setLuong(result.getInt("Luong"));

                list_nv.add(n);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list_nv;
    }

    public static void insert_nv(Employee nv) {
        try {
            String sql = "INSERT INTO nhanvien values (? , ? , ? , ? , ? , ? , ? , ?)";
            PreparedStatement preStatement = conn.prepareStatement(sql);
            
            preStatement.setString(1, nv.getManv());
            preStatement.setString(2, nv.getTennv());
            preStatement.setString(3, nv.getGioitinh());
            preStatement.setString(4, nv.getNgaysinh());
            preStatement.setString(5, nv.getSdt());
            preStatement.setString(6, nv.getEmail());
            preStatement.setString(7, nv.getChucvu());
            preStatement.setInt(8, nv.getLuong());

            preStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void update_nv(Employee nv) {
        try {
            String sql_ = "SELECT * FROM nhanvien WHERE Manv LIKE '" + nv.getManv() + "'";

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql_);
            
            String manv_ = null , hoten_ = null, gioitinh_ = null,chucvu_ = null , ngaysinh_ = null ,sdt_ = null, email_ = null;
            int luong_ = -999;
            while (result.next()) {
                manv_ = result.getString("Manv");
                hoten_ = result.getString("Hoten");
                gioitinh_ = result.getString("Gioitinh");
                chucvu_ = result.getString("Chucvu");
                ngaysinh_ = result.getString("Ngaysinh");
                sdt_ = result.getString("SDT");
                email_ = result.getString("Email");
                luong_ = result.getInt("Luong");
            }

            if (hoten_.equals(nv.getTennv()) == false) {
                try {
                    String sql = "UPDATE nhanvien SET Hoten = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, nv.getTennv());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

            if (gioitinh_.equals(nv.getGioitinh()) == false) {
                try {
                    String sql = "UPDATE nhanvien SET Gioitinh = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, nv.getGioitinh());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

            if (chucvu_.equals(nv.getChucvu()) == false) {
                try {
                    String sql = "UPDATE nhanvien SET Chucvu = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, nv.getChucvu());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

            if (ngaysinh_.equals(nv.getNgaysinh()) == false) {
                try {
                    String sql = "UPDATE nhanvien SET Ngaysinh = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, nv.getNgaysinh());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            
            if (sdt_.equals(nv.getSdt()) == false) {
                try {
                    String sql = "UPDATE nhanvien SET SDT = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, nv.getSdt());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            
            if (email_.equals(nv.getEmail()) == false) {
                try {
                    String sql = "UPDATE nhanvien SET Email = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setString(1, nv.getEmail());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            
            if (luong_ != nv.getLuong()) {
                try {
                    String sql = "UPDATE nhanvien SET Luong = ? WHERE Manv LIKE " + '?';
                    PreparedStatement preStatement = conn.prepareStatement(sql);
                    preStatement.setInt(1, nv.getLuong());
                    preStatement.setString(2, nv.getManv());
                    preStatement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void delete_nv(String manv) {
        try {
            String sql = "DELETE FROM nhanvien WHERE Manv LIKE '" + manv + "'";

            PreparedStatement preStatement = conn.prepareStatement(sql);

            preStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static ArrayList<Employee> search_nv(Employee nv) {
        ArrayList<Employee> nv_list = new ArrayList<Employee>();
        try {
            if (nv.getManv() != null) {
                String sql_masv = "SELECT * FROM nhanvien WHERE Manv LIKE '" + nv.getManv() + "'";

                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql_masv);

                while (result.next()) {
                    Employee nv_ = new Employee();
                    nv_.setManv(result.getString(1));
                    nv_.setTennv(result.getString(2));
                    nv_.setGioitinh(result.getString(3));
                    nv_.setNgaysinh(result.getString(4));
                    nv_.setSdt(result.getString(5));
                    nv_.setEmail(result.getString(6));
                    nv_.setChucvu(result.getString(7));
                    nv_.setLuong(result.getInt(8));

                    nv_list.add(nv_);
                }
            }
            
            if (nv.getTennv() != null) {
                String sql_hoten = "SELECT * FROM nhanvien WHERE Hoten LIKE '%" + nv.getTennv() + "'";

                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql_hoten);

                while (result.next()) {
                    Employee nv_ = new Employee();
                    nv_.setManv(result.getString(1));
                    nv_.setTennv(result.getString(2));
                    nv_.setGioitinh(result.getString(3));
                    nv_.setNgaysinh(result.getString(4));
                    nv_.setSdt(result.getString(5));
                    nv_.setEmail(result.getString(6));
                    nv_.setChucvu(result.getString(7));
                    nv_.setLuong(result.getInt(8));

                    nv_list.add(nv_);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return nv_list;
    }
}