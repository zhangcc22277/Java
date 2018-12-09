

/*while统计水仙花数的个数*/
public class while_demo1 {
    public static void main(String[] args) {
        int count = 1 ;
        int i = 100;
        while (i<=999){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /10 / 10 % 10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(count);
                count++;

                System.out.println(i);
            }
            i++;
        }

    }
}
