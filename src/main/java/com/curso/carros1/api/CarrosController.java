package com.curso.carros1.api;

import com.curso.carros1.domain.Carro;
import com.curso.carros1.domain.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

    private CarroService service = new CarroService();

    @GetMapping
    public List<Carro> get(){
        return service.getCarros();
    }




}
