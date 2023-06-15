package pt.CCEM.ccem.counties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountiesController implements CountiesAPI {

    @Autowired
    private CountiesService countiesService;

    @Override
    public ResponseEntity<String> getAll(Integer page) {
        return this.countiesService.getAll(page);
    }

    @Override
    public ResponseEntity<String> getById(Long id) {
        return this.countiesService.getById(id);
    }

    @Override
    public ResponseEntity<String> getAllInRegion(Long id, Integer page) {
        return this.countiesService.getAllInRegion(id, page);
    }

    @Override
    public ResponseEntity<String> getAllInCounty(Long id, Integer page) {
        return this.countiesService.getAllInCounty(id, page);
    }

    @Override
    public ResponseEntity<String> put(Long id) {
        return this.countiesService.put(id);
    }

    @Override
    public ResponseEntity<String> postOne() {
        return this.countiesService.postOne();
    }
}
