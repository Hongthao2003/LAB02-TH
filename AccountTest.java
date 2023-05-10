
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class AccountTest {
    private AccountList alist;
    public AccountTest(AccountList alist) {
        this.alist = alist;
    }
    
    public static void main(String args[]) {
    AccountList accList = new AccountList(10);
    Account ac1 = new Account();
    Scanner sc = new Scanner(System.in);
    
    int menu;
        do {
            System.out.println("Lua chon chuc nang :");
            System.out.println("1. Them tai khoan :");
            System.out.println("2. So tk hien co :");
            System.out.println("3. In thong tin tat ca tai khoan :");
            System.out.println("4. Nap tien vao tk :");
            System.out.println("5. Rut tien :");
            System.out.println("6. Chuyen tien :");
            System.out.println("0. Thoat");
            System.out.print("Nhap: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    sc.nextLine();
                    System.out.println("Nhap tai khoan can them:");
                    String tentk = sc.nextLine();
                    System.out.print("Nhap vao so tien: ");
                    double sotien = sc.nextDouble();
                    System.out.print("Nhap vao so tai khoan: ");
                    int sotk = sc.nextInt();
                    sc.nextLine();
                    Account ac = new Account(sotien, sotk, tentk, tentk);
                    accList.themTK(ac);
            break;
            
            case 2:
                accList.soluongtaikhoan();
                System.out.println("So tk hien co");
                break;
             
            case 3:
               accList.inAccount();
               System.out.println("In thong tin tat ca tk"); 
               break;
               
            case 4:
                System.out.print("Nhap so tai khoan: ");
                sotk = sc.nextInt();
                ac1 = accList.tim_sotk_theo_sotk(sotk);
                if (ac1 == null) {
                    System.out.println("Khong tim thay tai khoan");
                } else {
                    System.out.print("Nhap so tien can nap: ");
                    double sotiennap = sc.nextDouble();
                    ac1.napTien(sotiennap);
                    System.out.println("Da nap " + sotiennap + " vao tai khoan " + sotk);
                    System.out.println("Thong tin tai khoan sau khi nap tien:");
                    System.out.println(ac1.toString());
                }
               break;
               
            case 5:
                System.out.print("Nhap so tai khoan: ");
                sotk = sc.nextInt();
                ac1 = accList.tim_sotk_theo_sotk(sotk);
                if (ac1 == null) {
                    System.out.println("Khong tim thay tai khoan");
                } else {
                    System.out.print("Nhap so tien can rut: ");
                    double sotienrut = sc.nextDouble();
                    ac1.rutTien(sotienrut);
                    System.out.println(ac1.toString());
                }
               break;
               
            case 6:
                 System.out.print("Nhap vao so tai khoan chuyen: ");
                   double chuyenkhoan = sc.nextDouble();
                   int stk_can_chuyen =sc.nextInt();
                   ac1 = accList.tim_sotk_theo_sotk(stk_can_chuyen);
                    if(ac1 == null){
                        System.out.println("Khong tim thay"); 
                    }else{
                       System.out.println("Da chuyen vao"+stk_can_chuyen );
                        break;
                    }
               break;

            default:
                if(menu !=0){
                    System.out.println("Nhap lai");
                }else{
                    System.out.println("Thoat thanh cong");
                 }
            }
        }while(menu !=0);
    }
}
