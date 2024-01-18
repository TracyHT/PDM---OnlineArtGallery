package dataModel;

/**
 * Represents an artwork with its details.
 * Includes information about the associated artist.
 * 
 * @author ADMIN
 */
public class ArtworkModel {
    private int artworkID;
    private String title;
    private String description;
    private String dimensions;
    private String price;
    private String imageURL;
    private int creationYear;
    private String medium;
    private int artistID;
    private String artistName;

    public ArtworkModel(int artworkID, String title, String description, String dimensions,
                        String price, String imageURL, int creationYear, String medium, int artistID, String artistName) {
        this.artworkID = artworkID;
        this.title = title;
        this.description = description;
        this.dimensions = dimensions;
        this.price = price;
        this.imageURL = imageURL;
        this.creationYear = creationYear;
        this.medium = medium;
        this.artistID = artistID;
        this.artistName = artistName;
    }

    public int getArtworkID() {
        return artworkID;
    }

    public void setArtworkID(int artworkID) {
        this.artworkID = artworkID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
