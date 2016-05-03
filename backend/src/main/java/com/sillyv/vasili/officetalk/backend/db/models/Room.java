package com.sillyv.vasili.officetalk.backend.db.models;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.Date;
import java.util.List;

@Entity
@Index
public class Room
{
    @Id
    private Long id;
    private String name;
    private Key<User> leader;
    private List<Key<User>> users;
    private String imageUrl;

    public Room()
    {
    }

    public Room(String name, Key<User> leader, List<Key<User>> users, String imageUrl)
    {
        this.name = name;
        this.leader = leader;
        this.users = users;
        this.imageUrl = imageUrl;
    }

    public Room(Long id, String name, Key<User> leader, List<Key<User>> users, String imageUrl)
    {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.users = users;
        this.imageUrl = imageUrl;
    }
}