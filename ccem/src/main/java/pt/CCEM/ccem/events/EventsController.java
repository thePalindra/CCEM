package pt.CCEM.ccem.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventsController implements EventsAPI{

    @Autowired
    private EventsService eventsService;

    @Override
    public ResponseEntity<String> getAll(Integer page) {
        return this.eventsService.getAll(page);
    }

    @Override
    public ResponseEntity<String> getById(Long id) {
        return this.eventsService.getById(id);
    }

    @Override
    public ResponseEntity<String> getAllInRegion(Long id, Integer page) {
        return this.eventsService.getAllInRegion(id, page);
    }

    @Override
    public ResponseEntity<String> getAllInCounty(Long id, Integer page) {
        return this.eventsService.getAllInCounty(id, page);
    }

    @Override
    public ResponseEntity<String> put(Long id) {
        return this.eventsService.put(id);
    }

    @Override
    public ResponseEntity<String> postOne() {
        return this.eventsService.postOne();
    }
}
