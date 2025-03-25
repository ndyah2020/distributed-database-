
package DTO;

import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class HopDong {

    private String soHD;
    private String nvID;
    private String loaiHD;
    private LocalDate ngayKy;
    private Time gioKy;
    private LocalDate ngayBD;
    private LocalDate ngayKT;
    private double luongCB;
    private String trangthai;

    public HopDong() {
    }

    public HopDong(String soHD, String nvID, String loaiHD, LocalDate ngayKy, Time gioKy, LocalDate ngayBD, LocalDate ngayKT, double luongCB, String trangthai) {
        this.soHD = soHD;
        this.nvID = nvID;
        this.loaiHD = loaiHD;
        this.ngayKy = ngayKy;
        this.gioKy = gioKy;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.luongCB = luongCB;
        this.trangthai = trangthai;
    }

    
    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getNvID() {
        return nvID;
    }

    public void setNvID(String nvID) {
        this.nvID = nvID;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }

    public LocalDate getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(LocalDate ngayKy) {
        this.ngayKy = ngayKy;
    }

    public Time getGioKy() {
        return gioKy;
    }

    public void setGioKy(Time gioKy) {
        this.gioKy = gioKy;
    }

    public LocalDate getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(LocalDate ngayBD) {
        this.ngayBD = ngayBD;
    }

    public LocalDate getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(LocalDate ngayKT) {
        this.ngayKT = ngayKT;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    
    
}
