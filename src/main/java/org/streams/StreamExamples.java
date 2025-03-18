package org.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        Trainee trainee0 = new Trainee("John", "Smith", "Java", 2, 25, 75.0);
        Trainee trainee1 = new Trainee("Jane", "Jones", "BA", 3, 27, 82.5);
        Trainee trainee2 = new Trainee("Tom", "Williams", "BA", 8, 30, 25.0);
        Trainee trainee3 = new Trainee("Jo", "Taylor", "Java", 4, 20, 63.0);
        Trainee trainee4 = new Trainee("Pat", "Brown", "BA", 7, 22, 94.0);
        Trainee trainee5 = new Trainee("Fay", "Davis", "Java", 2, 26, 50.0);

        List<Trainee> trainees = new ArrayList<>();
        trainees.add(trainee0);
        trainees.add(trainee1);
        trainees.add(trainee2);
        trainees.add(trainee3);
        trainees.add(trainee4);
        trainees.add(trainee5);

       long numberOfBAtrainees = trainees.stream().filter(trainee -> trainee.getStream().equals("BA")).count();

        //only BA stream
        List<Trainee> baTrainees = trainees.stream().filter(trainee -> trainee.getStream().equals("BA")).collect(Collectors.toList());

        //getting the oldest trainee
        trainees.stream().map(trainee -> trainee.getAge()).max((age1, age2) -> age1.compareTo(age2)).ifPresent(maxAge -> System.out.println("The oldest trainee is: " + maxAge + " years old"));

        OptionalDouble optionalAverageAge = trainees.stream().mapToInt(trainee -> trainee.getAge()).average();

        if(optionalAverageAge.isPresent()){
            Double average = optionalAverageAge.getAsDouble();
        }

        //Reducing streams
        BinaryOperator<Trainee> traineeWithHighestGrade = (firstTrainee, secondTrainee) -> firstTrainee.getAverageGrade() > secondTrainee.getAverageGrade() ? firstTrainee : secondTrainee;

        Trainee bestTrainee = trainees.stream().reduce(traineeWithHighestGrade).orElse(new Trainee("dummy", "trainee", "dummy stream",0,0,0.0));

        Trainee[] traineeArray = {trainee0, trainee1, trainee2, trainee3, trainee4, trainee5};

        Arrays.stream(traineeArray).filter(trainee -> trainee.getStream().equals("BA")).toArray(Trainee[]::new);

    }
}
