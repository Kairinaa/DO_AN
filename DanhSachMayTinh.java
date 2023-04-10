import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachMayTinh {
    ArrayList<MayTinh> mayTinh;
        public DanhSachMayTinh() {
            mayTinh = new ArrayList<>();
        }

        public void themDSMayTinh(MayTinh a) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong can them: "); int n = sc.nextInt();
            for (int i = 0; i< n; i++) {
                System.out.println("\nLan them thu " + (i+1)+ ": ");a.nhapThongTin();mayTinh.add(a);
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
}
