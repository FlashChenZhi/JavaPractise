package back.features;

/**     Lambda表达式的重要特征
 *  可选类型声明：不需要声明参数类型，编译器可以统一识别参数值
 *  可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号
 *  可选的大括号：如果主体包含了一个语句，就不需要使用大括号
 *  可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值
 *
 */
public class Lambda {
    public static void main(String[] args) {
        Lambda lb=new Lambda();
        // 类型声明
        MathOperation   addition=(int a,int b) ->a+b;
        //不用类型声明
        MathOperation subtraction=(a,b)->a-b;
        // 大括号中的返回语句
//        MathOperation multip=(a,b)->{return a*b;};
        MathOperation multiplication=(int a,int b)->{ return  a * b; };
        // 没有大括号及返回语句
        MathOperation division=(a,b)->a/b;

        System.out.println("求两个数的加法："+(addition.operation(10,8)));
        System.out.println("求两个数的减法："+(subtraction.operation(10,2)));
        System.out.println("求两个数的乘法："+(multiplication.operation(6,6)));
        System.out.println("求两个数的除法："+(division.operation(10,5)));

        // 不用括号
        GreetingService gs1=message -> System.out.println("你好！"+message);

        // 用括号
        GreetingService gs2=(message) ->System.out.println("Hello "+message);

        gs1.sayMessage(" 菜鸟 ");
        gs2.sayMessage(" Runoob ");

        final int num=1;
        Converter<Integer,String> s=(param)->System.out.println(String.valueOf(param+num));
        s.convert(5);


    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface Converter<T1,T2>{
       void convert(int i);
    }

    private  int operate(int a,int b,MathOperation mo){
        return mo.operation(a,b);
    }

}
