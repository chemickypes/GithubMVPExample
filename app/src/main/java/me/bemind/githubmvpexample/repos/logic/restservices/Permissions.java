
package me.bemind.githubmvpexample.repos.logic.restservices;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Permissions {

    @SerializedName("admin")
    private Boolean mAdmin;
    @SerializedName("pull")
    private Boolean mPull;
    @SerializedName("push")
    private Boolean mPush;

    public Boolean getAdmin() {
        return mAdmin;
    }

    public void setAdmin(Boolean admin) {
        mAdmin = admin;
    }

    public Boolean getPull() {
        return mPull;
    }

    public void setPull(Boolean pull) {
        mPull = pull;
    }

    public Boolean getPush() {
        return mPush;
    }

    public void setPush(Boolean push) {
        mPush = push;
    }

}
