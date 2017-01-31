package me.bemind.githubmvpexample.repos.view;

import java.util.List;

import me.bemind.githubmvpexample.repos.logic.restservices.Repo;

/**
 * Created by angelomoroni on 31/01/17.
 */

public interface IRepoView {

    void setList(List<Repo> list);

    void emptyList();

    void showLoader(boolean show);

    void onError(Throwable e);
}
