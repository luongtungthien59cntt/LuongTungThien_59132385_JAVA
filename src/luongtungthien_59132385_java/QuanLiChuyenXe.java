/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtungthien_59132385_java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class QuanLiChuyenXe {
    
    private List<ChuyenXe> danhSachChuyenXe = new ArrayList<ChuyenXe>();
    
    public void them(ChuyenXe ChuyenXe) {
        danhSachChuyenXe.add(ChuyenXe);
    }
    
    public void xuat() {
        for (int i = 0; i < danhSachChuyenXe.size(); i++) {
        ChuyenXe chuyenXe = danhSachChuyenXe.get(i);
        
        System.out.println(chuyenXe.getThongTin());
    }
    }
    public double doanhThuXeNoiThanh() {
        double ketqua = 0;
        for (int i = 0; i < danhSachChuyenXe.size(); i++) {
            ChuyenXe chuyenXe = danhSachChuyenXe.get(i);
            if (chuyenXe instanceof XeNoiThanh) {
                ketqua += chuyenXe.getDoanhThu();
                
            }
        }
        return ketqua;
        
    }
     public double doanhThuXeNgoaiThanh() {
        double ketqua = 0;
        for (int i = 0; i < danhSachChuyenXe.size(); i++) {
            ChuyenXe chuyenXe = danhSachChuyenXe.get(i);
            if (chuyenXe instanceof XeNgoaiThanh) {
                ketqua += chuyenXe.getDoanhThu();
            }
        }
        return ketqua;
     }
     
    public double tongDoanhThu() {
        double ketqua = 0;
        for (int i = 0; i < danhSachChuyenXe.size(); i++) {
            ChuyenXe chuyenXe = danhSachChuyenXe.get(i);
                ketqua += chuyenXe.getDoanhThu();
        }
        return ketqua;
    }   
}

     

           
