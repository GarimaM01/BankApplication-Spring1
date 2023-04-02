import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        System.out.println("Enter balance: ");
        int balance = sc.nextInt();

        SBIAccount SBIAccount = new SBIAccount(name, password, balance);

        System.out.println("Your Account No is: "+ SBIAccount.getAccNo());

        System.out.println(SBIAccount.depositeAmount(balance));

        int choose;
        do {
            System.out.println("===================Choose your Option============================\n");
            System.out.println("choose 1 for deposite Amount");
            System.out.println("choose 2 for withdrawl Amount");
            System.out.println("choose 3 for Interest Amount");
            System.out.println("choose 4 for EXIT");

            System.out.println("\nEnter ur Option: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter deposite Amount: ");
                    System.out.println(SBIAccount.depositeAmount(sc.nextInt()));
                    //System.out.println(SBIAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Enter Withdrawl Amount: ");
                    int amt = sc.nextInt();
                    System.out.println("Enter password: ");
                    String pass = sc.next();

                    System.out.println(SBIAccount.withdrawlAmount(pass, amt));
                    //System.out.println(SBIAccount.getBalance());
                    break;
                case 3:
                    System.out.println("Enter your timeframe: ");
                    int year = sc.nextInt();
                    double amt_SI = SBIAccount.calculateInterest(year);
                    int bal = SBIAccount.getBalance();
                    System.out.println("After spending " + year + "yrs with 7.2 ROI amount will be: " + amt_SI+bal);
                    break;
            }
        } while (choose != 4); System.exit(0);
    }
}