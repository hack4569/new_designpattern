package state;

public class StatePatternExample {
    public static void main(String[] args) {
        Door door = new Door();

        door.open();  // "문을 열었습니다."
        door.open();  // "문이 이미 열려 있습니다."
        door.close(); // "문을 닫았습니다."
        door.close(); // "문이 이미 닫혀 있습니다."
    }
}
