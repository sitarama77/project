

public class Sample {

    public static void main(String[] args) {

        

        System.out.print("Enter a number: ");
        int num = nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
