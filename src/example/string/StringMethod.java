package example.string;

import java.util.Locale;
import java.util.StringTokenizer;

/**     关于 字符串方法的应用
 * 1.替换：replace() / replaceFirst() / replaceAll()
 * 2.反转：reverse()
 * 3.查找：indexOf()   /   lastIndexOf()
 * 4.分割：两种不同的方法
 *   <1>.split()方法通过循环取值
 *   <2>.实例化一个 StringTokenizer 的对象，通过 hasMoreTokens() 与 nextToken()进行判断
 * 5.大小写转换：
 *   <1>.大转小：toLowerCase()
 *   <2>.小转大：toUpperCase()
 * 6.判断区域相等： regionMatches() 方法测试两个字符串区域是否相等
 *
 * 7.性能比较：字面量直接赋值<--字符串对象<--字符串对象intern()方法     [ 从高到低 ]
 *      System.currentTimeMillis() (毫秒：)  /   System.nanoTime() (纳秒：多用于循环次数较少)
 * 8.优化：String.intern()方法
 *      intern方法会到常量池中查找是否存在该对象，如果存在，返回该对象；不存在的话就创建该对象并返回该对象
 * 9.格式化： format()方法
 * 10.拼接：   通过 "+" 操作符和StringBuffer.append() 方法
 */
public class StringMethod {
    public static void main(String[] args) {
        //字符串替换
//        String replace="AB12CD34EF56EF36";
//        System.out.println("替换指定字符串(可替换字符或字符串)："+replace.replace("AB","ab"));
//        System.out.println("替换指定字符串(指定替换第1次出现)："+replace.replaceFirst("EF","ef"));
//        System.out.println("替换指定字符串(基于规则表达式的替换)："+replace.replaceAll("\\d","*"));

        //字符串反转
//        String str="ABCDEFGH";
//        String reverse=new StringBuffer(str).reverse().toString();
//        System.out.println("反转字符串前："+str);
//        System.out.println("反转字符串后："+reverse);

        //字符串搜索
//        String search="Google Alibaba Runoob";
//        int index=search.indexOf("Ali");
//        if(index==-1){
//            System.out.println("未从该字符串中找到元素：Ali");
//        }else{
//            System.out.println("在该字符串中找到元素：Ali"+" 出现索引初始位置为："+index);
//        }

        //1.字符串分割
//        String split = "www-runoob-com";
//        String [] temp;
//        String delimeter="-";           // 指定分割字符
//        temp=split.split(delimeter);    // 分割字符串
//        for(int i=0;i<temp.length;i++){
//            System.out.print(temp[i]+" ");
//        }
//        System.out.println("\n------java for each循环输出的方法-----");
//        //2.字符串分割
//        String split1="中国.湖南.长沙";
//        String [] temp1;
//        String delimeter1="\\.";         // 指定分割字符， . 号需要转义
//        temp1=split1.split(delimeter1);
//        for(String s:temp1){
//            System.out.println(s);
//        }
//        //3.字符串分割
//        String split3="home.firefoxchina.cn";
//        String split4 = "This is String , split by StringTokenizer, created by runoob";
//        StringTokenizer st=new StringTokenizer(split3,".");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
//       System.out.println("----- 通过空格分隔 ------");
//       StringTokenizer stk=new StringTokenizer(split4);
//       while(stk.hasMoreTokens()){
//           System.out.println(stk.nextElement());
//       }

        //字符串大小写转换
//        String strLower="good time";
//        String strUpper="JAVA LANGUAGE";
//        String toLower=strUpper.toLowerCase();
//        String toUpper=strLower.toUpperCase();
//        System.out.println("字符串strLower 小写转大写："+toUpper);
//        System.out.println("字符串strUpper 大写转小写："+toLower);

        //判断两个字符串区域是否相等(返回布尔值)
//        String first_str = "Welcome to Microsoft";
//        String second_str = "I work with microsoft";
//        boolean match1 = first_str.regionMatches(11,second_str,12,8);
//        boolean match2=first_str.regionMatches(true,11,second_str,12,8);
//
//        System.out.println("区分大小写比较字符串区域："+match1 );
//        System.out.println("忽略大小写比较字符串区域："+match2);

        //字符串性能比较测试
//        long startTime=System.currentTimeMillis();
//        for(int i=0;i<50000;i++){
//            String s1="Hello";
//            String s2="World";
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.println("第一次通过 String 关键词创建字符串" + " ： "+ (endTime - startTime) + " 毫秒" );
//        long fristTime=System.currentTimeMillis();
//        for(int i=0;i<50000;i++){
//            String s3=new String("Hello");
//            String s4=new String("World");
//        }
//        long lastTime=System.currentTimeMillis();
//        System.out.println("第二次通过 String 关键词创建字符串："+ " ： "+ (lastTime-fristTime)+" 毫秒");

        //1.字符串优化：直接使用字符串
//        String variables[]= new String [50000];
//        for(int i=0;i<50000;i++){
//            variables[i]="s"+i;
//        }
//        long startTimes=System.currentTimeMillis();
//        for(int j=0;j<50000;j++){
//            variables[j]="Hello";
//        }
//        long endTimes=System.currentTimeMillis();
//        System.out.println("直接通过字符串赋值："+(endTimes-startTimes)+" 毫秒");
//
//        //2.字符串优化：通过 new 关键词
//        long firstTimes=System.currentTimeMillis();
//        for(int i=0;i<50000;i++){
//            variables[i]=new String("Hello");
//        }
//        long lastTimes=System.currentTimeMillis();
//        System.out.println("通过 new 关键词给字符串赋值："+(firstTimes-lastTimes)+" 毫秒");
//
//        //3.字符串优化：使用字符串对象的 intern() 方法
//        long beforeTimes=System.currentTimeMillis();
//        for(int i=0;i<50000;i++){
//            variables[i]=new String("Hello");
//            variables[i]=variables[i].intern();
//        }
//        long afterTimes=System.currentTimeMillis();
//        System.out.println("使用字符串对象的 intern() 方法："+(afterTimes-beforeTimes)+" 毫秒");

        //字符串格式化
//        double e=Math.E;
//        System.out.format("%f%n",e);
//        System.out.format(Locale.CHINA,"%-10.4f%n%n",e);    //指定本地为中国（CHINA）

        //字符串拼接：通过 "+" 操作符和StringBuffer.append() 方法

        long times1=System.currentTimeMillis();
        for(int i=0;i<5;i++){
            String result="这个"+"测试"+ "用于"+ "区别"+ "String"+ "和"+ "StringBuffer";
            System.out.println(result);
        }
        long times2=System.currentTimeMillis();
        System.out.println("字符串连接" + " - 使用 + 操作符 ： " + (times2 - times1)+ " 毫秒");

        long st1=System.currentTimeMillis();
        for(int i=0;i<5;i++){
            StringBuffer result=new StringBuffer();
            result.append("This is  ");
            result.append("testing the  ");
            result.append("difference  ");
            result.append("between  ");
            result.append("String  ");
            result.append("and  ");
            result.append("StringBuffer  ");
            System.out.println(result);
        }
        long st2=System.currentTimeMillis();
        System.out.println("字符串连接" + " - 使用 StringBuffer ： " + (st2- st1)+ " 毫秒");


    }


}
