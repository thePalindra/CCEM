package pt.CCEM.ccem.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.CCEM.ccem.data.Event;

@Repository
public interface EventsRepository extends JpaRepository<Event, Long> {
}
