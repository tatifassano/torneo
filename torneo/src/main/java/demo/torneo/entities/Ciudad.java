package demo.torneo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_ciudad")
    private String nombre;

}
