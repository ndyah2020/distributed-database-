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
public class DotTuyenDung {

   private String idTD;
   private String maNV;
   private LocalDate ngayUngTuyen;

    public DotTuyenDung() {
    }

    public DotTuyenDung(String id, String maNV, LocalDate ngayUngTuyen) {
        this.idTD = id;
        this.maNV = maNV;
        this.ngayUngTuyen = ngayUngTuyen;
    }

    public String getId() {
        return idTD;
    }

    public void setId(String id) {
        this.idTD = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public LocalDate getNgayTuyenDung() {
        return ngayUngTuyen;
    }

    public void setNgayTuyenDung(LocalDate ngayUngTuyen) {
        this.ngayUngTuyen = ngayUngTuyen;
    }
 
}
