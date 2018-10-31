package example.printGraphics;

/**
 * 打印矩形
 */
public class Squareness {
    public static void main(String[] args) {
        //外层循环 每次输出一行*
        for(int i=1;i<=6;i++){
            System.out.print("*");
            for(int j=1;j<=6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
