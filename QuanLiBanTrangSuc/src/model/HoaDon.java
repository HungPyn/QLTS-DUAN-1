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
public class HoaDon {

    private String IDHoaDon;
    private Double TongTienTRuoc;
    private Double TongTienSau;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;
    private boolean TrangThaiTichDiem;
    private KhachHang IdKhachHang;
    private TaiKhoan IdTaiKhoan;
    private Voucher IdVoucher;

    public HoaDon() {
    }

    public HoaDon(String IDHoaDon, Double TongTienTRuoc, Double TongTienSau, Date NgayTao, Date NgaySua, boolean TrangThai, boolean TrangThaiTichDiem, KhachHang IdKhachHang, TaiKhoan IdTaiKhoan, Voucher IdVoucher) {
        this.IDHoaDon = IDHoaDon;
        this.TongTienTRuoc = TongTienTRuoc;
        this.TongTienSau = TongTienSau;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
        this.TrangThaiTichDiem = TrangThaiTichDiem;
        this.IdKhachHang = IdKhachHang;
        this.IdTaiKhoan = IdTaiKhoan;
        this.IdVoucher = IdVoucher;
    }

    public String getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(String IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public Double getTongTienTRuoc() {
        return TongTienTRuoc;
    }

    public void setTongTienTRuoc(Double TongTienTRuoc) {
        this.TongTienTRuoc = TongTienTRuoc;
    }

    public Double getTongTienSau() {
        return TongTienSau;
    }

    public void setTongTienSau(Double TongTienSau) {
        this.TongTienSau = TongTienSau;
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

    public boolean isTrangThaiTichDiem() {
        return TrangThaiTichDiem;
    }

    public void setTrangThaiTichDiem(boolean TrangThaiTichDiem) {
        this.TrangThaiTichDiem = TrangThaiTichDiem;
    }

    public KhachHang getIdKhachHang() {
        return IdKhachHang;
    }

    public void setIdKhachHang(KhachHang IdKhachHang) {
        this.IdKhachHang = IdKhachHang;
    }

    public TaiKhoan getIdTaiKhoan() {
        return IdTaiKhoan;
    }

    public void setIdTaiKhoan(TaiKhoan IdTaiKhoan) {
        this.IdTaiKhoan = IdTaiKhoan;
    }

    public Voucher getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(Voucher IdVoucher) {
        this.IdVoucher = IdVoucher;
    }

    
}
