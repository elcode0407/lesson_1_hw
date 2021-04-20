public class Treadmill implements Obstracteble{
    int height;

    public Treadmill(int height) {
        this.height = height;
    }
    @Override
    public String getName() {
        return "Treadmill";
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= height);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }
}
