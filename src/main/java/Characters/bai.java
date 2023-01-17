package Characters;

public class bai {
    public static void main(String[] args){
        int x=14;
        x-= x-- + --x;
        System.out.println(x);
        
        for(int i=0; i<=10; i+=3){
            System.out.print(i--);
        }
    }
    
}
