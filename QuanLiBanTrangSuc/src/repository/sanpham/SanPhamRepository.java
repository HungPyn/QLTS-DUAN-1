/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.sanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietSanPham;
import model.GioiTinh;
import model.SanPham;
import until.jdbc;

/**
 *
 * @author HUNGpYN
 */
public class SanPhamRepository implements SanPhamInterface {
    private List<SanPham> listsp = new ArrayList<>();
    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql = null;

    @Override
    public List<SanPham> getAll() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

//        sql = "select * from v_SanPhamChiTiet";
//        try {
//            con = jdbc.getConnection();
//            pre = con.prepareStatement(sql);
//            res = pre.executeQuery();
//            while(res.next()){
//                ChiTietSanPham ctsp = new ChiTietSanPham();
//                ctsp.setTen(res.getString(2));
//                SanPham sp = new SanPham(res.getString(1), ctsp.toString(), res.getString(3),true);
//                listsp.add(sp);
//            }
//            return listsp;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
    }

    @Override
    public int creat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
