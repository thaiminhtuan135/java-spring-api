import java.util.Scanner;

public class SoThuc {
    public static Scanner sc = new Scanner(System.in);
    private float giaTri;
    private boolean laSoDuong;

    public SoThuc(float giaTri) {
        this.giaTri = giaTri;
        isLaSoDuong();
    }

    public SoThuc() {
        System.out.println("nhap gia tri");
        giaTri= sc.nextFloat();
        isLaSoDuong();
    }

    public float getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }

    public void isLaSoDuong() {
        if (giaTri > 0) {
            laSoDuong = true;
        } else {
            laSoDuong = false;
        }
    }

    public void setLaSoDuong(boolean laSoDuong) {
        this.laSoDuong = laSoDuong;
    }

    public static float max(SoThuc a, SoThuc b, SoThuc c) {
        return Math.min(a.getGiaTri(), Math.min(b.getGiaTri(), c.getGiaTri()));
    }

    public double canBacN(int n) {
        return Math.pow(giaTri, 1./n);
    }

    public static void main(String[] args) {
        SoThuc soThuc = new SoThuc();
        SoThuc soThuc1 = new SoThuc(4);
        SoThuc soThuc2= new SoThuc(5);
        SoThuc soThuc3 = new SoThuc(6);

        System.out.println(soThuc.canBacN(5));
        System.out.println(SoThuc.max(soThuc1,soThuc2,soThuc3));
    }
}
