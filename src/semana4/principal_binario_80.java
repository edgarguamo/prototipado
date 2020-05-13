package semana4;

import java.util.stream.IntStream;

public class principal_binario_80 {
    public static void main(String[] args) {
        int[] values = IntStream.range(0,10_000_000).toArray();
       principal_binario_80.calculo(values);
    }
    public static void calculo(int [] values){
        for (var i = 0; i<10_000_000;i++){
            int index = -1;
            for (var j=0;j<values.length;j++){
                if (values[j]==80){
                    index=j;
                }
            }
            System.out.printf("valor posición j = %d",index);
            break;
        }
    }
}