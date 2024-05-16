public class Main {

    public static void main(String[] args) {
        String expression = "1+2=";

        String operation = "SOMMA"; // Dovrebbe richiamare il metodo che riconosce l'operazione

        // Trasformo la stringa in un array di char
        char[] expressionChars = expression.toCharArray();

        // Leggo e salvo il primo numero
        int num1 = 0;
        int readingPoint = 0;
        for(int i = 0; i< expressionChars.length; i++){
            if (expressionChars[i] >= '0' && expressionChars[i] <= '9') {
               num1 = num1 * 10 + (expressionChars[i] - 48); // 0 è 48 in ASCII e le altre cifre sono a seguire
            }
            else {
                readingPoint = i;
                break;
            }
        }
        // Leggo e salvo il secondo numero
        int num2 = 0;
        for(int i = readingPoint + 1; i< expressionChars.length; i++){
            if (expressionChars[i] >= '0' && expressionChars[i] <= '9') {
                num2 = num2 * 10 + (expressionChars[i] - 48); // 0 è 48 in ASCII e le altre cifre sono a seguire
            }
            else {
                break;
            }
        }

    }

}
