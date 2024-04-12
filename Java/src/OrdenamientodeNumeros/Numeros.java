package OrdenamientodeNúmeros;

public class Numeros {
    private String cadenaNumeros;
    private final int matriz[] = new int[50];
    private int y;

    public void setNumeros(String n) {
        this.cadenaNumeros = n;
        ConvertirEnMatriz();
    }

    public void ConvertirEnMatriz() {
        String[] numerosSeparados = cadenaNumeros.split(" ");
        y = numerosSeparados.length;
        for (int i = 0; i < y; i++) {
            matriz[i] = Integer.parseInt(numerosSeparados[i]);
        }
        OrdenarMatriz();
    }

    public void OrdenarMatriz() {
        for (int i = 0; i < y - 1; i++) {
            for (int j = 0; j < y - i - 1; j++) {
                if (matriz[j] > matriz[j + 1]) {
                    int temp = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = temp;
                }
            }
        }
        getMatriz();
    }

    public void getMatriz() {
        for (int i = 0; i < y; i++) {
            System.out.println(matriz[i]);
        }
    }
}

