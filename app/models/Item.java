package models;
import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Arrays;
import java.util.List;

/**
 * Represents an item for sale.
 */
@Entity
public class Item extends Model {
    
    @Id
    private int itemId;
    
    private int saleId;
    private String title;
    private String description;
    private double price;
    private int stock;
    
    @Lob
    private byte[] image;
    
    /**
     * Finder.
     */
    private static Finder<Integer, Item> find
        = new Finder<Integer, Item>(Item.class);
    
    /**
     * Find an item by ID.
     * @param id the item's ID
     * @return the item found
     */
    public static Item findById(int id) {
        return find.byId(id);

    }
    
    /**
     * Find items belonged to the same sale.
     * @param id the sale's ID
     * @return the item list found
     */
    public static List<Item> findBySale(int id) {
        return find.where().eq("saleId", id).findList();
    }
    
    /**
     * Getters for private fields.
     */
    
    public int getItemId() {
        return itemId;
    }
    
    public int getSaleId() {
        return saleId;
    }
    
    public String getTitle() {
        return title;
    }
   
    public String getDescription() {
        return description;
    }
   
    public double getPrice() {
        return price;
    }
    
    public int getStock() {
        return stock;
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
    
    public void setItemId(int itemIdNew) {
        this.itemId = itemIdNew;
    }
    
    public void setSaleId(int saleIdNew) {
        this.saleId = saleIdNew;
    }
   
    public void setTitle(String titleNew) {
        this.title = titleNew;
    }
   
    public void setDescription(String descriptionNew) {
        this.description = descriptionNew;
    }
  
    public void setPrice(double priceNew) {
        this.price = priceNew;
    }
  
    public void setStock(int stockNew) {
        this.stock = stockNew;
    }
    
    public void setImage(byte[] newImage) {
        this.image = Arrays.copyOf(newImage, newImage.length);
    }
}
