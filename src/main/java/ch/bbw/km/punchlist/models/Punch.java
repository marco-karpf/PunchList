package ch.bbw.km.punchlist.models;

import java.util.Date;

public class Punch {
    private String category;
    private String description;
    private String date;

    public Punch(String category, String description, String date) {
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Punch{" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
