package models;
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a sale.
 */
@Entity
public class Sale extends Model {
    
    @Id
    private int saleId;

    private String sellerId;
    private String adminId;
    private String title;
    private String location;
    private int size;
    
    @Lob
    private byte[] image;
    
    /**
     * Finder.
     */
   private static Finder<Integer, Sale> find
        = new Finder<Integer, Sale>(Sale.class);
    
    /**
     * Find a sale by ID.
     * @param id the sale's ID
     * @return the sale found
     */
    public static Sale findById(int id) {
        return find.byId(id);

    }
    
    /**
     * Find all sales.
     * @return the sale list found
     */
    public static List<Sale> findAll() {
        return find.all();
    }
    
    /**
     * Getters for private fields.
     */

    public int getSaleId() {
        return saleId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }

    public byte[] getImage() {
        if (image == null) {
            return null;
        }
        return Arrays.copyOf(image, image.length);
    }
    
    /**
     * Setters for private fields.
     */
    
    public void setSaleId(int saleIdNew) {
        this.saleId = saleIdNew;
    }

    public void setSellerId(String sellerIdNew) {
        this.sellerId = sellerIdNew;
    }

    public void setAdminId(String adminIdNew) {
        this.adminId = adminIdNew;
    }

    public void setTitle(String titleNew) {
        this.title = titleNew;
    }

    public void setLocation(String locationNew) {
        this.location = locationNew;
    }

    public void setSize(int sizeNew) {
        this.size = sizeNew;
    }

    public void setImage(byte[] imageNew) {
        this.image = Arrays.copyOf(imageNew, imageNew.length);
    }
}
