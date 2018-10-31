package back.practise.practise0816.course_generic;

public class MaximumTest {
    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;            //设最大值为 x
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return   max;       //返回最大值
    }

    public static void main(String[] args) {
        System.out.printf("%d,%d 和 %d 三个数中最大值是：%d ",3,4,5,maximum(3,4,5));
        System.out.println();
        System.out.printf("%f,%f 和 %f 三个数中最大值是：%f ",3.58,4.21,5.20,maximum(3.58,4.21,5.20));
        System.out.println();
        System.out.printf("%d,%d 和 %d 三个数中最大值是：%d ",15,6,12,maximum(15,6,12));
    }

}
