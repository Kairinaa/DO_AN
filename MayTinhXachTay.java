import java.util.Scanner;

public class MayTinhXachTay extends MayTinh {
    private int slTon;
    private double trongLuong;

    public  MayTinhXachTay() {}

    public MayTinhXachTay(int gia, int namSX, String hangSX, String quocGia, String hangCPU, String maSerial, int slTon, double trongLuong) {
        super(gia, namSX, hangSX, quocGia, hangCPU, maSerial);
        this.slTon = slTon;
        this.trongLuong = trongLuong;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Sl ton: "); slTon = sc.nextInt();
        System.out.print("Nhap Trong luong: "); trongLuong = sc.nextDouble();
        super.nhapThongTin();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.print("\tSluong ton: " + slTon);
        System.out.println("\tTrong luong: "+ trongLuong + "kg");
    }

    @Override
    public double capNhatGiaTien() {
        return super.capNhatGiaTien();
    }
}