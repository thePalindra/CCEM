package pt.CCEM.ccem.events;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventsController implements EventsAPI{

    @Override
    public ResponseEntity<String> getAll(Integer page) {
        return null;
    }

    @Override
    public ResponseEntity<String> getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> getAllInRegion(Long id, Integer page) {
        return null;
    }

    @Override
    public ResponseEntity<String> getAllInCounty(Long id, Integer page) {
        return null;
    }

    @Override
    public ResponseEntity<String> put(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> postOne() {
        return null;
    }
}
