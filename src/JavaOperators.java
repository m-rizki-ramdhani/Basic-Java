/*
    Operator dalam Java adalah simbol yang digunakan
    untuk melakukan operasi. Contoh: +, -, *, /dst.

    Ada banyak jenis operator di Java diantaranya:
        -Unary Operator:
            var++, var--
            --var, ++var
        -Arithmetic Operator:
            +, -, *, /, %
        -Shift Operator:
            <<, >>, >>>
        -Relational Operator:
            <, <=, >, >=, ==, !=
        -Bitwise Operator:
            &, |, ^
        -Logical Operator:
            &&, ||
        -Ternary Operator:
            ? :
        -Assignment Operator:
            =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
*/

public class JavaOperators {
    public static void main(String[] args) {

        int x = 10;
        //Unary Operator
        ++x; //x akan menjadi 11

        int y = 4;
        //Arithmetic Operator
        int z = x + y;
        y = (x+z) * x;

        //Shift Operator
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20>>3);//20/2^3=20/8=2

        int a=10;
        int b=5;
        int c=20;
        //Bitwise and Logical Operator
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
        //
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true || vs |
        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked

        //Ternary Operator
        int min=(a<b)?a:b;
        System.out.println(min);

        //Assignment Operator
        a+=4;//a=a+4
        b-=4;//b=b-4
    }
}
