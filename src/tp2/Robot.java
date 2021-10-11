package tp2;

public class Robot implements Runner {

    @Override
    public int capability(BarrierKind kind) {
        switch (kind) {
            case WALL: {
                return 1;
            }

            case TREADMILL: {
                return 200;
            }

            default: {
                return 0;
            }
        }
    }
}