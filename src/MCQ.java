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
          new questionConstructor(QuC.q5, QuC.choice5, "c"),
          new questionConstructor(QuC.q6, QuC.choice6, "b"),
          new questionConstructor(QuC.q7, QuC.choice7, "c"),
          new questionConstructor(QuC.q8, QuC.choice8,"d" ),
          new questionConstructor(QuC.q9, QuC.choice9, "a"),
          new questionConstructor(QuC.q10, QuC.choice10, "d"),
          new questionConstructor(QuC.q11, QuC.choice11, "b"),
          new questionConstructor(QuC.q12, QuC.choice12, "d"),
          new questionConstructor(QuC.q13, QuC.choice13,"b"),
          new questionConstructor(QuC.q14, QuC.choice14, "b"),
          new questionConstructor(QuC.q15, QuC.choice15, "a")
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

        System.out.println("Please Answer the Test with small letters only, if you've answered a Big letter, the test will consider it a mistake");
        System.out.println(" ");

        do {
            System.out.print("Please Enter your Name: ");
            tstName = usrInput.nextLine();
        }while (tstName.isEmpty());

        System.out.println("************** TEST PROPER ******************");
        for (questionConstructor question : questions) {
            System.out.println("Question "+ questNum +": " + question.question);
            System.out.println(question.choices);
            System.out.print("Your Answer?: ");
            String answer = usrInput.next();
            questNum++;
            if (answer.equals(question.answer)) {
                score++;
            }
        }
        usrInput.close();
        System.out.println("************** END OF TEST ******************");
        if(score >= 8){
            System.out.println("Thank you " +tstName + " for taking the test, and Congratulations you have PASSED the test with a score of " +score+ " out of 15");
        }else {
            System.out.println("Thank you " +tstName + " for taking the test, but unfortunately you have FAILED the test with a score of " +score+ " out of 15, better luck next time!");
        }


    }
}
