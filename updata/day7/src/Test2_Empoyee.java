/*
 * A:案例演示
 * 需求：定义一个员工类Employee
 * 自己分析出几个成员，然后给出成员变量
 * 姓名name,工号id,工资salary
 * 构造方法，
 * 空参和有参的
 * getXxx()setXxx()方法，
 * 以及一个显示所有成员信息的方法。并测试。
 * work

 **/
public class Test2_Empoyee {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("张三");
        e1.setId("9527x");
        e1.setSalary(100);
        e1.work();
        System.out.println("---------------");
        Employee e2 = new Employee("李四","9527xx",200);
        e2.work();


    }
}

class Employee{
    private String name;    //姓名
    private String id;      //工号
    private double salary;  //工资

    public Employee(){}         //空参构造

    public Employee(String name,String id,double salary){ //有参构造
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setName(String name){       //设置姓名
        this.name = name;
    }
    public String getName(){                //获取姓名
        return name;
    }

    public void setId(String id){           //设置id
        this.id = id;
    }
    public String getId(){                  //获取id
        return id;
    }

    public void setSalary(double salary){       //设置工资
        this.salary = salary;
    }
    public double getSalary(){                  //获取工资
        return salary;
    }

    public void work(){
        System.out.println("姓名："+name+";"+"工号："+id+";"+"工资"+salary);
    }
}





