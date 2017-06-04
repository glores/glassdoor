package model;

/**
 * This class represents a glassdoor employer.
 * @author Gloria
 *
 */
public class Employer {
    private int id;
    private String name;
    private String website;
    private boolean isEEP;
    private boolean exactMatch;
    private String industry;
    private int numberOfRatings;
    private String squareLogo;
    private String overallRating;
    private String ratingDescription;
    private String cultureAndValuesRating;
    private String seniorLeadershipRating;
    private String compensationAndBenefitsRating;
    private String careerOpportunitiesRating;
    private String workLifeBalanceRating;
    private String recommendToFriendRating;
    private int sectorId;
    private String sectorName;
    private int industryId;
    private String industryName;
    private FeaturedReview featuredReview;
    private Ceo ceo;


    public Employer() {
    }

    public Employer(int id, String name, String website) {
        this.id = id;
        this.name = name;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isEEP() {
        return isEEP;
    }

    public void setEEP(boolean isEEP) {
        this.isEEP = isEEP;
    }

    public boolean isExactMatch() {
        return exactMatch;
    }

    public void setExactMatch(boolean exactMatch) {
        this.exactMatch = exactMatch;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public String getSquareLogo() {
        return squareLogo;
    }

    public void setSquareLogo(String squareLogo) {
        this.squareLogo = squareLogo;
    }

    public String getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(String overallRating) {
        this.overallRating = overallRating;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }

    public String getCultureAndValuesRating() {
        return cultureAndValuesRating;
    }

    public void setCultureAndValuesRating(String cultureAndValuesRating) {
        this.cultureAndValuesRating = cultureAndValuesRating;
    }

    public String getSeniorLeadershipRating() {
        return seniorLeadershipRating;
    }

    public void setSeniorLeadershipRating(String seniorLeadershipRating) {
        this.seniorLeadershipRating = seniorLeadershipRating;
    }

    public String getCompensationAndBenefitsRating() {
        return compensationAndBenefitsRating;
    }

    public void setCompensationAndBenefitsRating(String compensationAndBenefitsRating) {
        this.compensationAndBenefitsRating = compensationAndBenefitsRating;
    }

    public String getCareerOpportunitiesRating() {
        return careerOpportunitiesRating;
    }

    public void setCareerOpportunitiesRating(String careerOpportunitiesRating) {
        this.careerOpportunitiesRating = careerOpportunitiesRating;
    }

    public String getWorkLifeBalanceRating() {
        return workLifeBalanceRating;
    }

    public void setWorkLifeBalanceRating(String workLifeBalanceRating) {
        this.workLifeBalanceRating = workLifeBalanceRating;
    }

    public String getRecommendToFriendRating() {
        return recommendToFriendRating;
    }

    public void setRecommendToFriendRating(String recommendToFriendRating) {
        this.recommendToFriendRating = recommendToFriendRating;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public FeaturedReview getFeaturedReview() {
        return featuredReview;
    }

    public void setFeaturedReview(FeaturedReview featuredReview) {
        this.featuredReview = featuredReview;
    }

    public Ceo getCeo() {
        return ceo;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    @Override
    public String toString() {
        return "Employeer [id=" + id + ", name=" + name + "]";
    }

}
