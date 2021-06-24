package a;

/*
    Saved DATE: 06/25
    @Author: BingRongHung
    URL https://zerojudge.tw/ShowProblem?problemid=a002
    TestResult: AC
*/

import java.util.Scanner;

public class a002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String tran[] = input.split(" ");
        int a = Integer.parseInt(tran[0]);
        int b = Integer.parseInt(tran[1]);
        int c = a + b;
        System.out.print(c);
        sc.close();
    }
}
