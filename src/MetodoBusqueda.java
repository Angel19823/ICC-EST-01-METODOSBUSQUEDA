
public class MetodoBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBusqueda){
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==valorBusqueda){
                return i;
            }
        }
        long fin = System.currentTimeMillis();
        long total = fin-inicio;
        System.out.println("Total: "+total);
        return -1;
    }

    public int busquedaBinaria(int[] arreglo, int valorBusqueda){
        int inicio = 0;
        int fin = arreglo.length -1;

        while(inicio<=fin){
            int medio = inicio +(fin-inicio)/2;

            if(arreglo[medio] == valorBusqueda){
                return medio;
            }

            if(arreglo[medio]<valorBusqueda){
                inicio = medio+1;
            }else{
                fin = medio -1;
            }
        }
        return -1;
    }

    public void printArreglo(int[] arreglo){
        for (int elemento : arreglo) {
            System.out.print(elemento+", ");
        }
        System.out.println("-");
    }
}
