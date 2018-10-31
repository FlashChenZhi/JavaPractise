package example.printGraphics;

/**
 * 打印圆形
 */
public class Circle {
    public static void main(String[] args) {
            circle(5);
    }

    public static  void circle(int r){
        for(int y=0;y<=r*2;y+=2){
            int x= (int) Math.round(r-Math.sqrt(r*y*2-y*y));
            int len=2*(r-x);
            // 圆左的空白
            for(int i=0;i<=x;i++){
                System.out.print(' ');
            }
            // 左半圆
            System.out.print('*');
            // 中间空白
            for(int j=0;j<=len;j++){
                System.out.print(' ');
            }
            // 右半圆
            System.out.println('*');
        }
    }

}
