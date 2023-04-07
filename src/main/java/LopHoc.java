import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LopHoc {
    public static Scanner scanner = new Scanner(System.in);
    private int MaLop,SiSo;
    private String TenLop,DiaChi,GVCN;

    public LopHoc(int maLop, int siSo, String tenLop, String diaChi, String GVCN) {
        MaLop = maLop;
        SiSo = siSo;
        TenLop = tenLop;
        DiaChi = diaChi;
        this.GVCN = GVCN;
    }

    public LopHoc() {
        MaLop = scanner.nextInt();
        scanner.nextLine();
        TenLop = scanner.nextLine();
        SiSo = scanner.nextInt();
        scanner.nextLine();
        DiaChi = scanner.nextLine();
        GVCN = scanner.nextLine();
    }

    public void InThongTin() {
        System.out.println("Lop "+ TenLop + " co ma la "+MaLop+" o "+ DiaChi);
        System.out.println("Lop co" + SiSo + " hoc sinh va co " + GVCN + " la GiaoVienChuNhiem");
    }
    public int getMaLop() {
        return MaLop;
    }

    public void setMaLop(int maLop) {
        MaLop = maLop;
    }

    public int getSiSo() {
        return SiSo;
    }

    public void setSiSo(int siSo) {
        SiSo = siSo;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getGVCN() {
        return GVCN;
    }

    public void setGVCN(String GVCN) {
        this.GVCN = GVCN;
    }
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        LopHoc lopHoc1 = new LopHoc(12313, 40, "B19dcat", "bac bins", "Minh Tuan");
        lopHoc1.InThongTin();
        lopHoc.InThongTin();

    }
}
