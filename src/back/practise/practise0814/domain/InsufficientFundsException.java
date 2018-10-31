package back.practise.practise0814.domain;

//自定义异常类，继承Exception类
public class InsufficientFundsException extends Exception{
    private  double amount;

    //构造方法
    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }
    //封装属性
    public double getAmount() {
        return amount;
    }
}
