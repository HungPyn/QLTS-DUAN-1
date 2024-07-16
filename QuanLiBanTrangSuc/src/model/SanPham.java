/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SanPham {

    private GioiTinh gioiTinh;
    private String IDSanPham;
    private String TenSanPham;
    private GioiTinh IDGioiTinh;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;

    public SanPham() {
    }

    public SanPham(GioiTinh gioiTinh, String IDSanPham, String TenSanPham, GioiTinh IDGioiTinh, Date NgayTao, Date NgaySua, boolean TrangThai) {
        this.gioiTinh = gioiTinh;
        this.IDSanPham = IDSanPham;
        this.TenSanPham = TenSanPham;
        this.IDGioiTinh = IDGioiTinh;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public GioiTinh getIDGioiTinh() {
        return IDGioiTinh;
    }

    public void setIDGioiTinh(GioiTinh IDGioiTinh) {
        this.IDGioiTinh = IDGioiTinh;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
        this.NgaySua = NgaySua;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
