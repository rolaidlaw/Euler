/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class Problem5 {
    Problem5(){

    }
    public int findSmallest()
    {
        int a = 2*3*5*7*11*13*17*19;
        for(int i = 4;i<=20;i++)
        {
            if(a%i!=0)
            {
                //increment by all primes between 1 and 20
                a+=2*3*5*7*11*13*17*19;
                i=4;
            }
            if(a%i==0 && i==20)
            {
                return a;
            }
        }
        return 0;
    }
}
