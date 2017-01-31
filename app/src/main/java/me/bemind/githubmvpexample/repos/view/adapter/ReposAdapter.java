package me.bemind.githubmvpexample.repos.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import me.bemind.githubmvpexample.R;
import me.bemind.githubmvpexample.repos.logic.restservices.Repo;

/**
 * Created by angelomoroni on 31/01/17.
 */

public class ReposAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Repo> items;

    public ReposAdapter() {
        items = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repos_row,parent,false);
        return new StringViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((StringViewHolder)holder).bind(items.get(position),position);
    }


    @Override
    public int getItemCount() {

        if(items == null) items = new ArrayList<>();
        return items.size();
    }

    public void addAll(List<Repo> list){
        if(list!=null){
            items.addAll(list);
        }
    }

    public void clear() {
        items.clear();
    }

    class StringViewHolder extends RecyclerView.ViewHolder{

        private final TextView reposName;

        public StringViewHolder(View itemView) {
            super(itemView);

            reposName = (TextView) itemView.findViewById(R.id.reposNameTV);
        }

        public void bind(Repo s,int position){
            reposName.setText(s.getFullName());
        }
    }
}
