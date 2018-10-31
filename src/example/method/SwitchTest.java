package example.method;

public class SwitchTest {
    public static void main(String[] args) {
        Car c;
        c = Car.lamborghini;
        switch(c) {
            case lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 audi!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }

        System.out.println("所有汽车的价格：");
        for(Car car:Car.values()){
            System.out.println(car+" 需要:$"+car.getPrice()+"美元");
        }
    }

}
