package dimpas_oop_night_act2.pkg3;
public class AdvancedTextEditor extends TextEditor {
    private String previousText;

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        this.previousText = initialText;
    }

    public void undo() {
        text = previousText;
    }

    @Override
    public void append(String newText) {
        previousText = getText();
        super.append(newText);
    }

    @Override
    public void delete(int n) {
        previousText = getText();
        super.delete(n);
    }
}
