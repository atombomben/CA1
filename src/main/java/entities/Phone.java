/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 *
 * @author peter
 */
@Entity
@NamedQuery(name = "Phone.deleteAllRows", query = "DELETE from Phone")
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private String description;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Person person;

    public Phone() {
    }

    public Phone(int number, String description, Person person) {
        this.number = number;
        this.description = description;
        this.person = person;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int Number) {
        this.number = Number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", number=" + number +
                ", description='" + description + '\'' +
                ", person=" + person +
                '}';
    }
}
