package OOP_14;

import java.util.Scanner;

public class PhanSo {
    public static Scanner sc = new Scanner(System.in);

    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        System.out.println("nhap tu so , mau so");
        tuSo = sc.nextInt();
        mauSo = sc.nextInt();
    }

    public PhanSo toiGian() {

        int gcd = findGcd(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
        return this;
    }

    public PhanSo cong(PhanSo b) {
        int tuso = this.getTuSo() * b.getMauSo() + b.getTuSo() * this.getMauSo();
        int mauso = this.getMauSo() * b.getMauSo();
        //        simplifyFraction();
        return new PhanSo(tuso, mauso).toiGian();
    }

    public PhanSo tru(PhanSo b) {
        int tuso = this.getTuSo() * b.getMauSo() - b.getTuSo() * this.getMauSo();
        int mauso = this.getMauSo() * b.getMauSo();
        //        simplifyFraction();
        return new PhanSo(tuso, mauso).toiGian();
    }

    public static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }


    public void inThongTin() {
        System.out.println("phan so" + tuSo + "/" + mauSo);
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }


}
