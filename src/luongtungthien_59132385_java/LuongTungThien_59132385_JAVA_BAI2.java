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
public class LuongTungThien_59132385_JAVA_BAI2 {
        
    public static void main(String[] args) {
    
        QuanLiNhanVien qlnv = new QuanLiNhanVien();
        
        NhanVien nv1 = new NhanVien("Thien", 21L, "Van Canh", 200000, 20);
        NhanVien nv2 = new NhanVien("Trang", 20L, "Phu Yen", 200000, 20);
        NhanVien nv3 = new NhanVien("Nen", 23L, "Binh Dinh", 200000, 20);
        NhanVien nv4 = new NhanVien("Khanh", 20L, "Binh Thuan", 200000, 20);
        NhanVien nv5 = new NhanVien("Loc", 21L, "Dak Lak", 200000, 20);
        
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        qlnv.inDS();
}
}
