import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class DSPhieu {
    ArrayList <Phieu> phieu;

    public DSPhieu() {
        phieu  = new ArrayList<>();
    }
    public void themDSPhieu(Phieu a) {
        Scanner ds = new Scanner(System.in);
        System.out.println("\nNhap so luong can them: "); int n = ds.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("\nLan them thu "+ (i+1)+": "); a.nhapThongTin(); phieu.add(a);
        }
    }
    public void suaPhieuNhapKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    y.nhapThongTin();
                }
            }
        }
    }

    public void xoaPhieuNhapKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    phieu.remove(y);
                }
            }
        }
    }
    public void suaPhieuXuatKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    y.nhapThongTin();
                }
            }
        }
    }

    public void xoaPhieuXuatKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    phieu.remove(y);
                }
            }
        }
    }

    public void hienDS(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            y.xuatThongTin();
        }
    }

    public void hienDSPhieuNhapKho(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                y.xuatThongTin();
            }
        }
    }
    public void hienDSPhieuXuatKho(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                y.xuatThongTin();
            }
        }
    }
    public void menuSuaDoiPhieu() {
        System.out.println("|_____________________________________________|");
        System.out.println("|           THAY DOI THONG TIN PHIEU          |");
        System.out.println("|=============================================|");
        System.out.println("|1. Sua Thong Tin Phieu Nhap Kho              |");
        System.out.println("|2. Xoa Thong Tin Phieu Nhap Kho              |");
        System.out.println("|3. Sua Thong Tin Phieu Xuat Kho              |");
        System.out.println("|4. Xoa Thong Tin Phieu Xuat Kho              |");
        System.out.println("|5. Exit                                      |");
        System.out.println("|---------------------------------------------|");
    }
    public void SuaDoiPhieu()
    {
        Scanner sd = new Scanner(System.in);
        int chon;
        menuSuaDoiPhieu();
        do
        {
            System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
            switch (chon)
            {
                case 1:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Nhap Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    suaPhieuNhapKho(maPhieu);
                } break;
                case 2:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Nhap Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    xoaPhieuNhapKho(maPhieu);
                } break;
                case 3:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Xuat Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    suaPhieuXuatKho(maPhieu);
                } break;
                case 4:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Xuat Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    xoaPhieuXuatKho(maPhieu);
                } break;
            }
        } while(chon != 0);
    }
}
