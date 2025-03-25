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
public class TuyenDungDTO {

    private String id;
    private String viTriTD;
    private String hocVan;
    private String gioiTinh;
    private int doTuoi;
    private int soLuong;
    private LocalDate hanTD;
    private double mucLuongToiThieu;
    private double mucLuongToiDa;
    private int soLuongNopHoSo;
    private int soLuongDaTuyen;
    
    public TuyenDungDTO() {
    }

    public TuyenDungDTO(String id, String viTriTD, String hocVan, String gioiTinh, int doTuoi, int soLuong, LocalDate hanTD, double mucLuongToiThieu, double mucLuongToiDa, int soLuongNopHoSo, int soLuongDaTuyen) {
        this.id = id;
        this.viTriTD = viTriTD;
        this.hocVan = hocVan;
        this.gioiTinh = gioiTinh;
        this.doTuoi = doTuoi;
        this.soLuong = soLuong;
        this.hanTD = hanTD;
        this.mucLuongToiThieu = mucLuongToiThieu;
        this.mucLuongToiDa = mucLuongToiDa;
        this.soLuongNopHoSo = soLuongNopHoSo;
        this.soLuongDaTuyen = soLuongDaTuyen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getViTriTD() {
        return viTriTD;
    }

    public void setViTriTD(String viTriTD) {
        this.viTriTD = viTriTD;
    }

    public String getHocVan() {
        return hocVan;
    }

    public void setHocVan(String hocVan) {
        this.hocVan = hocVan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(int doTuoi) {
        this.doTuoi = doTuoi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public LocalDate getHanTD() {
        return hanTD;
    }

    public void setHanTD(LocalDate hanTD) {
        this.hanTD = hanTD;
    }

    public double getMucLuongToiThieu() {
        return mucLuongToiThieu;
    }

    public void setMucLuongToiThieu(double mucLuongToiThieu) {
        this.mucLuongToiThieu = mucLuongToiThieu;
    }

    public double getMucLuongToiDa() {
        return mucLuongToiDa;
    }

    public void setMucLuongToiDa(double mucLuongToiDa) {
        this.mucLuongToiDa = mucLuongToiDa;
    }

    public int getSoLuongNopHoSo() {
        return soLuongNopHoSo;
    }

    public void setSoLuongNopHoSo(int soLuongNopHoSo) {
        this.soLuongNopHoSo = soLuongNopHoSo;
    }

    public int getSoLuongDaTuyen() {
        return soLuongDaTuyen;
    }

    public void setSoLuongDaTuyen(int soLuongDaTuyen) {
        this.soLuongDaTuyen = soLuongDaTuyen;
    }
   
}
