import java.util.Scanner;

public class method_demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数");
        int y = sc.nextInt();

//        int max = getMax(x,y);
//        System.out.println(max);

        boolean b = isEqual(x,y);
        System.out.println(b);
    }

//    public static int getMax(int a,int b){
//        return a>b ? a:b;
//    }

    public static boolean isEqual(int a, int b){
        return a==b;
    }

}
