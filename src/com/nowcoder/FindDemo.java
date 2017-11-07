package com.nowcoder;


public class FindDemo {


    public static void main(String[] args) {
        FindDemo fd = new FindDemo();
        int[] a = {2,2,2,1,1,2,2,2};
        System.out.println(fd.minNumberInRotateArray(a) );
        assert fd.minNumberInRotateArray(a)==1;
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

            if (array[mid] > array[left]) {
                left = mid;
            } else {
                right = mid;
            }
            if(right-left==1){
                return array[right];
            }
        }
    }

}