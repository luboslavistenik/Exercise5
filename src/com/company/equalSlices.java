package com.company;

public class equalSlices {

    public static void main(String[] args) {
	    double total = 10;
	    double recipients = 5;
        double each = 2;
        if(total / each >= recipients)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
