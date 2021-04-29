package pacote;

import java.util.Arrays;

public class ArraySimples {

    public static void main(String[] args) {

        String[] empresas = {"Google", "Apple", "Microsoft", "Amazon"};
        
        //O comando abaixo serve para mostrar o Array como uma String no console.
        System.out.println(Arrays.toString(empresas));

        //Serve para mostrar no console a posicao da String "Google" no Array.
        int posicao = Arrays.binarySearch(empresas, "Amazon");
        System.out.println(posicao);
        
        Arrays.sort(empresas, 0, empresas.length);
        System.out.println(Arrays.toString(empresas));
        
        Integer[] valores = {1,2};
        System.out.println(Arrays.toString(valores));
        System.out.println(valores[0].intValue());
    
    }

}