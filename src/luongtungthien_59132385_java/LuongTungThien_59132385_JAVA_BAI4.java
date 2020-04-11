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
public class LuongTungThien_59132385_JAVA_BAI4 {
    public static void main(String[] args) {
        
        ChuyenXe cx1 = new XeNoiThanh("B11", "Thien", 23, 18, 100, 2000000);
        ChuyenXe cx2 = new XeNoiThanh("B12", "Khanh", 22, 18, 100, 2000000);
        ChuyenXe cx3 = new XeNoiThanh("B13", "Loc", 21, 18, 100, 2000000);
        
        ChuyenXe cx4 = new XeNgoaiThanh("B20", "Nen", 25, 18, 12, 2000000);
        ChuyenXe cx5 = new XeNgoaiThanh("B21", "Huu", 25, 18, 10, 2000000);
        ChuyenXe cx6 = new XeNgoaiThanh("B22", "Thiet", 25, 18, 12, 2000000);
        
        QuanLiChuyenXe qlcx = new QuanLiChuyenXe();
        
        qlcx.them(cx1);
        qlcx.them(cx2);
        qlcx.them(cx3);
        qlcx.them(cx4);
        qlcx.them(cx5);
        qlcx.them(cx6);
        
        System.out.println("Thong tin tung chuyen xe: ");
        qlcx.xuat();
        
        System.out.println("Tong doanh thu xe noi thanh: " + qlcx.doanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu xe noi thanh: " + qlcx.doanhThuXeNoiThanh());
        System.out.println("Tong doanh thu xe noi thanh: " + qlcx.tongDoanhThu());
        }
    
}
