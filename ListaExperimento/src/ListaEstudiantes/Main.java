package ListaEstudiantes;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//       m.Sart();
        //new Menu().Start();
        System.out.println("digite el nombre a abuscar: ");
        
        new ConectionSql().Campo1("ac","operador","jesus","paye",2);
    
    }
}
