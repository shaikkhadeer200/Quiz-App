import java.util.*;

class Question {
    String question;
    String optionA, optionB, optionC, optionD;
    char correctAnswer;

    Question(String question, String a, String b, String c, String d, char correctAnswer) {
        this.question = question;
        this.optionA = a;
        this.optionB = b;
        this.optionC = c;
        this.optionD = d;
        this.correctAnswer = correctAnswer;
    }

    void display() {
        System.out.println("\n" + question);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "Which language is used for Android development?",
            "Java", "Python", "C++", "HTML", 'A'));

        questions.add(new Question(
            "What is the size of int in Java?",
            "2 bytes", "4 bytes", "8 bytes", "Depends on system", 'B'));

        questions.add(new Question(
            "Which company developed Java?",
            "Microsoft", "Google", "Sun Microsystems", "Apple", 'C'));

        questions.add(new Question(
            "Which keyword is used to inherit a class?",
            "this", "super", "extends", "implements", 'C'));

        questions.add(new Question(
            "Which data structure uses FIFO?",
            "Stack", "Queue", "Tree", "Graph", 'B'));

        int score = 0;

        System.out.println(" QUIZ APPLICATION ");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            q.display();

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = sc.next().toUpperCase().charAt(0);

            if (answer == q.correctAnswer) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: " + q.correctAnswer);
            }
        }

        System.out.println("\n Your Score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println(" Excellent!");
        } else if (score >= 3) {
            System.out.println(" Good job!");
        } else {
            System.out.println(" Keep practicing!");
        }
    }
}