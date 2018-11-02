import java.util.Scanner;

public class Main {

    static int sumaCifara(int n)
    {
        int suma = 0;
        while(n > 0)
        {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        Scanner citac = new Scanner(System.in);
        n = citac.nextInt();
        citac.close();
        for(int i = 1; i <= n; i++)
            if(i % sumaCifara(i) == 0) System.out.print(i + " ");
    }
}
