package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomE;
    private String prenomE;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

}
