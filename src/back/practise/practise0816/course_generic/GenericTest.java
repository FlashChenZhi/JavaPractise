package back.practise.practise0816.course_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void getData(List<?> data){
        System.out.println("泛型数据："+data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data){
            System.out.println("父类泛型数据："+data.get(0));
    }

    public static void main(String[] args) {
        List<Integer> integers= new ArrayList<Integer>();
        List<Number> numbers=new ArrayList<>();
        List<String>  strings=new ArrayList<>();
        List<Double> doubles=new ArrayList<>();
        List<Character> characters=new ArrayList<>();

        integers.add(5201314);
        numbers.add(1234567890);
        strings.add("圆周率：");
        doubles.add(3.14159);
        characters.add('C');

        getData(numbers);
        getData(strings);
        getData(doubles);
        getData(characters);

        getUperNumber(integers);
        getUperNumber(numbers);

    }
}
