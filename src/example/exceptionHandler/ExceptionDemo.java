package example.exceptionHandler;

/**     异常处理
 * 1.System 类的 System.err.println() 来展示异常的处理方法
 *
 */
public class ExceptionDemo {

    public static void main(String[] args) {
//        try{
//            throw new Exception("My Exception");
//        }catch (Exception e){
//            System.err.println("发生异常");
//            System.err.println("获取信息：" + e.getMessage());
//            System.err.println("获取本地信息" + e.getLocalizedMessage());
//            System.err.println("转成字符串" + e);
//            System.err.println("printStackTrace():");
//            e.printStackTrace();
//        }

        Demo demo=new Demo();
        try{
            int x = demo.div(4,0);//程序运行截图中的三组示例 分别对应此处的三行代码
            //int x = d.div(5,0);
            //int x = d.div(4,1);
            System.out.println("X+"+x);
        }catch (ArithmeticException a){
            System.out.println(a.toString());
        }catch (ArrayIndexOutOfBoundsException  e){
            System.out.println(e.toString());
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Over");
    }

}
