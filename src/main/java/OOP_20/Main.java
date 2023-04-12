package OOP_20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Sach sach = new Sach();
        sach.inThongTin();
        List<Sach> listSach = new ArrayList<>();
        listSach.add(new Sach(123, "tuan", 4, "tuan", "tuan", 54));
        listSach.add(new Sach(567, "nam", 4, "tuan", "tuan", 54));
        listSach.add(new Sach(789, "huy", 4, "huy", "tuan", 54));
        Sach.timkiem(listSach, "tuan");

        List<TapChi> tapChis = new ArrayList<>();
        tapChis.add(new TapChi(123, "tuan", 4, "tuan", "5", 11));
        tapChis.add(new TapChi(456, "huy", 4, "tuan", "5", 11));
        tapChis.add(new TapChi(789, "nam", 4, "huy", "5", 11));
        TapChi.timKiemTapChi(tapChis, "tuan");

        List<TruyenTranh> truyenTranhs = new ArrayList<>();
        truyenTranhs.add(new TruyenTranh(123, "tuan", 4, "one piece", 12));
        truyenTranhs.add(new TruyenTranh(456, "huy", 4, "naruto", 12));
        truyenTranhs.add(new TruyenTranh(789, "kien", 4, "bleach", 12));
        truyenTranhs.add(new TruyenTranh(232, "nam", 4, "okai", 12));
        TruyenTranh.timkiem(truyenTranhs, "one piece");
    }
}
