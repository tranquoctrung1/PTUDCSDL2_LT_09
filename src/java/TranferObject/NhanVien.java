/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranferObject;

import java.sql.Date;

/**
 *
 * @author tqtr
 */
public class NhanVien {

    /**
     * @return the phai
     */
    public String getPhai() {
        return phai;
    }

    /**
     * @param phai the phai to set
     */
    public void setPhai(String phai) {
        this.phai = phai;
    }

    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the hoNV
     */
    public String getHoNV() {
        return hoNV;
    }

    /**
     * @param hoNV the hoNV to set
     */
    public void setHoNV(String hoNV) {
        this.hoNV = hoNV;
    }

    /**
     * @return the tenLot
     */
    public String getTenLot() {
        return tenLot;
    }

    /**
     * @param tenLot the tenLot to set
     */
    public void setTenLot(String tenLot) {
        this.tenLot = tenLot;
    }

    /**
     * @return the tenNV
     */
    public String getTenNV() {
        return tenNV;
    }

    /**
     * @param tenNV the tenNV to set
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the luong
     */
    public int getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(int luong) {
        this.luong = luong;
    }

    /**
     * @return the maNVQL
     */
    public String getMaNVQL() {
        return maNVQL;
    }

    /**
     * @param maNVQL the maNVQL to set
     */
    public void setMaNVQL(String maNVQL) {
        this.maNVQL = maNVQL;
    }

    /**
     * @return the phg
     */
    public String getPhg() {
        return phg;
    }

    /**
     * @param phg the phg to set
     */
    public void setPhg(String phg) {
        this.phg = phg;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    // properties
    private String maNV;
    private String hoNV;
    private String tenLot;
    private String tenNV;
    private Date ngaySinh;
    private String phai;
    private int luong;
    private String maNVQL;
    private String phg;
    private String diaChi;
}
