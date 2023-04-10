import java.util.Scanner;

public class PhieuNhapKho extends Phieu {

    private int ngayNhap;
    public PhieuNhapKho() {
    }

    public PhieuNhapKho(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner n = new Scanner(System.in);
        System.out.print("Ghi ngay Nhap kho: ");
        ngayNhap = n.nextInt();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
    }


}
