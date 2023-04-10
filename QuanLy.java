import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList <MayTinh> mayTinh;
    ArrayList <Phieu> phieu;

    public QuanLy() {
        mayTinh = new ArrayList<>();
        phieu = new ArrayList<>();
    }
    public void themDSMayTinh(MayTinh a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: "); int n = sc.nextInt();
        for (int i = 0; i< n; i++) {
            System.out.println("\nLan them thu " + (i+1)+ ": ");
            if (a instanceof MayTinhDeBan)
            {
                a = new MayTinhDeBan();
                a.nhapThongTin();
            }
            else if (a instanceof MayTinhXachTay)
            {
                a = new MayTinhXachTay();
                a.nhapThongTin();
            }
            mayTinh.add(a);
        }
    }
    public void suaDSMayTinhDeBan(String maSerial) {
        for(MayTinh x: mayTinh) {
            if(x instanceof MayTinhDeBan) {
                if(((MayTinhDeBan)x).getMaSerial().compareTo(maSerial) == 0) {
                    x.nhapThongTin();
                }
            }
        }
    }

    public void xoaDSMayTinhDeBan(String maSerial) {
        for(MayTinh x: mayTinh) {
            if (x instanceof MayTinhDeBan) {
                if(((MayTinhDeBan)x).getMaSerial().compareTo(maSerial) == 0) {
                    mayTinh.remove(x);
                }
            }
        }
    }

    public void suaDSMayTinhXachTay(String maSerial) {
        for(MayTinh x: mayTinh) {
            if(x instanceof MayTinhXachTay) {
                if(((MayTinhXachTay)x).getMaSerial().compareTo(maSerial) == 0) {
                    x.nhapThongTin();
                }
            }
        }
    }

    public void xoaDSMayTinhXachTay(String maSerial) {
        for(MayTinh x: mayTinh) {
            if (x instanceof MayTinhXachTay) {
                if(((MayTinhXachTay)x).getMaSerial().compareTo(maSerial) == 0) {
                    mayTinh.remove(x);
                }
            }
        }
    }
    public void hienDanhSachMayTinhDeBan()
    {
        for (MayTinh x: mayTinh)
        {
            if (x instanceof MayTinhDeBan)
            {
                ((MayTinhDeBan) x).xuatThongTin();
            }
        }
    }
    public void hienDanhSachMayTinhXachTay()
    {
        for (MayTinh x: mayTinh)
        {
            if (x instanceof MayTinhXachTay)
            {
                ((MayTinhXachTay) x).xuatThongTin();
            }
        }
    }
    public void themDSPhieu(Phieu a)
    {
        Scanner ds = new Scanner(System.in);
        System.out.print("\nNhap So Luong Can Them: "); int n = ds.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("\nLan them thu " + (i+1) + ": ");
            if (a instanceof PhieuNhapKho)
            {
                a = new PhieuNhapKho();
                a.nhapThongTin();
            }
            else if (a instanceof PhieuXuatKho)
            {
                a = new PhieuXuatKho();
                a.nhapThongTin();
            }
            phieu.add(a);
        }
    }
    public void TongSoLuongConLai()
    {
        int tongKM = 0;
        int tongPhieu = 0;
        for (MayTinh x: mayTinh)
        {
            tongKM += x.getSoluong();
        }
        for (Phieu y: phieu)
        {
            tongPhieu += y.getSoLuong();
        }
        int conLai = tongKM - tongPhieu;
        System.out.println("Tong So luong may tinh con Lai: " + conLai);
    }
    public void hienDSPhieu(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            y.xuatThongTin();
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

    public void hienDanhSachPhieuNhapKho()
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                ((PhieuNhapKho) y).xuatThongTin();
            }
        }
    }

    public void hienDanhSachPhieuXuatKho()
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                ((PhieuXuatKho) y).xuatThongTin();
            }
        }
        TongSoLuongConLai();
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

    public void hienDanhSachPhieu()
    {
        for (Phieu y: phieu)
        {
            y.xuatThongTin();
        }
    }
    public void hienDanhSachMayTinh()
    {
        for (MayTinh x: mayTinh)
        {
            x.xuatThongTin();
        }
    }
    public void ghiFileKM(String fileName)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(mayTinh);
            objOut.close();
            fileOut.close();
            System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void docFileKM(String fileName)
    {
        try
        {
            mayTinh = new ArrayList <> ();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin); mayTinh= (ArrayList) fout.readObject();
            hienDanhSachMayTinh();
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nKhong Thay File");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void ghiFileP(String fileName)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(phieu);
            objOut.close();
            fileOut.close();
            System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void docFileP(String fileName)
    {
        try
        {
            phieu = new ArrayList <> ();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin); phieu = (ArrayList) fout.readObject();
            hienDanhSachPhieu();
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nKhong Thay File");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void ghiFileMT(String fileName)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(mayTinh);
            objOut.close();
            fileOut.close();
            System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void docFileMT(String fileName)
    {
        try
        {
            mayTinh = new ArrayList <> ();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin); mayTinh = (ArrayList) fout.readObject();
            hienDanhSachMayTinh();
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nKhong Thay File");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void menuChange() {
        System.out.println("-----------------------------------|");
        System.out.println("|1. Sua thong tin May tinh de ban  |");
        System.out.println("|2. Xoa thong tin May tinh de ban  |");
        System.out.println("|3. Sua thong tin May tinh xach tay|");
        System.out.println("|4. Xoa thong tin May tinh xach tay|");
        System.out.println("|----------------------------------|");
    }
    public void SuaDoiKM() {
        Scanner sd = new Scanner(System.in);
        menuChange();
        int chon;
        do {
            System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
            switch(chon) {
                case 1:
                    String maSerial;
                    System.out.println("\n Nhap Serial May Tinh De Ban: ");
                    sd.nextLine();
                    maSerial = sd.nextLine();
                    suaDSMayTinhDeBan(maSerial);
                    break;
                case 2:
                    //String maSerial;
                    System.out.println("\nNhap Serial May Tinh De Ban");
                    sd.nextLine();
                    maSerial = sd.nextLine();
                    xoaDSMayTinhDeBan(maSerial);
                    break;
                case 3:
                    //String maSerial;
                    System.out.println("\n Nhap Serial May Tinh Xach Tay: ");
                    sd.nextLine();
                    maSerial = sd.nextLine();
                    suaDSMayTinhXachTay(maSerial);
                    break;
                case 4:
                    //String maSerial;
                    System.out.println("\nNhap Serial May Tinh Xach Tay");
                    sd.nextLine();
                    maSerial = sd.nextLine();
                    xoaDSMayTinhXachTay(maSerial);
            }
        } while (chon!=0);
    }
    public void menuChinh() {
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|           CHUONG TRINH QUAN LY KHO MAY TINH            |");
        System.out.println("|========================================================|");
        System.out.println("|1. Nhap DS May Tinh Xach Tay                            |");
        System.out.println("|2. Nhap DS May Tinh De Ban                              |");
        System.out.println("|3. Hien DS May Tinh De Ban                              |");
        System.out.println("|4. Hien DS May Tinh Xach Tay                            |");
        System.out.println("|5. Chinh sua Thong tin (MayTinhDeBan, MayTinhXachTay)   |");
        System.out.println("|6. Nhap Phieu nhap kho                                  |");
        System.out.println("|7. Nhap Phieu xuat kho                                  |");
        System.out.println("|8. Hien DS Phieu nhap kho                               |");
        System.out.println("|9. Hien DS Phieu nhap kho                               |");
        System.out.println("|10. Chinh sua Thong tin (Phieu nhap kho, Phieu xuat kho)|");
        System.out.println("|11. Luu file DS Phieu                                   |");
        System.out.println("|12. Doc file DS Phieu                                   |");
        System.out.println("|11. Luu file DS May Tinh                                   |");
        System.out.println("|12. Doc file DS Phieu                                   |");
        System.out.println("|--------------------------------------------------------|");
    }
    public void menuSuaDoiPhieu() {
        System.out.println("|---------------------------------------------|");
        System.out.println("|        MENU THAY DOI THONG TIN PHIEU        |");
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