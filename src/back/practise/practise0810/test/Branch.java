package back.practise.practise0810.test;

/**
 * 1.if分支结构
 *  如果布尔表达式的值为 true，则执行 if 语句中的代码块，否则执行 if 语句块后面的代码
 *
 * 2.if...else分支结构
 * if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行
 *
 * 3.if...else if...else 语句
 * 使用 if，else if，else 语句的时候，需要注意下面几点：
 *  if 语句至多有 1 个 else 语句，else 语句在所有的 elseif 语句之后
 *  if 语句可以有若干个 elseif 语句，它们必须在 else 语句之前
 *  一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行
 *
 * 4.嵌套的 if…else 语句
 *  使用嵌套的 if…else 语句是合法的。也就是说你可以在另一个 if 或者 elseif 语句中使用 if 或者 elseif 语句
 *
 * 5. switch 语句
 *  switch 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支
 */

public class Branch {
    public static void main(String[] args) {
        int i=10;
        int x=20;
//        if(i>20){
//            System.out.println("这是if结构语句");
//        }else{
//            i++;
//            System.out.println("变量i的值为："+i);
//        }

//        if(x==10){
//            System.out.println("变量X值为："+x);
//        }else if(x==20){
//            System.out.println("变量X值为："+x);
//        }else if(x==30){
//            System.out.println("变量X值为："+x);
//        }else{
//            System.out.println("这是if...else if...else结构语句");
//            System.out.println("变量X值为："+x);
//        }

//        if(i==10) {
//            if (x == 30) {
//                System.out.println("变量i值为：" + i + "\t变量x值为：" + x);
//            } else {
//                System.out.println("变量i值为：" + i + "且变量x值判断不成立！！！");
//            }
//        }
        int grade=86;
        char c;
        switch (grade/10){
            case 10:
                c='A';
                System.out.println("恭喜你获得了满分，评定成绩等级为："+c++);
                break;
            case 9:
                c='A';
                System.out.println("恭喜你获得了高分，评定成绩等级为："+c);
                break;
            case 8:
                c='B';
                System.out.println("恭喜你获得了不错的成绩，评定成绩等级为："+c);
                break;
            case 7:
            case 6:
                c='C';
                System.out.println("恭喜你通过考试，评定成绩等级为："+c);
                break;
            default:
                c='D';
                System.out.println("很遗憾！你没有通过考试，评定成绩等级为："+c);
        }

    }

}
