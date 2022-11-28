public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задание 2
        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задание 3
        System.out.println("Задание 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);


        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задание 6
        System.out.println("Задание 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightBothBoxers = weightFirstBoxer + weightSecondBoxer;
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Общий вес боксёров: " + weightBothBoxers);
        System.out.println("Разница в весе боксёров: " + differenceWeight);
        // Задание 7
        System.out.println("Задание 7");
        var secondDifferenceWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе боксёров с помощью остатка от деления: " + secondDifferenceWeight);
        System.out.println("Разница в весе боксёров с помощью вычетания: " + differenceWeight);
        // Задание 8
        var jobsHours = 640;
        var hoursPerWorker = 8;
        var workers = jobsHours / hoursPerWorker;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        hoursPerWorker = hoursPerWorker * workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + hoursPerWorker + " часов работы может быть поделено между сотрудниками");
    }
}