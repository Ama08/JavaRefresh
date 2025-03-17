package org.lambdas;

import java.util.*;
import java.util.function.*;

public class Runner {
    public static void main(String[] args) {
        Trainee trainee0 = new Trainee("John", "Smith", "Java", 2, 25, 75.0);
        Trainee trainee1 = new Trainee("Jane", "Jones", "BA", 3, 27, 82.5);
        Trainee trainee2 = new Trainee("Tom", "Williams", "BA", 8, 30, 25.0);
        Trainee trainee3 = new Trainee("Jo", "Taylor", "Java", 4, 20, 63.0);
        Trainee trainee4 = new Trainee("Pat", "Brown", "BA", 7, 22, 94.0);
        Trainee trainee5 = new Trainee("Fay", "Davis", "Java", 2, 26, 50.0);

       Function< Trainee, String> getTraineeFullName = trainee -> trainee.getFirstName() + " " + trainee.getLastName();

       //Funtion
       String trainee0Name = getTraineeFullName.apply(trainee0);
        System.out.println(trainee0Name);

        //BiFuntion - takes in two arguments
        BiFunction<Trainee, String, String> getTraineeWtihTitle = (trainee, title) -> title + " " + trainee.getFirstName() + " " + trainee.getLastName();

        String trainee1Name = getTraineeWtihTitle.apply(trainee1, "Ms");
        System.out.println(trainee1Name);

        //Predicate - funtional interface taking in a single argument and returning a boolean
        Predicate<Trainee> veryWeakTrainee = trainee -> trainee.getAverageGrade() < 50;
        boolean trainee2IsWeak = veryWeakTrainee.test(trainee2);
        boolean trainee3IsWeak = veryWeakTrainee.test(trainee3);
        System.out.println(trainee2IsWeak + " " + trainee3IsWeak);

        //BinaryOperator - takes two arguments and returns a value. Must all have same datatypes
        BinaryOperator<Trainee> getOldestTrainee = (firstTrainee, secondTrainee) -> firstTrainee.getAge() > secondTrainee.getAge() ? firstTrainee : secondTrainee;
        Trainee oldestTrainee = getOldestTrainee.apply(trainee0, trainee1);

        //consumer - single argument with no return. equivalent to a void method
        Consumer<Trainee> printFullName = trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName());

        //forEach
        List<Trainee> trainees = new ArrayList<>();
        trainees.add(trainee0);
        trainees.add(trainee1);
        trainees.add(trainee2);
        trainees.add(trainee3);
        trainees.add(trainee4);
        trainees.add(trainee5);

        trainees.forEach(printFullName); // requires a consumer .. which was the printFullName variable
        //alternatively
        trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName()));

        //removeIf
        trainees.removeIf(veryWeakTrainee);
        //alternatively
        trainees.removeIf(trainee -> trainee.getAverageGrade() < 50);

        trainees.forEach(trainee ->
                System.out.println(trainee.getFirstName() + " - " + trainee.getAverageGrade())
        );

        Comparator<Trainee> traineeStreamComparitor = (firstTrainee, seconTrainee) -> firstTrainee.getStream().compareTo(seconTrainee.getStream());
        Collections.sort(trainees, traineeStreamComparitor);
        Comparator<Trainee> traineeGradeComparitor = (firstTrainee, seconTrainee) -> firstTrainee.getAverageGrade().compareTo(seconTrainee.getAverageGrade());

        //combining comparitors
        Comparator<Trainee> traineeStreamThenGradeComparitor = traineeStreamComparitor.thenComparing(traineeGradeComparitor);
        Collections.sort(trainees, traineeStreamThenGradeComparitor);

        //Map.merge
        Map<String, Integer> traineesPerStream = new HashMap<>();
        for (Trainee trainee : trainees) {
            String stream = trainee.getStream();
            traineesPerStream.merge(stream,1, (currentCount,one) -> currentCount + one);
        }

    }
}
