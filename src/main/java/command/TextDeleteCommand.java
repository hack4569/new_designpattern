package command;

class TextDeleteCommand implements Command {
    private TextEditor editor;
    private String lastDeletedText;

    public TextDeleteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        lastDeletedText = editor.getText(); // 현재 전체 텍스트 저장
        editor.deleteLastText(lastDeletedText);
    }

    @Override
    public void undo() {
        editor.appendText(lastDeletedText);
    }
}
