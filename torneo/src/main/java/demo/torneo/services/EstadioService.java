package demo.torneo.services;

import demo.torneo.entities.Ciudad;
import demo.torneo.entities.Estadio;

import java.util.List;
import java.util.Optional;

public interface EstadioService {

    List<Estadio> obtenerTodos();
    Optional<Estadio> obtenerPorId(int id);
    Estadio guardar(Estadio estadio);
    Estadio actualizar(int id, Estadio estadio);
    void eliminar(int id);
}
