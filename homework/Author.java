package bookauthor;

import java.util.Date;

public class Author {

    private String authorID;
    private String name;
    private Date dateOfBirth;
    public Author() {
    }

    public Author(String authorID, String name) {
        this.authorID = authorID;
        this.name = name;
    }
     public Date getDateOfBirth() {
        return dateOfBirth;
    }
     public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" + "authorID ='" + authorID + '\'' + ", name='" + name + '\'' + '}';
    }

    
    }
   
   


