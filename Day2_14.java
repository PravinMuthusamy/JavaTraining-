class Student {
    String name;
    int rollNo;

    Student() {
        name = "null";
        rollNo = 1;
    }

    public void setDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Exam extends Student {
    int m1;
    int m2;
    int m3;

    public void setMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class Result extends Exam {
    public int totalMark() {
        int res = this.m1 + this.m2 + this.m3;
        return res;
    }
}

public class Day2_14 {
    public static void main(String[] args) {
        Result result = new Result();
        result.setDetails("Kiran", 62);
        result.setMarks(89, 67, 90);
        System.out.println("The total marks calculated for the student "+result.name+" is "+result.totalMark());
    }
}