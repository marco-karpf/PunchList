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
    private String tools;
    private String responsable;
    private String notes;

    public Punch() {
    category = "Start";
    description = "not done yet";
    date = new Date();
    tools = "Meter";
    responsable = "Marco";
    notes = "-";
    }

    public Punch(String category, String description, Date date, String tools, String responsable, String notes) {
        this.category = category;
        this.description = description;
        this.date = date;
        this.tools = tools;
        this.responsable = responsable;
        this.notes = notes;
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

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
