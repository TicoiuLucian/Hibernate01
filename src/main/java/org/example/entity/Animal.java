package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Table(name = "animal_pref") //necesara doar daca vrem sa schimbam numele tabelului
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, name = "animal_name")
    private String name;

    @OneToOne(mappedBy = "animal", cascade = CascadeType.ALL) //non-owning side
    private Caretaker careTaker;

    public Animal(String name) {
        this.name = name;
    }

}
