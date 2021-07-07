package a;

/*
    Saved DATE: 07/08
    @Author: BingRongHung
    URL https://zerojudge.tw/ShowProblem?problemid=a004
    TestResult: AC
    Hint: https://zerojudge.tw/ShowThread?postid=22083&reply=0
    Note: EOF表示結束輸入(最終資料), 可透過 Scanner 的 hasnext 測試有無下一筆資料, 如果有資料再進行判斷
 */

import java.util.Scanner;

public class a004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
               //閏年條件(二擇一成立) : 可被400整除；可被4整除但不可被100整除
		int year1 = sc.nextInt() ;
                
		String reult1 = "" ;
		if((year1 % 400 == 0) || (year1 % 4 ==0) && (year1 % 100 != 0)){
			reult1 = "閏年" ;
		}else{
			reult1 = "平年" ;
		}
                
		System.out.printf("%s\n",reult1) ;
        }
    }
}
