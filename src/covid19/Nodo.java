
package covid19;

public class Nodo {
    private Paciente paciente;

    private Nodo siguiente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente valor) {
        this.paciente = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  
}
