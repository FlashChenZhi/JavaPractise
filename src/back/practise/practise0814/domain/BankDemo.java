package back.practise.practise0814.domain;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount ca=new CheckingAccount(1234567890);
        System.out.println("请输入存款金额：￥5000元");
        ca.deposit(5000);
        try {
            System.out.println("第一次提取金额： ￥1000元");
            ca.withdraw(1000.00);
            System.out.println("第二次提取金额：￥6000元");
            ca.withdraw(6000.00);
        } catch (InsufficientFundsException  e) {
           System.out.println("对不起！您的实际余额距提取金额还差：￥"+e.getAmount()+"元.");
           e.printStackTrace();
        }
    }
}
