public class Pez extends Animal implements Nadador {

    @Override
    public void nacer(){
        System.out.println("Nace...");
    }

    @Override
    public void nadar(){
        System.out.println("Nada...");
    }
}
