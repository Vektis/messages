package com.company;
import java.util.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        DateFormat df =  new SimpleDateFormat("dd/MM/y HH:mm:ss");
        Date dateobj = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        String ign = input.next();
        System.out.println("Enter message: ");
        String message = input.next();
        message guy = new message(ign,message,df.format(dateobj));

    }
}
