/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtungthien_59132385_java;

/**
 *
 * @author dell
 */
public abstract class ChuyenXe {
    private String masoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private int soTuyen;
    private double doanhThu;

    public ChuyenXe(String masoChuyen, String hoTenTaiXe, int soXe, int soTuyen, double doanhThu) {
        this.masoChuyen = masoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.soTuyen = soTuyen;
        this.doanhThu = doanhThu;
        
        
    }

    public String getMasoChuyen() {
        return masoChuyen;
    }

    public void setMasoChuyen(String masoChuyen) {
        this.masoChuyen = masoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    abstract String getThongTin();
    
    
    
}
