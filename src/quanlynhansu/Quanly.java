package quanlynhansu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public abstract class Quanly {

    static ArrayList<Nhanvien> nhanvien = new ArrayList<Nhanvien>();

    public static void HeThong() {
        System.out.println("-------------Quản Lý Nhân Sự-------------");
        System.out.println("1. Nhập danh sách thông tin của nhân viên ");
        System.out.println("2. In danh sách nhân viên và tính lương cho nhân viên ");
        System.out.println("3. Tổng tiền phải chi trả cho nhân viên ");
        System.out.println("4. Tìm kiếm tên nhân viên ");
        System.out.println("5. Sắp xếp nhân viên ");
        System.out.println("6. Xóa nhân viên ");

        System.out.println("Chọn chức năng :");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();

        switch (chon) {
            case 1:
                NhapDanhSachNhanVien();
                break;
            case 2:
                InDanhSachNhanVien();
                break;
            case 3:
                TongLuongCuaNhanVien();
                break;
            case 4:
                TimKiemNhanVien();
                break;
            case 5:
                SapXepNhanVien();
                break;
            case 6:
                XoaNhanVien();
                break;
            case 7:
                System.out.println("Thanks ");
                System.exit(0);

            default:
                System.out.println(" Bạn chọn sai xin chọn lại. ");

        }

    }

    private static void XoaNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần xóa :");
        String Idnv = sc.nextLine();
        Boolean check = false;
        for (Nhanvien nv : nhanvien) {
            if (Idnv.equalsIgnoreCase(String.valueOf(nv.getIdNv()))) {
                nhanvien.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Không tồn tại nhân viên :");
        } else {
            System.out.println("Nhân viên đã bị xóa. ");
        }
    }


    private static void SapXepNhanVien() {
        System.out.println("Sắp xếp nhân viên :");
        Collections.sort(nhanvien, (a, b) -> a.getTen().compareTo(b.getTen()) );
        InDanhSachNhanVien();
    }

    private static void TimKiemNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên : ");
        String ten = sc.nextLine();
        for(Nhanvien nv :nhanvien) {
            if(nv.getTen().equalsIgnoreCase(ten)) {
                nv.Hienthi();
            }
        }
    }

    private static void TongLuongCuaNhanVien() {
        System.out.println("-------Tổng lương nhân viên------");
        Scanner sc = new Scanner(System.in);
        long S = 0 ;
        for ( Nhanvien nv : nhanvien) {
            S += (long) + (S + Nhanvien.getLuong());
        }
        System.out.println(" Tổng lương nhân viên là :" + S+ "\n");
    }

    private static void InDanhSachNhanVien() {

        System.out.println("In danh sách và tính lương cho nhân viên :");
        for(int i = 0 ; i< nhanvien.size(); i++) {
            System.out.println(nhanvien.get(i)+ "\n");
        }
    }


    private static void NhapDanhSachNhanVien() {
        System.out.println("Nhập số lượng nhân viên muốn thêm:");
        Scanner sc = new Scanner(System.in);
        int sl1 = sc.nextInt();
        for(int a = 1; a <= sl1 ; a++) {
            System.out.println("Nhập nhân viên "+a+ ": ");
            Nhanvien nv = new Nhanvien();
            nv.Nhapdulieu();
            nhanvien.add(nv);

        }
    }

    public static void main(String[] args) {
        while (true) {
            HeThong();
        }
    }
}

