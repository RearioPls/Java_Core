package primitive7;

public class Main {
    public static void main(String[] args) {
        //Main volleyball = new Main(); - это для проверки создан объект.
        //System.out.println(volleyball.determineGroup(11));

    }

    public int determineGroup(int age) {
       if(6<age && age<14) {
           return 1;
       }
       if(13<age && age<18){
           return 2;
       }
        if(17<age && age<66) {
            return 3;
        }
        return -1;
    }
    }
