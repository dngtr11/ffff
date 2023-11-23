/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dungt
 */
public class GiangVien {

    private String maGV;
    private String tenGV;
    private boolean gioiTinh;
    private String loai;
    private int namSinh;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, int namSinh, boolean gioiTinh, String loai) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.loai = loai;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

}
