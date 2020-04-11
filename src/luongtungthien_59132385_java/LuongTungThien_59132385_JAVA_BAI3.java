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
public class LuongTungThien_59132385_JAVA_BAI3 {
    public static void main(String[] args) {
        
        SinhVienPoly svPoLy = new SinhVienIT("Thien", 3, 4,5);
        SinhVienIT svIT = new SinhVienIT("Khanh", 5, 3, 6);
        SinhVienBiz svBiz = new SinhVienBiz("Loc", 4, 5);
        
        svPoLy.xuat();
        svIT.xuat();
        svBiz.xuat();
                
    }
}
