public class Main
{
    public static void main(String args[])
    {
        int sum = 0, i = 0;

        while(i<=1000) {
            sum += i;
            ++i;
            if(i == 1000) {
                System.out.println(sum);
            }
        }
    }
}
