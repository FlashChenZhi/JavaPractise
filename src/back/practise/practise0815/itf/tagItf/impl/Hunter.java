package back.practise.practise0815.itf.tagItf.impl;

import back.practise.practise0815.itf.tagItf.Humans;
import back.practise.practise0815.itf.tagItf.SomeThing;

public class Hunter   {

    public void fire(Object target)
    {
        if(target instanceof Humans) {

            System.out.println("这下完了，打中了一个人，该去坐牢了！");
        } else {
            System.out.println("恭喜你，打中了一只动物!");
        }
    }

    //智能猎枪
    public  void intelligentFire(Object target){
        if(target instanceof Humans) {
            return;
        }
        System.out.println("开了一枪!"+target.getClass());
        //下面进行秒杀等相关处理
        //销毁他
        target=null;
    }

    public static void main(String[] args) {
        Hunter hunter=new Hunter();
        Object[] objects=new Object[]{new Tiger(),new Japanese(),new Chinese(),new Monster(),new SomeThing(){}};
        for(int i=0;i<objects.length;i++) {
            hunter.intelligentFire(objects[i]);
        }

    }

}
