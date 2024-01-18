package dataModel;
import dataModel.artistModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArtistDAO {

    // Database connection details
    private String connectionUrl = "jdbc:sqlserver://sql.bsite.net\\MSSQL2016;databaseName=htthuy_ArtGallery;user=htthuy_ArtGallery;password=012345678";

    public List<artistModel> getAllArtists() {
        List<artistModel> artists = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            String query = "SELECT * FROM Artist";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    int artistID = resultSet.getInt("ArtistID");
                    String name = resultSet.getString("Name");
                    String phone = resultSet.getString("Phone");
                    String email = resultSet.getString("Email");
                    String avatarLink = resultSet.getString("AvatarLinks");
                    String socialMediaLink = resultSet.getString("SocialMediaLinks");

                    artistModel artist = new artistModel(artistID, name, phone, email, avatarLink, socialMediaLink);
                    artists.add(artist);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return artists;
    }
}
