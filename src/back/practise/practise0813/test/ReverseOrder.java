package back.practise.practise0813.test;

public class ReverseOrder {

    public static void main(String[] args) {
        int [] test={3,5,1,8,6,2,9};
        for(int i:test){
            System.out.print(i+" ");
        }
        System.out.println();
        test=ReverseOrder.reverse(test);
        for(int j:test){
            System.out.print(j+" ");
        }
        bubbling();

    }
    //根据原数组顺序倒序显示所有元素
    public static  int[] reverse(int[] arr){
        int [] result=new int[arr.length];
        for(int i=0,j=result.length-1;i<result.length;i++,j--){
            result[j]=arr[i];
        }
        return result;
    }

    //冒泡排序
    public static void bubbling(){
        int px[] = {26,15,29,66,99,88,36,77,111,1,6,8,8};
        //外层循环控制排序趟数
        for(int i=0;i<px.length-1;i++){
            //内层循环控制每一趟排序多少次
            for(int j=0;j<px.length-i-1;j++){
                // 把小的值交换到前面
                if(px[j]>px[j+1]){
                    int temp=px[j];
                    px[j]=px[j+1];
                    px[j+1]=temp;
                }
            }
            //列举每次排序的数据
            System.out.print("第"+(i+1)+"次排序结果：");
            for(int a=0;a<px.length;a++){
                System.out.print(px[a]+"\t");
            }
            System.out.println();
        }
        System.out.print("最终排序结果：");
        for(int a=0;a<px.length;a++){
            System.out.print(px[a]+"\t");
        }

    }




}
