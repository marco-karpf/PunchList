package ch.bbw.km.punchlist.models;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

/**
 * Class Punch for PunchList
 * @author marco karpf
 * @version 31.03.2022
 */
public class Punch {
    private String category;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Punch() {
    category = "Start";
    description = "not done yet";
    date = new Date();
    }

    public Punch(String category, String description, Date date) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
