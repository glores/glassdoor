package model;

/**
 * This class represents a glassdoor review.
 * @author Gloria
 *
 */
public class FeaturedReview {
    private String attributionURL;
    private int id;
    private boolean currentJob;
    private String reviewDateTime;
    private String jobTitle;
    private String location;
    private String jobTitleFromDb;
    private String headline;
    private String pros;
    private String cons;
    private int overall;
    private int overallNumeric;

    public String getAttributionURL() {
        return attributionURL;
    }

    public void setAttributionURL(String attributionURL) {
        this.attributionURL = attributionURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(boolean currentJob) {
        this.currentJob = currentJob;
    }

    public String getReviewDateTime() {
        return reviewDateTime;
    }

    public void setReviewDateTime(String reviewDateTime) {
        this.reviewDateTime = reviewDateTime;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobTitleFromDb() {
        return jobTitleFromDb;
    }

    public void setJobTitleFromDb(String jobTitleFromDb) {
        this.jobTitleFromDb = jobTitleFromDb;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getOverallNumeric() {
        return overallNumeric;
    }

    public void setOverallNumeric(int overallNumeric) {
        this.overallNumeric = overallNumeric;
    }

    @Override
    public String toString() {
        return "FeaturedReview [attributionURL=" + attributionURL + ", id=" + id + ", currentJob=" + currentJob
                + ", reviewDateTime=" + reviewDateTime + ", jobTitle=" + jobTitle + ", location=" + location
                + ", jobTitleFromDb=" + jobTitleFromDb + ", headline=" + headline + ", pros=" + pros + ", cons=" + cons
                + ", overall=" + overall + ", overallNumeric=" + overallNumeric + "]";
    }
}
