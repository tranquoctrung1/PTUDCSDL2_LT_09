/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import TranferObject.NhanVien;
import Utils.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tqtr
 */
public class NhanVienModel {
    public ArrayList<NhanVien> Select() {
        
        ArrayList<NhanVien> lnv = new ArrayList<NhanVien>();
        
        try {
            DB.Connect("root", "");

            String sql = "SELECT * FROM nhanvien";

            ResultSet rs = DB.Select(sql);

            NhanVien nv = null;
            while (rs.next()) {
                nv = new NhanVien();

                nv.setMaNV(rs.getString("manv"));
                nv.setHoNV(rs.getString("honv"));
                nv.setTenLot(rs.getString("tenlot"));
                nv.setTenNV(rs.getString("tennv"));
                nv.setNgaySinh(rs.getDate("ngaysinh"));
                nv.setPhai(rs.getString("phai"));
                nv.setLuong(rs.getInt("luong"));
                nv.setMaNVQL(rs.getString("ma_nql"));
                nv.setPhg(rs.getString("phg"));
                nv.setDiaChi(rs.getString("diachi"));

                lnv.add(nv);
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.Disconnect();
        }
        
        return lnv;
    }
}
