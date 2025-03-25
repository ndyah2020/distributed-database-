
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietBangCong {

    private String id;
    private String idBC;
    private int ngayLamViec;
    private int gioVao;
    private int gioRa;
    private int gioTangCa;
    private String trangThai;

    public ChiTietBangCong() {
    }

    public ChiTietBangCong(String id, String idBC, int ngayLamViec, int gioVao, int gioRa, int gioTangCa, String trangThai) {
        this.id = id;
        this.idBC = idBC;
        this.ngayLamViec = ngayLamViec;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.gioTangCa = gioTangCa;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBC() {
        return idBC;
    }

    public void setIdBC(String idBC) {
        this.idBC = idBC;
    }

    public int getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(int ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public int getGioVao() {
        return gioVao;
    }

    public void setGioVao(int gioVao) {
        this.gioVao = gioVao;
    }

    public int getGioRa() {
        return gioRa;
    }

    public void setGioRa(int gioRa) {
        this.gioRa = gioRa;
    }

    public int getGioTangCa() {
        return gioTangCa;
    }

    public void setGioTangCa(int gioTangCa) {
        this.gioTangCa = gioTangCa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
