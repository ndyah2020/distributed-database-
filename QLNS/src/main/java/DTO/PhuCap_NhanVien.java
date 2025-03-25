/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class PhuCap_NhanVien {

    private String idNV;
    private String idPC;
    private LocalDate ngayPC;
    private double tongPC;

    public PhuCap_NhanVien() {
    }

    public PhuCap_NhanVien(String idNV, String idPC, LocalDate ngayPC, double tongPC) {
        this.idNV = idNV;
        this.idPC = idPC;
        this.ngayPC = ngayPC;
        this.tongPC = tongPC;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getIdPC() {
        return idPC;
    }

    public void setIdPC(String idPC) {
        this.idPC = idPC;
    }

    public LocalDate getNgayPC() {
        return ngayPC;
    }

    public void setNgayPC(LocalDate ngayPC) {
        this.ngayPC = ngayPC;
    }

    public double getTongPC() {
        return tongPC;
    }

    public void setTongPC(double tongPC) {
        this.tongPC = tongPC;
    }
    
    
}
