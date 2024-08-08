import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //String[] lines = new String[] {sc.nextLine()};

        String path = "C:\\Users\\rvand\\OneDrive\\CursoUdemy\\Java\\Trabalhando com arquivos\\out.txt";

        //Cria/recria o arquivo: new FileWriter(CAMINHO DO ARQUIVO)
        //Acrescenta ao arquivo existente: new FileWriter(CAMINHO DO ARQUIVO, true)

       /* try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }*/
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}