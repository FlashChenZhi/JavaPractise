package example.method;

/**
 * 汉诺塔算法
 */
public class HanoiTower {
    public static void doTowers(int top,char from,char inter,char to){
        if(top==1){
            System.out.println("来自于："+from+"\t\t去往："+to);
        }else{
            doTowers(top-1,from,to,inter);
            System.out.println("开始 " + top + " 来源： " + from + " 抵达： " + to);
            doTowers(top-1,inter,from,to);
        }
    }

    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

}
