package demo.torneo.services;

import demo.torneo.entities.Ciudad;

import java.util.List;
import java.util.Optional;

//Declaro los metodos CRUD
public interface CiudadService {

    List<Ciudad> obtenerTodas();
    Optional<Ciudad> obtenerPorId(int id);
    Ciudad guardar(Ciudad ciudad);
    Ciudad actualizar(int id, Ciudad ciudad);
    void eliminar(int id);

}
