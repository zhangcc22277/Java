/*二维数组求和*/
public class twoshuzu_demo2 {
    public static void main(String[] args) {
        int[][] arr = {{22,66,44},{77,88,55},{22,33,44},{66,11,77}};
            int sum = 0;        //定义变量，记录每一个相加的结果
            for (int i =1;i<arr.length;i++){        //获取每一个一位数组
                for (int j=0;j<arr[i].length;j++){  //获取每一个一位数组的元素
                    sum = sum +arr[i][j];               //累加
                }
            }
        System.out.println(sum);

    }
}
