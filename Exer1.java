public class Exer1 {
    private int[] array;
    private int[] upair_pivot;
    private int param = 0;

    public Exer1(int[] value) {
        array = value;
        upair_pivot = array.clone();
    }

    public boolean unpair() {
        if (param >= array.length) {
            for (int i = 0; i < upair_pivot.length; i++) {
                if (upair_pivot[i] == 0) {
                } else {
                    System.out.println(upair_pivot[i]);
                }
            }
            return true;
        } else {
            for (int i = param + 1; i < array.length; i++) {
                if (upair_pivot[param] == 0) {
                    param += 1;
                    unpair();
                    return true;
                } else if (array[param] == array[i]) {
                    upair_pivot[i] = 0;
                    upair_pivot[param] = 0;
                    param += 1;
                    unpair();
                    return true;
                }
            }
        }
        param += 1;
        if (param <= array.length) {
              unpair();
        }
        return true;
    }
}
