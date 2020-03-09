package com.ljj.demo;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/3/9.
 */
public class wordBreakSolution {

    /**
     * 断词识别句子.
     * @param str 字符串
     * @param wordDict 数据字典
     */
    public static void wordBreak(String str, String[] wordDict){
        isValid(str, wordDict, "");
    }

    /**
     * 递归遍历拼接.
     * @param str
     * @param wordDict
     * @param result
     */
    public static void isValid(String str, String[] wordDict, String result){
        int size = str.length();
        int num = 0;
        for (int i = 1; i <= size; i++) {
            num++;
            String prefix = str.substring(0, i);
            if (Arrays.asList(wordDict).contains(prefix)) {
                if (size == i) {
                    result = result + prefix;
                    System.out.println(result);
                    break;
                }
                String nextStr = str.substring(i);
                String nextResult = result + prefix + " ";
                isValid(nextStr, wordDict, nextResult);//递归
            }
        }
    }

    public static void main(String[] args){
        String[] dictionary = {"mobile","samsung","sam","sung", "man","mango", "icecream","and", "go","i","like","ice","cream"};
        String str = "ilikeicecreamandmango";
//        String str = "ilikesamsungmobile";
        System.out.println("Input dictionary：" + Arrays.toString(dictionary));
        System.out.println("Input sentence：" + str);
        System.out.println("Output：");
        wordBreak(str, dictionary);
    }

}
