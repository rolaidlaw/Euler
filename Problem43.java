import java.lang.reflect.Array;
import java.util.ArrayList;
public class Problem43 {
    public Problem43(){

    }
    public ArrayList<Long> sumOfAllPandigitalNumsWithSubStringDivisibility(){
        Problem27 problem27 = new Problem27();
        ArrayList<Long> panNums = new ArrayList<Long>();
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                if(b==a){
                    continue;
                }
                for(int c=0;c<10;c++){
                    if(c==b || c==a){
                        continue;
                    }
                    for(int d=0;d<10;d++){
                        if(d==c || d==b || d==a){
                            continue;
                        }
                        for(int e=0;e<10;e++){
                            if(e==d || e==c || e==b || e==a){
                                continue;
                            }
                            for(int f=0;f<10;f++){
                                if(f==e || f==d || f==c || f==b || f==a){
                                    continue;
                                }
                                for(int g=0;g<10;g++){
                                    if(g==f || g==e || g==d || g==c || g==b || g==a || !problem27.isPrime(Long.parseLong(""+a+b+c+d+e+f+g))){
                                        continue;
                                    }
                                    panNums.add(Long.parseLong(""+a+b+c+d+e+f+g));
                                    for(int h=0;h<10;h++){
                                        if(h==g || h==f || h==e || h==d || h==c || h==b || h==a || !problem27.isPrime(Long.parseLong(""+a+b+c+d+e+f+g+h))){
                                            continue;
                                        }
                                        panNums.add(Long.parseLong(""+a+b+c+d+e+f+g+h));
                                        for(int i=0;i<10;i++){
                                            if(i==h || i==g || i==f || i==e || i==d || i==c || i==b || i==a || !problem27.isPrime(Long.parseLong(""+a+b+c+d+e+f+g+h+i))){
                                                continue;
                                            }
                                            panNums.add(Long.parseLong(""+a+b+c+d+e+f+g+h+i));
                                            for(int j=0;j<10;j++){
                                                if(j==i || j==h || j==g || j==f || j==e || j==d || j==c || j==b || j==a || !problem27.isPrime(Long.parseLong(""+a+b+c+d+e+f+g+h+i+j))){
                                                    continue;
                                                }
                                                panNums.add(Long.parseLong(""+a+b+c+d+e+f+g+h+i+j));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        return panNums;
    }
    public int sumOfLongArray(ArrayList<Long> nums){
        int sum=0;
        for (int i=0;i<nums.size();i++) {
            sum+=nums.get(i);
        }
        return sum;
    }
}
