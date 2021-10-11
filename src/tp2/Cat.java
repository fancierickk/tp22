package tp2;
public class Cat implements Runner {

    @Override
    public int capability(BarrierKind kind) {
        switch (kind) {
            case WALL: {
                return 3;
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
