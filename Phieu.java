
import java.io.Serializable;
import java.util.Scanner;

public class Phieu implements Serializable {
    private int soLuong;
    private String maPhieu, donViNhap, diaChiKho;

    public Phieu() {
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getDonViNhap() {
        return donViNhap;
    }

    public void setDonViNhap(String donViNhap) {
        this.donViNhap = donViNhap;
    }

    public String getDiaChiKho() {
        return diaChiKho;
    }

    public void setDiaChiKho(String diaChiKho) {
        this.diaChiKho = diaChiKho;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma phieu: "); maPhieu = sc.nextLine();
        System.out.print("Nhap Don vi nhap: "); donViNhap = sc.nextLine();
        System.out.print("Nhap Dia chi kho: "); diaChiKho = sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("Ma phieu: "+ maPhieu);
        System.out.println("Don vi nhap: "+ donViNhap);
        System.out.println("Dia chi kho: "+ diaChiKho);
    }
}
