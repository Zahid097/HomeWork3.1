package peaksoft.interfaces;

import peaksoft.models.Movies;

import java.util.List;

public interface SortAble {
    void printAllMovies(List<Movies> movies);

    void findMovie(List<Movies> movies, String title);

    void sortByYear(List<Movies> movies);

    void sortByName(List<Movies> movies);

    void sortByDirector(List<Movies> movies);
}
