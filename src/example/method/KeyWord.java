package example.method;

/**     各类关键词的使用
 * 1. break：    可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试
 * 2. continue： 用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行
 */
public class KeyWord {
    public static void main(String[] args) {
        //continue关键词的使用
//        StringBuffer sb=new StringBuffer("Hello How are you ?");
//        int length=sb.length();
//        int count=0;
//        for(int i=0;i<length;i++){
//            if(sb.charAt(i)!='o'){          //判断单个指定字符
//                continue;
//            }
//            count++;                        //统计字符出现次数
//            sb.setCharAt(i,'r');       //替换所有指定字符
//        }
//        System.out.println("发现 " + count + " 个 o 字符");
//        System.out.println(sb);

        int[] intary = { 99,12,22,34,45,67,5678,8990 };
        int i=0;
        int no=5678;
        boolean find=false;
        for(;i<intary.length;i++){
            if(no==intary[i]){
                find=true;
                break;
            }
            System.out.println("显示元素："+intary[i]);
        }
        if(find){
            System.out.println("元素"+no+"在数组中的索引位置为："+i);
        }else{
            System.out.println(no + " 元素不在数组中");
        }
    }

}
