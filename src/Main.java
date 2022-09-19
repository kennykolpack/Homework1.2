public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println("dog: " + dog);
        var cat = 3.6;
        System.out.println("cat: " + cat);
        var paper = 763789;
        System.out.println("paper: " + paper);
        // Задача 2
        System.out.println("Задача 2 ");
        dog = dog + 4;
        System.out.println("dog: " + dog);
        cat = cat + 4;
        System.out.println("cat: " + cat);
        paper = paper +4;
        System.out.println("paper: " + paper);
        // Задача 3
        System.out.println("Задача 3");
        var dog1 = 12.0;
        dog1 = dog1 - 3.5;
        System.out.println("dog: " + dog1);
        cat = cat - 1.6;
        System.out.println("cat: " + cat);
        paper = paper - 7639;
        System.out.println("paper: " + paper);
        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend: " + friend);
        friend = friend + 2;
        System.out.println("friend: " + friend);
        friend = friend / 7;
        System.out.println("friend: " + friend);
        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog: " + frog);
        frog = frog * 10;
        System.out.println("frog: " + frog);
        frog = frog / 3.5;
        System.out.println("frog: " + frog);
        frog = frog + 4;
        System.out.println("frog: " + frog);
        // Задача 6
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров " + weightDifference + "кг");
        // Задача 7
        System.out.println("Задача 7");
        weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров используя вычитание " + weightDifference + "кг");
        weightDifference = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе боксеров используя функцию остаток от деления " + weightDifference + "кг");
    }
}