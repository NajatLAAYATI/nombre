
package conversion;

public class ArabicRomanNumerals {

    public static String convert(int nbr) {
        // Définir les valeurs des chiffres romains et leurs correspondances
        StringBuilder result = new StringBuilder();
        int[] values = {50, 10, 9, 5, 4, 1};
        String[] symbols = {"L", "X", "IX", "V", "IV", "I"};

        // Construire le chiffre romain en parcourant les valeurs
        for (int i = 0; i < values.length; i++) {
            while (nbr >= values[i]) {
                result.append(symbols[i]); // Ajouter le symbole correspondant
                nbr -= values[i];          // Réduire le nombre par la valeur ajoutée
            }
        }
        return result.toString();
    }
}