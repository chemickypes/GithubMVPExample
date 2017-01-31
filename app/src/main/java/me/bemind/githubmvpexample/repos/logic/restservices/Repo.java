
package me.bemind.githubmvpexample.repos.logic.restservices;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Repo {

    @SerializedName("archive_url")
    private String mArchiveUrl;
    @SerializedName("assignees_url")
    private String mAssigneesUrl;
    @SerializedName("blobs_url")
    private String mBlobsUrl;
    @SerializedName("branches_url")
    private String mBranchesUrl;
    @SerializedName("clone_url")
    private String mCloneUrl;
    @SerializedName("collaborators_url")
    private String mCollaboratorsUrl;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("commits_url")
    private String mCommitsUrl;
    @SerializedName("compare_url")
    private String mCompareUrl;
    @SerializedName("contents_url")
    private String mContentsUrl;
    @SerializedName("contributors_url")
    private String mContributorsUrl;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("default_branch")
    private String mDefaultBranch;
    @SerializedName("deployments_url")
    private String mDeploymentsUrl;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("downloads_url")
    private String mDownloadsUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("fork")
    private Boolean mFork;
    @SerializedName("forks_count")
    private Long mForksCount;
    @SerializedName("forks_url")
    private String mForksUrl;
    @SerializedName("full_name")
    private String mFullName;
    @SerializedName("git_commits_url")
    private String mGitCommitsUrl;
    @SerializedName("git_refs_url")
    private String mGitRefsUrl;
    @SerializedName("git_tags_url")
    private String mGitTagsUrl;
    @SerializedName("git_url")
    private String mGitUrl;
    @SerializedName("has_downloads")
    private Boolean mHasDownloads;
    @SerializedName("has_issues")
    private Boolean mHasIssues;
    @SerializedName("has_pages")
    private Boolean mHasPages;
    @SerializedName("has_wiki")
    private Boolean mHasWiki;
    @SerializedName("homepage")
    private String mHomepage;
    @SerializedName("hooks_url")
    private String mHooksUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("id")
    private Long mId;
    @SerializedName("issue_comment_url")
    private String mIssueCommentUrl;
    @SerializedName("issue_events_url")
    private String mIssueEventsUrl;
    @SerializedName("issues_url")
    private String mIssuesUrl;
    @SerializedName("keys_url")
    private String mKeysUrl;
    @SerializedName("labels_url")
    private String mLabelsUrl;
    @SerializedName("language")
    private Object mLanguage;
    @SerializedName("languages_url")
    private String mLanguagesUrl;
    @SerializedName("merges_url")
    private String mMergesUrl;
    @SerializedName("milestones_url")
    private String mMilestonesUrl;
    @SerializedName("mirror_url")
    private String mMirrorUrl;
    @SerializedName("name")
    private String mName;
    @SerializedName("notifications_url")
    private String mNotificationsUrl;
    @SerializedName("open_issues_count")
    private Long mOpenIssuesCount;
    @SerializedName("owner")
    private Owner mOwner;
    @SerializedName("permissions")
    private Permissions mPermissions;
    @SerializedName("private")
    private Boolean mPrivate;
    @SerializedName("pulls_url")
    private String mPullsUrl;
    @SerializedName("pushed_at")
    private String mPushedAt;
    @SerializedName("releases_url")
    private String mReleasesUrl;
    @SerializedName("size")
    private Long mSize;
    @SerializedName("ssh_url")
    private String mSshUrl;
    @SerializedName("stargazers_count")
    private Long mStargazersCount;
    @SerializedName("stargazers_url")
    private String mStargazersUrl;
    @SerializedName("statuses_url")
    private String mStatusesUrl;
    @SerializedName("subscribers_url")
    private String mSubscribersUrl;
    @SerializedName("subscription_url")
    private String mSubscriptionUrl;
    @SerializedName("svn_url")
    private String mSvnUrl;
    @SerializedName("tags_url")
    private String mTagsUrl;
    @SerializedName("teams_url")
    private String mTeamsUrl;
    @SerializedName("trees_url")
    private String mTreesUrl;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("watchers_count")
    private Long mWatchersCount;

    public String getArchiveUrl() {
        return mArchiveUrl;
    }

    public void setArchiveUrl(String archive_url) {
        mArchiveUrl = archive_url;
    }

    public String getAssigneesUrl() {
        return mAssigneesUrl;
    }

    public void setAssigneesUrl(String assignees_url) {
        mAssigneesUrl = assignees_url;
    }

    public String getBlobsUrl() {
        return mBlobsUrl;
    }

    public void setBlobsUrl(String blobs_url) {
        mBlobsUrl = blobs_url;
    }

    public String getBranchesUrl() {
        return mBranchesUrl;
    }

    public void setBranchesUrl(String branches_url) {
        mBranchesUrl = branches_url;
    }

    public String getCloneUrl() {
        return mCloneUrl;
    }

    public void setCloneUrl(String clone_url) {
        mCloneUrl = clone_url;
    }

    public String getCollaboratorsUrl() {
        return mCollaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaborators_url) {
        mCollaboratorsUrl = collaborators_url;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String comments_url) {
        mCommentsUrl = comments_url;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commits_url) {
        mCommitsUrl = commits_url;
    }

    public String getCompareUrl() {
        return mCompareUrl;
    }

    public void setCompareUrl(String compare_url) {
        mCompareUrl = compare_url;
    }

    public String getContentsUrl() {
        return mContentsUrl;
    }

    public void setContentsUrl(String contents_url) {
        mContentsUrl = contents_url;
    }

    public String getContributorsUrl() {
        return mContributorsUrl;
    }

    public void setContributorsUrl(String contributors_url) {
        mContributorsUrl = contributors_url;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String created_at) {
        mCreatedAt = created_at;
    }

    public String getDefaultBranch() {
        return mDefaultBranch;
    }

    public void setDefaultBranch(String default_branch) {
        mDefaultBranch = default_branch;
    }

    public String getDeploymentsUrl() {
        return mDeploymentsUrl;
    }

    public void setDeploymentsUrl(String deployments_url) {
        mDeploymentsUrl = deployments_url;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDownloadsUrl() {
        return mDownloadsUrl;
    }

    public void setDownloadsUrl(String downloads_url) {
        mDownloadsUrl = downloads_url;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String events_url) {
        mEventsUrl = events_url;
    }

    public Boolean getFork() {
        return mFork;
    }

    public void setFork(Boolean fork) {
        mFork = fork;
    }

    public Long getForksCount() {
        return mForksCount;
    }

    public void setForksCount(Long forks_count) {
        mForksCount = forks_count;
    }

    public String getForksUrl() {
        return mForksUrl;
    }

    public void setForksUrl(String forks_url) {
        mForksUrl = forks_url;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String full_name) {
        mFullName = full_name;
    }

    public String getGitCommitsUrl() {
        return mGitCommitsUrl;
    }

    public void setGitCommitsUrl(String git_commits_url) {
        mGitCommitsUrl = git_commits_url;
    }

    public String getGitRefsUrl() {
        return mGitRefsUrl;
    }

    public void setGitRefsUrl(String git_refs_url) {
        mGitRefsUrl = git_refs_url;
    }

    public String getGitTagsUrl() {
        return mGitTagsUrl;
    }

    public void setGitTagsUrl(String git_tags_url) {
        mGitTagsUrl = git_tags_url;
    }

    public String getGitUrl() {
        return mGitUrl;
    }

    public void setGitUrl(String git_url) {
        mGitUrl = git_url;
    }

    public Boolean getHasDownloads() {
        return mHasDownloads;
    }

    public void setHasDownloads(Boolean has_downloads) {
        mHasDownloads = has_downloads;
    }

    public Boolean getHasIssues() {
        return mHasIssues;
    }

    public void setHasIssues(Boolean has_issues) {
        mHasIssues = has_issues;
    }

    public Boolean getHasPages() {
        return mHasPages;
    }

    public void setHasPages(Boolean has_pages) {
        mHasPages = has_pages;
    }

    public Boolean getHasWiki() {
        return mHasWiki;
    }

    public void setHasWiki(Boolean has_wiki) {
        mHasWiki = has_wiki;
    }

    public String getHomepage() {
        return mHomepage;
    }

    public void setHomepage(String homepage) {
        mHomepage = homepage;
    }

    public String getHooksUrl() {
        return mHooksUrl;
    }

    public void setHooksUrl(String hooks_url) {
        mHooksUrl = hooks_url;
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

    public String getIssueCommentUrl() {
        return mIssueCommentUrl;
    }

    public void setIssueCommentUrl(String issue_comment_url) {
        mIssueCommentUrl = issue_comment_url;
    }

    public String getIssueEventsUrl() {
        return mIssueEventsUrl;
    }

    public void setIssueEventsUrl(String issue_events_url) {
        mIssueEventsUrl = issue_events_url;
    }

    public String getIssuesUrl() {
        return mIssuesUrl;
    }

    public void setIssuesUrl(String issues_url) {
        mIssuesUrl = issues_url;
    }

    public String getKeysUrl() {
        return mKeysUrl;
    }

    public void setKeysUrl(String keys_url) {
        mKeysUrl = keys_url;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labels_url) {
        mLabelsUrl = labels_url;
    }

    public Object getLanguage() {
        return mLanguage;
    }

    public void setLanguage(Object language) {
        mLanguage = language;
    }

    public String getLanguagesUrl() {
        return mLanguagesUrl;
    }

    public void setLanguagesUrl(String languages_url) {
        mLanguagesUrl = languages_url;
    }

    public String getMergesUrl() {
        return mMergesUrl;
    }

    public void setMergesUrl(String merges_url) {
        mMergesUrl = merges_url;
    }

    public String getMilestonesUrl() {
        return mMilestonesUrl;
    }

    public void setMilestonesUrl(String milestones_url) {
        mMilestonesUrl = milestones_url;
    }

    public String getMirrorUrl() {
        return mMirrorUrl;
    }

    public void setMirrorUrl(String mirror_url) {
        mMirrorUrl = mirror_url;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNotificationsUrl() {
        return mNotificationsUrl;
    }

    public void setNotificationsUrl(String notifications_url) {
        mNotificationsUrl = notifications_url;
    }

    public Long getOpenIssuesCount() {
        return mOpenIssuesCount;
    }

    public void setOpenIssuesCount(Long open_issues_count) {
        mOpenIssuesCount = open_issues_count;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        mOwner = owner;
    }

    public Permissions getPermissions() {
        return mPermissions;
    }

    public void setPermissions(Permissions permissions) {
        mPermissions = permissions;
    }

    public Boolean getPrivate() {
        return mPrivate;
    }

    public void setPrivate(Boolean mrivate) {
        mPrivate = mrivate;
    }

    public String getPullsUrl() {
        return mPullsUrl;
    }

    public void setPullsUrl(String pulls_url) {
        mPullsUrl = pulls_url;
    }

    public String getPushedAt() {
        return mPushedAt;
    }

    public void setPushedAt(String pushed_at) {
        mPushedAt = pushed_at;
    }

    public String getReleasesUrl() {
        return mReleasesUrl;
    }

    public void setReleasesUrl(String releases_url) {
        mReleasesUrl = releases_url;
    }

    public Long getSize() {
        return mSize;
    }

    public void setSize(Long size) {
        mSize = size;
    }

    public String getSshUrl() {
        return mSshUrl;
    }

    public void setSshUrl(String ssh_url) {
        mSshUrl = ssh_url;
    }

    public Long getStargazersCount() {
        return mStargazersCount;
    }

    public void setStargazersCount(Long stargazers_count) {
        mStargazersCount = stargazers_count;
    }

    public String getStargazersUrl() {
        return mStargazersUrl;
    }

    public void setStargazersUrl(String stargazers_url) {
        mStargazersUrl = stargazers_url;
    }

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statuses_url) {
        mStatusesUrl = statuses_url;
    }

    public String getSubscribersUrl() {
        return mSubscribersUrl;
    }

    public void setSubscribersUrl(String subscribers_url) {
        mSubscribersUrl = subscribers_url;
    }

    public String getSubscriptionUrl() {
        return mSubscriptionUrl;
    }

    public void setSubscriptionUrl(String subscription_url) {
        mSubscriptionUrl = subscription_url;
    }

    public String getSvnUrl() {
        return mSvnUrl;
    }

    public void setSvnUrl(String svn_url) {
        mSvnUrl = svn_url;
    }

    public String getTagsUrl() {
        return mTagsUrl;
    }

    public void setTagsUrl(String tags_url) {
        mTagsUrl = tags_url;
    }

    public String getTeamsUrl() {
        return mTeamsUrl;
    }

    public void setTeamsUrl(String teams_url) {
        mTeamsUrl = teams_url;
    }

    public String getTreesUrl() {
        return mTreesUrl;
    }

    public void setTreesUrl(String trees_url) {
        mTreesUrl = trees_url;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updated_at) {
        mUpdatedAt = updated_at;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Long getWatchersCount() {
        return mWatchersCount;
    }

    public void setWatchersCount(Long watchers_count) {
        mWatchersCount = watchers_count;
    }

}
