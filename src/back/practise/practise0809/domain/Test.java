package back.practise.practise0809.domain;
/**
 *
 */
public class Test {
    public static  int staticVar=0;
    public int instanceVar=0;

    public void Test() {
        staticVar++;
        instanceVar++;
        System.out.println("静态值staticVar："+staticVar+"实例值instanceVar："+instanceVar);
    }

    /**
     * 每次创建一个新对象就会分配一个实例变量，而始终只会分配一个静态变量
     * 输出结果(如下)：
     *  staticVar1, instanceVar=1
     *  staticVar2, instanceVar=1
     *  staticVar3, instanceVar=1
     *  staticVar4, instanceVar=1
     *  staticVar5, instanceVar=1
     *  staticVar6, instanceVar=1
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            Test test=new Test();
            test.Test();
        }
    }

}
