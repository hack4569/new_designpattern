package command;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void appendText(String newText) {
        text.append(newText);
        System.out.println("현재 텍스트: " + text.toString());
    }

    public void deleteLastText(String lastText) {
        int start = text.length() - lastText.length();
        if (start >= 0) {
            text.delete(start, text.length());
        }
        System.out.println("현재 텍스트: " + text.toString());
    }

    public String getText() {
        return text.toString();
    }
}
