package com.web.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materias")
public class MateriasRestController {

        @GetMapping
        public List<Map<String, Object>> obtenerMaterias() {
        return List.of(
                Map.of(
                        "nombre", "Programacion web",
                        "semestre", 7,
                        "estado", "En curso"),
                Map.of(
                        "nombre", "Software para toma de decisiones",
                        "semestre", 7,
                        "estado", "En curso"),
                Map.of(
                        "nombre", "Frances",
                        "semestre", "NA",
                        "estado", "En curso"));
        }
}
