package com.variable;

public class ControlStatement {

    int value1 = 5;


    public static void main(String[] args) {

        IF a = new IF(100);
        a.getCon(90);

        Score s = new Score(83);
        s.getScore();

    }
}


class IF {
    int value;
    IF(int value_) {
        this.value = value_;
    }

    void getCon(int value_) {
        if (this.value > value_) {
            System.out.println(" 참 ");
        }
    }
}

class Score {
    int value;
    Score(int value_) {
        this.value = value_;
    }

    void getScore() {
        if (this.value >= 90) {
            System.out.println(" 수 ");
        } else if (this.value >= 80) {
            System.out.println(" 우 ");
        } else if (this.value >= 70) {
            System.out.println(" 미 ");
        } else if (this.value >= 60) {
            System.out.println(" 양 ");
        } else {
            System.out.println(" 가 ");
        }
    }
}
