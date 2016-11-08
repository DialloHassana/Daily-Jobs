package tn.enis.com.daily_jobs;

/**
 * Created by Hassana on 22-Oct-16.
 */

public class User {
    String name;
    String email;
    String password;
    String address;
    String pseudo;

    public User(String pseudo, String name, String email, String password, String address) {
        this.pseudo = pseudo;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public User() {
    }
}
