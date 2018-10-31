package example.method;

/**     varargs：可变长度的参数
 * 定义实参个数可变的方法：只要在一个形参的"类型"与"参数名"之间加上三个连续的"."
 * （即"..."，英文里的句中省略号），就可以让它和不确定个实参相匹配
 */
public class Varargs {
    static int sumvarargs(int ... args){
        int i=0;
        int sum=0;
        for(;i<args.length;i++){
            sum+=args[i];
        }
        return sum;
    }

    //重载(overloading)方法中使用 Varargs
    static void vaTest(int ... no) {
        System.out.print("vaTest(int ...): "
                + "参数个数: " + no.length +" 内容: ");
        for(int n : no)
            System.out.print(n + " ");
        System.out.println();
    }
    static void vaTest(boolean  ... bo) {
        System.out.print("vaTest(int ...): "
                + "参数个数: " + bo.length +" 内容: ");
        for(boolean n : bo)
            System.out.print(n + " ");
        System.out.println();
    }
    static void vaTest(String ... str) {
        System.out.print("vaTest(int ...): "
                + "参数个数: " + str.length +" 内容: ");
        for(String n : str)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int sum=sumvarargs(new int[]{20,40,120,160,180});
        System.out.println("数组之和为："+sum);

        vaTest(1,2,3);
        vaTest(true,true,true);
        vaTest("I","Love","You");
    }

}
