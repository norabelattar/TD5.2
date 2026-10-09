package lsp.bird;

public class Chicken implements Bird {
    @Override
    public void eat() {
        System.console().printf("Chicken eats seeds.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Chicken cannot fly!");
    }
}
