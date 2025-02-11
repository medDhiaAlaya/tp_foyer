package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numertoChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

@ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;

@OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations=new HashSet<Reservation>();

}
