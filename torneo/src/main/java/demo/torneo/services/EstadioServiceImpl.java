package demo.torneo.services;

import demo.torneo.entities.Estadio;
import demo.torneo.repositories.EstadioRepository;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EstadioServiceImpl implements EstadioService{

    @Autowired
    private EstadioRepository estadioRepository;

    @Override
    @Transactional
    public List<Estadio> obtenerTodos() {
        return estadioRepository.findAll();
    }

    @Override
    public Optional<Estadio> obtenerPorId(int id) {
        return Optional.empty();
    }

    @Override
    public Estadio guardar(Estadio estadio) {
        return null;
    }

    @Override
    public Estadio actualizar(int id, Estadio estadio) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}
