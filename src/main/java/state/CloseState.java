package state;

public class CloseState implements DoorState{
    @Override
    public void open(Door door) {
        System.out.println("문을 열었습니다.");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("문이 이미 닫혀 있습니다.");
    }
}
