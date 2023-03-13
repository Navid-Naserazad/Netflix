package org.example;

import java.util.ArrayList;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */

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
    public boolean doesUserExist(String username)
    {
        boolean existance = false;
        for (int i=0; i<users.size(); i++)
        {
            if (username.equals(users.get(i).getUsername()))
            {
                existance = true;
            }
        }
        return existance;
    }
    public boolean passwordCheck(String username, String password)
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
    public void addTVShow(TVShow tvShow){
        // Implement add tv show logic here
        if (doesTvShowExist(tvShow))
        {
            System.out.println("This show has been added");
        }
        else
        {
            tvShows.add(tvShow);
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

    public void createAccount(String username, String password) {
        // Implement create account logic here
        if (doesUserExist(username))
        {
            System.out.println("This username has been taken!");
        }
        else
        {
            User user = new User(username, password);
            users.add(user);
        }
    }

    public boolean login(String username, String password) {
        // Implement login logic here
        if (doesUserExist(username))
        {
            if (passwordCheck(username, password))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public void logout() {
        // Implement logout logic here
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

