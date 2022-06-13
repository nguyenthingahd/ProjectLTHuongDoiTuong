package qlnhanviendh;

public class Employee {
    private String Manv;
    private String Tennv;
    private String Gioitinh;
    private String Chucvu;
    private String Ngaysinh;
    private String Sdt;
    private String Email;
    private int Luong;

    public Employee() {
    }

    public Employee(String Manv , String Tennv , String Gioitinh , String Chucvu , String Ngaysinh , String Sdt , String Email , int Luong) {
        this.Manv = Manv;
        this.Tennv = Tennv;
        this.Gioitinh = Gioitinh;
        this.Chucvu = Chucvu;
        this.Ngaysinh = Ngaysinh;
        this.Sdt = Sdt;
        this.Email = Email;
        this.Luong = Luong;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
}