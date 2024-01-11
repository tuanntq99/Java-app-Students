package services;

import  model.HocSinh;

import java.util.ArrayList;
import java.util.List;

public class AppServices implements AppHocSinhInterface {
    private List<HocSinh> db;

    public AppServices() {
        db = new ArrayList<>();
    }

    @Override
    public boolean addNew(HocSinh input) {
        for (HocSinh hocSinh : db) {
            if (hocSinh.getId() == input.getId()) {
                System.out.println("Them that bai");
                return false;
            }
        }
        db.add(input);
        System.out.println("Them thanh cong");
        return true;
    }

    @Override
    public boolean remakeHocSinh(HocSinh dataNew, int id) {
        for (HocSinh hocSinh : db) {
            if (hocSinh.getId() == id) {
                hocSinh.setId(dataNew.getId());
                hocSinh.setName(dataNew.getName());
                hocSinh.setAge(dataNew.getAge());
                System.out.println("Sua thanh cong");
                return true;
            }
        }
        System.out.println("Sua that bai");
        return false;
    }

    @Override
    public boolean deleteHocSinh(int id) {
        for (HocSinh hocSinh : db) {
            if (hocSinh.getId() == id) {
                db.remove(hocSinh);
                System.out.println("Xoa thanh cong");
                return true;
            }
        }
        System.out.println("Xoa that bai");
        return false;
    }

    @Override
    public boolean showEverything() {
        if (db.size() == 0) {
            System.out.println("Khong co du lieu");
            return false;
        }
        for (HocSinh hocSinh : db) {
            hocSinh.ShowInfo();
        }
        return true;
    }
}
