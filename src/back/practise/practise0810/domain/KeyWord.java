package back.practise.practise0810.domain;

/**
 * 1. break
 *  break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块
 *  break 跳出最里层的循环，并且继续执行该循环下面的语句
 *
 * 2. continue
 *  continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代
 *  在 for 循环中，continue 语句使程序立即跳转到更新语句
 *  在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句
 */

public class KeyWord {

    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int a:numbers){
            if(a==30){
//                break;
                continue;
            }
            System.out.println("变量a循环值："+a);
        }

    }

}
