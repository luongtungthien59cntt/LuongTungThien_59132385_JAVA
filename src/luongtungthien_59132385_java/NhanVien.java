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
public class NhanVien {
    private String ten;
    private Long tuoi;
    private String diachi;
    private double tienluong;
    private int tongSoGioLam;
    
    public NhanVien(){
        
    }
    public NhanVien(String name, Long tuoi, String diachi, double tienluong, int tongSoGioLam){
            this.ten = name;
            this.tuoi = tuoi;
            this.diachi = diachi;
            this.tienluong = tienluong;
            this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Long getTuoi() {
        return tuoi;
    }

    public void setTuoi(Long tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int TongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    public String getthongtin(){
        return "Ten: " + ten + "\t" +
                "Tuoi: " + tuoi + "\t" +
                "Dia chi: " + diachi + "\t" +
                "Tien luong: " + tienluong + "\t" +
                "Tong so gio lam" + tongSoGioLam + "\t" +
                "Tien thuong: " + tinhThuong() + "\t" +
                "Tong tien thuong: " + (tinhThuong() + tienluong);
    }
    public  double tinhThuong(){
        double tienthuong = 0;
        
        //tinhtoan
        if (this.tongSoGioLam >=200) tienluong = this.tienluong + 0.2;
        else if (this.tongSoGioLam < 200 && this.tongSoGioLam >=100) tienluong = this.tienluong + 0.1;
        else if (this.tongSoGioLam < 100) tienthuong = 0; 
        
        return tienthuong;
    }
    
}
