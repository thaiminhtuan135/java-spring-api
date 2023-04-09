package OOP_13;

import java.util.Scanner;

public class SoNguyen {
    public static Scanner sc = new Scanner(System.in);

    private int giaTri;
    private boolean laSoChan, laSoNguyenTo,laSoDoiXung;


    public SoNguyen() {
        System.out.println("nhapo gia tri");
        giaTri = sc.nextInt();
        kiemTraChan();
        kiemTraDoiXung();
        kiemTraNguyenTo();
    }

    public SoNguyen(int giaTri) {
        this.giaTri = giaTri;
        kiemTraChan();
        kiemTraDoiXung();
        kiemTraNguyenTo();
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public boolean isLaSoChan() {
        return laSoChan;
    }

    public void setLaSoChan(boolean laSoChan) {
        this.laSoChan = laSoChan;
    }

    public boolean isLaSoNguyenTo() {
        return laSoNguyenTo;
    }

    public void setLaSoNguyenTo(boolean laSoNguyenTo) {
        this.laSoNguyenTo = laSoNguyenTo;
    }

    public boolean isLaSoDoiXung() {
        return laSoDoiXung;
    }

    public void setLaSoDoiXung(boolean laSoDoiXung) {
        this.laSoDoiXung = laSoDoiXung;
    }

    public boolean kiemTraDoiXung(int n) {
        String s = String.valueOf(n);
        int lengh = String.valueOf(n).length();
        int i = 0;
        int j = lengh - 1;
        while (i < j) {
            if (s.charAt(i) - '0' != s.charAt(j) - '0') {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int cong2So(SoNguyen a, SoNguyen b) {
        return a.getGiaTri()+b.getGiaTri();
    }

    public void kiemTraChan() {
        if (giaTri % 2 == 0) {
            laSoChan = true;
        } else {
            laSoChan = false;
        }
    }

    public void kiemTraNguyenTo() {
        if (isPrimeNumber(giaTri)) {
            laSoNguyenTo = true;
        }
        else {
            laSoNguyenTo = false;
        }
    }

    public void kiemTraDoiXung() {
        if (kiemTraDoiXung(giaTri)) {
            laSoDoiXung = true;
        } else {
            laSoDoiXung = false;
        }
    }

    public void inThongTin() {
        System.out.println("So nguyen "+giaTri + (laSoChan ? " co " : " khong ") + "la so chan ," +(laSoNguyenTo ? " co " : " khong ") +"la so nguyen to");
    }

}
