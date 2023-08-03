package grafos;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        GrafoMatriz grafo = new GrafoMatriz();
        Scanner scanner = new Scanner(System.in);

        // Ingreso dinámico de vértices
        System.out.print("Ingrese la cantidad de vértices: ");
        int numVertices = scanner.nextInt();
        scanner.nextLine(); // Consumimos el salto de línea pendiente

        for (int i = 0; i < numVertices; i++) {
            System.out.print("Ingrese el vértice " + (i + 1) + ": ");
            String nombreVertice = scanner.nextLine();
            grafo.nuevoVertice(nombreVertice);
        }

        // Ingreso dinámico de arcos
        System.out.print("Ingrese la cantidad de arcos que desea agregar: ");
        int numArcos = scanner.nextInt();
        scanner.nextLine(); // Consumimos el salto de línea pendiente

        for (int i = 0; i < numArcos; i++) {
            System.out.print("Ingrese el vértice origen del arco " + (i + 1) + ": ");
            String origen = scanner.nextLine();

            System.out.print("Ingrese el vértice destino del arco " + (i + 1) + ": ");
            String destino = scanner.nextLine();

            try {
                grafo.nuevoArco(origen, destino);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Verificar si dos vértices son adyacentes
        System.out.print("Ingrese el primer vértice a verificar: ");
        String vertice1 = scanner.nextLine();

        System.out.print("Ingrese el segundo vértice a verificar: ");
        String vertice2 = scanner.nextLine();

        try {
            System.out.println(grafo.adyacente(vertice1, vertice2) ? "Si son adyacentes" : "No son adyacentes");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

