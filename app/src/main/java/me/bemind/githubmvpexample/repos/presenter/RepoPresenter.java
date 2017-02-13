package me.bemind.githubmvpexample.repos.presenter;

import java.util.List;

import me.bemind.githubmvpexample.repos.logic.GetRepoListener;
import me.bemind.githubmvpexample.repos.logic.IRepoLogic;
import me.bemind.githubmvpexample.repos.logic.RepoLogic;
import me.bemind.githubmvpexample.repos.logic.restservices.Repo;
import me.bemind.githubmvpexample.repos.view.IRepoView;
import me.bemind.githubmvpexample.repos.view.NullRepoView;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by angelomoroni on 31/01/17.
 */

public class RepoPresenter implements IRepoPresenter, GetRepoListener {


    private IRepoView repoView = new NullRepoView();
    private IRepoLogic repoLogic;

    //retrofit
    private Observable<List<Repo>> observableListOfRepo;
    private Subscriber<List<Repo>> subscriberListOfRepo;

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

        try {
            if (observableListOfRepo != null) {
                observableListOfRepo.unsafeSubscribe(subscriberListOfRepo);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void searchRepos(String nickname) {

        repoView.showLoader(true);
        //repoLogic.getReposList(nickname,this);

        subscriberListOfRepo =  new Subscriber<List<Repo>>() {
            @Override
            public void onCompleted() {
                try {
                    // unsubscribe();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Throwable e) {
                onFailure(e);
            }

            @Override
            public void onNext(List<Repo> repos) {
                onSuccess(repos);
            }
        };

        observableListOfRepo = repoLogic.getReposListAsList(nickname);

        observableListOfRepo.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriberListOfRepo);

    }

    @Override
    public void onSuccess(List<Repo> repos) {
        repoView.showLoader(false);

        if(repos!=null && repos.size()>0) {

            repoView.setList(repos);
        }else {
            repoView.emptyList();
        }
    }

    @Override
    public void onFailure(Throwable e) {
        repoView.showLoader(false);
        repoView.onError(e);
    }
}
