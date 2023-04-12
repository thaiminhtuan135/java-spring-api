package OOP_16;

import java.util.Calendar;
import java.util.Scanner;

public class ThoiGian {
    public static Scanner sc = new Scanner(System.in);

    private int ngay, thang, nam, thu;
    private boolean laNamNhuan;
    Calendar calendar = Calendar.getInstance();

    public ThoiGian(int nam, int thang, int ngay) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public ThoiGian() {
        setNam(nhap("Nhap nam :", "Can nhap so nguyen tu 1000 den nay", 1000, calendar.get(Calendar.YEAR)));
        setThang(nhap("Nhap thang :", "can nhap so nguyen [1,12]", 1, 12));

        if (thang == 2) {
            if (laNamNhuan) {
                setNgay(nhap("nhap ngay : ", "can nhap so nguyen tu [1-29]", 1, 29));
            } else {
                setNgay(nhap("nhap ngay : ", "can nhap so nguyen tu [1-28]", 1, 28));
            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            setNgay(nhap("nhap ngay : ", "can nhap so nguyen tu [1-30]", 1, 30));
        } else {
            setNgay(nhap("nhap ngay : ", "can nhap so nguyen tu [1-31]", 1, 31));
        }
    }

    public long layKhoangThoiGian(ThoiGian tg) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(nam, thang - 1, ngay);
        calendar2.set(tg.getNam(), tg.getThang() - 1, tg.getNgay());
        return (calendar1.getTimeInMillis() - calendar2.getTimeInMillis()) / (24 * 60 * 60 * 1000);
    }

    public void inThongtin() {
        System.out.println("Thu" + thu + " ngay " + ngay + "/" + thang + "/" + nam + ", " + laNamNhuan + " la nam nhuan");
    }

    private int nhap(String msg, String msgErr, int min, int max) {

        boolean ok = false;
        int so = 0;
        do {
            try {
                System.out.println(msg);
                so = sc.nextInt();
                ok = true;
                ok = ok && so >= min && so <= max;
            } catch (Exception e) {
                System.out.println(msgErr);
                sc.nextLine();
            }

        } while (!ok);
        return so;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
        calendar.set(nam, thang - 1, ngay);
        thu = calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }

    public boolean isLaNamNhuan() {
        return laNamNhuan;
    }

    public void setLaNamNhuan() {
        if (nam % 4 == 0 && nam % 100 == 0 || nam % 400 == 0) {
            laNamNhuan = true;
        } else {
            laNamNhuan = false;
        }
    }
}
