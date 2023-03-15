package org.example;
import java.util.Scanner;

public class Main {
    //don't limit yourself to our template ***

    public static void main(String[] args) {

    }


    public static void runMenu(NetflixService netflix, TVShow show, Movie movie, User user){
        //TODO:
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        int command;
        System.out.println("Welcome to The Netflix");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("Enter your command");
        System.out.println("Command : ");
        command = Integer.parseInt(input.nextLine());
        if (command == 1)
        {
            userMenu(netflix, show, movie, user);
        }
        else
        {

        }
    }
    public static void userMenu(NetflixService netflix, TVShow show, Movie movie, User user)
    {
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        System.out.println("1.Sign up");
        System.out.println("2.Sign in");
        System.out.println("Enter your command");
        System.out.println("Command : ");
        int command = Integer.parseInt(input.nextLine());
        if (command == 1)
        {
            System.out.println("Enter your username : ");
            username = input.nextLine();
            System.out.println("Enter your password : ");
            password = input.nextLine();
            if (netflix.createAccountUser(username, password))
            {
                userLoggedInMenu(netflix, show, movie, user);
            }
            else
            {
                System.out.println("Choose another username!");
                runMenu(netflix, show, movie, user);
            }
        }
        else
        {
            System.out.println("Enter your username : ");
            username = input.nextLine();
            System.out.println("Enter your password : ");
            password = input.nextLine();
            if (netflix.loginUser(username, password))
            {
                userLoggedInMenu(netflix, show, movie, user);
            }
            else {
                runMenu(netflix, show, movie, user);
            }
        }
    }

    public static void userLoggedInMenu(NetflixService netflix, TVShow show, Movie movie, User user)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Watch a TV show");
        System.out.println("2. Search TV show in netflix");
        System.out.println("3. Search TV show in your favorite shows");
        System.out.println("4. Add TV show to your favorite TV shows");
        System.out.println("5. View favorite shows");
        System.out.println("6. View watch history");
        System.out.println("7. Change password");
        System.out.println("8. Log out");
        System.out.println("Enter your command");
        System.out.println("Command : ");
        int command = Integer.parseInt(input.nextLine());
        if (command == 1)
        {
            System.out.println("Enter TV show's title");
            System.out.println("TV show's title : ");
            String title = input.nextLine();
            show.setTitle(title);
            user.watchAShow(netflix, show);
        }
        else if (command == 2)
        {
            System.out.println("1. Search by title");
            System.out.println("2. Search by genre");
            System.out.println("3. Search by release year");
            System.out.println("Enter your command");
            System.out.println("Command : ");
            command = Integer.parseInt(input.nextLine());
            if (command == 1)
            {
                String title = input.nextLine();
                System.out.println(netflix.searchByTitle(title));
            }
            else if (command == 2)
            {
                String genre = input.nextLine();
                System.out.println(netflix.searchByGenre(genre));
            }
            else if (command == 3)
            {
                int releaseYear = Integer.parseInt(input.nextLine());
                System.out.println(netflix.searchByReleaseYear(releaseYear));
            }
        }
        else if (command == 3)
        {
            System.out.println("1. Search by title");
            System.out.println("2. Search by genre");
            System.out.println("3. Search by release year");
            System.out.println("Enter your command");
            System.out.println("Command : ");
            command = Integer.parseInt(input.nextLine());
            if (command == 1)
            {
                String title = input.nextLine();
                System.out.println(user.searchByTitle(title));
            }
            else if (command == 2)
            {
                String genre = input.nextLine();
                System.out.println(user.searchByGenre(genre));
            }
            else if (command == 3)
            {
                int releaseYear = Integer.parseInt(input.nextLine());
                System.out.println(user.searchByReleaseYear(releaseYear));
            }
        }
        else if (command == 4)
        {
            System.out.println("Enter TV show's title");
            System.out.println("TV show's title : ");
            String title = input.nextLine();
            show.setTitle(title);
            user.addToFavorites(netflix, show);
        }
        else if (command == 5)
        {
            user.viewFavorites();
        }
        else if (command == 6)
        {
            user.viewWatchHistory();
        }
        else if (command == 7)
        {

        }
        else if (command == 8)
        {
            netflix.logoutUser(user);
        }
    }
    public static void adminMenu(NetflixService netflix, TVShow show, Movie movie, User user , Admin admin)
    {
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        System.out.println("1.Sign up");
        System.out.println("2.Sign in");
        System.out.println("Enter your command");
        System.out.println("Command : ");
        int command = Integer.parseInt(input.nextLine());
        if (command == 1)
        {
            System.out.println("Enter your username : ");
            username = input.nextLine();
            System.out.println("Enter your password : ");
            password = input.nextLine();
            if (netflix.createAccountAdmin(username, password)) {
                adminLoggedInMenu(netflix, show, movie, user, admin);
            } else {
                System.out.println("Choose another username!");
                runMenu(netflix, show, movie, user);
            }
        }
        else
        {
            System.out.println("Enter your username : ");
            username = input.nextLine();
            System.out.println("Enter your password : ");
            password = input.nextLine();
            if (netflix.loginAdmin(username, password))
            {
                adminLoggedInMenu(netflix, show, movie, user, admin);
            }
            else {
                runMenu(netflix, show, movie, user);
            }
        }
    }
    public static void adminLoggedInMenu(NetflixService netflix, TVShow show, Movie movie, User user, Admin admin)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Add TV show");
        System.out.println("2. Add movie");
        System.out.println("3. Change password");
        System.out.println("4. Log out");
        System.out.println("Enter your command");
        System.out.println("Command : ");
        int command = Integer.parseInt(input.nextLine());
        if (command == 1)
        {
            System.out.println("Enter TV show's title");
            System.out.println("TV show's title : ");
            String title = input.nextLine();
            System.out.println("Enter TV show's genre");
            System.out.println("TV show's genre : ");
            String genre = input.nextLine();
            System.out.println("Enter TV show's release year");
            System.out.println("TV show's release year : ");
            int releaseYear = Integer.parseInt(input.nextLine());
            System.out.println("Enter TV show's duration");
            System.out.println("TV show's duration : ");
            String duration = input.nextLine();
            System.out.println("Enter TV show's rating");
            System.out.println("TV show's rating : ");
            double rating = Double.parseDouble(input.nextLine());
            TVShow addingShow = new TVShow(title , genre, releaseYear, duration, rating);
            netflix.addTVShow(addingShow);
        }
        else if (command == 2)
        {
            System.out.println("Enter movie's title");
            System.out.println("Movie's title : ");
            String title = input.nextLine();
            System.out.println("Enter movie's genre");
            System.out.println("Movie's genre : ");
            String genre = input.nextLine();
            System.out.println("Enter movie's release year");
            System.out.println("Movie's release year : ");
            int releaseYear = Integer.parseInt(input.nextLine());
            System.out.println("Enter movie's duration");
            System.out.println("Movie's duration : ");
            String duration = input.nextLine();
            System.out.println("Enter movie's rating");
            System.out.println("Movie's rating : ");
            double rating = Double.parseDouble(input.nextLine());
            System.out.println("Enter movie's length");
            System.out.println("Movie's length : ");
            String length = input.nextLine();
            Movie addingMovie = new Movie(title , genre, releaseYear, duration, rating, length);
            netflix.addMovie(addingMovie);
        }
        else if (command == 3)
        {

        }
        else if (command == 4)
        {
            netflix.logoutAdomin(admin);
        }
    }
}
