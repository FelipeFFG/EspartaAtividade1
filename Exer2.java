public class Exer2 {
    private int[] array;
    private int param = 0;
    private int[] repetidos;
    private int[] trocados;
    private int cont = 0;

    public Exer2(int[] valores) {
        array = valores;
        repetidos = array.clone();
        trocados = new int[valores.length];
        for (int i = 0; i < trocados.length; i++) {
            trocados[i] = 99999999;
        }
    }


    public boolean compare() {
        if (param == array.length) {
            for (int i = 0; i < trocados.length; i++) {
                if (trocados[i] != 99999999) {
                    cont += 1;
                }
            }
            System.out.println(cont);
            return true;
        }
        if (array[param] != 99999999) {
            for (int i = 0; i < array.length; i++) {
                if (repetidos[param] == array[i]) {
                    trocados[param] = array[i];
                    array[i] = 99999999;
                }
            }
        }
        param += 1;
        compare();
        return true;
    }
}
