package net.dBuck.android.sqlite.first;

/**
 * Created by Dillon on 7/25/2014.
 */
public class Comment {
    private long id;
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    @Override
    public String toString(){
        return comment;
    }
}
