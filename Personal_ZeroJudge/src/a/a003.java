package a;

/*
    Saved DATE: 06/27
    @Author: BingRongHung
    URL https://zerojudge.tw/ShowProblem?problemid=a003
    TestResult: AC
*/

import java.util.Scanner;

public class a003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        String input[] = scString.split(" ");
        int M = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int S = (M*2+D)%3;
        switch(S){
            case 0:System.out.print("普通");
                break;
            case 1:System.out.print("吉");
                break;
            case 2:System.out.print("大吉");
                break;
        }
        sc.close();
    }
}
