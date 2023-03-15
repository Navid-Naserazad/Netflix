package org.example;

import java.util.ArrayList;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */

    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<TVShow> tvShows = new ArrayList<>();
    ArrayList<Movie> movies = new ArrayList<>();

    public boolean doesTvShowExist(TVShow tvShow)
    {
        boolean existance = false;
        for (int i=0; i<tvShows.size(); i++)
        {
            if (tvShow.getTitle().equals(tvShows.get(i).getTitle()))
            {
                existance = true;
            }
        }
        return existance;
    }
    public boolean doesMovieExist(Movie movie)
    {
        boolean existance = false;
        for (int i=0; i<movies.size(); i++)
        {
            if (movie.getTitle().equals(movies.get(i).getTitle()))
            {
                existance = true;
            }
        }
        return existance;
    }
    public boolean doesUserExist(User user)
    {
        boolean existance = false;
        for (int i=0; i<users.size(); i++)
        {
            if (user.getUsername().equals(users.get(i).getUsername()))
            {
                existance = true;
            }
        }
        return existance;
    }

    public boolean doesAdminExist(Admin admin)
    {
        boolean existance = false;
        for (int i=0; i<admins.size(); i++)
        {
            if (admin.getUsername().equals(admins.get(i).getUsername()))
            {
                existance = true;
            }
        }
        return existance;
    }

    public boolean passwordCheckUser(String username, String password)
    {
        boolean check = false;
        for (int i=0; i<users.size(); i++)
        {
            if (username.equals(users.get(i).getUsername()))
            {
                if (password.equals(users.get(i).getPassword()))
                {
                    check = true;
                }
            }
        }
        return check;
    }

    public boolean passwordCheckAdmin(String username, String password)
    {
        boolean check = false;
        for (int i=0; i<admins.size(); i++)
        {
            if (username.equals(admins.get(i).getUsername()))
            {
                if (password.equals(admins.get(i).getPassword()))
                {
                    check = true;
                }
            }
        }
        return check;
    }

    public void addTVShow(TVShow show){
        // Implement add tv show logic here
        if (doesTvShowExist(show))
        {
            System.out.println("This show has been added");
        }
        else
        {
            tvShows.add(show);
        }
    }

    public void addMovie(Movie movie){
        // Implement add movie logic here
        if (doesMovieExist(movie))
        {
            System.out.println("This movie has been added");
        }
        else
        {
            movies.add(movie);
        }
    }

    public boolean createAccountUser(String username, String password) {
        // Implement create account logic here
        User currentUser = new User(username, password);
        if (doesUserExist(currentUser))
        {
            System.out.println("This username has been taken!");
            return false;
        }
        else
        {
            users.add(currentUser);
            return true;
        }
    }

    public boolean createAccountAdmin(String username, String password) {
        // Implement create account logic here
        Admin currentAdmin = new Admin(username, password);
        if (doesAdminExist(currentAdmin))
        {
            System.out.println("This username has been taken!");
            return false;
        }
        else
        {
            admins.add(currentAdmin);
            return true;
        }
    }

    public boolean loginUser(String username, String password) {
        // Implement login logic here
        User currentUser = new User(username, password);
        if (doesUserExist(currentUser))
        {
            if (passwordCheckUser(username, password))
            {
                currentUser.setLogInStatus(true);
                return true;
            }
            else
            {
                System.out.println("Wrong password!");
                currentUser.setLogInStatus(false);
                return false;
            }
        }
        else
        {
            System.out.println("This username does not exist!");
            currentUser.setLogInStatus(false);
            return false;
        }
    }

    public void logoutUser(User user) {
        // Implement logout logic here
        if (user.getLogInStatus())
        {
            user.changeLogInStatus();
        }
        else
        {
            System.out.println("The user is already logged out!");
        }
    }
    public boolean loginAdmin(String username, String password) {
        // Implement login logic here
        Admin currentAdmin = new Admin(username, password);
        if (doesAdminExist(currentAdmin))
        {
            if (passwordCheckAdmin(username, password))
            {
                currentAdmin.setLogInStatus(true);
                return true;
            }
            else
            {
                System.out.println("Wrong password!");
                currentAdmin.setLogInStatus(false);
                return false;
            }
        }
        else
        {
            System.out.println("This username does not exist!");
            currentAdmin.setLogInStatus(false);
            return false;
        }
    }

    public void logoutAdomin(Admin admin) {
        // Implement logout logic here
        if (admin.getLogInStatus())
        {
            admin.changeLogInStatus();
        }
        else
        {
            System.out.println("The admin is already logged out!");
        }
    }
    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title logic here
        ArrayList<TVShow> save = new ArrayList<>();
        for (int i=0; i<tvShows.size(); i++)
        {
            if (title.equals(tvShows.get(i).getTitle()))
            {
                save.add(tvShows.get(i));
            }
        }
        return (save);
    }

    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre logic here
        ArrayList<TVShow> save = new ArrayList<>();
        for (int i=0; i<tvShows.size(); i++)
        {
            if (genre.equals(tvShows.get(i).getGenre()))
            {
                save.add(tvShows.get(i));
            }
        }
        return (save);
    }

    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year logic here
        ArrayList<TVShow> save = new ArrayList<>();
        for (int i=0; i<tvShows.size(); i++)
        {
            if (year == tvShows.get(i).getReleaseYear())
            {
                save.add(tvShows.get(i));
            }
        }
        return (save);
    }
}

