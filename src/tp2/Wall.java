package tp2;

public class Wall implements IBarrier {
    private final int duration;
    public Wall(int duration) {
        this.duration = duration;
    }
    @Override
    public int getDuration() {
        return duration;
    }
    @Override
    public BarrierKind getKind() {
        return BarrierKind.WALL;
    }
}