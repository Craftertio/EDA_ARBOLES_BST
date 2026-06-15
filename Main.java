import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cedula;

        // Validación de cédula
        while (true) {
            System.out.print("Ingrese su cédula (10 dígitos): ");
            cedula = sc.nextLine();
            if (cedula.matches("\\d{10}")) break;
            System.out.println("Error: Debe tener exactamente 10 dígitos numéricos.");
        }

        int[] digitos = new int[10];
        for (int i = 0; i < 10; i++) {
            digitos[i] = Integer.parseInt(cedula.substring(i, i+1));
        }

        int[] valores = new int[10];
        System.out.println("\nTabla de valores generados:");
        for (int i = 0; i < 10; i++) {
            valores[i] = digitos[i] * 10 + (i+1);
            System.out.println("V" + (i+1) + " = " + digitos[i] + " * 10 + " + (i+1) + " = " + valores[i]);
        }

        ArbolBST arbol = new ArbolBST();
        System.out.println("\nConstruyendo árbol (inserciones en orden V1 a V10):");
        for (int i = 0; i < 10; i++) {
            arbol.insertar(valores[i]);
            System.out.print("Después de insertar V" + (i+1) + ": ");
            arbol.inorden();
        }

        // Búsquedas requeridas
        System.out.println("\n--- Búsqueda de V7 ---");
        arbol.buscar(valores[6]);
        System.out.println("\n--- Búsqueda de V10 ---");
        arbol.buscar(valores[9]);
        System.out.println("\n--- Búsqueda de 105 ---");
        arbol.buscar(105);

        // Nuevas inserciones
        int A = 111 + digitos[8];
        int B = 122 + digitos[9];
        System.out.println("\nInsertando A = " + A);
        arbol.insertar(A);
        System.out.print("Inorden actual: ");
        arbol.inorden();
        System.out.println("\nInsertando B = " + B);
        arbol.insertar(B);
        System.out.print("Inorden actual: ");
        arbol.inorden();

        // Eliminaciones según los tres casos
        System.out.println("\n--- Eliminación hoja: eliminar 15 ---");
        arbol.eliminar(15);
        System.out.print("Inorden después de eliminar hoja: ");
        arbol.inorden();

        System.out.println("\n--- Eliminación con un hijo: eliminar 98 ---");
        arbol.eliminar(98);
        System.out.print("Inorden después: ");
        arbol.inorden();

        System.out.println("\n--- Eliminación de raíz con dos hijos: eliminar 72 ---");
        System.out.println("Sucesor en orden utilizado: 66");
        arbol.eliminar(72);
        System.out.print("Inorden después: ");
        arbol.inorden();

        sc.close();
    }
}