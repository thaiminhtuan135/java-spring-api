package OOP_20;

import java.util.List;

public class TapChi extends TaiLieu {
    private String tenTapChi,soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTapChi, String soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTapChi = tenTapChi;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String tenTapChi, String soPhatHanh, int thangPhatHanh) {
        super();
        this.tenTapChi = tenTapChi;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getTenTapChi() {
        return tenTapChi;
    }

    public void setTenTapChi(String tenTapChi) {
        this.tenTapChi = tenTapChi;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void inThongTin() {
        in();
        System.out.println("ten tap chi "+ tenTapChi + " so phat hanh"+soPhatHanh+" thang phat hanh");
    }
    public static void timKiemTapChi(List<TapChi> list, String name) {
        list.stream().filter(s -> s.getTenTapChi().contains(name)).forEach(s -> s.inThongTin());
    }


}
