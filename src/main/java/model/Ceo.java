package model;

/**
 * CEO's information.
 * @author Gloria
 *
 */
public class Ceo {
    private String name;
    private String title;
    private int numberOfRatings;
    private int pctApprove;
    private int pctDisapprove;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public int getPctApprove() {
        return pctApprove;
    }

    public void setPctApprove(int pctApprove) {
        this.pctApprove = pctApprove;
    }

    public int getPctDisapprove() {
        return pctDisapprove;
    }

    public void setPctDisapprove(int pctDisapprove) {
        this.pctDisapprove = pctDisapprove;
    }

    @Override
    public String toString() {
        return "Ceo [name=" + name + ", title=" + title + ", numberOfRatings=" + numberOfRatings + ", pctApprove="
                + pctApprove + ", pctDisapprove=" + pctDisapprove + "]";
    }
}
