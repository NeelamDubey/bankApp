public class hdfcBankAcc implements bankacc{
    private int balance;
    public hdfcBankAcc(int balance)
    {
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }

    @Override
    public boolean withdrawMoney(int Money) {
        if (this.balance >= Money) {
            this.balance = this.balance - Money;
            return true;
        }
        return false;
    }
}
