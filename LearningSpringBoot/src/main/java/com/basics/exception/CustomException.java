package com.basics.exception;

public class CustomException {

    public static void main(String[] args) {
        try {
            checkAge(10);
        }
        catch (invalidAgeException e){
            System.out.println("Exception \n"+e.getMessage());
        }
    }

    static
    void checkAge(int i) throws invalidAgeException {
        if(i<18){
            throw new invalidAgeException("Age must be greater than 18");
        }
    }

}

class invalidAgeException extends Exception{
    public invalidAgeException(String message){
        super(message);
    }
}