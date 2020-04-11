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
public class SinhVienBiz extends SinhVienPoly {
    
    private double diemMarketting;
    private double diemSales;
    
    public SinhVienBiz(String hoTen, double diemMarketting, double diemsales){
        super(hoTen, "Biz");
        
        this.diemMarketting = diemMarketting;
        this.diemSales = diemsales;
    }

    @Override
    public double getDiem() {
        return (2* diemSales + diemMarketting) / 3;
    }
    
}
