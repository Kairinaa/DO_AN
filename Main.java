
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy a = new QuanLy();
        MayTinh b;
        Phieu c;
        int chon;
        Scanner sc = new Scanner(System.in);
        a.menuChinh();
        do {
            System.out.print("\nNhap Lua Chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    b = new MayTinhXachTay();
                    a.themDSMayTinh(b);
                    break;
                case 2:
                    b = new MayTinhDeBan();
                    a.themDSMayTinh(b);
                    break;
                case 3:
                    a.hienDanhSachMayTinhDeBan();
                    break;
                case 4:
                    a.hienDanhSachMayTinhXachTay();
                    break;
                case 5:
                    a.SuaDoiKM();
                    break;
                case 6:
                    c = new PhieuNhapKho();
                    a.themDSPhieu(c);
                    break;
                case 7:
                    c = new PhieuXuatKho();
                    a.themDSPhieu(c);
                    break;
                case 8:
                    a.hienDanhSachPhieuNhapKho();
                    break;
                case 9:
                    a.hienDanhSachPhieuXuatKho();
                    break;
                case 10:
                    a.SuaDoiPhieu();
                    break;
                case 11:
                    String tenFile;
                    System.out.print("\nNhap Ten File Muon Luu: ");
                    sc.nextLine();
                    tenFile = sc.nextLine();
                    a.ghiFileP(tenFile);
                    break;
                case 12:
                    System.out.print("Nhap Ten File Muon Doc: ");
                    sc.nextLine();
                    tenFile = sc.nextLine();
                    a.docFileP(tenFile);
                    break;
                case 13:
                    System.out.print("\nNhap Ten File Muon Luu: ");
                    sc.nextLine();
                    tenFile = sc.nextLine();
                    a.ghiFileMT(tenFile);
                    break;
                case 14:
                    System.out.print("Nhap Ten File Muon Doc: ");
                    sc.nextLine();
                    tenFile = sc.nextLine();
                    a.docFileMT(tenFile);
                    break;
            }
        }while (chon != 0) ;
    }
}