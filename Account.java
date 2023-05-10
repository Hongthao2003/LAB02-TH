import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Account {
    
    private double sotien;
    private int sotk;
    private String tentk;
    private String trangthai;
    
    Scanner sc = new Scanner(System.in);
    
    public Account() {
    }

    public Account(double sotien, int sotk, String tentk, String trangthai) {
        this.sotien = sotien;
        this.sotk = sotk;
        this.tentk = tentk;
        this.trangthai = trangthai;
    }
    
    public double getSotien() {
        return sotien;
    }

    public int getSotk() {
        return sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setSotien(double sotien) {
        if(sotien >50){
        this.sotien = sotien;
        }else {
            this.sotien =50;
        }
    }

    public void setSotk(int sotk) {
        if(sotk >0 || sotk !=999999) {
            this.sotk = sotk;
        }else{
            this.sotk =999999;
        }
    }

    public void setTentk(String tentk) {
        if(tentk.isEmpty()||tentk.trim().isEmpty()){
            this.tentk="Chua xac dinh";
        }else{
        this.tentk = tentk;
    }
    }
    public void setTrangthai(String trangthai) {
        if (tentk.isEmpty() || sotk == 0 || sotien < 0) {
            this.trangthai = "Khong hop le";
        } else {
            this.trangthai = "Hop le";
        }
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi", "vn");
 NumberFormat nf =NumberFormat.getCurrencyInstance(local);
String str1 = nf.format(sotien); 
        return "Account{" + "sotien=" + str1 + ", sotk=" + sotk + ", tentk=" + tentk + ", trangthai=" + trangthai + '}';
    }

    
    public double napTien(double sotiennap) {
        double nap;
        System.out.print("Nhap so tien can nap ");
        nap = sc.nextDouble();
   
        if (nap >= 0) {
            sotien = nap + sotien;
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            String str1 = nf.format(nap);
            System.out.println("ban vua nap " + str1 + " vao tai khoan");
        } else {
            System.out.println("So tien khong hop le");
        }
        return nap;
    }
    
    public double rutTien(double sotienrut) {
        double rut;
        System.out.print("Nhap so tien ban can rut ");
        rut = sc.nextDouble();
        
        if (rut <= (sotien - rut)) {
            sotien = sotien - (rut);
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            String str1 = nf.format(rut);
            System.out.println("ban vua rut " + str1 );
        } else {
            System.out.println("So tien khong hop le");
            return rutTien(sotienrut);
        }
        return rut;
    }
    
    public double chuyenKhoan(){
        double chuyenkhoan;
        int stk_can_chuyen;
        
        chuyenkhoan = sc.nextDouble();
        stk_can_chuyen =sc.nextInt();
        if (chuyenkhoan <= (sotien - chuyenkhoan)) {
            sotien = sotien - (chuyenkhoan);
            System.out.println("Nhap so tien ban can chuyen khoan:");
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            String str1 = nf.format(chuyenkhoan);
            System.out.println("ban vua chuyen khoang " + str1+ "vao"+ stk_can_chuyen );
            return chuyenKhoan();
    }
        return chuyenkhoan;
        
    }
    
    public double daoHan() {
        double laixuat = 0.035;
        sotien =sotien+ sotien * laixuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotien);
        System.out.println("dao han cua ban la"+ str1);
        return sotien;
    }
    
}
