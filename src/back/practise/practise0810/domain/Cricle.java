package back.practise.practise0810.domain;

public class Cricle {
    public static void main(String[] args) {
        int i=10;
        /*  满足条件立即执行循环体 */
//        while(i<20){
//            System.out.println("变量i的值："+i);
//            i++;
//        }
        /*  无论是否满足条件，至少执行一次循环体  */
//        do{
//            System.out.println("变量i的值："+i);
//            i++;
//        }while(i<20);

        /*  for循环结构  */
//        for (int j=10;j<20;j++){
//            System.out.println("变量j值："+j);
//        }

        /*  增强 for 循环   */
        int [] number={10,12,16,28,20,38,36,30};
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for(String k:names){
            System.out.println("变量K循环值有："+k);
        }


    }
}
