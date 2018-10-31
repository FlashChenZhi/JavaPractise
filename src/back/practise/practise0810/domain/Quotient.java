package back.practise.practise0810.domain;

public class Quotient {

    public static void main(String[] args) {
        System.out.println("输出200以内能被7整除且不能被4整出的数字：");
        int k=1;
        for(int i=0;i<=200;i++){
            if(i%7==0 && i%4!=0){
                System.out.print("变量值："+i+"\t");
                k++;
                if(k>6){
                    System.out.println();
                    k=1;
                }
            }
        }
    }

}
