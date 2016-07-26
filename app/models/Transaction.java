package models;
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Represents a transaction.
 */
@Entity
public class Transaction extends Model {
    
    @Id
    private int transactionId;

    private String customerId;
    private double total;
    
    /**
     * Finder.
     */
     private static Finder<Integer, Transaction> find
        = new Finder(Transaction.class);
    
    /**
     * Find all transactions.
     * @return the transaction list found
     */
    public static List<Transaction> findAll() {
        return find.all();
    }
    
    /**
     * Getters for private fields.
     */

    public int getTransactionId() {
        return transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getTotal() {
        return total;
    }
    
    /**
     * Setters for private fields.
     */

    public void setTransactionId(int transactionIdNew) {
        this.transactionId = transactionIdNew;
    }
   
    public void setCustomerId(String customerIdNew) {
        this.customerId = customerIdNew;
    }
   
    public void setTotal(double totalNew) {
        this.total = totalNew;
    }
}
