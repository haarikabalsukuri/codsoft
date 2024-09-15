import java.util.*;
public class UserAtm 
{
    public static void main(String[] args) 
    {
        BankAc ac = new BankAc(1000);
        ATM atm = new ATM(ac);
        atm.run();
    }
}
 class ATM 
{
    private BankAc ac;
    private Scanner sc=new Scanner(System.in);

    public ATM(BankAc ac) {
        this.ac = ac;
        this.sc = sc;
    }

    public void display() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void handle(int op) {
        switch (op) {
            case 1:
                System.out.println(ac.checkBal());
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAm = sc.nextDouble();
                System.out.println(ac.deposit(depositAm));
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAm = sc.nextDouble();
                System.out.println(ac.withdraw(withdrawAm));
                break;
            case 4:
                System.out.println("Thank you for using ATM.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public void run() {
        int op = 0;
        while (op != 4) {
            display();
            System.out.print("Choose an option: ");
            op = sc.nextInt();
            handle(op);
        }
    }
}
    class BankAc{
    private double bal;

    public BankAc(double initialBal) {
        this.bal = initialBal;
    }

    public String deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            return "Deposited Rs" + amt + " Successfully.";
        } else {
            return "Deposit amount must be greater than zero.";
        }
    }

    public String withdraw(double amt) {
        if (amt > 0 && amt <= bal)
        {
            bal -= amt;
            return "Withdrew Rs" + amt+ " Successfully.";
        } 
        else if (amt> bal)
        {
            return "Insufficient Balance.";
        } 
        else
        {
            return "Withdrawal amount must be greater than zero.";
        }
    }

    public String checkBal() 
    {
        return "Your balance is Rs " + bal;
    }

    public double getBal() 
    {
        return bal;
    }
}

