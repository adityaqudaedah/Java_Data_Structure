package com.data.main;

class stringFunctions{
    public static int count(String s, String target){
        int count = 0;
        int n = target.length();
        for (int i = 0;i<=s.length()-n;i++){
            String piece = s.substring(i,i+n);
            if (piece.equals(target)) count++;
        }
        return count;
    }
    public static String acronym(String[]phrase){
        StringBuilder result = new StringBuilder();
        //remove any space
        for(String token : phrase){
            //result.append(token.toUpperCase().charAt(0));
            result.append(token.toUpperCase().charAt(0));
        }
        return result.toString();
    }
    public static String acronym2(String[]phrase){
        StringBuilder result = new StringBuilder();
        for (int i = 0;i<phrase.length;i++){
            result.append(phrase[i].charAt(0));
        }
        return result.toString();
    }
    public static String reverse(String s){
        String result = new String();
        for (int i = s.length()-1;i>=0;i--){
            result+= s.charAt(i);
        }
        return result.toString();
    }
}
