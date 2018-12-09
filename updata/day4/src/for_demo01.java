

/*统计水仙花数的个数*/
public class for_demo01 {
    public static void main(String[] args) {
        /*分析：
        * 1.需要有一个变量记录水仙花数的个数
        * 2.获取所有的三位数
        * 3.判断是否满足水仙花数
        * 4.如果满足条件，计数器就自增
        * */
        int count = 0;
        for (int i=100;i<=999;i++){
            int ge = i % 10 ;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10 ;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                count++;
                System.out.println(i);
            }
        }
    }
}
