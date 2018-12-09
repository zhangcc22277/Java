/*
* A:继承的注意事项
	* a:子类只能继承父类所有非私有的成员(成员方法和成员变量)
	* b:子类不能继承父类的构造方法，但是可以通过super(马上讲)关键字去访问父类构造方法。
	* c:不要为了部分功能而去继承
	* 项目经理 姓名 工号 工资 奖金
	* 程序员	姓名 工号 工资
* B:什么时候使用继承
	* 继承其实体现的是一种关系："is a"。
		Person
			Student
			Teacher
		水果
			苹果
			香蕉
			橘子
	采用假设法。
		如果有两个类A,B。只有他们符合A是B的一种，或者B是A的一种，就可以考虑使用继承。
 */
public class Demo6_Extends {
    public static void main(String[] args) {

        Son6 s1 =new Son6();
        System.out.println(s1.getName()+"----"+s1.getAge());
        System.out.println("=================");
        Son6 s2 = new Son6("张三",24);
        System.out.println(s2.getName()+"============="+s2.getAge());
    }
}
/*
 * A:案例演示
 * 父类没有无参构造方法,子类怎么办?
 * super解决
 * this解决
 * B:注意事项
 * super(…)或者this(….)必须出现在构造方法的第一条语句上
 */

class Father6{
    private String name;        //姓名
    private int age;            //年龄
    public  Father6(){             //空参构造
        System.out.println("Father 空参构造");
    }

    public Father6(String name,int age){    //有参构造
        this.name = name;
        this.age = age;
        System.out.println("Father 有参构造");
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
class Son6 extends Father6{
    public Son6(){
        this("王五",25);          //空参构造
        //super("李四"，24    )                //本类中的构造方法
                                                //调用父类中的构造方法
        System.out.println("空参构造");
    }
    public Son6(String name,int age){       //有参构造
        super(name,age);
        System.out.println("Son 有参构造");
    }
}
