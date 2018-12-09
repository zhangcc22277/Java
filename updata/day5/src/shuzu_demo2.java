/*数组元素的反转（元素对调）
* */
public class shuzu_demo2 {
    public static void main(String[] args) {

        //调用方法
        int[] arr = {1,2,3,4,5,6,7};

        reverseArray(arr);
        bl(arr);
    }
    /*数组元素反转的方法
    1.明确返回值类型：void
    2.明确参数列表：int[] arr
    * */
    public static void reverseArray(int[] arr){
        for (int i=0;i<arr.length/2;i++){
            //arr[0]和arr[arr.length-1]交换
            //arr[1]和arr[arr.length-1-1]交换
            //arr[2]和arr[arr.length-1-1-1]交换
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    /*对改变后的数组进行遍历
    1。明确返回值类型：void
    2.明确参数的列表：int[] arr
    * */
    public static void bl(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
    }
}
