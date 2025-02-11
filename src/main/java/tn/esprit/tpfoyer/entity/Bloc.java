package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private long capaciteBloc;


    @ManyToOne(cascade = CascadeType.ALL)
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres=new HashSet<Chambre>();


}
