import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String expression = "2+1=";
        String operation = riconosciOperazione(expression);
        double[] arrayCalcolatrice = {11.7, 3.2, 3.4, 5, 5};
        int numero = 5;
        System.out.println("Il numero inserito è: " + numero);
        System.out.println("Il numero è pari? = " + controlloDelNumero(numero));
        System.out.println("Numeri inseriti nella calcolatrice: " + Arrays.toString(arrayCalcolatrice));

        // Trasformo la stringa in un array di char
        char[] expressionChars = expression.toCharArray();

        // Leggo e salvo il primo numero
        int num1 = 0;
        int readingPoint = 0;
        for (int i = 0; i < expressionChars.length; i++) {
            if (expressionChars[i] >= '0' && expressionChars[i] <= '9') {
                num1 = num1 * 10 + (expressionChars[i] - 48); // 0 è 48 in ASCII e le altre cifre sono a seguire
            } else {
                readingPoint = i;
                break;
            }
        }
        // Leggo e salvo il secondo numero
        int num2 = 0;
        for (int i = readingPoint + 1; i < expressionChars.length; i++) {
            if (expressionChars[i] >= '0' && expressionChars[i] <= '9') {
                num2 = num2 * 10 + (expressionChars[i] - 48); // 0 è 48 in ASCII e le altre cifre sono a seguire
            } else {
                break;
            }
        }

        // Controllo quale metodo richiamare per l'operazione
        String result = "prova";
        switch (operation.toUpperCase()) {
            case "SOMMA":
                result = addition(num1, num2);
                break;
            case "DIFFERENZA":
                result = sottrazione(num1, num2);
                break;
            case "MOLTIPLICAZIONE":
                result = moltiplicazione(num1, num2);
                break;
            case "DIVISIONE":
                result = divisione(num1, num2);
                break;
            case "POTENZA":
                result = String.valueOf(potenza(num1, num2));
                break;
            case "PARI O DISPARI":
                // Richiamo il metodo per vedere se è pari o dispari
                break;
            default:
                System.out.println("Errore: operazione non riconosciuta");
                break;
        }

        // Stampo il risultato
        System.out.println(expression);
        System.out.println(result);

        // Utilizzo dello switch per dichiarare tutte le possibili operazioni sulla calcolatrice.

        char operatore = '*';
        switch (operatore) {
            case '+':
                System.out.println("Somma dei Numeri: " + somma(arrayCalcolatrice));
                break;
            case '*':
                System.out.println("Moltiplicazione dei numeri: " + moltiplicazione(arrayCalcolatrice));
                break;
            case '/':
                System.out.println("Divisione dei numeri: " + divisione(arrayCalcolatrice));
                break;
            case '-':
                System.out.println("Sottrazione dei numeri: " + sottrazione(arrayCalcolatrice));
        }
    }

    public static String moltiplicazione (int a ,int b){
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
        if(pot == 0){
            res = 1;
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

    public static String riconosciOperazione(String expression){
        // controllo quale operatore contiene
        if(expression.contains("+")){
            return "SOMMA";
        }
        else if(expression.contains("-")){
            return "DIFFERENZA";
        }
        else if(expression.contains("*") || expression.contains("x") || expression.contains("X")){
            return "MOLTIPLICAZIONE";
        }
        else if(expression.contains("/") || expression.contains(":")){
            return "DIVISIONE";
        }
        else if(expression.contains("^") || expression.contains("pow")){
            return "POTENZA";
        }
        else {
            return "NON RICONOSCIUTO";
        }
    }

    // Creazione del metodo della somma di più numeri sulla calcolatrice.
    public static double somma(double[] numeriSomma) {
        double risultato = 0;
        for (int i = 0; i < numeriSomma.length; i++) {
            risultato = risultato + numeriSomma[i];
        }
        return risultato;
    }

    // Creazione del metodo della moltplicazione di più numeri sulla calcolatrice.
    public static double moltiplicazione(double[] numeriMoltiplicazione) {
        double risultato = 1;
        for (int i = 0; i < numeriMoltiplicazione.length; i++) {
            risultato = risultato * numeriMoltiplicazione[i];
        }
        return risultato;
    }

    // Creazione del metodo della divisione di più numeri sulla calcolatrice.
    public static double divisione(double[] numeriDivisione) {

        double result = numeriDivisione[0];
        for (int i = 1; i < numeriDivisione.length; i++) {
            if (numeriDivisione[i] == 0) {
                System.out.print("Errore: presente uno zero, risultato ottenuto fino allo zero è, ");
                break;
            } else result /= numeriDivisione[i];
        }
        return result;
    }

    // Creazione del metodo della sottrazione di più numeri sulla calcolatrice.
    public static double sottrazione(double[] numeriSottrazione) {
        double risultato = 0;
        for (int i = 0; i < numeriSottrazione.length; i++) {
            risultato = risultato - numeriSottrazione[i];
        }
        return risultato;
    }

    //Creazione del metodo per controllo di un numero che sia pari o dispari
    public static boolean controlloDelNumero(int numero) {
        return (numero % 2 == 0);
    }
}
