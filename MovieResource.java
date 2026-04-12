package com.wipro.Movies;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    private static final Map<String, Movie> movies = new HashMap<>();

    static {
        movies.put("M101", new Movie("M101", "Inception", "Leonardo DiCaprio", "Elliot Page", "Christopher Nolan", 950.0));
        movies.put("M102", new Movie("M102", "Titanic", "Leonardo DiCaprio", "Kate Winslet", "James Cameron", 2200.0));
    }

    @GET
    public Collection<Movie> getAllMovies() {
        return movies.values();
    }

    @GET
    @Path("/{movieID}")
    public Response getMovieById(@PathParam("movieID") String movieID) {
        Movie movie = movies.get(movieID);

        if (movie != null) {
            return Response.ok(movie).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Movie not found")
                    .build();
        }
    }

    @POST
    public Response addMovie(Movie movie) {
        if (movie == null || movie.getMovieID() == null || movie.getMovieID().isBlank()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Invalid movie data")
                    .build();
        }

        if (movies.containsKey(movie.getMovieID())) {
            return Response.status(Response.Status.CONFLICT)
                    .entity("Movie ID already exists")
                    .build();
        }

        movies.put(movie.getMovieID(), movie);
        return Response.status(Response.Status.CREATED).entity(movie).build();
    }

    @PUT
    @Path("/{movieID}")
    public Response updateMovie(@PathParam("movieID") String movieID, Movie movie) {
        if (!movies.containsKey(movieID)) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Movie not found")
                    .build();
        }

        movie.setMovieID(movieID);
        movies.put(movieID, movie);
        return Response.ok(movie).build();
    }
}