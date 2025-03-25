/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class LoaiHDDTO {

    private String id;
    private String tenLoai;
    private String hinhThucKy;
    private int thoiHan;
    private float bhyt;
    private float bhxh;
    private float bhtn;
    private float thue_TNCN;

    public LoaiHDDTO() {
    }

    public LoaiHDDTO(String id, String tenLoai, String hinhThucKy, int thoiHan, float bhyt, float bhxh, float bhtn, float thue_TNCN) {
        this.id = id;
        this.tenLoai = tenLoai;
        this.hinhThucKy = hinhThucKy;
        this.thoiHan = thoiHan;
        this.bhyt = bhyt;
        this.bhxh = bhxh;
        this.bhtn = bhtn;
        this.thue_TNCN = thue_TNCN;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getHinhThucKy() {
        return hinhThucKy;
    }

    public void setHinhThucKy(String hinhThucKy) {
        this.hinhThucKy = hinhThucKy;
    }

    public int getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(int thoiHan) {
        this.thoiHan = thoiHan;
    }

    public float getBhyt() {
        return bhyt;
    }

    public void setBhyt(float bhyt) {
        this.bhyt = bhyt;
    }

    public float getBhxh() {
        return bhxh;
    }

    public void setBhxh(float bhxh) {
        this.bhxh = bhxh;
    }

    public float getBhtn() {
        return bhtn;
    }

    public void setBhtn(float bhtn) {
        this.bhtn = bhtn;
    }

    public float getThue_TNCN() {
        return thue_TNCN;
    }

    public void setThue_TNCN(float thue_TNCN) {
        this.thue_TNCN = thue_TNCN;
    }
    
    
}
