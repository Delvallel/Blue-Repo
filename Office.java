/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Win 7
 */
public class Office {
    private String name;
    private int contact;
    private List<Transaction> history;
    private Date dateOfTransaction;
    private int terms;

    public Office(String name, int contact, Date dateOfTransaction, int terms) {
        this.name = name;
        this.contact = contact;
        this.dateOfTransaction = dateOfTransaction;
        this.terms = terms;
    }

    
    public void addTransaction(Transaction t){
    
    }
    
    public List<Transaction> getTransaction(){
    
    return history;
    }
    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contact;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
    
    
    
    
}
