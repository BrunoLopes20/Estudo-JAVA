package com.java_angular.fullstackdevelop.enumeration;
//Classe criada para um método que seus valores serão constantes
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
