package com.aluracursos.screenmatch.controller;

import com.aluracursos.screenmatch.dto.EpisodioDTO;
import com.aluracursos.screenmatch.dto.SerieDTO;
import com.aluracursos.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/series")

public class SerieController {
    @Autowired
    private SerieService servicio;

    @GetMapping()
    public List<SerieDTO> obtenerTodasLasSeries(){
        return servicio.obtenerTodasLasSeries();
    }

    @GetMapping("/top5")

    public List<SerieDTO> obtererTop5(){
        return servicio.obtenerTop5();

    }

    @GetMapping("/lazamientos")
    public List<SerieDTO> obtenerLazamientoMasRecientes() {
        return servicio.obternerLanzamientosMasRecientes();
    }

    @GetMapping("/{id}")

public SerieDTO obternerPorID(@PathVariable Long id) {
        return  servicio.obtenerPorId(id);
   }

   @GetMapping("/{id}/temporadas/todas")
        public List<EpisodioDTO> obetenerTodasLAsTemporadas(@PathVariable Long id){
        return servicio.obternerTodasLasTemporadas(id);
   }

   @GetMapping("/{id}/temporadas/{numeroTemporada}")
    public  List<EpisodioDTO> obtenerTemporadasPorNumero(@PathVariable Long id, @PathVariable long numeroTemporada){
        return  servicio.obtenerTemporadasPorNumero(id, numeroTemporada);
   }

   @GetMapping("/categoria/{nombreGenero}")
    public List<SerieDTO> obtenerSeriesPorCategoria(@PathVariable String nombreGenero){
        return  servicio. obtenerSeriesPorCategoria(nombreGenero);

   }

    }

