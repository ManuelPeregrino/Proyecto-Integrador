package com.petmaps.aplication.models;

public class UserO {
    private String Nombre;
    private String Username;
    private String Password;

    public UserO(String nombre, String username, String password) {
        Nombre = nombre;
        Username = username;
        Password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
