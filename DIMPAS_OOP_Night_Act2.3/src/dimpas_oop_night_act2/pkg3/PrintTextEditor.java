package dimpas_oop_night_act2.pkg3;

public class PrintTextEditor extends TextEditor {

    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    public void print() {
        System.out.println(getText());
    }
}