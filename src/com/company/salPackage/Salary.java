package com.company.salPackage;

import com.company.ms.Message;

public class Salary  extends Message<Integer> {


    public Salary(String from, String to, Integer content) {
        super(from, to, content);
    }
}
