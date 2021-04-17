package com.company.ms;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MailBox<T> extends HashMap<String, List<T>> {
    @Override
    public List<T> get(Object key) {
        if(!containsKey(key)){
             return Collections.emptyList();
        }
        return super.get(key);
    }

}
