package lsp.bird;

public class Eagle implements Bird {
    @Override
    public void eat() {
        System.console().printf("Eagle eats fish.");
    }

    @Override
    public void fly() {
        System.console().printf("Eagle is flying.");
    }
}
