package com.petmaps.aplication.models;

import java.util.ArrayList;

public class ValidarUser {
    private ArrayList<User> users=new ArrayList<>();
    public ValidarUser(){

        users.add(new User("Admin", "Admin", "Admin"));

    }
    public boolean autenticarUsers(String username, String password){
        boolean status=false;
        User user=findUser(username);

        if (user !=null && user.getPassword().equals(password)){
            status=true;
            return status;
        }
            return false;
    }
    private  User findUser (String username){
        User user=null;
        boolean status=false;
        int index=0;
        while(!status && index<users.size()){
            if(users.get(index).getUsername().equals(username)){
                user=users.get(index);
                status=true;
            }
            index++;
        }
        return user;

    }

}
