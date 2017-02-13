package me.bemind.githubmvpexample.repos.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import me.bemind.githubmvpexample.repos.logic.restservices.IGithubService;
import me.bemind.githubmvpexample.repos.logic.restservices.Repo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by angelomoroni on 31/01/17.
 */

public class RepoLogic implements IRepoLogic {

    @Override
    public void getReposList(String nick, final GetRepoListener listener)  {




        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IGithubService service = retrofit.create(IGithubService.class);

        service.listRepos(nick).enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                listener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                listener.onFailure(t);
            }
        });

    }


    @Override
    public Observable<Repo> getReposList(String nickname) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IGithubService service = retrofit.create(IGithubService.class);

        return  service.listReposAsObservable(nickname)
                .flatMap(new Func1<List<Repo>, Observable<Repo>>() {
                    @Override
                    public Observable<Repo> call(List<Repo> repos) {
                        return Observable.from(repos);
                    }
                });

        //return null;
    }



    @Override
    public Observable<List<Repo>> getReposListAsList(String nickname) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IGithubService service = retrofit.create(IGithubService.class);

        return  service.listReposAsObservable(nickname);
    }

    private List<String> getFakeStringList() {


        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                List<String> strings = getFakeStringList();

                if(strings == null){
                    listener.onFailure(new NullPointerException());
                }else {
                    listener.onSuccess(strings);
                }

            }
        },3500);*/

        Random random = new Random();

        int rr = random.nextInt();
        if(rr % 10 == 0) return null;

        ArrayList<String> strings = new ArrayList<>();

        for(int i = 0;i<10;i++){
            strings.add("Repos "+(i+1));
        }
        return strings;
    }


}
