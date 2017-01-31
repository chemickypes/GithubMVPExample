package me.bemind.githubmvpexample.repos.logic;

/**
 * Created by angelomoroni on 31/01/17.
 */

public interface IRepoLogic {

    void getReposList(String nick,GetRepoListener listener);
}
