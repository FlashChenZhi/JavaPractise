package back.practise.practise0808.interfaces;

/**
 * Java只支持类之间的单继承，但支持接口之间的多继承
 * 并支持类与接口之间的实现机制（关键字为implements）
 */
public interface InterfaceA extends InterfaceB,InterfaceC{
        int num = 1024;
        double divide(int x, int y);
        int get();
}
