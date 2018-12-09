/*
 * A:Java中类的继承特点
 * a:Java只支持单继承，不支持多继承。(一个儿子只能有一个爹)
 * 有些语言是支持多继承，格式：extends 类1,类2,...
 * b:Java支持多层继承(继承体系)
 * B:案例演示
 * Java中类的继承特点
 * 如果想用这个体系的所有功能用最底层的类创建对象
 * 如果想看这个体系的共性功能,看最顶层的类
 */
public class Demo5_Extends {
    public static void main(String[] args) {

    }
}
/*
 * A:案例演示
 * 子类中所有的构造方法默认都会访问父类中空参数的构造方法
 * B:为什么呢?
 * 因为子类会继承父类中的数据，可能还会使用父类的数据。
 * 所以，子类初始化之前，一定要先完成父类数据的初始化。

 * 其实：
 * 每一个构造方法的第一条语句默认都是：super() Object类最顶层的父类。
 */
class Father5{
    public Father5(){
        super();
        System.out.println("Father 的构造方法");

    }
    class Son5 extends Father5{
        public Son5(){
            super();        //这是一条语句，如股票不写，系统就会默认加上，用来访问父类中的空参构造
            System.out.println("Son 的构造方法");
        }

    }
}
