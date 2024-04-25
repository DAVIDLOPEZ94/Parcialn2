public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean esObservable;

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public boolean isEsObservable() {
        return esObservable;
    }

    // Método para calcular la densidad del planeta
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Método para imprimir los valores de los atributos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia al sol: " + distanciaAlSol);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Densidad: " + calcularDensidad());
    }

    public static void main(String[] args) {
        // Crear objetos
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta p2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        // Imprimir datos de los planetas
        System.out.println("Planeta 1:");
        p1.imprimirDatos();

        System.out.println("\nPlaneta 2:");
        p2.imprimirDatos();
    }
}
