package peaksoft.services;

import peaksoft.interfaces.FindAble;
import peaksoft.models.Cast;
import peaksoft.models.Movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindByMap implements FindAble {
    @Override
    public void findMoviesByActor(List<Movies> movies, String actorName) {
        movies.stream().filter(movies1 -> movies1.getCast()
                        .stream().anyMatch(cast -> cast.getFullName()
                                .equalsIgnoreCase(actorName)))
                .forEach(System.out::println);
    }


    @Override
    public void findMoviesByDirector(List<Movies> movies, String directorName) {
        movies.stream().filter(movies1 -> movies1.getDirector()
                        .getFullName().equalsIgnoreCase(directorName))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int year) {
        movies.stream().filter(movies1 -> movies1.getYear() == year).forEach(System.out::println);

    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies, String title) {
        movies.stream().filter(movies1 -> movies1.getCast().
                        stream().anyMatch(cast -> cast.getFullName().equalsIgnoreCase(title)))
                .forEach(System.out::println);

    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        List<Cast> allCasts = new ArrayList<>();
        movies.forEach(movie -> allCasts.addAll(movie.getCast()));

        allCasts.stream()
                .sorted(Comparator.comparing(Cast::getFullName))
                .forEach(System.out::println);
    }
}
