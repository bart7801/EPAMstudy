import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args) {
        int[] filmography = new int[10]; // or new int[]{0,0,0,0,0,0,0,0,0,0};
        filmography[0] = 12;
        filmography[1] = 9;
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i < 10; i++) {  // enter other elements
            System.out.print("The number of movies with superhero num." + (i + 1) + " is ");
            filmography[i] = scanner.nextInt();
        }
        int totalMovies = 0;
        for (int num : filmography) {// Find the sum of all elements using For-each
            totalMovies += num;
        }

        System.out.println("The total number of movies with all superheroes " + totalMovies);

        int min = filmography[0];// Finding the smallest bouquet
        for (int i = 1; i < filmography.length; i++) {
            if (filmography[i] < min)
                min = filmography[i];
        }
        System.out.println("The smallest filmography consists of " + min + " movie(s).");
    }
}
//The result:

//The number of movies with superhero num.3 is 10
//The number of movies with superhero num.4 is 11
//The number of movies with superhero num.5 is 8
//The number of movies with superhero num.6 is 7
//The number of movies with superhero num.7 is 6
//The number of movies with superhero num.8 is 2
//The number of movies with superhero num.9 is 13
//The number of movies with superhero num.10 is 14
//The total number of movies with all superheroes 92
//The smallest filmography consists of 2 movie(s).