/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataModel;

/**
 *
 * @author ADMIN
 */
public class artistModel {
    private int artistID;
    
    private String phone;
    
    private String email;
    
    private String avatarLink;
    
    private String socialMediaLink;

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public String getSocialMediaLink() {
        return socialMediaLink;
    }

    public void setSocialMediaLink(String socialMediaLink) {
        this.socialMediaLink = socialMediaLink;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    private String link;
    
    public artistModel (int artistID, String name, String phone, String email, String avatarLink, String socialMediaLink) {
        this.artistID = artistID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.avatarLink = avatarLink;
        this.socialMediaLink = socialMediaLink;
    }
    
    
}
