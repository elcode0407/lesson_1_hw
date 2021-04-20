public class Main {
    public static void main(String[] args) {
        Moveable[] members = {
                new People(4,2,"Elan"),
                new Cat(12,13,"Tommy"),
                new Robot(23,12,"Copper")
        };
        Obstracteble[] obstacles = {
                new Wall(3),
                new Treadmill(4),

        };

        for (Moveable member : members) {
            System.out.println("Сейчас припятствие проходит " + member.getName());
            for (Obstracteble obstacle : obstacles) {
                System.out.println(member.getName() + " пробует пройти " + obstacle.getName());
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("У него получается!");
                } else {
                    System.out.println("У него не получается.");

                }

            }
            System.out.println();
        }
    }
}
