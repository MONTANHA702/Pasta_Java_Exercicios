package revisao.Poo.DesafioWrappersEBoxing;

public class Main {
    public static void main(String[] args) {

        Televisor tv = new Televisor();
        tv.mudarVolume(20);
        //tv.mudarVolume(null); //emite mensagem de erro "Novo volume deve ser informado"
        tv.mudarCanal(130);


        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }
}
