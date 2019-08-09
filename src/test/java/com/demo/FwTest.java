package com.demo;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * calculate the fw interest;
 * @author zhaogw
 * date 2019/8/9 9:36
 */
public class FwTest {
    private int loopNum = 20;

    @Test
    public void calSum(){
        calculateSum(loopNum,0.11);
    }

    private void calculateSum(int loopNum, double interest){
        System.out.println("#######loopNum="+loopNum+",interest="+interest);
        BigDecimal bigDecimalSum = new BigDecimal(0);
        for(int i=0;i<loopNum;i++){
            double curCash = calculate(i,interest);
            bigDecimalSum = bigDecimalSum.add(new BigDecimal(curCash));
            System.out.println("loop"+i+",curCash="+curCash);
            System.out.println("loop"+i+",bigDecimalSum="+bigDecimalSum.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        }
    }

    private double calculate(int loop, double interest){
        double rtn=0;
        if(loop == 0){
            rtn = interest;
        }else if (loop == 1){
            rtn = calculate(loop-1,interest)+interest*1;
        }else if(loop == 2){
            rtn = calculate(loop-1,interest)+interest*0.7;
        }else if(loop == 3){
            rtn = calculate(loop-1,interest)+interest*0.5;
        }else {
            rtn = calculate(loop-1,interest)+interest*0.1;
        }
        BigDecimal bigDecimal = new BigDecimal(rtn);
        return bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
