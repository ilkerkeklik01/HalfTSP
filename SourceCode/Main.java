import java.util.List;

public class Main {
    public static void main(String[] args) {

       /*String input_filePath_test = "your_path_file"; //Enter the input file path. EX: Desktop\HalfTSPProblem\input.txt
        String output_filePath_test = "your_path_file";  //Enter the output path.(it'll be created) EX: Desktop\HalfTSPProblem\output.txt

        long timeMillis_test = System.currentTimeMillis();
        List<City> cities_test = InputData.readCitiesFromFile(input_filePath_test); //Get the cities from input

        TSPSolverHalf solver_test = new TSPSolverHalf(cities_test); // Get the
        int[] bestTour_test = solver_test.solve();
        int bestTourLength_test = solver_test.getBestTourLength();

        String output_test = Helper.fromArrayToString(bestTour_test, bestTourLength_test);
        InputData.writeOutPutFile(output_filePath_test, output_test);
        timeMillis_test = System.currentTimeMillis() - timeMillis_test;

        System.out.println(input_filePath_test + ":");
        System.out.println("Best tour length: "+ bestTourLength_test);
        System.out.println("Execution time in ms: "+ timeMillis_test);*/


            // THE FOLLOWING CODE INSIDE COMMENT BLOCK CAN BE RUN TO GET THE OUTPUTS OF THE TEST INPUTS.


        for (int i = 1; i < 5; i++){
            long timeMillis = System.currentTimeMillis();
            String filePath = System.getProperty("user.dir") + "/test-input-" + i + ".txt";
            List<City> cities = InputData.readCitiesFromFile(filePath);

            TSPSolverHalf solver = new TSPSolverHalf(cities);
            int[] bestTour = solver.solve();

            int bestTourLength = solver.getBestTourLength();

            String output = Helper.fromArrayToString(bestTour, bestTourLength);
            InputData.writeOutPutFile(System.getProperty("user.dir") + "/test-output-" + i + ".txt", output);
            System.out.println("test-input-" + i + ":");
            timeMillis = System.currentTimeMillis() - timeMillis;
            System.out.println("Best tour length: "+ bestTourLength);
            System.out.println("Execution time in ms: "+ timeMillis);
            System.out.println();
        }



    }

}