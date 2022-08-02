package api.equipo.data;

import java.util.ArrayList;
import java.util.List;

public class Jugador implements Comparable<Jugador>{
	private Integer age;
    private String name;
    
    public Jugador() {
    }

	public Jugador(final int age, final String name) {
        super();
        this.age = age;
        this.name = name;
    }
    
    @Override
    public int compareTo(Jugador u) {
      if (getAge() == 0 || u.getAge() == 0) {
        return 0;
      }
      return getAge().compareTo(u.getAge());
    }
    
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Jugador> getJugadores(){
		List<Jugador> nationalTeam = new ArrayList<>();
        nationalTeam.add(new Jugador(37, "Claudio Bravo"));
        nationalTeam.add(new Jugador(36, "Jean Beausejour"));
        nationalTeam.add(new Jugador(34, "Gonzalo Jara"));
        nationalTeam.add(new Jugador(33, "Gary Medel"));
        nationalTeam.add(new Jugador(32, "Mauricio Isla"));
        nationalTeam.add(new Jugador(31, "Charles Aránguiz"));
        nationalTeam.add(new Jugador(33, "Arturo Vidal"));
        nationalTeam.add(new Jugador(34, "Matias Fernandez"));
        nationalTeam.add(new Jugador(36, "Jorge Valdivia"));
        nationalTeam.add(new Jugador(31, "Alexis Sánchez"));
        nationalTeam.add(new Jugador(30, "Eduardo Vargas"));
		return nationalTeam;
	}
	
	@Override
	public String toString() {
		return "Jugador [age=" + age + ", name=" + name + "]";
	}

    
}
