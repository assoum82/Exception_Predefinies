import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo15_1 {
    static Scanner cl=new Scanner(System.in);
    static int[]tableau = {17,12,15,38,29,157,89,-22,0,5};
    static int division(int indice,int diviseur){
        if(diviseur==0)
            throw new ArithmeticException("division par zéro");
        else
            if((indice>9) &&( indice<0))
                throw new ArrayIndexOutOfBoundsException();
        else
        return tableau[indice]/diviseur;

    }
    public static void main(String [] args){
        int x,y;
        try {
            System.out.print("entrez l'indice de l'entier a diviser : " );
            x=cl.nextInt() ;
            System.out.print("entrez le diviseur : " );
            y=cl.nextInt();
            System.out.println("le résultat de la division est : " + division(x,y));
        }catch(ArithmeticException e){
           System.err.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.err.println("l'indice n'existe pas");
        }  catch(Exception e){
            System.err.println("n'est pas un entier ");
        }


    }
}
