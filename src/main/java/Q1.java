
public class Q1 {
    
    boolean sol1has3(int num){
        
        return String.valueOf(num).contains("3");
        
    }
    //log10(n)
    boolean sol2has3(int num){
        
        while(num>2){
            if(num%10==3) {
                return true;
            }
            else{
                num = num / 10;
            }   
        }
        return false;
        
    }
    
    boolean isprime(int num){
        
        for(int i =2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //runs sqrt of n
    boolean sol2isprime(int num){
        
        for(int i =2; i<=num/i; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //n*log(n)*sqrtn
    int getsumofprimeswith3(int n){
        
        int sum = 0;
        
        for(int i =2; i<=n;i++){
            if(sol2isprime(i)&&sol2has3(i)){
                sum+=i;
            }
        }
        return sum;
    }
    
}
