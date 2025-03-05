package tech.informatik_projekt.api.repository;

import org.springframework.stereotype.Repository;
import tech.informatik_projekt.api.model.Event;

import java.util.List;

@Repository
public interface EventRepository {
    List<Event> findAll();
    Event findById(int id);
}
