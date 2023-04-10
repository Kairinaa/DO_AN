import java.util.Scanner;

public class MayTinhDeBan extends MayTinh{
    private int slTon;

    public MayTinhDeBan () {}

    public MayTinhDeBan(int gia, int namSX, String hangSX, String quocGia, String hangCPU, String maSerial, int slTon) {
        super(gia, namSX, hangSX, quocGia, hangCPU, maSerial);
        this.slTon = slTon;
    }

    @Override
    public void xuatThongTin() {
        System.out.print("Sluong ton: " + slTon);
        super.xuatThongTin();
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Sl ton: "); slTon = sc.nextInt();
        super.nhapThongTin();
    }

    @Override
    public double capNhatGiaTien() {
        return super.capNhatGiaTien();
    }
}
