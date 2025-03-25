/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class BangChamCong {

    private String id;
    private String nvID;
    private String idLC;
    private int thang;
    private int nam;
    private int tongNgayLamViec;
    private int tongNgayNghi;
    private int tongNgayDiTre;
    private int tongGioTangCa;
    private String trangThai;

    public BangChamCong() {
    }

    public BangChamCong(String id, String nvID, String idLC, int thang, int nam, int tongNgayLamViec, int tongNgayNghi, int tongNgayDiTre, int tongGioTangCa, String trangThai) {
        this.id = id;
        this.nvID = nvID;
        this.idLC = idLC;
        this.thang = thang;
        this.nam = nam;
        this.tongNgayLamViec = tongNgayLamViec;
        this.tongNgayNghi = tongNgayNghi;
        this.tongNgayDiTre = tongNgayDiTre;
        this.tongGioTangCa = tongGioTangCa;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNvID() {
        return nvID;
    }

    public void setNvID(String nvID) {
        this.nvID = nvID;
    }

    public String getIdLC() {
        return idLC;
    }

    public void setIdLC(String idLC) {
        this.idLC = idLC;
    }

    public int getTongNgayLamViec() {
        return tongNgayLamViec;
    }

    public void setTongNgayLamViec(int tongNgayLamViec) {
        this.tongNgayLamViec = tongNgayLamViec;
    }

    public int getTongNgayNghi() {
        return tongNgayNghi;
    }

    public void setTongNgayNghi(int tongNgayNghi) {
        this.tongNgayNghi = tongNgayNghi;
    }

    public int getTongNgayDiTre() {
        return tongNgayDiTre;
    }

    public void setTongNgayDiTre(int tongNgayDiTre) {
        this.tongNgayDiTre = tongNgayDiTre;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getTongGioTangCa() {
        return tongGioTangCa;
    }

    public void setTongGioTangCa(int tongGioTangCa) {
        this.tongGioTangCa = tongGioTangCa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
}
