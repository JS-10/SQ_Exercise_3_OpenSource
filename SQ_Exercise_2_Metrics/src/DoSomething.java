//Exercise 2 - Task 1 - Java file
public class DoSomething {
    //Calculates something. Main focus lies on the code itself and the use of branches, which were required for the previous exercise.
    public int calculation(int a, int b, int c){
        //Create the sum out of all parameters
        int x = a + b + c;
        while(x < 20){
            if(b < c){
                if(c < a){
                    //If c is larger than b and lower than a, then increase value of b by 1.
                    b += 1;
                }else{
                    //If c is larger than b, but not lower than a, then increase value of b by 5.
                    b += 5;
                }
            }else{
                //If c is not larger than b, then increase the value of x (the sum of all parameters) by 3.
                x += 3;
            }
        }
        return x;
    }
}
