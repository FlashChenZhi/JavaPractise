package example.string;

public class DeleteString {
    public static void main(String[] args) {
        String str="This is interesting course!";
        //将定义的字符串传参到方法中，获取删除指定元素后的新字符串
        System.out.println(removeChartAt(str,3));
    }

    //定义一个方法：通过截取指定字符串中的元素，获取新的返回值
    public static String removeChartAt(String str,int index){
        return str.substring(0,index)+str.substring(index+1);
    }
}
