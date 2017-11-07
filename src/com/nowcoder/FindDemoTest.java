package com.nowcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDemoTest {
    @Test
    public void find() throws Exception {
        FindDemo fd = new FindDemo();
        int[][] a = {{}};
        System.out.println(fd.find(10, a) ? "true" : "false");
    }

    @Test
    public void minNumberInRotateArray() throws Exception {
        FindDemo fd = new FindDemo();
        int[] a = {2,2,2,1,1,2,2,2};
        System.out.println(fd.minNumberInRotateArray(a) );
        assert fd.minNumberInRotateArray(a)==1;
    }

}