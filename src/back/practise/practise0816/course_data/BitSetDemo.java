package back.practise.practise0816.course_data;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bs1=new BitSet(16);
        BitSet bs2=new BitSet(16);
        for(int i=0;i<16;i++){
            if(i%2==0){
                bs1.set(i);
            }
            if(i%5!=0){
                bs2.set(i);
            }
        }
        System.out.println("位集合bs1："+bs1);
        System.out.println("位集合bs2："+bs2);

        // AND bits
        bs2.and(bs1);
        System.out.println("对此目标位 set 和参数位 set 执行逻辑与操作："+bs2);

        // OR bits
        bs2.or(bs1);
        System.out.println("对此位 set 和位 set 参数执行逻辑或操作："+bs2);

        // XOR bits
        bs2.xor(bs1);
        System.out.println("对此位 set 和位 set 参数执行逻辑异或操作："+bs2);

    }


}
