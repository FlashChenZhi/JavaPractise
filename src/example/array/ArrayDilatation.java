package example.array;

/**
 *   数组扩容
 */
public class ArrayDilatation {
    public static void main(String[] args) {
        String[] str={"A","B","C"};
//        String[] names = new String[] { "A", "B", "C" };
        String[] extended=new String[6];
        extended[3]="D";
        extended[4]="E";
        extended[5]="F";
        System.arraycopy(str,0,extended,0,str.length);
        for(String s:extended){
            System.out.print(s+" ");
        }

    }
}
