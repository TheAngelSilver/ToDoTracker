package com.tiy;

import javax.persistence.*;
/*

*
 * Created by silve on 5/18/2016 at 11:04 AM with name: GameTrackerSpring.

*/

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
            String name;

    @Column(nullable = false)
    String password;

    public String getPassword() {
        return password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }
}