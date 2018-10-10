package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("enter a number");
        int num = sc.nextInt();

        //calling the method
        result(int total);

	System.out.println("result" + total);


	//creating a method
	public static int result(int total){
            total = num / 3;
        }
        return total;
    }
}
