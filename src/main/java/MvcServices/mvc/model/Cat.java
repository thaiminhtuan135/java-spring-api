package MvcServices.mvc.model;


import java.util.Scanner;

public abstract class Cat {
    protected Scanner sc = new Scanner(System.in);
    protected int id;
    protected String name;
    protected int age;
    protected String gender;
    protected String sound;


    public void nhap() {
        System.out.println("Nhập id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên");
        name = sc.nextLine();
        System.out.println("Nhập tuổi");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính");
        gender = sc.nextLine();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "  id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
