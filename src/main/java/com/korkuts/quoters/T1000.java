package com.korkuts.quoters;

import org.springframework.stereotype.Service;

@Service
public class T1000 extends TerminatorQuoter implements Quoter {

    @Override
    public void sayQuote() {
        System.out.println("I'm liquid");
    }
}
