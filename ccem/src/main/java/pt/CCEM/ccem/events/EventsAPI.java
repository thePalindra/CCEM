package pt.CCEM.ccem.events;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/events")
public interface EventsAPI {

    @GetMapping("/")
    ResponseEntity<String> getAll(@RequestParam(required = false) Integer page);

    @GetMapping("/{id}")
    ResponseEntity<String> getById(@PathVariable Long id);

    @GetMapping("/region/{id}/{page}")
    ResponseEntity<String> getAllInRegion(@PathVariable Long id,
                                          @PathVariable Integer page);

    @GetMapping("/county/{id}/{page}")
    ResponseEntity<String> getAllInCounty(@PathVariable Long id,
                                          @PathVariable Integer page);

    @PutMapping("/{id}")
    ResponseEntity<String> put(@PathVariable Long id);

    @PostMapping("/")
    ResponseEntity<String> postOne();
}
