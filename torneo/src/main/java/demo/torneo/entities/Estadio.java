package demo.torneo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_estadio")
    private String nombre;
}
