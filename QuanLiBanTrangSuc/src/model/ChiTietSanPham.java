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
public class ChiTietSanPham {
    private String IDChiTietSanPham;
    private String IDKIemDinh;
    private String IDSanPham;
    private String IDSize;
    private String Ten;
    private String IDChatLieu;
    private int SoLuongTonKho;
    private int SoLuongDaQuy;
    private Double GiaCu;
    private Double GiaMoi;
    private String IDGiamGia;
    private String HinhAnh;
    private String IDNguonGoc;
    private boolean TrangThai;
    private Float TrongLuong;
    private String IDDaQuy;
    private Date NgayTao;
    private Date NgaySua;
    
    private KiemDinh IdKiemDinh;
    private SanPham IdSanPham;
    private Size IdSize;
    private GiamGia IdGiamGia;
    private NguonGoc IdNguonGoc;
    private DaQuy IdDaQuy;
    private ChatLieu IdChatLieu;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String IDChiTietSanPham, String IDKIemDinh, String IDSanPham, String IDSize, String Ten, String IDChatLieu, int SoLuongTonKho, int SoLuongDaQuy, Double GiaCu, Double GiaMoi, String IDGiamGia, String HinhAnh, String IDNguonGoc, boolean TrangThai, Float TrongLuong, String IDDaQuy, Date NgayTao, Date NgaySua, KiemDinh IdKiemDinh, SanPham IdSanPham, Size IdSize, GiamGia IdGiamGia, NguonGoc IdNguonGoc, DaQuy IdDaQuy, ChatLieu IdChatLieu) {
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
        this.IdKiemDinh = IdKiemDinh;
        this.IdSanPham = IdSanPham;
        this.IdSize = IdSize;
        this.IdGiamGia = IdGiamGia;
        this.IdNguonGoc = IdNguonGoc;
        this.IdDaQuy = IdDaQuy;
        this.IdChatLieu = IdChatLieu;
    }

    public String getIDChiTietSanPham() {
        return IDChiTietSanPham;
    }

    public void setIDChiTietSanPham(String IDChiTietSanPham) {
        this.IDChiTietSanPham = IDChiTietSanPham;
    }

    public String getIDKIemDinh() {
        return IDKIemDinh;
    }

    public void setIDKIemDinh(String IDKIemDinh) {
        this.IDKIemDinh = IDKIemDinh;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getIDSize() {
        return IDSize;
    }

    public void setIDSize(String IDSize) {
        this.IDSize = IDSize;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getIDChatLieu() {
        return IDChatLieu;
    }

    public void setIDChatLieu(String IDChatLieu) {
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

    public String getIDGiamGia() {
        return IDGiamGia;
    }

    public void setIDGiamGia(String IDGiamGia) {
        this.IDGiamGia = IDGiamGia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getIDNguonGoc() {
        return IDNguonGoc;
    }

    public void setIDNguonGoc(String IDNguonGoc) {
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

    public String getIDDaQuy() {
        return IDDaQuy;
    }

    public void setIDDaQuy(String IDDaQuy) {
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

    public KiemDinh getIdKiemDinh() {
        return IdKiemDinh;
    }

    public void setIdKiemDinh(KiemDinh IdKiemDinh) {
        this.IdKiemDinh = IdKiemDinh;
    }

    public SanPham getIdSanPham() {
        return IdSanPham;
    }

    public void setIdSanPham(SanPham IdSanPham) {
        this.IdSanPham = IdSanPham;
    }

    public Size getIdSize() {
        return IdSize;
    }

    public void setIdSize(Size IdSize) {
        this.IdSize = IdSize;
    }

    public GiamGia getIdGiamGia() {
        return IdGiamGia;
    }

    public void setIdGiamGia(GiamGia IdGiamGia) {
        this.IdGiamGia = IdGiamGia;
    }

    public NguonGoc getIdNguonGoc() {
        return IdNguonGoc;
    }

    public void setIdNguonGoc(NguonGoc IdNguonGoc) {
        this.IdNguonGoc = IdNguonGoc;
    }

    public DaQuy getIdDaQuy() {
        return IdDaQuy;
    }

    public void setIdDaQuy(DaQuy IdDaQuy) {
        this.IdDaQuy = IdDaQuy;
    }

    public ChatLieu getIdChatLieu() {
        return IdChatLieu;
    }

    public void setIdChatLieu(ChatLieu IdChatLieu) {
        this.IdChatLieu = IdChatLieu;
    }
    
    
}
