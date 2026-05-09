package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String country;
    private String city;


    public Event(String name, LocalDate startDate, String city) {
        this.name = name;
        this.startDate = startDate;
        this.city = city;
    }
}
