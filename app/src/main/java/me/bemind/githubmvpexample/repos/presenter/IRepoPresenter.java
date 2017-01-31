package me.bemind.githubmvpexample.repos.presenter;

import me.bemind.githubmvpexample.repos.view.IRepoView;

/**
 * Created by angelomoroni on 31/01/17.
 */

public interface IRepoPresenter {

    void subscribe(IRepoView repoView);
    void unsubscribe();

    void searchRepos(String nickname);

}
