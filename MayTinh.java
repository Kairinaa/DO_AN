import java.io.Serializable;
import java.util.Scanner;

public class MayTinh implements Serializable {
    private int gia;
    private int namSX, soluong;
    private String hangSX, quocGia, HangCPU, maSerial;

    public MayTinh() {}

    public MayTinh(int gia, int namSX, String hangSX, String quocGia, String hangCPU, String maSerial) {
        this.gia = gia;
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.quocGia = quocGia;
        HangCPU = hangCPU;
        this.maSerial= maSerial;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getHangCPU() {
        return HangCPU;
    }

    public void setHangCPU(String hangCPU) {
        HangCPU = hangCPU;
    }

    public String getMaSerial() {
        return maSerial;
    }

    public void setMaSerial(String maSerial) {
        this.maSerial = maSerial;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Hang SX: "); hangSX = sc.nextLine();
        System.out.print("Nhap Quoc gia: "); quocGia = sc.nextLine();
        System.out.print("Nhap Hang CPU: "); HangCPU = sc.nextLine();
        System.out.print("Nhap Serial: "); maSerial = sc.nextLine();
        System.out.print("Nhap Nam SX: "); namSX = sc.nextInt();
        System.out.print("Nhap Gia tien: "); gia = sc.nextInt();
    }
    public void xuatThongTin() {
        System.out.print("Hang SX: "+ hangSX);
        System.out.print("\tQuoc gia: "+ quocGia);
        System.out.print("\tHang CPU: "+ HangCPU);
        System.out.print("\tNam SX: "+ namSX);
        System.out.println("\tSerial: "+ maSerial);
        System.out.print("\tGia tien: "+ gia + " VND");
    }

    public double capNhatGiaTien() {
        return gia* 0.1 + gia;
    }
}
