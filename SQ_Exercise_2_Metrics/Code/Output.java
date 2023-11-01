//After running this code, you will get the output of DoSomething, depending on the selected parameters.
public class Output {
    public static void main(String[] args) {
        DoSomething object = new DoSomething();
        //Change parameters here, if needed.
        int y = object.calculation(2, 4, 6);
        System.out.println("The result is: "+ y);
    }
}