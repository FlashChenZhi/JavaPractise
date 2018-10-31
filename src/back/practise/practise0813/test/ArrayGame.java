package back.practise.practise0813.test;

import java.util.Scanner;

/**
 * 程序随机产生5个按一定顺序排列的字符，作为猜测结果。
 * 玩家可以猜测多次，每猜一次，若猜测的完全正确则游戏结束，并计算玩家的游戏得分并输出;
 * 若没有猜对，则提示猜测结果，如猜对了几个字符，以及猜对了几个字符的位置信息，并提示玩家游戏继续;
 * 若中途输入EXIT，则游戏提前结束
 */
public class ArrayGame {
    private static Scanner scan;
    public static void main(String[] args) {
       scan=new Scanner(System.in);
       char[] chs=generate();
//       System.out.println(chs);
       int count=0;
       while(true){
           System.out.println("猜吧！");
           String str=scan.next().toUpperCase();
           if(str.equals("EXIT")){
                System.out.println("下次再来吧！");
                break;
           }
           char [] input=str.toCharArray();
           int  [] result=check(chs,input);
           if(result[0]==chs.length){
               int score = 100 * chs.length - 10 * count;
               System.out.println("你本次游戏得分为："+score);
               break;
           }else{
               count++;
               System.out.println("字符对个数为:" + result[1] + "，位置对个数为:" + result[0]);
           }

       }


    }

    //生成随机字符数组
    public static  char[] generate(){
        char[] chs = new char[5];
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z' };
        boolean[] flags=new boolean[letters.length];
//        System.out.println(chs.length);
        for(int i=0;i<chs.length;i++){
            int index;
            do{
                index=(int)Math.random()*letters.length;
            }while (flags[i]==true);
            chs[i]=letters[index];
            flags[index]=true;
        }
            return  chs;
    }

    // 对比:随机字符数组chs与用户输入的字符数组input
    public static  int [] check(char[] chs, char[] input){
        int [] result=new int[2];
        for(int i=0;i<chs.length;i++){
            for(int j=0;j<input.length;j++){
                if(chs[i]==input[j]){
                    result[1]++;
                    if(i==j){
                        result[0]++;
                    }
                    break;
                }
            }
        }
        return result;
    }

}
