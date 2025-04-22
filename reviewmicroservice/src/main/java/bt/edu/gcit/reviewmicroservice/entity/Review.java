package bt.edu.gcit.reviewmicroservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String travelAgentName;

    @Column(name = "travel_date_from")
    private LocalDate travelDateFrom;

    @Column(name = "travel_date_to")
    private LocalDate travelDateTo;

    @Column(length = 2000)
    private String feedback;
}
