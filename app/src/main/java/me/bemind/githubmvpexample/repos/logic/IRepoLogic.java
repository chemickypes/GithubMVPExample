package me.bemind.githubmvpexample.repos.logic;

import java.util.List;

import me.bemind.githubmvpexample.repos.logic.restservices.Repo;
import rx.Observable;

/**
 * Created by angelomoroni on 31/01/17.
 */

public interface IRepoLogic {

    void getReposList(String nick,GetRepoListener listener);

    Observable<Repo> getReposList(String nickname);

    Observable<List<Repo>> getReposListAsList(String nickname);
}
