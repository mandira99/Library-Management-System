/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
class User {
    private int id;
    private String username, password,gender,address;
    
    public User(int id,String username,String password,String gender,String address){
        
        this.id=id;
        this.username= username;
        this.password= password;
        this.gender=gender;
        this.address=address;
        
    }
    public int getid(){
        return id;
    }
    public  String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public String getgender(){
        return gender;
    }
    public String getaddress(){
        return address;
    }
    
}
