package tasmaneger;

public    class ExceptionHandler{
    public  static  void handler(Exception e ){
        System.out.println("Wart proble cod  "+e.getMessage()+" "+e.getCause()+" "+e.getStackTrace());
    }
}
