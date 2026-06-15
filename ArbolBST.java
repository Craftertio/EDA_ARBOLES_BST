import java.util.ArrayList;
import java.util.List;

public class ArbolBST {
    private Nodo raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    // Insertar (recursivo)
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);
        if (valor < nodo.valor) nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        else if (valor > nodo.valor) nodo.derecho = insertarRec(nodo.derecho, valor);
        // si es igual, no se inserta
        return nodo;
    }

    // Buscar con conteo y registro de visitas
    public boolean buscar(int valor) {
        List<Integer> visitados = new ArrayList<>();
        int comparaciones = 0;
        Nodo actual = raiz;

        while (actual != null) {
            comparaciones++;
            visitados.add(actual.valor);
            if (actual.valor == valor) {
                System.out.println("Visitados: " + visitados);
                System.out.println("Comparaciones: " + comparaciones);
                System.out.println("Resultado: Encontrado");
                return true;
            } else if (valor < actual.valor) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }
        System.out.println("Visitados: " + visitados);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Resultado: No encontrado");
        return false;
    }

    // Eliminar (recursivo)
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo nodo, int valor) {
        if (nodo == null) return null;
        if (valor < nodo.valor) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = eliminarRec(nodo.derecho, valor);
        } else {
            // Caso 1: hoja
            if (nodo.izquierdo == null && nodo.derecho == null) return null;
            // Caso 2: solo hijo izquierdo
            if (nodo.derecho == null) return nodo.izquierdo;
            // Caso 2: solo hijo derecho
            if (nodo.izquierdo == null) return nodo.derecho;
            // Caso 3: dos hijos -> sucesor inorden
            Nodo sucesor = encontrarMin(nodo.derecho);
            nodo.valor = sucesor.valor;
            nodo.derecho = eliminarRec(nodo.derecho, sucesor.valor);
        }
        return nodo;
    }

    private Nodo encontrarMin(Nodo nodo) {
        while (nodo.izquierdo != null) nodo = nodo.izquierdo;
        return nodo;
    }

    // Recorridos
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRec(nodo.derecho);
        }
    }

    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preordenRec(nodo.izquierdo);
            preordenRec(nodo.derecho);
        }
    }

    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo);
            postordenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Nodo nodo) {
        if (nodo == null) return -1;
        return 1 + Math.max(alturaRec(nodo.izquierdo), alturaRec(nodo.derecho));
    }
}