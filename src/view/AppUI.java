package view;

import library.Helper;
import model.HocSinh;
import services.AppServices;

public class AppUI {
    private AppServices app;
    public AppUI (){
        app =new AppServices();
        menu();
    }
    public void menu(){
        System.out.println("1. Them moi Hoc Sinh");
        System.out.println("2. Sua thong tin theo id");
        System.out.println("3. Xoa theo id");
        System.out.println("4. In toan bo thong tin");
        System.out.println("5. Thoat chuong trinh");
        int request = Helper.IntHelper("Nhap lua chon: ","Lua chon khong dung");
        Controller(request);
    }
    private void Controller(int request){
        switch (request){
            case 1:
                app.addNew(new HocSinh());
                break;
            case 2:
                app.remakeHocSinh(new HocSinh(), Helper.IntHelper("Nhap id: ","Kieu du lieu khong dung"));
                break;
            case 3:
                app.deleteHocSinh(Helper.IntHelper("Nhap id can xoa: ","Kieu du lieu khong dung"));
                break;
            case 4:
                app.showEverything();
                break;
            case 5:
                System.exit(0);
        }
        menu();
    }
}
