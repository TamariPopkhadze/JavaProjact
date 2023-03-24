package com.example.Projact;

public class User {
    private String key;
    private String username;
    private String firstname;
    private String surname;
    private String profession;
    private String password;

    User(){
    }

    User(String username, String password){
        this.password = password;
        this.username = username;
    }
    User(String key){
        this.username = key;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setKey(String key) {this.key = key;}
    public String getUsername(){
        return username;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getSurname(){
        return surname;
    }
    public String getProfession(){
        return profession;
    }
    public String getPassword(){
        return password;
    }
    public String getKey() {return key;}


}
