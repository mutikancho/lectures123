package com.company;

import java.security.Security;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        System.out.println("Random Number: "+ randomNum);
        if(randomNum>5) System.out.println("True");



    }
}
