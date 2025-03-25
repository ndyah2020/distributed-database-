
package DTO;

public class TaiKhoan {

    private String id;
    private String userName;
    private String pass;
    private String maNhomQuyen;
    private String trangThai;
    
    public TaiKhoan() {
    }

    public TaiKhoan(String id, String userName, String pass, String maNhomQuyen, String trangThai) {
        this.id = id;
        this.userName = userName;
        this.pass = pass;
        this.maNhomQuyen = maNhomQuyen;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMaNhomQuyen() {
        return maNhomQuyen;
    }

    public void setMaNhomQuyen(String maNhomQuyen) {
        this.maNhomQuyen = maNhomQuyen;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
