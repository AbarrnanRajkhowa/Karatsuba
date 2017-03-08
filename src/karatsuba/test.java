/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karatsuba;

/**
 *
 * @author aborn
 */
public class test {
    public static void main(String[] args){
        Karatsuba one = new Karatsuba();
        String num1 ="3141592653589793238462643383279502884197169399375105820974944592" ;
        String num2 ="2718281828459045235360287471352662497757247093699959574966967627";
        String result = one.multiply(num1, num2);
        System.out.println(result);
    }
}
