/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class LoaiCong {

    private String id;
    private String tenLC;
    private double heSoLuong;

    public LoaiCong() {
    }

    public LoaiCong(String id, String tenLC, double heSoLuong) {
        this.id = id;
        this.tenLC = tenLC;
        this.heSoLuong = heSoLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenLC() {
        return tenLC;
    }

    public void setTenLC(String tenLC) {
        this.tenLC = tenLC;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    
}
