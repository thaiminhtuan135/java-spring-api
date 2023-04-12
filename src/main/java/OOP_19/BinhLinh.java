package OOP_19;

public class BinhLinh {
    private String ten;
    private int sucManh = 50;
    private boolean trangBi;

    public BinhLinh(String ten, boolean trangBi) {
        this.ten = ten;
        this.trangBi = trangBi;
    }

    public void chienDau(BinhLinh enemy) {
        if (this.tinhSucManh() > enemy.tinhSucManh()) {
            System.out.println(this.ten + " thang" + enemy.ten);
        } else if (this.tinhSucManh() < enemy.tinhSucManh()) {
            System.out.println(this.ten + " thua " + enemy.ten);
        } else {
            System.out.println("hoa");
        }
    }

    private int tinhSucManh() {
        int sucManhMoi = this.sucManh;
        if (this.trangBi) {
            if (this instanceof Linh) {
                sucManhMoi *= 1.1;
            } else if (this instanceof CungThu) {
                sucManhMoi *= 1.3;
            } else if (this instanceof KiemSi) {
                sucManhMoi *= 1.5;
            } else if (this instanceof DauSi) {
                sucManhMoi *= 1.7;
            }
        }
        return sucManhMoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }

    public boolean isTrangBi() {
        return trangBi;
    }

    public void setTrangBi(boolean trangBi) {
        this.trangBi = trangBi;
    }

    public void inThongTin() {
        System.out.println(this.ten + " có chỉ số sức mạnh " + this.sucManh);
    }

}
