package demo.torneo.services;

import demo.torneo.entities.Ciudad;
import demo.torneo.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//Implementacion de los metodos definidos en la interfaz.
@Service
public class CiudadServiceImpl implements CiudadService{

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    @Transactional
    public List<Ciudad> obtenerTodas() {
        return ciudadRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Ciudad> obtenerPorId(int id) {
        Optional<Ciudad> ciudadBuscada = ciudadRepository.findById(id);
        if(ciudadBuscada.isEmpty()){
            throw new NoSuchElementException("Ciudad no encontrada");
        }
        return ciudadBuscada;
    }

    @Override
    @Transactional
    public Ciudad guardar(Ciudad ciudad) {
        Ciudad nueva = ciudadRepository.save(ciudad);
        return nueva;
    }

    @Override
    @Transactional
    public Ciudad actualizar(int id, Ciudad ciudad) {
        return null;
    }

    @Override
    @Transactional
    public void eliminar(int id) {

    }
}
