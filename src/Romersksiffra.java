/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-29 <br>
 * Time: 10:23 <br>
 * Project: IntelliJ IDEA <br>
 */
public enum Romersksiffra {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    public final int värde;

    Romersksiffra(int värde){
        this.värde = värde;
    }
}
