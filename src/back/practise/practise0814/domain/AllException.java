package back.practise.practise0814.domain;

/**
 * 异常发生的原因有很多，通常包含以下几大类：
 * 1.用户输入了非法数据
 * 2.要打开的文件不存在
 * 3.网络通信时连接中断，或者JVM内存溢出
 *
 *  三种类型的异常
 *  检查性异常：不处理编译不能通过
 *  运行时异常：不处理编译可以通过，如果有抛出直接抛到控制台
 *  错误：
 *
 * 一个 try 代码块后面跟随多个 catch 代码块的情况就叫多重捕获
 */
public class AllException {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("数组元素："+a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("数组下标越界啦！");
    }

}
