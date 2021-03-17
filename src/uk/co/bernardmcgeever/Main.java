package uk.co.bernardmcgeever;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myNumber = 8;

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);
    }
}
