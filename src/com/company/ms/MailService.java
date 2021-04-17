package com.company.ms;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> {

    HashMap<String, List<T>> mailBox = new MailBox();
    List<T> list= new ArrayList<T>();



    public HashMap<String, List<T>> getMailBox() {
        return mailBox;

    }

    @Override
    public void accept(Message<T> tMessage) {
        list.add(tMessage.getContent());

        var checkKey=mailBox.get(tMessage.getTo());

        if(checkKey!=null){
            list.addAll(mailBox.get(tMessage.getTo()));
            mailBox.put(tMessage.getTo(),list);
        }
        else {
            mailBox.put(tMessage.getTo(),list);
        }
        list= new ArrayList<T>();
    }



    // public Map<String, List<String>> getMailBox() {

    //}
}
