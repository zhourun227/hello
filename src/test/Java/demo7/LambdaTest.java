package demo7;


import java.util.ArrayList;
import java.util.List;

//高阶方法（一个方法又是另外一个方法的参数）
public class LambdaTest {
    public static void main(String[] args) {
       
        //有名类
        FooImp fooImp1 = new FooImp();
        System.out.println(fooImp1.fun(3,8));

        //匿名类
        Foo fooImp2 = new Foo() {
            @Override
            public int fun(int x, int y) {
                return x + y;
            }
        };
        System.out.println(fooImp2.fun(3,8));

        //Lambda表达式 只能配合函数式接口 来使用
        Foo fooImp3 = (x, y) -> x + y;
        System.out.println(fooImp3.fun(3,8));

        Foo fooImp4 = (x, y) -> {return x * y;};
        System.out.println(fooImp4.fun(4,9));

        System.out.println(test(3,5,fooImp4));

        System.out.println(test(3,5,(x, y) -> x - y));

        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        List reslist = filter(list, x-> x % 2 ==0);
        System.out.println(reslist);
    }

    static List filter(List list, Perdicate p){
         List newList = new ArrayList();
         for(Object item : list){
             if(p.isOk((Integer)item)){
                  newList.add(item);
             }
         }
         return newList;
    }

    static int test(int x, int y, Foo f){
         x = x * 10;
         y = y * 10;
         return f.fun(x, y);
    }


}
