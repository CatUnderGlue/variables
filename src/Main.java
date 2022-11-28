public class Main {
    public static void main(String[] args) {
        var dog = 8;
        dog = dog + 4;
        dog = (int) (dog - 3.5);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightBothBoxers = weightFirstBoxer + weightSecondBoxer;
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Общий вес боксёров: " + weightBothBoxers);
        System.out.println("Разница в весе боксёров: " + differenceWeight);
    }
}