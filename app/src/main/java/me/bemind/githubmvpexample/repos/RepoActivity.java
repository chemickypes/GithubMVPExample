package me.bemind.githubmvpexample.repos;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

import me.bemind.githubmvpexample.R;
import me.bemind.githubmvpexample.repos.logic.restservices.Repo;
import me.bemind.githubmvpexample.repos.presenter.IRepoPresenter;
import me.bemind.githubmvpexample.repos.presenter.RepoPresenter;
import me.bemind.githubmvpexample.repos.view.IRepoView;
import me.bemind.githubmvpexample.repos.view.adapter.ReposAdapter;

public class RepoActivity extends Activity  implements IRepoView, View.OnClickListener {

    private IRepoPresenter presenter;

    //views
    private EditText searchBar;
    private ImageButton searchButton;
    private RecyclerView list;
    private View loaderView;

    //adapter
    private ReposAdapter mAdapter;

    //useful
    private boolean isLoaderVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo);

        presenter = new RepoPresenter();

        searchBar = findView(R.id.searchEditText);
        searchButton = findView(R.id.searchButton);

        loaderView = findView(R.id.loadingView);

        list = findView(R.id.list);

        list.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new ReposAdapter();

        list.setAdapter(mAdapter);

    }

    @Override
    protected void onPause() {
        super.onPause();

        searchButton.setOnClickListener(null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.unsubscribe();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.subscribe(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        searchButton.setOnClickListener(this);


    }

    @Override
    public void setList(List<Repo> list) {
        mAdapter.clear();
        mAdapter.addAll(list);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void showLoader(boolean show) {

        if(show){
            if(!isLoaderVisible){
                loaderView.setVisibility(View.VISIBLE);
                isLoaderVisible = true;
            }
        }else {
            if(isLoaderVisible){
                loaderView.setVisibility(View.GONE);
                isLoaderVisible = false;
            }
        }
    }

    @Override
    public void onError(Throwable e) {
        Toast.makeText(this,"Errore nel caricamento della lista",Toast.LENGTH_LONG).show();
    }

    private <V> V findView(@IdRes int id){
        return (V) findViewById(id);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.searchButton){
            if(!TextUtils.isEmpty(searchBar.getText())){
                presenter.searchRepos(searchBar.getText().toString());
            }else {
                Toast.makeText(this,"Il nick non deve essere vuoto",Toast.LENGTH_LONG).show();
            }
        }
    }
}
