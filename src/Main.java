public class Main {

    public static void main(String[] args) {

    } public static String moltiplicazione (int a ,int b){
    String result;

    result = "risultato: " + a * b;
        return result;
    }

    public static int potenza(int num, int pot){

        int res = num;
        for(int i=1; i<pot; i++){
            res = res * num;
        }
        return res;
    }

}
