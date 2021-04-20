public class Wall implements Obstracteble {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return "Wall";
    }

    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return (maxHeight >= height);
    }
}
