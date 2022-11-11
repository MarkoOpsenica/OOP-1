public class GlavnaTv {

boolean ukljucen = false;
int JacinaTona = 0;


public void ukljuci() {
    ukljucen = true;

}
public void iskljuci() {
    ukljucen = false;
}
public void PojacajTon(){
    if (JacinaTona < 20){
        JacinaTona++;
    }
}
public void SmanjiTon(){
    if (JacinaTona > 0) {
        JacinaTona--;
    }
}

public boolean daLiJeUkljucen (){
    return ukljucen;
}





}
