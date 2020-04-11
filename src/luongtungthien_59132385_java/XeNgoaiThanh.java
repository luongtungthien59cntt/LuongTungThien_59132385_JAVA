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
public class XeNgoaiThanh extends ChuyenXe {
    
    private int soNgayDiDuoc;

    public XeNgoaiThanh(String masoChuyen, String hoTenTaiXe, int soXe, int soTuyen, int soNgayDiDuoc, double doanhThu) {
        super(masoChuyen, hoTenTaiXe, soXe, soTuyen, doanhThu);
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    String getThongTin() {
        return "Ma so chuyen: " + getMasoChuyen()+ "\t" +
                "Ho ten tai xe: " + getHoTenTaiXe()+ "\t" +
                "So xe: " + getSoXe() + "\t" +
                "So tuyen: " + getSoTuyen() + "\t" +
                "So km di duoc: " + soNgayDiDuoc + "\t" +
                "Doanh thu: " + getDoanhThu() + "\t";
    }
    
    
    
}
