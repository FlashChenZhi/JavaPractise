package example.dataStructure;

/**
 * 数字求和运算
 */
public class GetSum {

    public static void main(String[] args) {
        int limit=100,sum=0,i=1;
        //使用while结构求0-100的整数数字之和
//        while(i<=limit){
//            sum+=i;
//            i++;
//        }
//        System.out.println("100以内整数之和为："+sum);
        //使用do...while结构求0-100的整数数字之和
        do{
            sum+=i;
            i++;
        }while (i<=limit);
        System.out.println("100以内整数之和为："+sum);
    }

}
