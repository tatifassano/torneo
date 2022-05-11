package demo.torneo.controllers;

import demo.torneo.services.CiudadService;
import demo.torneo.services.CiudadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadServiceImpl ciudadService;


    @GetMapping("/todas")
    public ResponseEntity<?> obtenerTodas() {
        return ResponseEntity.status(HttpStatus.OK).body(ciudadService.obtenerTodas());
    }

    @GetMapping("/una/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(ciudadService.obtenerPorId(id));
    }

}
