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
public abstract class SinhVienPoly {
    
    private String hoTen;
    private String nganh;
    
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;    
    }
    
    abstract public double getDiem();
    
    public String getHocLuc(){
        String ketqua = "Yeu";
        
        if (getDiem() < 5) ketqua = "Yeu";
        else if (getDiem() < 6.5) ketqua = "Trung binh";
        else if (getDiem() < 7.5) ketqua = "Kha";
        else if (getDiem() < 9) ketqua = "Gioi";
        else ketqua = "Xuat sac";
        
        return ketqua;
    }
    
    public void xuat(){
        System.out.println("Ho ten: " + hoTen + "\t" +
                           "Nganh: " + nganh + "\t" +
                           "Diem: " + getDiem() + "\t" +
                           "Hoc luc: " + getHocLuc());
    }
}
    
