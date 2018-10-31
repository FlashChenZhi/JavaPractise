package back.practise.practise0808.object;

/**
 *
 */
public class Cat {
    int catAge;

    public Cat(String name) {
        System.out.println("小猫的名字是 : " + name );
    }
    public int getCatAge() {
        System.out.println("小猫的年龄是 : " + catAge );
        return catAge;
    }
    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Tom");
        cat.setCatAge(2);
        cat.getCatAge();
        System.out.println("变量值："+cat.getCatAge());
    }



}
