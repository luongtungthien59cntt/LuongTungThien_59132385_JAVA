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
public class QuanLiNhanVien implements IQuanli{
    private List<NhanVien> danhSachNhanVien =  new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (int i = 0; i < danhSachNhanVien.size(); i++)
        {
            NhanVien nv = danhSachNhanVien.get(i);
            System.out.println(nv.getthongtin());
        } 
    }    
}
