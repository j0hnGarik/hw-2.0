public class Main {
    public static void main(String[] args) {
        System.out.println(" HW per№1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
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
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight + " Общая масса бойцов");
        var differenceMass = secondBoxer - firstBoxer;
        System.out.println(differenceMass + " Разница в весе");
        var remainingWeight = (secondBoxer - firstBoxer) % totalWeight;
        System.out.println(remainingWeight + " Остаток");
        var allHours = 640;
        var oneEmployerHours = 8;
        var howMuchEmployers = allHours / oneEmployerHours;
        System.out.println("Всего работников в кампании " + howMuchEmployers + " человек");
        var newEmployers = 94;
        var newStuff = howMuchEmployers + newEmployers;
        var newHours = allHours / newStuff;
        System.out.println("Если в кампании работает " +newStuff + " человека, то всего " + newHours + " часов работы может быть поделено между сотрудниками");}}