public class Cat implements Moveable{
        int maxHeight;
        int maxLength;
        String nickname;

        public Cat(int maxHeight, int maxLength, String nickname) {
            this.maxHeight = maxHeight;
            this.maxLength = maxLength;
            this.nickname = nickname;
        }


        @Override
        public int getMaxHeight() {
            return maxHeight;
        }

        @Override
        public void jump() {
            System.out.println("Cat jump");
        }

    @Override
    public String getName() {
        return nickname;
    }

    @Override
        public int getMaxLength() {
            return maxLength;
        }

        @Override
        public void run() {
            System.out.println("Cat run");
        }

}
