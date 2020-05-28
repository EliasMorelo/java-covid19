package covid19;

import javax.swing.JOptionPane;

public class ListaSimple {

    private Nodo inicio;
    private int tam;
    public boolean estaVacia() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int tamLista() {
        return tam;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void registrarPaciente(int id) {
        Paciente paciente = new Paciente();
        paciente.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del paciente"));
        paciente.setId(id);
            paciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente")));
            paciente.setDepartamento(JOptionPane.showInputDialog("Ingrese el departamento de procedencia del caso"));
            paciente.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad de procedencia del caso"));
            paciente.setCausa(JOptionPane.showInputDialog("Ingrese la causa del contagio\n"
                    + "Importado" + "\n"
                    + "Relacionado" + "\n"
                    + "En estudio"));
            paciente.setManejo(JOptionPane.showInputDialog("Ingrese el manejo que se le está dando al paciente\n"
                    + "Casa" + "\n"
                    + "Hospital" + "\n"
                    + "UCI"));
            Nodo nuevo = new Nodo();
            nuevo.setPaciente(paciente);
            if (estaVacia()) {
                inicio = nuevo;

                JOptionPane.showMessageDialog(null, "Caso registrado correctamente");
            } else {
                Nodo aux = inicio;
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(nuevo);
                JOptionPane.showMessageDialog(null, "Caso registrado correctamente");
            }
            tam++;
    }


    public void registrarMuerte(Nodo temp) {
        if (estaVacia()) {
            inicio = temp;
            JOptionPane.showMessageDialog(null, "Caso de muerte registrado correctamente");
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temp);
            JOptionPane.showMessageDialog(null, "Caso de muerte registrado correctamente");
        }
        tam++;
    }

    public void registrarRecuperado(Nodo temp) {
        if (estaVacia()) {
            inicio = temp;
            JOptionPane.showMessageDialog(null, "Caso de recuperación registrado correctamente");
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(temp);
            JOptionPane.showMessageDialog(null, "Caso de recuperación registrado correctamente");
        }
        tam++;
    }

    public Nodo buscarPaciente(int id) {
        Nodo temp = inicio;
        boolean bandera = false;
        while (temp != null && bandera != true) {
            if (temp.getPaciente().getId() == id) {
                bandera = true;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public void eliminarPaciente(int id) {
        if (buscarPaciente(id) != null) {
            if (inicio.getPaciente().getId() == id) {
                inicio = inicio.getSiguiente();
            } else {
                boolean bandera = true;
                Nodo aux = inicio;
                while (bandera) {
                    if (aux.getSiguiente().getPaciente().getId() == id) {
                        break;
                    } else {
                        aux = aux.getSiguiente();
                    }
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tam--;
        } else {
            JOptionPane.showMessageDialog(null, "El paciente con identificación " + id + " no está en la lista");
        }
    }

    public String mostrarlista() {
        String datos = "";
        if (!estaVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                datos += "Paciente " + (i + 1) + "\n"
                        + "Nombre del paciente: " + aux.getPaciente().getNombre() + "\n"
                        + "Identificación: " + aux.getPaciente().getId() + "\n"
                        + "Edad: " + aux.getPaciente().getEdad() + "\n"
                        + "Deparamento de procedencia del caso: " + aux.getPaciente().getDepartamento() + "\n"
                        + "Ciudad de procedencia del caso: " + aux.getPaciente().getCiudad() + "\n"
                        + "Causa del contagio: " + aux.getPaciente().getCausa() + "\n"
                        + "Manejo del contagio: " + aux.getPaciente().getManejo() + "\n\n\n";
                aux = aux.getSiguiente();
                i++;
            }
        }
        return datos;
    }
    

    public String mostrarlistaMuertes() {
        String datos = "";
        if (!estaVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                datos += "Muerte" + (i + 1) + "\n"
                        + "Nombre del paciente: " + aux.getPaciente().getNombre() + "\n"
                        + "Identificación: " + aux.getPaciente().getId() + "\n"
                        + "Edad: " + aux.getPaciente().getEdad() + "\n"
                        + "Deparamento de procedencia del caso: " + aux.getPaciente().getDepartamento() + "\n"
                        + "Ciudad de procedencia del caso: " + aux.getPaciente().getCiudad() + "\n"
                        + "Causa del contagio: " + aux.getPaciente().getCausa() + "\n"
                        + "Manejo del contagio: " + aux.getPaciente().getManejo() + "\n";
                aux = aux.getSiguiente();
                i++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
        return datos;
    }

    public String mostrarlistaRecuperados() {
        String datos = "";
        if (!estaVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                datos += "Recuperado" + (i + 1) + "\n"
                        + "Nombre del paciente: " + aux.getPaciente().getNombre() + "\n"
                        + "Identificación: " + aux.getPaciente().getId() + "\n"
                        + "Edad: " + aux.getPaciente().getEdad() + "\n"
                        + "Deparamento de procedencia del caso: " + aux.getPaciente().getDepartamento() + "\n"
                        + "Ciudad de procedencia del caso: " + aux.getPaciente().getCiudad() + "\n"
                        + "Causa del contagio: " + aux.getPaciente().getCausa() + "\n"
                        + "Manejo del contagio: " + aux.getPaciente().getManejo() + "\n";
                aux = aux.getSiguiente();
                i++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
        return datos;
    }

    public void eliminarTodos() {
        inicio = null;
        tam = 0;
    }
}
