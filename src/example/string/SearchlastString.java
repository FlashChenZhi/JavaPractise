package example.string;

/**   查询最后一个字符串
 *    说明：字符串下标位置从0开始，所有空格和符号均算一个占位符
 */
public class SearchlastString {
    public static void main(String[] args) {
        String str=" Flash.Alex.Chen";
        int index=str.lastIndexOf("Chen");
        if(index==-1){
            System.out.println("没有找到元素：Chen");
        }else{
            System.out.println("在该字符串种找到元素：Chen，最后出现的位置为："+index);
        }
    }

}
