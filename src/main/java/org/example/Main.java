package org.example;

import org.example.controlador.ControladorLibro;
import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;
import org.example.vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC y JDBC");
        ControladorLibro controller = new ControladorLibro(view);


        // LibroDAO ldao = new LibroDAO();









        /*try {
           Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("-----------------------------------");
            for (Object lib: ldao.obtenerTodo()){
                System.out.println((Libro)lib);

            }
        }catch (SQLException sqle){
            System.out.println("Error ");
            System.out.println(sqle.getMessage());
        }*/



    }
}