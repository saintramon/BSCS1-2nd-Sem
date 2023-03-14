package JasminRamonEmmielMidtermExercise3;

public class SecretTest {
    public static void main(String[] args) {
        JasminRamonEmmielSecret sample = new JasminRamonEmmielSecret("Minekaniko ni Moniko ang makina ni monika");

        System.out.print("Message to be encrypted: ");
        System.out.println(sample.toString());
        sample.encrypt(); /*Encrypt by invoking the encrypt method*/

        System.out.print("Encrypted Message: ");
        System.out.println(sample.toString());
        System.out.print("Result of Decryption: ");
        sample = new JasminRamonEmmielSecret(sample.decrypt()); /*Decrypt by invoking the decrypt method*/
        System.out.println(sample.toString());

        System.exit(0);
    }
}
