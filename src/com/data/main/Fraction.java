package com.data.main;

class Fraction{
    private int num;
    private int den;

    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    public Fraction(int n){
        this(n,1);
    }
    public void dividedBy(Fraction f){
        num *= f.den;
        den *= f.num;
        if(num%2==0 && den%2==0) {
            while (num > 1 && den > 1) {
                num /= 2;
                den /= 2;
            }
        }
    }
    public void addOn(Fraction f){
        num = num * f.den + f.num*den;
        den  *= f.den;
        if(num%2==0 && den%2==0) {
            while (num > 1 && den > 1) {
                num /= 2;
                den /= 2;
            }
        }
    }
    public static Fraction add(Fraction f1, Fraction f2){
        int n = f1.num*f2.den + f2.num*f1.den;
        int d = f1.den*f2.den;
        if(n%2==0 && d%2==0) {
            while (n > 1 && d > 1) {
                n /= 2;
                d /= 2;
            }
        }
        return new Fraction(n,d);
    }
    @Override
    public String toString(){
        return num + "/" + den;
    }
}
