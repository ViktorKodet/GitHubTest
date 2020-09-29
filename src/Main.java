public class Main {

    public static void main(String[] args) {

        for (Romersksiffra r : Romersksiffra.values()){
            System.out.println(r + " = " + r.värde);
        }
    }
}
