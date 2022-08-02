package api.equipo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import api.equipo.data.Jugador;

@Service
public class JugadorService {

	public Map<Integer, List<String>> ordenarJugadorEdad(List<Jugador> jugadores) {

		Map<Integer, List<String>> response = ordenarEdad(jugadores);
		return response;
	}

	public Map<Integer, List<String>> ordenarJugadorNombre(List<Jugador> jugadores) {

		Map<Integer, List<String>> response = ordenarEdad(jugadores);
		sortNames(response);

		return response;
	}

	private Map<Integer, List<String>> ordenarEdad(List<Jugador> nationalTeam) {

		Map<Integer, List<String>> teamMap = new HashMap<Integer, List<String>>();

		for (Jugador jugador : nationalTeam) {
			List<String> nombresJugador = new ArrayList<String>();
			if (teamMap.containsKey(jugador.getAge())) {
				teamMap.get(jugador.getAge()).add(jugador.getName());

			} else {
				nombresJugador.add(jugador.getName());
				teamMap.put(jugador.getAge(), nombresJugador);
			}

		}
		Map<Integer, List<String>> ordenado = new TreeMap<>(teamMap);

		return ordenado;

	}

	private List<String> sortNames(Map<Integer, List<String>> teamMap) {

		for (Map.Entry<Integer, List<String>> entry : teamMap.entrySet()) {

			Collections.sort(entry.getValue());

		}

		return null;

	}

	public static <T> String objectToString(T obj) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
		}
		return null;
	}

}
