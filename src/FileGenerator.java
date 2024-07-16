import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileGenerator {

    public void guardarJson(List<String> lista) {
        try {
            // Abre el archivo 'historial_consultas.txt' para escritura
            FileWriter fileWriter = new FileWriter("FileGenerator.txt");
            for (String resultado : lista) {
                // Escribe cada resultado en el archivo, seguido de una nueva línea
                fileWriter.write(resultado);
                fileWriter.write("\n");
            }
            // Cierra el archivo
            fileWriter.close();
            System.out.println("Historial de consultas guardado en 'FileGenerator.txt'");
        } catch (IOException e) {
            // Maneja cualquier excepción de E/S
            System.out.println("Error al guardar el historial de consultas: " + e.getMessage());
        }
    }
}
