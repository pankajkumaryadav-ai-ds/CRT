//Overloading in Java
//Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both. Overloading is related to compile-time (or static) polymorphism.
public class Sum{
    public int sum(int x,int y){
        return(x+y);
    }
    public int sum(int x,int y,int z){
        return(x+y+z);
    }
    public double sum(double x,double y){
        return(x+y);
    }
    
    public static void main(String args[]){
        Sum s=new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5,20.5));
    }
}
