package com.sillyv.vasili.officetalk.backend.db.models;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.Date;

@Entity
@Index
public class User
{
    @Id
    private Long id;

    private String name;

    private String imageUrl;

    private String eMail;
    private String homePhone;
    private String workPhone;
    private String cellPhone;
    private int color;
    private Date creationDate;
    public static Key<User> key(long id)
    {
        return Key.create(User.class, id);
    }

    public User()
    {
    }
    public User(String name, String imageUrl, String eMail, String homePhone, String workPhone, String cellPhone, int color, Date creationDate)
    {
        this.name = name;
        this.imageUrl = imageUrl;
        this.eMail = eMail;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.cellPhone = cellPhone;
        this.color = color;
        this.creationDate = creationDate;
    }
    public User(Long id, String name, String imageUrl, String eMail, String homePhone, String workPhone, String cellPhone, int color, Date creationDate)
    {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.eMail = eMail;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.color = color;
        this.creationDate = creationDate;
        this.workPhone = workPhone;
    }
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getImageUrl()
    {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }
    public String geteMail()
    {
        return eMail;
    }
    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }
    public String getHomePhone()
    {
        return homePhone;
    }
    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }
    public String getWorkPhone()
    {
        return workPhone;
    }
    public void setWorkPhone(String workPhone)
    {
        this.workPhone = workPhone;
    }
    public String getCellPhone()
    {
        return cellPhone;
    }
    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }
    public int getColor()
    {
        return color;
    }
    public void setColor(int color)
    {
        this.color = color;
    }
    public Date getCreationDate()
    {
        return creationDate;
    }
    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }
}
