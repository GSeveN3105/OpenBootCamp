public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        miCoche.AddPuertas();
        miCoche.AddPuertas();
        System.out.println(miCoche.puertas);


    }

    {
        int result;
        result = suma(2,4,6);
        System.out.println(result);
    }
    public static int suma(int a, int b, int c) {
        return a+b+c;

    }
}

class Coche {
    public int puertas = 0;
    public void AddPuertas() {
        this.puertas++;
    }



}