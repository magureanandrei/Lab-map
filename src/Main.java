import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Grades g = new Grades(new int[]{29, 37, 38, 41, 84, 67});
        System.out.println(Arrays.toString(g.bad_grades(g.rounded_up_grade(g.grades))));
        System.out.println(g.average_grade(g.grades));
        System.out.println(Arrays.toString(g.rounded_up_grade(g.grades)));
        System.out.println(g.max_rounded_up_grade(g.grades));

        Numbers n = new Numbers(new int[]{4,8,3,10,17});
        System.out.println(n.find_max(n.numbers));
        System.out.println(n.find_min(n.numbers));
        System.out.println(Arrays.toString(n.maximal_sum(n.numbers)));
        System.out.println(Arrays.toString(n.minimal_sum(n.numbers)));

        int[] number1=new int[]{1,3,0,0,0,0,0,0,0};
        int[] number2=new int[]{8,7,0,0,0,0,0,0,0};
        int[] number3=new int[]{8,3,0,0,0,0,0,0,0};
        int[] number4=new int[]{5,4,0,0,0,0,0,0,0};
        int[] number5=new int[]{2,3,6,0,0,0,0,0,0};
        Array_numbers a = new Array_numbers(number1,number2);
        System.out.println(Arrays.toString(a.sum(number1, number2)));
        System.out.println(Arrays.toString(a.diff(number3, number4)));
        System.out.println(Arrays.toString(a.multiply(number5, 2)));
        System.out.println(Arrays.toString(a.div(number5, 2)));

        Electronic_shop e= new Electronic_shop(new int[]{15,10,20,35}, new int[]{20,40,15,10});
        System.out.println(e.cheapest_keyboard(e.keyboard));
        System.out.println(e.expensive_thing(e.USB,e.keyboard));
        System.out.println(e.most_expensive_afford(e.USB,30));
        System.out.println(e.buy(60,e.keyboard,e.USB));
        System.out.println(e.buy(60,new int[]{40,60},new int[]{8,12}));

    }
}