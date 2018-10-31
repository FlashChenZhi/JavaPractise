package example.array;

/**
 * 查找数组中的重复元素
 */
public class FindRepetitiveValue {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        for(int i=0;i<my_array.length-1;i++){
            for(int j=i+1;j<my_array.length;j++){
                if(my_array[i]==my_array[j] && i!=j){
                    System.out.println("该数组中存在重复值："+my_array[i]+"\t元素索引为："+i+"\t"+my_array[j]+"对应位置："+j);
                }
            }
        }

    }
}
