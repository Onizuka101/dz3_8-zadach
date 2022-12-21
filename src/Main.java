public class Main {
    public static void main(String[] args) {
        task1();
        task4();
        task5();
        task6();
        task8();
    }

    public static void task1() {
        System.out.println("задача 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("задача 6-7");
        var ivanIvanov = 78.2;
        var petrPetrov = 82.7;
        var b = ivanIvanov + petrPetrov;
        System.out.println(b);
        var c = petrPetrov - ivanIvanov;
        System.out.println(c);
        var h = petrPetrov % ivanIvanov ;
        System.out.println(h);
    }
    public static void task8() {
        System.out.println("задача 8");
        var a = 640;
        var c = 8;
        var t = 94;
        var b = a / c;
        System.out.println("Всего работников в компании —" + b + "человек");
        var q = a + (c * t) ;
        System.out.println("Всего работников в компании —" + b +  "человек, то всего"  + q +  " часов работы может быть поделено между сотрудниками");
    }
}