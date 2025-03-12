package command;

public class CommandPatternTextEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        Command command1 = new TextAppendCommand(editor, "안녕하세요. ");
        Command command2 = new TextAppendCommand(editor, "Command 패턴을 배우고 있습니다. ");

        manager.executeCommand(command1); // "현재 텍스트: 안녕하세요. "
        manager.executeCommand(command2); // "현재 텍스트: 안녕하세요. Command 패턴을 배우고 있습니다."

        manager.undoLastCommand(); // "현재 텍스트: 안녕하세요. "
        manager.undoLastCommand(); // "현재 텍스트: "
        manager.undoLastCommand(); // "실행 취소할 명령이 없습니다."
    }
}
