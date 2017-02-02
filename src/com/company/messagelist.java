package com.company;

import java.util.ArrayList;

/**
 * Created by vr834 on 1/30/17.
 */
public class messagelist {
    public ArrayList messages = new ArrayList();

    public messagelist(message user){

    }
    public void addMessage(message m){
        messages.add(m.text);
        messages.add(m.timeReceived);
        messages.add(m.realtime);
    }
    public void removeMessage(String s){
        messages.remove(s);
    }
    public void removeMessage(int index){
        messages.remove(index);
    }
    public void moveMessage(int thisin,int index,messagelist user){
        user.messages.add(0,messages.get(thisin));
        user.messages.add(1,messages.get(thisin+1));
        user.messages.add(2,messages.get(thisin+2));
    }
    public void sortByDate(){
        //most recent first

    }


}
