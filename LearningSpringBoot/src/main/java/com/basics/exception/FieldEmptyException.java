package com.basics.exception;

public class FieldEmptyException {

    public static void main(String[] args) {

        try {
             RunMethod(null);
        }
        catch (Exception e)
        {
            System.out.println("Exception :"+e.getMessage());
        }
    }

    public static void RunMethod(String k) throws fieldInvalidException{

            if(k==null){
                throw new fieldInvalidException("field is null");
            }



    }
}
