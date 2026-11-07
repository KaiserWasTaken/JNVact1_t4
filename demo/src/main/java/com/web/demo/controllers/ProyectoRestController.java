package com.web.demo.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proyecto")
public class ProyectoRestController {

    @GetMapping
    public Map<String, String> obtenerInformacionProyecto() {
        return Map.of(
                "nombre", "Proyecto Spring Boot",
                "autor", "Jonathan de Jesus NV",
                "descripcion", "Proyecto de ejemplo con controladores REST");
    }
}
