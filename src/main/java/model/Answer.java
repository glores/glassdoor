package model;

/**
 * This class represents a glassdoor answer message
 * @author Gloria
 *
 */
public class Answer {
    private boolean success;
    private String status;
    private String jsessionid;
    private Response response;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Answer [success=" + success + ", status=" + status + ", jsessionid=" + jsessionid + ", response="
                + response + "]";
    }
}
