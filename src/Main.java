public class Main {
    public static void main(String[] args) {


        double[] arrayCalcolatrice = {11.7, 3.2, 3.4, 5, 5};
        int numero = 5;
        System.out.println("Il numero inserito è: " + numero);
        System.out.println("Il numero è pari? = " + controlloDelNumero(numero));
        System.out.println("Numeri inseriti nella calcolatrice: " + Arrays.toString(arrayCalcolatrice));


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
