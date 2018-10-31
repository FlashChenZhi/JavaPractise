package back.practise.practise0816.course_generic;

public class GenericMethodTest {
    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray ){
        // 输出数组元素
        for(E element:inputArray){
            System.out.printf("%s",element);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] integers={1,2,3,4,5,6};
        Double[]  doubles={2.06,3.15,2.30,3.78,5.20,6.80};
        Character[] characters={'F','L','A','S','H','C'};

        System.out.println("整型数据有：");
        printArray(integers);
        System.out.println("双精度数据有：");
        printArray(doubles);
        System.out.println("字符型数据有：");
        printArray(characters);

    }
}
