package back.practise.practise0810.domain;

public class RhombusTest {

    int x, y;// 菱形上部的参数
    int z, k;// 绘制菱形下部的参数

    int b, c;

    private void draw(int a) {
        for (x = 0; x <= a; x++) {
            for (y = a; y >= x; y--) {
                if (y > x) {
                    System.out.print(" ");
                }//绘制菱形上半部分左边的空格部分，逐行递减
                if (y == x) {
                    System.out.print("*");
                }//绘制菱形上半部分左边的边

            }

            for (b = 1; b <= 2 * x; b++) {
                if (b < 2 * x) {
                    System.out.print(" ");//绘制菱形上半部分中间的空格
                } else if (b == 2 * x) {
                    System.out.print("*");//绘制菱形上半部分有伴部分的边
                }

            }
            System.out.println();//换行

        }//菱形上半部分绘制完毕

        for (z = 0; z < a; z++) {
            for (k = 0; k <= z; k++) {
                if (k == 0) {
                    System.out.print(" ");
                }
                if (k < z) {
                    System.out.print(" ");
                }//绘制菱形下半部分左边的空格部分，数量逐行递增
                if (k == z) {
                    System.out.print("*");
                }//绘制菱形下半部分左边的边

            }
            for (c = 2 * a - 3; c >= 2 * z; c--) {
                if (c > 2 * z) {
                    System.out.print(" ");//绘制菱形下半部分中间的空格
                } else if (c == 2 * z) {
                    System.out.print("*");//绘制菱形下半部分有伴部分的边
                }

            }
            System.out.println();//换行
        }//菱形下半部分绘制完毕
    }

    public static void main(String[] args) {
        RhombusTest myRhombus = new RhombusTest();
        int a = 10;//可以更改，控制菱形的大小
        myRhombus.draw(a);
    }
}
