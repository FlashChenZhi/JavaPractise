package example.method;

/**
 * 阶乘算法：正整数10以内的阶乘
 */
public class factorial {

    public static  long factorial(long number){
        if(number<=1){
            return number;
        }else{
            return number*factorial((number-1));
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.printf("第%d次计算阶乘结果为：%d",i+1,factorial(i));
            System.out.print("\n");
        }
    }

}
