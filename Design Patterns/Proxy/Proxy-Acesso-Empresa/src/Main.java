import entities.Casa;
import interfaces.Residencia;
import proxys.ProxyCasa;

public class Main {

    public void runProxy() {
        Residencia residencia = new ProxyCasa();
        //residencia.entrar(false);
        residencia.entrar(true);
        residencia.sair();
    }

    public void run() {
        Residencia residencia = new Casa();
        residencia.entrar(false);
        residencia.sair();
    }


    public static void main(String[] args) {
        (new Main()).runProxy();
    }
}