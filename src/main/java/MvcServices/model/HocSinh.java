package MvcServices.model;

import MvcServices.lib.inputHelper;

import java.util.List;

public class HocSinh {
    private int id;
    private String name;
    private int age;

    public HocSinh(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public HocSinh() {
        id = inputHelper.intHelper("Nhập id", "Nhập sai mời nhập lại");
        name = inputHelper.stringHelper("Nhập id", "Nhập sai mời nhập lại", 2, 10);
        id = inputHelper.intHelper("Nhập id", "Nhập sai mời nhập lại");

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
}
