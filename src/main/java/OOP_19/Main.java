package OOP_19;

public class Main {
    public static void main(String[] args) {

        BinhLinh binhLinh1 = new Linh("Linh", true);
        BinhLinh binhLinh2 = new CungThu("Cung thu", true);
        binhLinh1.inThongTin();
        binhLinh2.inThongTin();

        binhLinh1.chienDau(binhLinh2);

    }
}
