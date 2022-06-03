public class Gasto {

    public String concepto;
    public float importe;

    public Gasto(String concepto, float importe){
        this.concepto = concepto;
        this.importe = importe;
    }

    String getName(){
        return concepto;
    }

    float getImporte() {
        return importe;
    }
}
