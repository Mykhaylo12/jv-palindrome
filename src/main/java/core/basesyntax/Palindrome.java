package core.basesyntax;

public class Palindrome {

    /** <p>Пример: Madam, I'm Adam!</p>
     * * <p>Результат: true</p>
     */
    public boolean isPalindrome(String text) {
        String polindrom = text.replaceAll("[^\\w]+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(polindrom);
        String polindromReverse = new String(sb.reverse());
        return polindromReverse.equals(polindrom);
    }
}
