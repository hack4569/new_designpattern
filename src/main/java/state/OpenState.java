package state;

public class OpenState implements DoorState{
    @Override
    public void open(Door door) {
        System.out.println("문이 이미 닫혀있음");
    }

    @Override
    public void close(Door door) {
        System.out.println("문을 열었습니다.");
        door.setState(new CloseState());
    }
}
