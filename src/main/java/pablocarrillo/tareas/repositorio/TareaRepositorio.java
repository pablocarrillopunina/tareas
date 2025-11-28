package pablocarrillo.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pablocarrillo.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}
