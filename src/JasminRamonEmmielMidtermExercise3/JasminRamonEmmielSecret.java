package JasminRamonEmmielMidtermExercise3;

import java.util.Random;
import java.lang.Math;

public class JasminRamonEmmielSecret implements Encryptable{
    private String message;
    private boolean encrypted;
    private int xorKey;
    private Random generator;

    public JasminRamonEmmielSecret(String givenMessage){
        this.message = givenMessage;
        encrypted = false;
        generator = new Random();
        xorKey = (char)(generator.nextInt('z' - 'a') + 'a');
    }

    public void encrypt(){
        if (!encrypted){
            String encryptedMessage ="";
            for (int i = 0; i < this.message.length(); i++){
                encryptedMessage = encryptedMessage + Character.toString((char) (this.message.charAt(i) ^ xorKey));
            }
            message = encryptedMessage;
            encrypted = true;
        }

    }

    public String decrypt(){
        if (encrypted) {
            String decryptedMessage = "";
            for (int i=0; i<this.message.length(); i++){
                decryptedMessage = decryptedMessage + Character.toString((char) (this.message.charAt(i) ^ xorKey));
            }
            message = decryptedMessage;
            encrypted = false;
        }

        return message;
    }

    public boolean isEncrypted(){
        return encrypted;
    }

    public String toString(){
        return message;
    }
}
