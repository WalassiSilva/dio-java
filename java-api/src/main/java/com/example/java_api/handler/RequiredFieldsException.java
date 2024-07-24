package com.example.java_api.handler;

public class RequiredFieldsException extends BusinessException{
    public RequiredFieldsException(String requiredField){
        super ("O campo %s é obrigatório", requiredField);
    }
}
