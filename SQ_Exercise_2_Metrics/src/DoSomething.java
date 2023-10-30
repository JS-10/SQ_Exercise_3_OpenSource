//Exercise 2 - Task 1 - Java file
public class DoSomething {
    public int calculation(int a, int b, int c){
        int x = a + b + c;
        while(x < 20){
            if(b < c){
                if(c < a){
                    b += 1;
                }else{
                    b += 5;
                }
            }else{
                x += 3;
            }
        }
        return x;
    }
}
