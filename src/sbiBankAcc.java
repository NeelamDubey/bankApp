public class sbiBankAcc implements bankacc{
    private int balance;
    public sbiBankAcc(int balance)
    {
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }
    @Override
    public boolean withdrawMoney(int Money) {
        if(this.balance >=Money)
        {
            this.balance=this.balance-money;
            return true;
        }
        return false;
    }
}
