package me.bemind.githubmvpexample.repos.logic;

import java.util.List;

import me.bemind.githubmvpexample.repos.logic.restservices.Repo;

/**
 * Created by angelomoroni on 31/01/17.
 */

public interface GetRepoListener {

    void onSuccess(List<Repo> repos);
    void onFailure(Throwable e);
}
