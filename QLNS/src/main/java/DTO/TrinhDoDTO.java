/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class TrinhDoDTO {

    private String id;
    private String tenTD;

    public TrinhDoDTO() {
    }

    public TrinhDoDTO(String id, String tenTD) {
        this.id = id;
        this.tenTD = tenTD;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenTD() {
        return tenTD;
    }

    public void setTenTD(String tenTD) {
        this.tenTD = tenTD;
    }
    
    
}
