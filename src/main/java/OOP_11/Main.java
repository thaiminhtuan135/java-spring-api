package OOP_11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DonDatHang donDatHang = new DonDatHang();
        donDatHang.inThongTin();
        LocalDate localDate = LocalDate.of(2000, 2, 2);
        DonDatHang donDatHang1 = new DonDatHang(123,localDate,"ti vi",3000,4,"hang limited",12000);
        donDatHang1.inThongTin();
    }
}
