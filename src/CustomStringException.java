public class CustomStringException extends Exception{
    public String message ;
    @Override
    public String toString() {
        return message;
    }

  public CustomStringException(String message ){
        this.message=message;

  }

}
