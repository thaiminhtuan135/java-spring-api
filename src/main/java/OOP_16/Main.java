package OOP_16;

public class Main {
    public static void main(String[] args) {
        ThoiGian thoiGian = new ThoiGian();
        thoiGian.inThongtin();
        ThoiGian thoiGian1 = new ThoiGian(2020, 8, 26);
        System.out.println(thoiGian.layKhoangThoiGian(thoiGian1));
    }
}
