package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "care_taker") //necesara doar daca vrem sa schimbam numele tabelului
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Caretaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String caretakerName;

    private Integer age;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}) // owning side
    private Animal animal;
}
