/*
A:代码块概述
	* 在Java中，使用{}括起来的代码被称为代码块。
* B:代码块分类
	* 根据其位置和声明的不同，可以分为局部代码块，构造代码块，静态代码块，同步代码块(多线程讲解)。
* C:常见代码块的应用
	* a:局部代码块
		* 在方法中出现；限定变量生命周期，及早释放，提高内存利用率
	* b:构造代码块 (初始化块)
		* 在类中方法外出现；多个构造方法方法中相同的代码存放到一起，每次调用构造都执行，并且在构造方法前执行
	* c:静态代码块
		* 在类中方法外出现，并加上static修饰；用于给类进行初始化，在加载的时候就执行，并且只执行一次。
		* 一般用于加载驱动
 */
public class Demo1_Code {
    public static void main(String[] args) {

        {int x =10;
            System.out.println(x);}
        Student t1 = new Student();
        System.out.println("-----------");
        Student t2 = new Student("张三",23);

    }
}

class Student{
    private String name;
    private int age;

    public Student(){//空参构造
         }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    private String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    {                                       //构造代码块：每创建一次对象就会执行一次，优先于构成方法
        //System.out.println("构造代码块");
        study();
    }
    public void study(){
        System.out.println("学生学习");
    }

    static {                    //随着类加载而加载，且执行一次
        System.out.println("我是静态代码块");//作用：用来给类进行初始化，一般用来加载驱动
    }           //静态代码块是优先于主方法执行
}