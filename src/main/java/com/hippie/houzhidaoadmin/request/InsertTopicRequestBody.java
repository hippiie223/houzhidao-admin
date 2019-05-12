package com.hippie.houzhidaoadmin.request;

/**
 * @author 39239
 * @Date 2019/5/9 13:27
 * @Package com.hippie.houzhidaoadmin.request
 * @Description:
 */

public class InsertTopicRequestBody {
    private String title;
    private String startTime;
    private String endTime;
    private String content;
    private String pic;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
