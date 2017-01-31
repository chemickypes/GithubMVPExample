
package me.bemind.githubmvpexample.repos.logic.restservices;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Owner {

    @SerializedName("avatar_url")
    private String mAvatarUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("followers_url")
    private String mFollowersUrl;
    @SerializedName("following_url")
    private String mFollowingUrl;
    @SerializedName("gists_url")
    private String mGistsUrl;
    @SerializedName("gravatar_id")
    private String mGravatarId;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("id")
    private Long mId;
    @SerializedName("login")
    private String mLogin;
    @SerializedName("organizations_url")
    private String mOrganizationsUrl;
    @SerializedName("received_events_url")
    private String mReceivedEventsUrl;
    @SerializedName("repos_url")
    private String mReposUrl;
    @SerializedName("site_admin")
    private Boolean mSiteAdmin;
    @SerializedName("starred_url")
    private String mStarredUrl;
    @SerializedName("subscriptions_url")
    private String mSubscriptionsUrl;
    @SerializedName("type")
    private String mType;
    @SerializedName("url")
    private String mUrl;

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatar_url) {
        mAvatarUrl = avatar_url;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String events_url) {
        mEventsUrl = events_url;
    }

    public String getFollowersUrl() {
        return mFollowersUrl;
    }

    public void setFollowersUrl(String followers_url) {
        mFollowersUrl = followers_url;
    }

    public String getFollowingUrl() {
        return mFollowingUrl;
    }

    public void setFollowingUrl(String following_url) {
        mFollowingUrl = following_url;
    }

    public String getGistsUrl() {
        return mGistsUrl;
    }

    public void setGistsUrl(String gists_url) {
        mGistsUrl = gists_url;
    }

    public String getGravatarId() {
        return mGravatarId;
    }

    public void setGravatarId(String gravatar_id) {
        mGravatarId = gravatar_id;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String html_url) {
        mHtmlUrl = html_url;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    public String getOrganizationsUrl() {
        return mOrganizationsUrl;
    }

    public void setOrganizationsUrl(String organizations_url) {
        mOrganizationsUrl = organizations_url;
    }

    public String getReceivedEventsUrl() {
        return mReceivedEventsUrl;
    }

    public void setReceivedEventsUrl(String received_events_url) {
        mReceivedEventsUrl = received_events_url;
    }

    public String getReposUrl() {
        return mReposUrl;
    }

    public void setReposUrl(String repos_url) {
        mReposUrl = repos_url;
    }

    public Boolean getSiteAdmin() {
        return mSiteAdmin;
    }

    public void setSiteAdmin(Boolean site_admin) {
        mSiteAdmin = site_admin;
    }

    public String getStarredUrl() {
        return mStarredUrl;
    }

    public void setStarredUrl(String starred_url) {
        mStarredUrl = starred_url;
    }

    public String getSubscriptionsUrl() {
        return mSubscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptions_url) {
        mSubscriptionsUrl = subscriptions_url;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
