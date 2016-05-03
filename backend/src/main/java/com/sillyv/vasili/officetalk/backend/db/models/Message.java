package com.sillyv.vasili.officetalk.backend.db.models;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.Date;

@Entity
@Index
public class Message
{
    @Id
    private Long id;
    private Key<Room> room;
    private Key<User> from;
    private Date date;
    private String content;
    private boolean isRead;
    private boolean isRecieved;
    public static Key<Message> key(long id)
    {
        return Key.create(Message.class, id);
    }

    public Message(){}

    public Message(Key<Room> room, Key<User> from, Date date, String content, boolean isRead, boolean isRecieved)
    {
        this.room = room;
        this.from = from;
        this.date = date;
        this.content = content;
        this.isRead = isRead;
        this.isRecieved = isRecieved;
    }

    public Message(Long id, Key<Room> room, Key<User> from, Date date, String content, boolean isRead, boolean isRecieved)
    {
        this.id = id;
        this.room = room;
        this.from = from;
        this.date = date;
        this.content = content;
        this.isRead = isRead;
        this.isRecieved = isRecieved;
    }



}
