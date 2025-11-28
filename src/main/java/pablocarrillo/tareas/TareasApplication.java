package pablocarrillo.tareas;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pablocarrillo.tareas.presentacion.SistemasTareasFx;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TareasApplication.class, args);
        Application.launch(SistemasTareasFx.class, args);
	}

}
