public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();

        System.out.println("A tv está ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.escolherCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
