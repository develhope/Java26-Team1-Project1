public class Main {
    public static void main(String[] args) {



    } public static String moltiplicazione (int a ,int b){
    String result;

    result = "risultato: " + a * b;
        return result;
    }
    public static String sottrazione(int a, int b){
        String result;
        result = "" + (a - b);
        return result;
    }


    public static int potenza(int num, int pot){

        int res = num;
        for(int i=1; i<pot; i++){
            res = res * num;
        }
        return res;

    }
    // method to calculate the addition of two integers
    public static String addition(int a, int b){
        String result;
        result = "" + (a + b);
        return result;
    }
    public static String divisione (int a ,int b){
        String result;

        result = "risultato: " + a / b + " resto: " + a % b;
        return result;
    }
}
