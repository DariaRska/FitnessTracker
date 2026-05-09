package pl.wsb.fitnesstracker.training.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.wsb.fitnesstracker.event.Event;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {
    @Query(value = "SELECT SUM(distance) FROM trainings WHERE user_id = :userId", nativeQuery = true)
    Double sumDistanceByUserId(@Param("userId") Long userId);
}
