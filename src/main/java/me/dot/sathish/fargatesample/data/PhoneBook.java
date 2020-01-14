package me.dot.sathish.fargatesample.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhoneBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String fullName;

    @Column(nullable = false)
    private String emailAddrs;

    public PhoneBook() {
        super();
    }

    public PhoneBook(String title, String author) {
        super();
        this.fullName = title;
        this.emailAddrs = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddrs() {
        return emailAddrs;
    }

    public void setEmailAddrs(String emailAddrs) {
        this.emailAddrs = emailAddrs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emailAddrs == null) ? 0 : emailAddrs.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PhoneBook other = (PhoneBook) obj;
        if (emailAddrs == null) {
            if (other.emailAddrs != null)
                return false;
        } else if (!emailAddrs.equals(other.emailAddrs))
            return false;
        if (id != other.id)
            return false;
        if (fullName == null) {
            if (other.fullName != null)
                return false;
        } else if (!fullName.equals(other.fullName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PhoneBook [id=" + id + ", fullName=" + fullName + ", emailAddrs=" + emailAddrs + "]";
    }

}
