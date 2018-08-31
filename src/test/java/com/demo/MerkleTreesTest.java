package com.demo;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhaogw
 * @Date 2018/8/31 18:24
 */
public class MerkleTreesTest {

    @Test
    public void t1(){
        List<String> tempTxList = new ArrayList<String>();
        tempTxList.add("a");
        tempTxList.add("b");
        tempTxList.add("c");
        tempTxList.add("d");
        tempTxList.add("e");

        MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
        merkleTrees.merkle_tree();
        System.out.println("root : " + merkleTrees.getRoot());
    }
}