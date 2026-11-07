package com.web.demo.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estado")
public class EstadoRestController {

    @GetMapping
    public Map<String, Object> obtenerEstadoServidor() {
        return Map.of(
                "mensaje", "El servidor esta funcionando correctamente, te lo juro",
                "codigo", 200,
                "activo", true,
                "cafe", "si");
    }
}
