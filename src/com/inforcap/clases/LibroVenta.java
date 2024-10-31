package com.inforcap.clases;

import java.io.*;

public class LibroVenta {

    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(){}

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo){
        try{
            File directorio = new File("src/ficheros");
            if (!directorio.exists()){
                directorio.mkdir();
                File archivo = new File(directorio, nombreVenta);
                archivo.createNewFile();
                int fecha = Integer.parseInt(fechaVenta);
                System.out.println(fecha);

                FileWriter fileWriter = new FileWriter(archivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter writer = new PrintWriter(bufferedWriter);

                writer.print(vehiculo.getPatente());
                writer.print(";");
                writer.print(cliente.getEdad());
                writer.print(";");
                writer.print(fecha);

                //bufferedWriter.write(vehiculo.getPatente());
                //bufferedWriter.write(",");
                //bufferedWriter.write(String.valueOf(cliente.getEdad()));
                //bufferedWriter.write(",");
                //bufferedWriter.write(String.valueOf(fecha));
                //bufferedWriter.write(",");
                //bufferedWriter.write(nombreVenta);

                writer.close();
                bufferedWriter.close();
                fileWriter.close();

            }
            else{
                File archivo = new File(directorio, nombreVenta);
                archivo.createNewFile();
                int fecha = Integer.parseInt(fechaVenta);
                System.out.println(fecha);

                FileWriter fileWriter = new FileWriter(archivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter writer = new PrintWriter(bufferedWriter);

                writer.print(vehiculo.getPatente());
                writer.print(";");
                writer.print(cliente.getEdad());
                writer.print(";");
                writer.print(fecha);

                writer.close();
                bufferedWriter.close();
                fileWriter.close();

            }
        }
        catch (IOException e){
            System.out.println("Se ha producido un error al crear el archivo");
        }
        catch (NumberFormatException e){
            throw new NumberFormatException(e.getMessage());
        }

    }


}
