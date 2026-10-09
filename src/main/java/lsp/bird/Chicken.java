package lsp.bird;

public class Chicken implements Eater {
    @Override
    public void eat() {
        System.console().printf("Chicken eats seeds.");
    }
}
