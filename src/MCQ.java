import java.util.Scanner;
public class MCQ {
    //Creation Of Tests
    public static void main(String[] args){
        questionsUndChoices QuC = new questionsUndChoices();

        questionConstructor[] questions = {
          new questionConstructor(QuC.q1, QuC.choice1, "c"),
          new questionConstructor(QuC.q2, QuC.choice2, "c"),
          new questionConstructor(QuC.q3, QuC.choice3, "a"),
          new questionConstructor(QuC.q4, QuC.choice4, "d"),
          new questionConstructor(QuC.q5, QuC.choice5, "c")
        };
        doTest(questions);
    }
    //Test Proper
    public static void doTest(questionConstructor[] questions){
        int score = 0, questNum = 1;

        String tstName;

        System.out.println("============================================");
        System.out.println("|                                            |");
        System.out.println("|          PHILIPPINE HISTORY TEST           |");
        System.out.println("|                                            |");
        System.out.println("============================================");

        Scanner usrInput = new Scanner(System.in);

        do {
            System.out.print("Please Enter your Name: ");
            tstName = usrInput.next();
        }while (tstName.equals(" "));

        for (questionConstructor question : questions) {
            System.out.println("Question "+ questNum +": " + question.question);
            System.out.println(question.choices);
            System.out.println("Your Answer?: ");
            String answer = usrInput.next();
            questNum++;
            if (answer.equals(question.answer)) {
                score++;
            }
        }
        if(score >= 4){
            System.out.println("Thank you " +tstName + " for taking the test, and Congratulations you have PASSED the test with a score of " +score+ " out of 15");
        }else {
            System.out.println("Thank you " +tstName + " for taking the test, but unfortunately you have FAILED the test with a score of " +score+ " out of 15, better luck next time!");
        }


    }
}
