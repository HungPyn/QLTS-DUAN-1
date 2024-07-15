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
public class ChatLieu {
    private String IDChatLieu;
    private String TenChatLieu;
    private float TyLe;
    private String IDMauSac;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;
     private MauSac IdMauSac;

    public ChatLieu() {
    }

    public ChatLieu(String IDChatLieu, String TenChatLieu, float TyLe, String IDMauSac, Date NgayTao, Date NgaySua, boolean TrangThai, MauSac IdMauSac) {
        this.IDChatLieu = IDChatLieu;
        this.TenChatLieu = TenChatLieu;
        this.TyLe = TyLe;
        this.IDMauSac = IDMauSac;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
        this.IdMauSac = IdMauSac;
    }

    public String getIDChatLieu() {
        return IDChatLieu;
    }

    public void setIDChatLieu(String IDChatLieu) {
        this.IDChatLieu = IDChatLieu;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }

    public float getTyLe() {
        return TyLe;
    }

    public void setTyLe(float TyLe) {
        this.TyLe = TyLe;
    }

    public String getIDMauSac() {
        return IDMauSac;
    }

    public void setIDMauSac(String IDMauSac) {
        this.IDMauSac = IDMauSac;
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

    public MauSac getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(MauSac IdMauSac) {
        this.IdMauSac = IdMauSac;
    }
     
     
}
