package back.practise.practise0814.domain;

public class CheckingAccount {
    //balance为余额，number为卡号
    double balance;
    int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    //方法：存钱
    public void deposit(double amount){
        balance+=amount;
    }
    //方法：取钱
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount<=balance){
            balance-=amount;
        }else{
            double d=amount-balance;
            throw new InsufficientFundsException(d);
        }
    }
    //返回余额
    public double getBalance() {
        return balance;
    }
    //返回卡号
    public int getNumber() {
        return number;
    }

}
