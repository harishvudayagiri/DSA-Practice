package com.basics.exception;

public class namecheck {

    public static void main(String[] args) {

        try {
            checkLength("Harish88888");
        }
        catch (invalidLengthException e){
            System.out.println(e.getMessage());
        }

    }
     public static void checkLength (String value)throws invalidLengthException{

        if(value.length()>10)
            throw new invalidLengthException("Exception : Invalid Length");
        else
            System.out.println(value+" is valid");
    }
}

