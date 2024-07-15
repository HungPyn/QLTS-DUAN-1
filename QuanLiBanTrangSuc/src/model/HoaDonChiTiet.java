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
public class HoaDonChiTiet {
    private String IDHoaDonChiTiet;
    private String IDChiTietSanPham;
    private String IDHoaDon;
    private int SoLUongSanPHam;
    private Double TongGia;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;
    
    private HoaDonChiTiet IdHoaDonChiTiet;
    private HoaDon IdHoaDon;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String IDHoaDonChiTiet, String IDChiTietSanPham, String IDHoaDon, int SoLUongSanPHam, Double TongGia, Date NgayTao, Date NgaySua, boolean TrangThai, HoaDonChiTiet IdHoaDonChiTiet, HoaDon IdHoaDon) {
        this.IDHoaDonChiTiet = IDHoaDonChiTiet;
        this.IDChiTietSanPham = IDChiTietSanPham;
        this.IDHoaDon = IDHoaDon;
        this.SoLUongSanPHam = SoLUongSanPHam;
        this.TongGia = TongGia;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
        this.IdHoaDonChiTiet = IdHoaDonChiTiet;
        this.IdHoaDon = IdHoaDon;
    }

    public String getIDHoaDonChiTiet() {
        return IDHoaDonChiTiet;
    }

    public void setIDHoaDonChiTiet(String IDHoaDonChiTiet) {
        this.IDHoaDonChiTiet = IDHoaDonChiTiet;
    }

    public String getIDChiTietSanPham() {
        return IDChiTietSanPham;
    }

    public void setIDChiTietSanPham(String IDChiTietSanPham) {
        this.IDChiTietSanPham = IDChiTietSanPham;
    }

    public String getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(String IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public int getSoLUongSanPHam() {
        return SoLUongSanPHam;
    }

    public void setSoLUongSanPHam(int SoLUongSanPHam) {
        this.SoLUongSanPHam = SoLUongSanPHam;
    }

    public Double getTongGia() {
        return TongGia;
    }

    public void setTongGia(Double TongGia) {
        this.TongGia = TongGia;
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

    public HoaDonChiTiet getIdHoaDonChiTiet() {
        return IdHoaDonChiTiet;
    }

    public void setIdHoaDonChiTiet(HoaDonChiTiet IdHoaDonChiTiet) {
        this.IdHoaDonChiTiet = IdHoaDonChiTiet;
    }

    public HoaDon getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(HoaDon IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }
    
    
}
