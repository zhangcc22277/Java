/*数组元素查找（查找指定元素第一次在数组中出现的索引）*/
public class shuzu_demo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int index = getIndex(arr,5);
        System.out.println(index);

    }
    /*查找元素索引
    * 1.明确返回值类型：int
    * 2.明确参数列表：int[] arr,int value*/
    public static int getIndex(int[] arr,int value){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == value){       //数组的遍历
                return i;               //如果数组中的元素与查找的元素匹配
            }
        }
        return -1;
    }
}
