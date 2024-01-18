package dataModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArtworkDAO {

    private static final String CONNECTION_URL = "jdbc:sqlserver://sql.bsite.net\\MSSQL2016;databaseName=htthuy_ArtGallery;user=htthuy_ArtGallery;password=012345678";

    public List<ArtworkModel> getAllArtworks() {
        List<ArtworkModel> artworks = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL)) {
            String query = "SELECT A.*, B.Name AS ArtistName " +
                           "FROM Artwork A " +
                           "JOIN Artist B ON A.ArtistID = B.ArtistID";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    int artworkID = resultSet.getInt("ArtworkID");
                    String title = resultSet.getString("Title");
                    String description = resultSet.getString("Description");
                    String dimensions = resultSet.getString("Dimensions");
                    String price = resultSet.getString("Price");
                    String imageURL = resultSet.getString("ImageURL");
                    int creationYear = resultSet.getInt("CreationYear");
                    String medium = resultSet.getString("Medium");
                    int artistID = resultSet.getInt("ArtistID");
                    String artistName = resultSet.getString("ArtistName");

                    ArtworkModel artwork = new ArtworkModel(artworkID, title, description, dimensions, price, imageURL, creationYear, medium, artistID, artistName);
                    artworks.add(artwork);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or rethrow the exception
        }

        return artworks;
    }
    
    // Other methods as needed
}
