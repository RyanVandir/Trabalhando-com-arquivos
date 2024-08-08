import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[] {sc.nextLine()};

        String path = "C:\\Users\\rvand\\OneDrive\\CursoUdemy\\Java\\Trabalhando com arquivos\\out.txt";

        //Cria/recria o arquivo: new FileWriter(CAMINHO DO ARQUIVO)
        //Acrescenta ao arquivo existente: new FileWriter(CAMINHO DO ARQUIVO, true)

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}