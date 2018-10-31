package example.method;

/**     for和foreach循环的使用
 * 1.for 语句比较简单，用于循环数据：for循环执行的次数是在执行前就确定的
 * 2.foreach 语句：在遍历数组、集合方面，foreach为开发人员提供了极大的方便
 */
public class ForeachTest {
    public static void main(String[] args) {
        int [] data=new int[]{25,18,36,40,20,72,60,12,55,52};
        forDisplay(data);
        System.out.println();
        foreachDisplay(data);
    }

    //1.for 语句循环数组
    public static void forDisplay(int[] data){
        System.out.println("使用 for 循环数组");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t\t");
        }
    }

    //2.foreach 语句加强循环
    public static void foreachDisplay(int[] data){
        System.out.println("使用 foreach 循环数组");
        for(int i:data){
            System.out.print(i+"\t\t");
        }
    }

}
