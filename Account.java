import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        MainAccount obj =new MainAccount();
        obj.getData();
        obj.showData();
    }
}
class MainAccount {
    int accountNo;
    String name = "Shyam";
    int tBalance = 50000;
    int withdraw;
    int deposit;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        withdraw = sc.nextInt();

        if (withdraw > tBalance) {
            System.out.println("Insufficient Balance. You can't withdraw.");
        } else {
            tBalance -= withdraw;
            System.out.println("Take your money. Current Balance: " + tBalance);
        }
    }

    void showData() {
        System.out.print("Enter Amount to Deposit: ");
        deposit = sc.nextInt();
        tBalance += deposit;
        System.out.println("Current Balance is: " + tBalance);
    }
}
