import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();
        
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i]= i+1;
        }
        metodoBusqueda.printArreglo(arr);

        //int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //metodoBusqueda.printArreglo(arr);
        System.out.println("Ingrese el numero a buscar");
        int bus = teclado.nextInt();
        int posicion = metodoBusqueda.busquedaSecuencial(arr, bus);
        if(posicion != -1){
            System.out.println("El valor se encuentra en la posicion: "+posicion);
        }else{
            System.out.println("Valor no encontrado");
        }

        
    }
}
