/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class ChiTietSanPham {
    private String IDChiTietSanPham;
    private KiemDinh IDKIemDinh;
    private SanPham IDSanPham;
    private Size IDSize;
    private String Ten;
    private ChatLieu IDChatLieu;
    private int SoLuongTonKho;
    private int SoLuongDaQuy;
    private Double GiaCu;
    private Double GiaMoi;
    private GiamGia IDGiamGia;
    private String HinhAnh;
    private NguonGoc IDNguonGoc;
    private boolean TrangThai;
    private Float TrongLuong;
    private DaQuy IDDaQuy;
    private Date NgayTao;
    private Date NgaySua;

    public ChiTietSanPham() {
    }    

    public ChiTietSanPham(String IDChiTietSanPham, KiemDinh IDKIemDinh, SanPham IDSanPham, Size IDSize, String Ten, ChatLieu IDChatLieu, int SoLuongTonKho, int SoLuongDaQuy, Double GiaCu, Double GiaMoi, GiamGia IDGiamGia, String HinhAnh, NguonGoc IDNguonGoc, boolean TrangThai, Float TrongLuong, DaQuy IDDaQuy, Date NgayTao, Date NgaySua) {
        this.IDChiTietSanPham = IDChiTietSanPham;
        this.IDKIemDinh = IDKIemDinh;
        this.IDSanPham = IDSanPham;
        this.IDSize = IDSize;
        this.Ten = Ten;
        this.IDChatLieu = IDChatLieu;
        this.SoLuongTonKho = SoLuongTonKho;
        this.SoLuongDaQuy = SoLuongDaQuy;
        this.GiaCu = GiaCu;
        this.GiaMoi = GiaMoi;
        this.IDGiamGia = IDGiamGia;
        this.HinhAnh = HinhAnh;
        this.IDNguonGoc = IDNguonGoc;
        this.TrangThai = TrangThai;
        this.TrongLuong = TrongLuong;
        this.IDDaQuy = IDDaQuy;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
    }

    public String getIDChiTietSanPham() {
        return IDChiTietSanPham;
    }

    public void setIDChiTietSanPham(String IDChiTietSanPham) {
        this.IDChiTietSanPham = IDChiTietSanPham;
    }

    public KiemDinh getIDKIemDinh() {
        return IDKIemDinh;
    }

    public void setIDKIemDinh(KiemDinh IDKIemDinh) {
        this.IDKIemDinh = IDKIemDinh;
    }

    public SanPham getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(SanPham IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public Size getIDSize() {
        return IDSize;
    }

    public void setIDSize(Size IDSize) {
        this.IDSize = IDSize;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public ChatLieu getIDChatLieu() {
        return IDChatLieu;
    }

    public void setIDChatLieu(ChatLieu IDChatLieu) {
        this.IDChatLieu = IDChatLieu;
    }

    public int getSoLuongTonKho() {
        return SoLuongTonKho;
    }

    public void setSoLuongTonKho(int SoLuongTonKho) {
        this.SoLuongTonKho = SoLuongTonKho;
    }

    public int getSoLuongDaQuy() {
        return SoLuongDaQuy;
    }

    public void setSoLuongDaQuy(int SoLuongDaQuy) {
        this.SoLuongDaQuy = SoLuongDaQuy;
    }

    public Double getGiaCu() {
        return GiaCu;
    }

    public void setGiaCu(Double GiaCu) {
        this.GiaCu = GiaCu;
    }

    public Double getGiaMoi() {
        return GiaMoi;
    }

    public void setGiaMoi(Double GiaMoi) {
        this.GiaMoi = GiaMoi;
    }

    public GiamGia getIDGiamGia() {
        return IDGiamGia;
    }

    public void setIDGiamGia(GiamGia IDGiamGia) {
        this.IDGiamGia = IDGiamGia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public NguonGoc getIDNguonGoc() {
        return IDNguonGoc;
    }

    public void setIDNguonGoc(NguonGoc IDNguonGoc) {
        this.IDNguonGoc = IDNguonGoc;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Float getTrongLuong() {
        return TrongLuong;
    }

    public void setTrongLuong(Float TrongLuong) {
        this.TrongLuong = TrongLuong;
    }

    public DaQuy getIDDaQuy() {
        return IDDaQuy;
    }

    public void setIDDaQuy(DaQuy IDDaQuy) {
        this.IDDaQuy = IDDaQuy;
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
    
}
