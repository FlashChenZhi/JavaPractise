package back.practise.practise0810.domain;

public class Draw {
    int a,b;    //a是要生成的菱形行数
    int h;      //h是方法中的参数，也是行数
    int i,j;    //i j是循环结构参数
    public void Draw(int h) {
        if (h % 2 != 0 && h>2) {
            //逐行打印
            for (i = 1; i <= h; i++) {
                //每行打印个数与行数保持一致
                for (j = 1; j <= h; j++) {
                    //当h=5时，j
                    if (j == (h + 3) / 2 - i || j == (h - 1) / 2 + i || j == i - (h - 1) / 2 || j == (3 * h + 1) / 2 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("你输入的参数无法构成菱形结构！");
        }
    }

    public static void main(String[] args) {
        Draw draw=new Draw();
        int i,j;
        int h=5;
        draw.Draw(h);
        for (i = 1; i <= h; i++) {
            //每行打印个数与行数保持一致
            for (j = 1; j <= h; j++) {
                if (j == (h + 3) / 2 - i || j == (h - 1) / 2 + i || j == i - (h - 1) / 2 || j == (3 * h + 1) / 2 - i) {
                    System.out.println("变量j 值1："+((h + 3) / 2 - i )+"\t变量j 值2："+((h - 1) / 2 + i )+"\t变量j 值3："+( i - (h - 1) / 2 )
                            + "\t变量j 值4："+( (3 * h + 1) / 2 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
