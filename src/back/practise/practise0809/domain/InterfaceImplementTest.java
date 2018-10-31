package back.practise.practise0809.domain;

import back.practise.practise0808.interfaces.InterfaceA;
/**
 * Java只支持类之间的单继承，但支持接口之间的多继承
 * 并支持类与接口之间的实现机制（关键字为implements）
 */
public class InterfaceImplementTest implements InterfaceA {
    @Override
    public double divide(int x, int y) {
        return 0;
    }

    @Override
    public String substr() {
        return null;
    }

    @Override
    public String str() {
        return null;
    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public int add(int x, int y) {
        return 0;
    }

    @Override
    public int delete(int x, int y) {
        return 0;
    }
}
