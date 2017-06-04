package model;

import java.util.ArrayList;

/**
 * This class represents a glassdoor response message.
 * @author Gloria
 *
 */
public class Response {
    private String attributionURL;
    private int currentPageNumber;
    private int totalNumberOfPages;
    private int totalRecordCount;
    private ArrayList<Employer> employers;

    public Response() {
    }

    public String getAttributionURL() {
        return attributionURL;
    }

    public void setAttributionURL(String attributionURL) {
        this.attributionURL = attributionURL;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }

    public int getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(int totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    @Override
    public String toString() {
        return "Response [attributionURL=" + attributionURL + ", currentPageNumber=" + currentPageNumber
                + ", totalNumberOfPages=" + totalNumberOfPages + ", totalRecordCount=" + totalRecordCount
                + ", employers=" + employers + "]";
    }

}
