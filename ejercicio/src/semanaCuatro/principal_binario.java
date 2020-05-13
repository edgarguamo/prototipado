package semanaCuatro;

import java.util.stream.IntStream;

public class principal_binario {
    public static void main(String[] args) {
        int[] values = IntStream.range(0,10_000_000).toArray();
       principal_binario.calculo(values);
    }
    public static void calculo(int [] values){
        for (var i = 0; i<10_000_000;i++){
            int index = -1;
            for (var j=0;j<values.length;j++){
                index+=(j==80) ? 1:0;
            }
            System.out.printf("valor posición j = %d",index);
        }
    }
}