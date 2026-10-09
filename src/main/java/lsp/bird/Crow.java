package lsp.bird;

public class Crow implements Bird {
    @Override
    public void eat() {
        System.console().printf("Crow eats anything.");
    }

    @Override
    public void fly() {
        System.console().printf("Crow is flying.");
    }
}
