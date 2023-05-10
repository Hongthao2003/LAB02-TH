
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AccountList {
    private Account[] accList;
    private int count;
    public AccountList(int n){
        accList = new Account[n];
        count = 0;
    }
    AccountList acclist;
    public AccountList(){
        acclist = new AccountList(10);
    }
    public void themTK(Account ac){
        if(count < accList.length){
            accList[count] = ac;
            count ++;
            System.out.println("Them thanh cong");
        }else{
            System.out.println("Khong the them, danh sach day");
        }
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Account getaccount(int index){
        if(index < 0 ||index> count){
            System.out.println("Tai khoan khong hop le");
            return null;
        }else{
            return accList[index];
        }
    }
    public Account tim_sotk_theo_sotk(int sotk){
        for(int i=0; i<count;i++){
            if(accList[i].getSotk() == sotk){
                return accList[i];
            }
        }
        return null;
    }
    public void xoaTK(int sotk){
        int index=-1;
        for(int i=0; i<count;i++){
            if(accList[i].getSotk()==sotk){
                index = i;
                break;
            }
        }
       if(index != -1){
           for(int i = index; i<count-1; i++){
               accList[i]=accList[i+1];
           }
           count--;
           System.out.println("Xoa thanh cong");
       }else{
           System.out.println("Khong tim thay tai khoan");
       }
    }
    public int soluongtaikhoan(){
        if (count == 0) {
            System.out.println("Khong co tai khoan nao trong danh sach");
        }else{
            System.out.println("So luong tai khoan la: "+count);
        }
        return count;
    }
    public void inAccount(){
        for(int i=0; i<count;i++){
            System.out.println("Thong tin tai khoan thu "+(i+1)+" la:");
            System.out.println("So ten khoan la: "+accList[i].getTentk());
            System.out.println("So tai khoan la: "+accList[i].getSotk());
            System.out.println("So tien la: "+accList[i].getSotien());
            System.out.println("Dao han la: "+accList[i].daoHan());
        }
    }
}
