package com.micro.MicroservicesProject.MicroservicesProject.exception;

public class ResourcenotFoundException extends  RuntimeException{

    public  ResourcenotFoundException(){
        super("Resource Not Found!!");
    }

    public  ResourcenotFoundException(String message){
        super(message);
    }
}
