package com.petmaps.aplication.models;

import java.util.ArrayList;

public class ValidarUser {
    private ArrayList<UserO> users=new ArrayList<>();
    public ValidarUser(){
        users.add(new UserO("Darinel","Darin", "1212"));
        users.add(new UserO("Ali López ","alilopez", "1234"));
        users.add(new UserO("Admin", "Admin", "Admin"));

    }
    public boolean autenticarUsers(String username, String password){
        boolean status=false;
        UserO user=findUser(username);

        if (user !=null && user.getPassword().equals(password)){
            status=true;
            return status;
        }
            return false;
    }
    private  UserO findUser (String username){
        UserO user=null;
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
