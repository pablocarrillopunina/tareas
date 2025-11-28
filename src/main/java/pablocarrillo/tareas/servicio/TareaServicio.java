package pablocarrillo.tareas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pablocarrillo.tareas.modelo.Tarea;
import pablocarrillo.tareas.repositorio.TareaRepositorio;

import java.util.List;

@Service
public class TareaServicio implements ITareaServicio{

    @Autowired
    private TareaRepositorio tareaRepositorio;

    @Override
    public List<Tarea> listarTareas() {
        return tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        //Creamos un objeto de tipo Tarea
        Tarea tarea = tareaRepositorio.findById(idTarea).orElse(null);
        return tarea;
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        tareaRepositorio.save(tarea);

    }

    @Override
    public void eliminarTarea(Tarea tarea) {
        tareaRepositorio.delete(tarea);
    }
}
