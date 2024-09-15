package tasks;

public class Wrapper extends Copy {
private Character alphabet = 's'; // autoboxing because it changes primitive type character into wrapper class character


    public Wrapper(int num ,int[] arr){

        super(num,arr);
    
}

    public void displayWrapper(){
        System.out.println("protected variable num inherited from the copy class "+num); // num is a protected variable which is accessible inside the package
        System.out.println("Character wrapper class" + alphabet.toUpperCase(0));
        char alphabetDown = alphabet; //unboxing wrapper class to primitve type
        System.out.println("the chaacter wrapper class" + alphabetDown);
    }

}
