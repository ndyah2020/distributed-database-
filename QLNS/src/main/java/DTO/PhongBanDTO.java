/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class PhongBanDTO {

    private String id;
    private String tenPB;
    private String diaChi;
    private String ngayThanhLap;

    public PhongBanDTO() {
    }

    public PhongBanDTO(String id, String tenPB, String diaChi, String ngayThanhLap) {
        this.id = id;
        this.tenPB = tenPB;
        this.diaChi = diaChi;
        this.ngayThanhLap = ngayThanhLap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayThanhLap() {
        return ngayThanhLap;
    }

    public void setNgayThanhLap(String ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }
    
    
}
