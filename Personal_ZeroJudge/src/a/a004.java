package a;

/*
    Saved DATE: 06/27
    @Author: BingRongHung
    URL https://zerojudge.tw/ShowProblem?problemid=a004
    TestResult: WA
    Hint: https://zerojudge.tw/ShowThread?postid=22083&reply=0
*/
import java.util.Scanner;

public class a004 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		//閏年條件(二擇一成立) : 可被400整除；可被4整除但不可被100整除
		int year1 = sc.nextInt() ;
		int year2 = sc.nextInt() ;
                
		String reult1 = "" ;
		if((year1 % 400 == 0) || (year1 % 4 ==0) && (year1 % 100 != 0)){
			reult1 = "閏年" ;
		}else{
			reult1 = "平年" ;
		}
                
                String reult2 = "" ;
		if((year2 % 400 == 0) || (year2 % 4 ==0) && (year2 % 100 != 0)){
			reult2 = "閏年" ;
		}else{
			reult2 = "平年" ;
		}
                
		System.out.printf("%s\n%s",reult1, reult2) ;
	}
}
