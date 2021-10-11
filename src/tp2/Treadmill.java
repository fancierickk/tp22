package tp2;

public class Treadmill implements IBarrier {

    private final int duration;

    public Treadmill(int duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public BarrierKind getKind() {
        return BarrierKind.TREADMILL;
    }
}
