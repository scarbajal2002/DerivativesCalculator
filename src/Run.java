import java.util.LinkedList;
import java.util.Random;

public class Run {

    /*public static String showExp(){
        Expression x = new Expression();
        Expression.Term term1 = new Expression.Term(1,2);
        Expression.Term term2 = new Expression.Term(2,56);
        Expression.Term term3 = new Expression.Term(3,9);
        Expression.Term term4 = new Expression.Term(0,200);
        Expression.Term term5 = new Expression.Term(39,7);
        Random randx = new Random();
        int upperBound = 7;
        int int_randx = randx.nextInt(upperBound);
        /*for (int i = 0; i<int_randx;i++){
            Random rand = new Random();
            Random rand2 = new Random();

            int int_rand = rand.nextInt(upperBound);
            int int_rand2 = rand.nextInt(upperBound);
            Expression.Term termx = new Expression.Term(int_rand,int_rand2);
            x.insertTerm(termx);
        }
        x.insertTerm(term1);

        //x.insertTerm(term2);
        //x.insertTerm(term3);
        //x.insertTerm(term4);

        return x.findDerivative().toString();
    }*/
    public static void findDerivative(Expression x){
        System.out.println("Expression: " + x.toString() +"   Derivative: " + x.findDer());
        Expression test = x.findDer();
    }


    public static void main(String[] args){

        for (int j = 0; j<6; j++){
            Expression x = new Expression();
            Random randx = new Random();
            int upperBound = 40;
            int int_randx = randx.nextInt(upperBound);
            for (int i = 0; i<int_randx+1;i++){
                Random rand = new Random();
                Random rand2 = new Random();
                int int_rand = rand.nextInt(upperBound+1);
                int int_rand2 = rand.nextInt(upperBound+1);
                Term termx = new Term(int_rand,int_rand2);
                x.insertTerm(termx);
            }
            findDerivative(x);
        }
    }

}
