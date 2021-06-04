package com.company;

public class EndingWith {
    public static void main(String[] args) {
        System.out.println(solution("expected","actual"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
