import java.util.List;

public class Grades {

    public Grades(int[] grades){ this.grades=grades; }

    public int[] grades;
//ex1.1
    public int[] bad_grades(int[] grades){
        int count=0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]<40) {
                count+=1;
            }
        }

        int[] bad_grades=new int[count];
        int counter=0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]<40) {
                bad_grades[counter] = grades[i];
                counter += 1;
            }
        }
        return bad_grades;
    }
//ex1.2
public int average_grade(int[] grades){
        int sum=0;
        for(int i=0; i<grades.length; i++){
            sum+=grades[i];
        }
        return sum/grades.length;
}
//ex1.3
public int round_up_grade(int grade){
    if(grade>=38) {
        if (grade % 5 == 3)
            grade += 2;
        if (grade % 5 == 4)
            grade += 1;
    }
    return grade;
}

public int[] rounded_up_grade(int[] grades){
        int count=0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]>=38) {
                if (grades[i] % 5 == 3)
                    count += 1;
                if (grades[i] % 5 == 4)
                    count+=1;
            }
        }
        int[] rounded_up_grades=new int[count];
        int counter=0;
        for(int j=0; j<grades.length; j++){
            if(grades[j]>=38) {
                if (grades[j] % 5 == 3) {
                    rounded_up_grades[counter] = round_up_grade(grades[j]);
                    counter += 1;
                }
                if (grades[j] % 5 == 4) {
                    rounded_up_grades[counter] =  round_up_grade(grades[j]);
                    counter += 1;
                }
            }

        }
        return rounded_up_grades;
}
//ex1.4
public int max_rounded_up_grade(int[] grades){
        int max=0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]>=38) {
                if (grades[i] % 5 == 3) {
                    grades[i]=round_up_grade(grades[i]);
                    if (max < grades[i]) {
                        max = grades[i];
                    }
                }
                if (grades[i] % 5 == 4) {
                    grades[i]=round_up_grade(grades[i]);
                    if (max < grades[i]) {
                        max = grades[i];
                    }
                }
            }
        }
        return max;
}

}

