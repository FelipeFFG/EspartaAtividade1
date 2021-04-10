public class Exer3 {
    private int[] chocolates;
    private int valor = 0;

    public Exer3(int[] value) {
        chocolates = value;
    }

    public boolean Comer(int N, int M) {
        for (int i = 0; i < chocolates.length; i++) {
            if (valor % N == 0) {
                chocolates[i] = 0;
                valor += M;
                Comer(N, M);
                return true;
            } else {
                if (chocolates[valor % N] == 0) {
                    int contador = 0;
                    for (int o = 0; o < chocolates.length; o++) {
                        if (chocolates[o] == 0) {
                            contador += 1;
                        }
                    }
                    System.out.println(contador);
                    return true;
                } else {
                    chocolates[valor%N] = 0;
                    valor += M;
                    Comer(N, M);
                    return true;
                }
            }
        }
        return true;
    }


}
