package org.example;

import java.util.ArrayList;

class User {
    /*
     * The user should contain username password.
     * The user should contain an ArrayList of favorite shows and watch history.
     * FUNCTION: the user should have a function to watch a show and add it to watch history.
     *  *** NOTE: All search functions in user are for searching in favorite shows ***
     */
    private String username;
    private String password;
    private boolean logInStatus = false;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLogInStatus() {
        return logInStatus;
    }
    public void setLogInStatus(boolean logInStatus) {
        this.logInStatus = logInStatus;
    }
    public void changeLogInStatus(){
        this.logInStatus = !logInStatus;
    }

    ArrayList<TVShow> favoriteShows = new ArrayList<>();
    ArrayList<TVShow> watchHistory = new ArrayList<>();

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title in favorite shows  logic here
        ArrayList<TVShow> save = new ArrayList<>();
        for (int i=0; i<favoriteShows.size(); i++)
        {
            if (title.equals(favoriteShows.get(i).getTitle()))
            {
                save.add(favoriteShows.get(i));
            }
        }
        return (save);
    }
    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre in favorite shows  logic here
        ArrayList<TVShow> save = new ArrayList<>();
        for (int i=0; i<favoriteShows.size(); i++)
        {
            if (genre.equals(favoriteShows.get(i).getGenre()))
            {
                save.add(favoriteShows.get(i));
            }
        }
        return (save);
    }
    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year in favorite shows logic here
        ArrayList<TVShow> save = new ArrayList<>();
        for (int i=0; i<favoriteShows.size(); i++)
        {
            if (year == favoriteShows.get(i).getReleaseYear())
            {
                save.add(favoriteShows.get(i));
            }
        }
        return (save);
    }
    public boolean doesTvShowExist(TVShow tvShow)
    {
        boolean existance = false;
        for (int i=0; i<favoriteShows.size(); i++)
        {
            if (tvShow.getTitle().equals(favoriteShows.get(i).getTitle()))
            {
                existance = true;
            }
        }
        return existance;
    }
    public void addToFavorites(NetflixService netflix, TVShow show) {
        // Implement add to favorites logic here
        if (netflix.doesTvShowExist(show))
        {
            if (doesTvShowExist(show))
            {
                System.out.println("This show has been added!");
            }
            else
            {
                favoriteShows.add(show);
            }
        }
        else
        {
            System.out.println("This show does not exist!");
        }
    }
    public void viewFavorites() {
        // Implement view favorites logic here
        System.out.println(favoriteShows);
    }
    public ArrayList<TVShow> getRecommendations() {
        // Implement get recommendations logic here
        return null;
    }
    public void watchAShow(NetflixService netflix, TVShow show)
    {
        if (netflix.doesTvShowExist(show))
        {
            watchHistory.add(show);
        }
        else
        {
            System.out.println("This show does not exist!");
        }
    }
}
