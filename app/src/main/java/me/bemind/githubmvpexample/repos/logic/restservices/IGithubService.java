package me.bemind.githubmvpexample.repos.logic.restservices;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by angelomoroni on 31/01/17.
 */

public interface IGithubService {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);


    @GET("users/{user}/repos")
    Observable<List<Repo>> listReposAsObservable(@Path("user") String user);

}
