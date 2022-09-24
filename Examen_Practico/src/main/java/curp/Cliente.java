package curp;


import com.mysql.cj.protocol.Resultset;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws MalformedURLException {
        String url = "jdbc:mysql://localhost:3306/curp?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from CURP");

            while(resultSet.next()){
                System.out.println(resultSet.getString("ID" + " / "+ resultSet.getString("Nombre")+ " / "+ resultSet.getString("Apellido_paterno" + " / " + resultSet.getString("Apellido_materno"))));

                connection.close();
                statement.close();
                resultSet.close();
            }

        }catch(SQLException e){
            e.printStackTrace();

        }

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:3306"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner input = new Scanner (System.in);

        System.out.println("Ingresa su primer nombre");
        String nombre = input.next();
        String sub3 = nombre.substring(0,1);


        System.out.println("Ingresa su apellido paterno");
        String apellido_paterno = input.next();
        String sub1 = apellido_paterno.substring(0,2);


        System.out.println("Ingresa su apellido materno");
        String apellido_materno = input.next();
        String sub2 = apellido_materno.substring(0,1);


        System.out.println("Ingresa su sexo (H/M)");
        String sexo = input.next();

        System.out.println("Ingresa la abreviatura de tu estado (Ej. GR, HG, JC, MC)");
        String estado = input.next();


        System.out.println("Ingresa su fecha de nacimiento (dd/mm/yyyy)");
        System.out.println("Ingresa el dia");
        String dia = input.next();

        System.out.println("Ingresa el mes");
        String mes = input.next();

        System.out.println("Ingresa el año (Solo los ultimos dos digitos)");
        String anio = input.next();

        //Cadenas (nombre, apellido paterno y materno)
        //Nombre
        String nombrecon = nombre.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");
        String consnom = nombrecon.substring(1,2);


        String apellidopcon = apellido_paterno.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");
        String consapellidop = apellidopcon.substring(1,2);


        String apellidomcon = apellido_materno.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");
        String consapellidom = apellidomcon.substring(1,2);


        int num_random1 = (int)(Math.random()*10+1);
        int num_random2 = (int)(Math.random()*10+1);

        System.out.println("El curp es: " + sub1.toUpperCase()+sub2+sub3+anio+mes+dia+sexo.toUpperCase()+estado.toUpperCase()+consapellidop.toUpperCase()+consapellidom.toUpperCase()+consnom.toUpperCase()+num_random1+num_random2);

    }
}