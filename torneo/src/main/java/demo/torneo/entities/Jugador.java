package demo.torneo.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "jugador" )
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_jugador")
    private String nombre;

    @Column(name = "id_equipo")
    private int id_equipo;

    @Column(name = "nacionalidad")
    private String nacionalidad;
}
