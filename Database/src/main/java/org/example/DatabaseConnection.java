package org.example;

public class DatabaseConnection {
    private String url;
    private String username;
    private static String password;
    private static DatabaseConnection instance;


    public DatabaseConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }



    public static DatabaseConnection getInstance(String url, String username, String password){
        if(instance == null){
            instance = new DatabaseConnection(url ,username , password);
        }
        return instance;
    }
    public void getConnection() {
        System.out.println("good connection"+this.username);
    }
}
