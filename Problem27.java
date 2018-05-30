/*
Euler discovered the remarkable quadratic formula:

n2+n+41
It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39. However, when n=40,402+40+41=40(40+1)+41 is divisible by 41, and certainly when n=41,412+41+41 is clearly divisible by 41.

The incredible formula n2−79n+1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79. The product of the coefficients, −79 and 1601, is −126479.

Considering quadratics of the form:

n2+an+b, where |a|<1000 and |b|≤1000

where |n| is the modulus/absolute value of n
e.g. |11|=11 and |−4|=4
Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n=0.
 */
//Code starts here
import java.util.ArrayList;
import java.util.Collections;

public class Problem27 {
        private int a;
        private int b;
        //Constructor using the example outlined in the problem
        public Problem27(){
            a=1;
            b=41;
        }
        public boolean isPrime(double n){
            if(n<2) return false;
            if(n==2) return true;
            if (n%2==0) return false;
            for(int i=3;i*i<=n;i+=2) {
                if(n%i==0)
                    return false;
            }
            return true;
        }
        public int numOfPrimeN(int a,int b){
            int n=0;
            while(isPrime(n*n+a*n+b)) {
                n++;
            }
            return n;
        }
        public ArrayList<Integer> allValues(){
            ArrayList<Integer> myValues = new ArrayList<Integer>();
            for(int a=-999;a<1000;a++){
                for(int b=-1000;b<=1000;b++){
                    myValues.add(numOfPrimeN(a,b));
                }
            }
            return myValues;
        }
        public int maxOfArrayList(ArrayList<Integer> nums){
            return Collections.max(nums);
        }
        public String maxA_AndBValues(int maxVal){
            String string = "";
            for(int a=-999;a<1000;a++){
                for(int b=-1000;b<=1000;b++){
                    if (maxVal==numOfPrimeN(a,b)){
                        string+="A: "+a+" and B: "+b;
                    }
                }
            }
            return string;
        }
        public String allMethodsTogether(){
            return maxA_AndBValues(maxOfArrayList(allValues()));
        }


    }

