public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // Задача №1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача №2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);

        // Задача №3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7 ;
        System.out.println(friend);

        // Задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача №6
        var BoxerFirst = 78.2;
        var BoxerSecond = 82.7;
        var TotalWeightOfBoxers = BoxerFirst + BoxerSecond;
        System.out.println("Общая масса боксеров: " + TotalWeightOfBoxers + "кг");
        var BoxerWeightDifference = BoxerSecond - BoxerFirst;
        System.out.println("Разница в весе боксеров на "+ BoxerWeightDifference +"кг");

        // Задача №7
        var LibraDivisionRemainder = BoxerSecond % BoxerFirst;
        System.out.println("Разница в весе боксеров: "+ LibraDivisionRemainder +"кг");

        // Задача №8
        var TheAmountOfHours = 640;
        var DedicationToWorkByOneEmployee = 8;
        var AmountOfWorkers = TheAmountOfHours / DedicationToWorkByOneEmployee;
        System.out.println("Всего работников в компании - " + AmountOfWorkers + " человек");

        AmountOfWorkers = AmountOfWorkers +94;
        DedicationToWorkByOneEmployee = TheAmountOfHours / AmountOfWorkers;
        System.out.println("Если в компании работает " + AmountOfWorkers + " человек, то всего " + DedicationToWorkByOneEmployee + " часов работы может быть поделено между сотрудниками");





    }
}