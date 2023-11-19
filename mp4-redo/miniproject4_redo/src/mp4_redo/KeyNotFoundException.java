package mp4_redo;

/**
 * Author: Livia Stein Freitas
 * Creates an exception when a key is not found.
 */
public class KeyNotFoundException extends Exception{
  public KeyNotFoundException(String message){
    super(message);
  }
}
