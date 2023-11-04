public class J0011BankAccount {
    private int balance;

    public void depositeMoney(int dMoney){
        balance = balance +dMoney;
    }

    public void withdrawMoney(int wMoney){
        balance = balance -wMoney;
    }

    public void display(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        J0011BankAccount j0011BankAccount = new J0011BankAccount();
        j0011BankAccount.depositeMoney(1500);
        j0011BankAccount.withdrawMoney(500);
        j0011BankAccount.display();
    }
    
}
