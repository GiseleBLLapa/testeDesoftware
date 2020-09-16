package model;

public class IdadeDose{
    public int meses(int x){

            if (x<4){
                int dose = x;
                System.out.println("Deve ser ministrada a " + dose +  "a.");
            } else {
                System.out.println("Este filhote já tomou as doses necessárias");
            }
        return x;
        
    }

}