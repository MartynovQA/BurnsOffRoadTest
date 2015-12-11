package extenedelements.elements;

public interface TextField extends Element {
    void type(String text);

    void clear();

    void clearAndType(String text);

    String getText();

    void sendKeys();

    void click();
}