package command;

public class TextAppendCommand implements Command {
    private TextEditor editor;
    private String text;

    public TextAppendCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.appendText(text);
    }

    @Override
    public void undo() {
        editor.deleteLastText(text);
    }
}
