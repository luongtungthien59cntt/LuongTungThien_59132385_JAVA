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
public class SinhVienIT extends SinhVienPoly {
    
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    
    
    public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss ){
        super(hoTen, "IT"); 
        
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2* diemJava + diemHtml + diemCss) / 4;
    }           
}
