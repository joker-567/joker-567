package com.company.day15.lambda表达式;

/**
 * @author Joker_Dong
 * @date 2020-7-30 16:48
 */

public class Demo07 {
    public static void main(String[] args) {
        // 使用lambda表达式调用测试
        invokeCacu(5,6,(int a,int b) ->{
            return a + b;
        });

    }
    public static void invokeCacu(int a,int b,Caculator caculator){
        int result = caculator.cacu(a,b);
        System.out.println("结果是" + result);
    }
}
