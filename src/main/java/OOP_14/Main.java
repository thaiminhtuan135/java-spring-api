package OOP_14;

public class Main {
    public static void main(String[] args) {
        PhanSo phanSo = new PhanSo();
        phanSo.inThongTin();
        PhanSo a = new PhanSo(5, 6);
        PhanSo b = new PhanSo(7, 8);
        System.out.println(a.cong(b).getTuSo()+ "/" + a.cong(b).getMauSo());
        System.out.println(a.tru(b).getTuSo()+ "/" + a.tru(b).getMauSo());
    }
}
