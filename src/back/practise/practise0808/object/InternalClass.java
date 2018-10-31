package back.practise.practise0808.object;

import static sun.java2d.cmm.ColorTransform.Out;

/**
 * <内部类的优点和缺点>
 * 优点：可访问外部类私有属性（心脏可访问身体的血液，而不是外部抽血）。
 * 缺点：破坏原有类的程序结构（属性、构造方法、普通方法、内部类）
 */
public class InternalClass {
        private int age;
        private String name;

        public class Person{
            String sex;
    }

    public class Animal{
            String type;
    }

}
