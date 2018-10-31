package example.printGraphics;

/**
 * 打印三角形：具体分析见src/instance/打印三角形
 */
public class Triangle {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; i <= j; j--)
//                System.out.print(" ");
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            for (int j = 1; j < i; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        //打印倒立的三角形
        for (int i=0;i<=5;i++) {
            for(int j=0;j<i;j++){
                //打印空格
                System.out.print(" ");
            }
            //打印*
            for(int k=0;k<9-2*(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
