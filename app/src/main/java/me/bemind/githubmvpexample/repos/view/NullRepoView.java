package me.bemind.githubmvpexample.repos.view;

import java.util.List;

import me.bemind.githubmvpexample.repos.logic.restservices.Repo;

/**
 * Created by angelomoroni on 31/01/17.
 */

public class NullRepoView implements IRepoView {
    @Override
    public void setList(List<Repo> list) {

    }

    @Override
    public void showLoader(boolean show) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void emptyList() {

    }
}
