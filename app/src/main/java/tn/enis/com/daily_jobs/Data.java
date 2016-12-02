package tn.enis.com.daily_jobs;

/**
 * Created by Hassana on 02-Dec-16.
 */

public class Data {
    public String title;
    public String description;
    public int imageId;
    public String skills;
    public String price;

    public Data(String title, String description, int imageId, String skills, String price) {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
        this.skills = skills;
        this.price = price;
    }

    Data(String title, String description, int imageId) {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
    }

}