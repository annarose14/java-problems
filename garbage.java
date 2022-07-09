public class garbage {
   
public static void main(String[] args) {
    garbage g1= new garbage();
    g1=null;
    System.gc();
}
public void finalize()
{System.out.println("object is garbage collected");
}
    
}
