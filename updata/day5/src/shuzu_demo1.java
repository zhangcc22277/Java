/**案例演示一：
 * 获取数组中的最值（最大值与最小值）
 */

public class shuzu_demo1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int max=getMax(arr);
        System.out.println(max);
    }
    /*获取数组最大值的方法
    1.返回值类型是int
    2.参数列表是int[] arr
    * */
    public static int getMax(int[] arr){
        int max = arr[0];           //从数组的第二个元素开始遍历
        for (int i=0;i<arr.length;i++) {       //如果max记录的值雄安与数组中的元素
            if (max < arr[i]) {     //max记录住较大的
                return arr[i];
            }
        }
        return -1;
    }


}