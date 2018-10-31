package back.practise.practise0816.course_data;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable balance =new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara",new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));
        //通过键将值保存到枚举
        names=balance.keys();
//        while(names.hasMoreElements()){
//            str= (String) names.nextElement();
//            System.out.println("显示品牌名称："+str+"\t对应价格："+balance.get(str));
//
//        }
        System.out.println("各品牌均上涨1000元后的价格：");
        while(names.hasMoreElements()){
            str=(String )names.nextElement();
            bal=(double)balance.get(str)+1000;                  //第一种写法
//            bal=((Double)balance.get(str)).doubleValue()+1000;  //第二种写法
            System.out.println("品牌名称："+str+"\t上涨后价格："+bal);
        }
    }

}
