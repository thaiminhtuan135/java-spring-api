package OOP_02;

public class SanPham {
    private int maSanPham;
    private String tenSpanPham, loaiSanpham;
    private boolean laSanPhamMoi;

    public SanPham(int maSanPham, String tenSpanPham, String loaiSanpham, boolean laSanPhamMoi) {
        this.maSanPham = maSanPham;
        this.tenSpanPham = tenSpanPham;
        this.loaiSanpham = loaiSanpham;
        this.laSanPhamMoi = laSanPhamMoi;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSpanPham() {
        return tenSpanPham;
    }

    public void setTenSpanPham(String tenSpanPham) {
        this.tenSpanPham = tenSpanPham;
    }

    public String getLoaiSanpham() {
        return loaiSanpham;
    }

    public void setLoaiSanpham(String loaiSanpham) {
        this.loaiSanpham = loaiSanpham;
    }

    public boolean isLaSanPhamMoi() {
        return laSanPhamMoi;
    }

    public void setLaSanPhamMoi(boolean laSanPhamMoi) {
        this.laSanPhamMoi = laSanPhamMoi;
    }

    public void inThongTin() {
        System.out.println("san pham" + tenSpanPham + " co ma la " + maSanPham + " thuoc loai "+ loaiSanpham + (laSanPhamMoi ? " la san pham moi" : ""));
    }
}
