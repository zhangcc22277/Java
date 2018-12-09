
public class Demo1_Static {
    public static void main(String[] args) {
    Person1 p1 = new Person1();//创建对象
    p1.name = "仓老师";        //调用姓名属性并赋值
    p1.country = "日本";          //调用国籍属性并赋值
    p1.speak();

    Person1 p2 = new Person1();
    p2.name = "小老师";        //调用姓名属性并赋值
    //p2.country = "日本";          //调用国籍并赋值
    p2.speak();

    Person1.country="中国";   //静态多了一种调用方式，可以通过类名
        System.out.println(Person1.country);
    }
}

class Person1{
     String name;               //姓名
    static String country;          //国籍

    public Person1(){}
    public void speak(){            //说话的方法
        System.out.println(name+"------"+country);
    }
}
