package com.nowcoder;


public class FindDemo {


    public static void main(String[] args) {
        FindDemo fd = new FindDemo();
        System.out.println(fd.numberOfOne(678) );
    }


    /**
     * 描述：
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照
     * 从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
     * 个整数，判断数组中是否含有该整数。
     * <p>
     * url:
     * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
     *
     * @param target
     * @param array
     * @return
     */
    public boolean find(int target, int[][] array) {

        for (int[] temp : array)
            if (array[0].length != temp.length)
                throw new RuntimeException("输入的矩阵不合法");
        int i = 0, j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (target == array[i][j])
                return true;
            else if (target > array[i][j])
                i++;
            else if (target < array[i][j])
                j--;
        }

        return false;
    }


    /**
     * 描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序
     * 的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数
     * 组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     *
     * https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0)
            return 0;
        if (array.length == 1)
            return array[0];
        if (array.length == 2)
            return array[0] > array[1] ? array[0] : array[1];
        int left = 0, right = array.length - 1;
        while (true) {
            if (array[left] < array[right])
                return array[left];
            int mid = (left + right) / 2;

            if (array[left] == array[mid] && array[right] == array[mid]) {
                for (int i = left; i < right; i++) {
                    if (array[i] > array[i + 1]){
                        left = i + 1;
                        break;
                    }
                }
                return array[left];
            }

            if (array[mid] >= array[left]) {
                left = mid;
            } else {
                right = mid;
            }
            if(right-left==1){
                return array[right];
            }
        }
    }

    /**
     * 描述：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
     *
     * url：https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        int a=0,b=1;
        int fn=0;
        for(int i=2;i<=n;i++){
            fn=a+b;
            a=b;
            b=fn;
        }
        return fn;
    }


    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     * @param n
     * @return
     */
    public int numberOfOne(int n){
        int result=0;
        while(n!=0){
            n=(n-1)&n;
            result++;
        }
        return result;
    }

}
