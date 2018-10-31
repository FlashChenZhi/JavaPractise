package back.practise.practise0808.datatype;

public class PrimitiveType {
    final double PI=3.1415927;
    byte i=68;
    char a='A';

    int decimal=100;
    static int octal=0144;
    static int hexa=0x64;

    long j=9223372036854775807l;

    /** 自动类型转换
     *   byte,short,char—> int —> long—> float —> double
     */
    public static void main(String[] args) {
//        System.out.println("变量octal："+octal);
//        System.out.println("变量hexa："+hexa);
        float f1=100.56f;
        Float F1=new Float(f1);
        double d1=F1.floatValue();
        double d2=F1.doubleValue();
//        System.out.println("显示单精度浮点数据："+d1+"\n显示双精度浮点数据："+d2);
        /**
         * 字符串作为值,向其它类型的转换
         */
        String str="3.1415926";
        Float f=new Float(str).floatValue();
        System.out.println(f);
        Double.valueOf(str).doubleValue();
        System.out.println(Double.valueOf(str).doubleValue());

    }


}
