package example.method;

/**
 * 输出数组元素
 */
public class OutputArray {
//    public static void printArray(Integer[] integers){
//        for(Integer i:integers){
//            System.out.printf("%s",i);
//            System.out.print("\t");
//        }
//    }
//
//    public static void printArray(Character[] characters){
//        for(Character i:characters){
//            System.out.printf("%s",i);
//            System.out.print("\t");
//        }
//    }
//
//    public static void printArray(Double[] doubles){
//        for(Double i:doubles){
//            System.out.printf("%s",i);
//            System.out.print("\t");
//        }
//    }

    //泛型
    public static<T>  void  printArray(T[] inputArray){
        for(T element:inputArray){
            System.out.printf("%s",element);
            System.out.print("\t");
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("输出整型数组:");
        printArray(integerArray);
        System.out.println("\n输出双精度型数组:");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组:");
        printArray(characterArray);
    }

}
