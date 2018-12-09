/**
 * 我要获取一个1-100之间的随机数，肿么办?
 */
public class Demo2_Math {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Math.random());
//        }
        /**
         * 生成1-100的随机数
         * Math.random()   0.0000000 - 0.9999999999
         * Math.random()*100  ==>   0.000 - 99.999
         * (int)(Math.random()*100)  ==>  0-99
         * (int)(Math.random()*100)+1  ==>  1-99
         */
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*10)+1);
        }

    }
}
