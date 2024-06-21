package mpaletti.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    final int numerator;
    final  int denominator;
    public RationalNumber(int numerator, int denominator){
        int gcd=greatestCommonDivisor(numerator,denominator);
        this.numerator=numerator/gcd;
        this.denominator=denominator/gcd;
    }
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }
    public RationalNumber add(RationalNumber o){
        int lcm=leastCommonMultiple(denominator,o.getDenominator());
        int num=numerator*(lcm/o.getDenominator())+o.getNumerator()*(lcm/denominator);
        return new RationalNumber(num,lcm);
    }

    public RationalNumber multiply(RationalNumber o){
        int num=numerator*o.getNumerator();
        int den=denominator*o.getDenominator();
        return  new RationalNumber(num,den);
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RationalNumber that)) return false;
        return getNumerator() == that.getNumerator() && getDenominator() == that.getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenominator());
    }
}
