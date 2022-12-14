package quanlynhansu;

import java.util.Scanner;

public class Nhanvien {
    private int idNv;
    private static int thoigianlamviec;
    private static long luong;

    private String HovaTen;

    private String HovaTenDem;

    private String Ten;
    private String soDienThoai;
    private String diachi;

    public Nhanvien(){
        super();
    }
    public Nhanvien(int idNv , int thoigianlamviec , long luong , String HovaTen , String HovaTenDem , String Ten , String soDienThoai , String diachi){

        super();
        this.idNv = idNv;
        this.thoigianlamviec = thoigianlamviec;
        this.luong = luong;
        this.HovaTen = HovaTen;
        this.HovaTenDem = HovaTenDem;
        this.Ten = Ten;
        this.soDienThoai = soDienThoai;
        this.diachi = diachi;

    }

    public void setIdNv(int idNv) {
        this.idNv = idNv;
    }

    public int getIdNv() {
        return idNv;
    }

    public void setThoigianlamviec(int thoigianlamviec) {
       this.thoigianlamviec = thoigianlamviec;
    }

    public static int getThoigianlamviec() {
        return thoigianlamviec;
    }


    public void setHovaTenDem(String HovaTenDem) {
        this.HovaTenDem = HovaTenDem;
    }

    public String getHovaTenDem() {
        return HovaTenDem;
    }

    public void setTen(String Ten) {this.Ten = Ten; }

    public String getTen() { return Ten;}

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }

    public static long getLuong() {
        luong = thoigianlamviec*200000;
        return luong;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "idNv=" + this.idNv +
                ",thoigianlamviec = " + this.thoigianlamviec+
                ",luong = " + getLuong()+ "VND"+
                ", HovaTen='" + this.HovaTenDem + " " + this.Ten+ '\'' +
                ", soDienThoai='" + this.soDienThoai + '\'' +
                ", diachi='" + this.diachi + '\'' +
                '}';
    }

    public void Hienthi() {
        System.out.println(this);
    }

    public void Nhapdulieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh???p Id nh??n vi??n :");
        idNv = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p h??? v?? t??n ?????m: ");
        HovaTenDem = sc.nextLine();
        System.out.print("Nh???p t??n : ");
        Ten = sc.nextLine();
        System.out.println("Nh???p s??? ??i???n tho???i nh??n vi??n :");
        soDienThoai = sc.nextLine();
        System.out.print("Nh???p ?????a ch??? nh??n vi??n :");
        diachi = sc.nextLine();
        System.out.print("Nh???p v??o th???i gian l??m vi???c :");
        thoigianlamviec = sc.nextInt();

    }
}







