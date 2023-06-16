package pt.CCEM.ccem.events;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pt.CCEM.ccem.data.County;
import pt.CCEM.ccem.data.Event;
import pt.CCEM.ccem.data.Region;
import pt.CCEM.ccem.data.Space;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Service
public class EventsService {

    private static final Gson gson = new Gson();

    private EventsRepository eventsRepository;

    @Autowired
    public EventsService(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    public ResponseEntity<String> getAll(Integer page) {
        return new ResponseEntity<>(gson.toJson(this.eventsRepository.findAll()), HttpStatus.OK);
    }

    public ResponseEntity<String> getById(Long id) {
        return null;
    }

    public ResponseEntity<String> getAllInRegion(Long id, Integer page) {
        return null;
    }

    public ResponseEntity<String> getAllInCounty(Long id, Integer page) {
        return null;
    }

    public ResponseEntity<String> put(Long id) {
        return null;
    }

    public ResponseEntity<String> postOne() {
        try {
            Event event = Event.builder()
                    .name("test")
                    .description("test")
                    .build();
            this.eventsRepository.save(event);

            return new ResponseEntity<>(gson.toJson(event), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(gson.toJson(e), HttpStatus.BAD_REQUEST);
        }
    }
}