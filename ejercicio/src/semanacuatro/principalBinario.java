package semanacuatro;

import java.util.stream.IntStream;

public class principalbinario {
    public static void main(String[] args) {
        int[] values = IntStream.range(0,10_000_000).toArray();
        int index=0;
        for (var j : values){
            if(j==80) index= j;
        }
        System.out.println("Valor encontrado en ka posición "+index);
    }

}