/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.ChiTietSanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.ChiTietSanPham;
import model.DaQuy;
import model.GiamGia;
import model.GioiTinh;
import model.KiemDinh;
import model.NguonGoc;
import model.SanPham;
import model.Size;
import until.jdbc;

/**
 *
 * @author WINDOWS10
 */
public class repoChiTietSanPham implements InterfaceRepoChiTietSanPham {

    private List<ChiTietSanPham> listctsp = new ArrayList<>();
    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql = null;

    @Override
    public List<ChiTietSanPham> getAll() {
        sql = "select * from v_ChiTiet";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                KiemDinh kd = new KiemDinh();
                kd.setIDKiemDinh(res.getString(2));
                SanPham sp = new SanPham();
                sp.setIDSanPham(res.getString(3));
                GioiTinh gt = new GioiTinh();
                gt.setIDGioiTinh(res.getString("IDGioiTinh"));
                gt.setGioiTinh(res.getString("GioiTinh"));
                sp.setIDGioiTinh(gt);
                sp.setTenSanPham(res.getString("TenSanPham"));
                Size sz = new Size();
                sz.setIDSize(res.getString(4));
                ChatLieu cl = new ChatLieu();
                cl.setIDChatLieu(res.getString(6));
                NguonGoc ng = new NguonGoc();
                ng.setIDNguonGoc(res.getString("IDNguonGoc"));
                GiamGia gg = new GiamGia();
                gg.setIDGIamGia(res.getString("IDGiamGia"));
                DaQuy dq = new DaQuy();
                dq.setIDDaQuyString(res.getString("IDDaQuy"));
                ChiTietSanPham ctsp = new ChiTietSanPham(res.getString(1), kd, sp, sz, res.getString("Ten"), cl, res.getInt("SoLuongTonKho"),
                        res.getInt("SoLuongDaQuy"), res.getDouble("GiaMoi"), res.getDouble("GiaCu"), 
                        gg, res.getString("HinhAnh"), ng, res.getBoolean("TrangThai"), res.getFloat("TrongLuong"), dq);
                listctsp.add(ctsp);
            }
            return listctsp;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
