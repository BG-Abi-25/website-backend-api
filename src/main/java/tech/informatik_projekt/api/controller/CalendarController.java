package tech.informatik_projekt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.informatik_projekt.api.model.Event;
import tech.informatik_projekt.api.repository.EventRepository;

import java.util.List;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@RestController
@RequestMapping("/v1/calendar")
public class CalendarController {

    @Autowired
    private EventRepository eventRepository;

    @CrossOrigin
    @GetMapping("/event")
    public ResponseEntity<List<Event>> getEvents() {
        List<Event> events = eventRepository.findAll();
        if (events.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(events);
    }

    @CrossOrigin
    @GetMapping("/event/{eventId}")
    public ResponseEntity<Event> getEventById(@PathVariable int eventId) {
        Event event = eventRepository.findById(eventId);
        if (event == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(event);
    }

}