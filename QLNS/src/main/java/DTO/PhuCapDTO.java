
package DTO;

/**
 *
 * @author Admin
 */
public class PhuCapDTO {

    private String id;
    private String tenPC;
    private double soTien;
    private String donViTinh;

    public PhuCapDTO() {
    }

    public PhuCapDTO(String id, String tenPC, double soTien, String donViTinh) {
        this.id = id;
        this.tenPC = tenPC;
        this.soTien = soTien;
        this.donViTinh = donViTinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return tenPC;
    }

    public void setTen(String ten) {
        this.tenPC = ten;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }
    
    
}
