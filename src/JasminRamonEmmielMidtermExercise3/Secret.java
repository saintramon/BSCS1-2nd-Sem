package JasminRamonEmmielMidtermExercise3;

import java.lang.*;
import java.util.Random;

public class Secret implements Encryptable{
    private String message;
    private boolean encrypted;
    private int shift;
    private Random generator;

    public Secret(String givenMessage){
        this.message = givenMessage;
        encrypted = false;
        generator = new Random();
        shift = generator.nextInt(10) + 5;
    }

    public void encrypt(){
        if (!encrypted){
            String encryptedMessage ="";
            for (int i = 0; i < this.message.length(); i++){
                encryptedMessage = encryptedMessage + (char) (message.charAt(i)+shift);
            }
            message = encryptedMessage;
            encrypted = true;
        }

    }

    public String decrypt(){
        if (encrypted) {
            String decryptedMessage = "";
            for (int i=0; i<this.message.length(); i++){
                decryptedMessage = decryptedMessage + (char) (message.charAt(i)-shift);
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
