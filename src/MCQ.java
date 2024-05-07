import java.util.Scanner;
public class MCQ {
    public static void main(String[] args){
        String q1 = "When was did the Philippines gained independence from the US\n (a) June 12, 1896 (b) July 4, 1776 (c) July 4, 1946 (d) July 14, 1789";
        String q2 = "Who was first elected Filipino President after the Japanese Occupation\n (a) Jose P. Laurel (b) Elpidio Quirino (c) Manuel Roxas (d) Carlos P. Garcia";
        String q3 = "What was the former capital of the Philippines from 1949-1976\n (a) Quezon City (b) Pasig City (c) Caloocan City (d) Navotas City";
        String q4 = "What was the political party Corazon Aquino ran under for the presidency\n (a) Kilusang Bagong Lipunan (b) KALIBAPI (c) Liberal Party (d) UNIDO";
        String q5 = "Since February 25, 1986, how many EDSA protests occurred afterwards\n (a) None (b) 3 (c) 2 (d) 1";

        questionConstructor[] questions = {
          new questionConstructor(q1,"c"),
          new questionConstructor(q2,"c"),
          new questionConstructor(q3,"a"),
          new questionConstructor(q4,"d"),
          new questionConstructor(q5,"c")
        };
        doTest(questions);
    }
    public static void doTest(questionConstructor[] questions){
        int score = 0;
        Scanner usrInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);
            String answer = usrInput.next();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got " +score+ " out of "+questions.length);
    }
}
