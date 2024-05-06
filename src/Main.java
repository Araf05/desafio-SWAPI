import io.araf.appSWAPI.modelos.ConsultaPelicula;
import io.araf.appSWAPI.modelos.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Ingresa el numero de la pelicula de Star Wars que desea consultar: ");
        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);

        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado. " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }

    }
}

