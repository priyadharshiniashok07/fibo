package world;

public class Priya {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=1;i<5;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }

    }
}
