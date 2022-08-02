package api.equipo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.equipo.data.Jugador;
import api.equipo.service.JugadorService;

@RestController
public class JugadorController {

	@Autowired
	private JugadorService jugadorService;
	
	
	@GetMapping(path="/equipoEdades",produces = "application/json")
	public Map<Integer, List<String>> ordenarJugadoresEdad() {
	

		
		Jugador nationalTeam = new Jugador();
        
        Map<Integer, List<String>> response = jugadorService.ordenarJugadorEdad(nationalTeam.getJugadores());
		return response;
		
		
	}
	
	
	@GetMapping(path="/equipoNombres",produces = "application/json")
	public Map<Integer, List<String>> ordenarJugadoresNombre() {

		
		Jugador nationalTeam = new Jugador();
        
        Map<Integer, List<String>> response = jugadorService.ordenarJugadorNombre(nationalTeam.getJugadores());
		return response;
		
		
	}
	
}
