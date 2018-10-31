package example.method;

/**
 * 斐波那契数列
 */
public class Fibonacci {
    public static long fibonacci(long number){
        if(number==0 || number==1){
            return  number;
        }else{
            return fibonacci(number-1)+fibonacci(number-2);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.printf("斐波那契数列第%s个数字是%s",i+1,fibonacci(i));
            System.out.println("\t");
        }
    }

}
