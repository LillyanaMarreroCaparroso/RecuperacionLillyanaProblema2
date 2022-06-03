import java.util.ArrayList;

public class Libro {

    private float suma = 0;
    ArrayList <Gasto> pila = new ArrayList<Gasto>();

    public void push(Gasto element) {
        pila.add(0, element);
    }

    public Gasto pop() {
        return pila.remove(0);
    }

    public void verLista() {
        for(int i = 0; i < pila.size(); i++) {
            System.out.println("Concepto: " + pila.get(i).getName() + "\n" + "Importe: " + pila.get(i).getImporte());
        }
    }

    public float sumarGastos() {
        for(int i = 0; i < pila.size(); i++) {
            suma += pila.get(i).getImporte();
        }
        return suma;
    }

}
