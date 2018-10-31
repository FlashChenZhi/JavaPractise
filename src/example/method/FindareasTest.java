package example.method;

/**
 * 方法覆盖
 */
public class FindareasTest {
    public static void main(String[] args) {
        Figure figure = new Figure(10,10);
        Rectangle rectangle = new Rectangle(9,5);
        Figure figref;
        figref=figure;
        System.out.println("第一次获取区域："+figref.area());
        figref=rectangle;
        System.out.println("第二次获取区域："+figref.area());
    }

}
