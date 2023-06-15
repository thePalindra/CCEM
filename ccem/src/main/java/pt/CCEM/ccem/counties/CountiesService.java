package pt.CCEM.ccem.counties;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pt.CCEM.ccem.data.County;
import pt.CCEM.ccem.data.Event;
import pt.CCEM.ccem.data.Region;
import pt.CCEM.ccem.data.Space;

import java.util.Map;
import java.util.TreeMap;

@Service
public class CountiesService {

    private static final Gson gson = new Gson();

    private Map<Long, Event> events;
    private Map<Long, Space> spaces;
    private Map<Long, County> counties;
    private Map<Long, Region> regions;

    public CountiesService() {
        this.events = new TreeMap<>();
        this.spaces = new TreeMap<>();
        this.counties = new TreeMap<>();
        this.regions = new TreeMap<>();
    }

    public ResponseEntity<String> getAll(Integer page) {
        return null;
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
                    .id(1l)
                    .build();
            this.events.put(1l, event);

            return new ResponseEntity<>(gson.toJson(this.events), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(gson.toJson(e), HttpStatus.BAD_REQUEST);
        }
    }
}