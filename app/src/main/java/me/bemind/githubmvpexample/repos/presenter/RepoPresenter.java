package me.bemind.githubmvpexample.repos.presenter;

import java.util.List;

import me.bemind.githubmvpexample.repos.logic.GetRepoListener;
import me.bemind.githubmvpexample.repos.logic.IRepoLogic;
import me.bemind.githubmvpexample.repos.logic.RepoLogic;
import me.bemind.githubmvpexample.repos.logic.restservices.Repo;
import me.bemind.githubmvpexample.repos.view.IRepoView;
import me.bemind.githubmvpexample.repos.view.NullRepoView;

/**
 * Created by angelomoroni on 31/01/17.
 */

public class RepoPresenter implements IRepoPresenter, GetRepoListener {


    private IRepoView repoView = new NullRepoView();
    private IRepoLogic repoLogic;

    public RepoPresenter() {
        repoLogic = new RepoLogic();
    }

    @Override
    public void subscribe(IRepoView repoView) {
        this.repoView  = repoView;
    }

    @Override
    public void unsubscribe() {
        repoView = new NullRepoView();
    }

    @Override
    public void searchRepos(String nickname) {

        repoView.showLoader(true);
        repoLogic.getReposList(nickname,this);

    }

    @Override
    public void onSuccess(List<Repo> repos) {
        repoView.showLoader(false);

        repoView.setList(repos);
    }

    @Override
    public void onFailure(Throwable e) {
        repoView.showLoader(false);
        repoView.onError(e);
    }
}
