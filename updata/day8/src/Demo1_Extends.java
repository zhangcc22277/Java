/*
 * A:继承(extends)
 * 让类与类之间产生关系,子父类关系
 * B:继承案例演示：
 * 动物类,猫类,狗类
 * 定义两个属性(颜色,腿的个数)两个功能(吃饭，睡觉)
 * C:案例演示
 * 使用继承前
 * D:案例演示
 * 使用继承后
 */
public class Demo1_Extends {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.color = "花花";
        c.leg = 4;
        c.eat();
        c.sleep();
    }
}
/*
 * A:继承(extends)
 * 让类与类之间产生关系,子父类关系
 * B:继承案例演示：
 * 动物类,猫类,狗类
 * 定义两个属性(颜色,腿的个数)两个功能(吃饭，睡觉)
 * C:案例演示
 * 使用继承前
 * D:案例演示
 * 使用继承后
 */
class Animal{
    String color;
    int leg;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
    class Cat extends Animal{

    }

    class Dog extends Animal{

    }
    /*
extends是继承的意思
Animal是父类
Cat和Dog都是子类
*/
    /*
    public Animal(){}
    public Animal(String color,int leg){
        this.color = color;
        this.leg = leg;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setLeg(int leg){
        this.leg = leg;
    }
    public int getLeg(){
        return leg;
    }*/



