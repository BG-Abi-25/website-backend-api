package tech.informatik_projekt.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@Document(collection = "events")
public class Event {

    @Id
    private int id;
    private final String title;
    private final String description;
    private final String fromDateTime;
    private final String toDateTime;
    private final boolean allDay;

    public Event(int id, String title, String description, String fromDateTime, String toDateTime, boolean allDay) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
        this.allDay = allDay;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getFromDateTime() {
        return fromDateTime;
    }

    public String getToDateTime() {
        return toDateTime;
    }

    public boolean isAllDay() {
        return allDay;
    }

}