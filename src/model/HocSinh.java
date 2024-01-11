package model;

import library.Helper;

/*
 *
 *
 * @author ngotuan
 */
public class HocSinh {
    private int id;
    private String name;
    private int age;

    public HocSinh() {
        id = Helper.IntHelper("Moi nhap ID: ", "Nhap sai kieu du lieu");
        name = Helper.StringHelper("Moi nhap ten: ", "Ten khong dung do dai", 5, 50);
        age = Helper.IntHelper("Moi nhap tuoi: ", "Nhap sai kieu du lieu");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ShowInfo() {
        System.out.println("Id: " + id);
        System.out.println("Ten hoc sinh: " + name);
        System.out.println("Tuoi: " + age);
    }
}
