public class BigOtest {
    int count=0;
    public static void main(String[] args) {
        BigOtest test=new BigOtest();
    }

    BigOtest(){
        long start=System.currentTimeMillis();
        bigOtest_O2N(8);
        System.out.println(count);
        long End=System.currentTimeMillis();
        System.out.println(End-start);

    }


    void bigOtest_O1(){
        System.out.println("Next number:");
    }

    void bigOtest_ON(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Next number: " + i);    }
    }
    void bigOtest_OLogN(int n){
        for (int i = 1; i < n; i = i * 2){
            System.out.println("Next number:"+i);
        }
    }
    void bigOtest_O2N(int n){
        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println("Next number: " + i);
        }
    }
    int Fibonacci(int number)
    {count++;
        if (number <= 1) {return number;}

        return Fibonacci(number - 2) + Fibonacci(number - 1);
    }



}
