package a;

/*
    Saved DATE: 06/25
    @Author: BingRongHung
    URL https://zerojudge.tw/ShowProblem?problemid=a001
    TestResult: AC
*/


import java.util.Scanner;

public class a001 {
    public static void main(String[] args) {

        String hello = "hello, ";
        Scanner sc = new Scanner(System.in);
        String world = sc.next();
        System.out.print(hello + world);
        sc.close();
        /*Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.print("hello, " + input);
        
        sc.close();*/
    }
}
