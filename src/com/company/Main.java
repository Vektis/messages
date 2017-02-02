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
        String time = df.format(dateobj);
        message guy = new message(ign,message,time,timeToNum(time));

  //      System.out.println(guy.timeReceived);
//        System.out.println(timeToNum(guy.timeReceived));

    }

    public static double timeToNum(String t){
        double jikan = 0;

        int months;
        if(Integer.parseInt(t.substring(0,1)) == 0){
            months = Integer.parseInt(t.substring(1,2));
        }
        else{
            months = Integer.parseInt(t.substring(0,2));
        }
        jikan += months * 43800;

        int days;
        if(Integer.parseInt(t.substring(3,4)) == 0){
            days = Integer.parseInt(t.substring(4,5));
        }
        else{
            days = Integer.parseInt(t.substring(3,5));
        }
        jikan += days * 1440;

        int year = Integer.parseInt(t.substring(6,10));

        jikan += year * 525600;

        int hour;
        if(Integer.parseInt(t.substring(11,12)) == 0){
            hour = Integer.parseInt(t.substring(12,13));
        }
        else{
            hour = Integer.parseInt(t.substring(11,13));
        }
        jikan += hour * 60;

        int min;
        if(Integer.parseInt(t.substring(11,12)) == 0){
            min = Integer.parseInt(t.substring(12,13));
        }
        else{
            min = Integer.parseInt(t.substring(11,13));
        }

        jikan += min;

        int seconds;
        if(Integer.parseInt(t.substring(17,18)) == 0){
            seconds = Integer.parseInt(t.substring(18,19));
        }
        else{
            seconds = Integer.parseInt(t.substring(17,19));
        }

        jikan += (double)seconds/60;
        return jikan/1000000;

}}
