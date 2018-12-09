/*
 * A:继承的好处
 * a:提高了代码的复用性
 * b:提高了代码的维护性
 * c:让类与类之间产生了关系，是多态的前提
 * B:继承的弊端
 * 类的耦合性增强了。

 * 开发的原则：高内聚，低耦合。
 * 耦合：类与类的关系
 * 内聚：就是自己完成某件事情的能力
 */
public class Demo4_Extends {
    public static void main(String[] args) {

        Son1 s = new Son1();
        s.method();
    }
}
/*
* A:案例演示
	* a:不同名的变量
	* b:同名的变量
		子父类出现同名的变量只是在讲课中举例子有,在开发中是不会出现这种情况的
		子类继承父类就是为了使用父类的成员,那么如果定义了同名的成员变量没有意义了
*/
class Father1 {
    int num1 = 10;
    int num2 = 30;
}
class Son1 extends Father1{
    int num2 = 20;
    public void method(){
        System.out.println(this.num1);//this既可以调用本类的，也可以调用父类的（本类没有的情况下）
        System.out.println(this.num2);//就近原则，资料有就不用父类的了
        System.out.println(this.num2);
    }
}