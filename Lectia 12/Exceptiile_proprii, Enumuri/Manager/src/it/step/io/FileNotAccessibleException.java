package it.step.io;

import java.security.PublicKey;

public class FileNotAccessibleException extends Exception {
    public FileNotAccessibleException(String message){
        super(message);
    }

}
