import tasks.*;

public class Main {
public static void main(String[] args){
int[] nums = {2,3,4,5};
    Copy c1 = new Copy(2,nums);
Copy c2 = c1; //shallow copy only copying reference of the object
System.out.println(c2.equals(c1)); // true because object variable referencing to same object
Copy c3 = new Copy(c1); // deep copy using copy constructor
    System.out.println(c3.equals(c1));//false because newly object is created and values are copied into it






}

}
