package ru.netology.mockito;
public class MovieManager {
    private MovieManager[] movies;
    private int limit;

    public MovieManager() {
        this.limit = 5;
        this.movies = new MovieManager[0];
    }

    public MovieManager(int limit) {
        this.limit = limit;
        this.movies = new MovieManager[0];
    }

    public void add(MovieManager item) {
        MovieManager[] tmp = new MovieManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public MovieManager[] findAll() {
        return movies;
    }

    public MovieManager[] findLast() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        MovieManager[] result = new MovieManager[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

