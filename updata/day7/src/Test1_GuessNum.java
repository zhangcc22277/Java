/*
 * A:案例演示
 * 需求：猜数字小游戏(数据在1-100之间)
 */

import java.util.Scanner;

public class Test1_GuessNum {
    public static void main(String[] args) {
        System.out.println("请输入一个1-100 之间的整数");
        Scanner sc = new Scanner(System.in);
        int guessNum = (int)(Math.random()*100+1);
        //System.out.println(guessNum);
        while (true){
            int result = sc.nextInt();
            if (result>guessNum){
                System.out.println("大了");
            }else if (result<guessNum){
                System.out.println("小了");
            }else{
                System.out.println("可以");
                break;
            }
        }
    }
}


