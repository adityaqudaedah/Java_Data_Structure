package com.data.main;

class comp {
    public static void compare(String s) {
        System.out.println("Char at 5 is " + s.charAt(5));
        System.out.println("index of 'struct' is " + s.indexOf("struct"));
        System.out.println(s.indexOf("D", 0));
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(5, 11));
        System.out.println(s.substring(5));
    }
    public static void compStr(String s, String t, String u) {
        System.out.println(s.equals(u));
        System.out.println(s.equalsIgnoreCase(u));
        System.out.println(s.compareTo(t));//become positive because alphabetically after the s
        System.out.println(s.compareTo(u));//become positive because alphabetically after the s
        System.out.println(!t.equalsIgnoreCase(u));
    }
    public static void findCharAt(String s){
        System.out.println("The third character of "+ s + " is "  +s.charAt(2));
    }
}
