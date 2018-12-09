import java.util.Scanner;

/*数组查表法，（根据键盘录入索引，查找对应的星期）*/
public class zhuzu_demo3 {
    public static void main(String[] args) {

        System.out.println("请输入对应 的星期范围1-7");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        System.out.println("星期"+getWeek(week));
    }
    /*根据索引返回对应的星期
    * 1。返回值类型：char
    * 2.参数列表：int week*/
    public static char getWeek(int week){
        char[] arr = {' ','一','二','三','四','五','六','七'}; //定义了一张星期表
        return arr[week];                   //通过索引获取表中的元素
    }
}
