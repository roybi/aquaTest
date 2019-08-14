package BlogFeatures;

import Utils.CurrentDate;
import Utils.RandomGUID;

import java.time.Instant;
import java.util.ArrayList;

public class Post {
    public void addPost(String titlePost,String strComment,String author) {

        //Create GUID
        RandomGUID rndGUI= new RandomGUID();
        String postGuid=rndGUI.createRandomGUID();

        //Get current Time
        CurrentDate curDateTime = new CurrentDate();
        Instant dd = curDateTime.curentDateTime();

        //Multiplie comments
        ArrayList<Comment> postComment = new ArrayList<Comment>();
        postComment.add(addCommentToPost(strComment));
    }

    public String addCommentToPost(String strComment2) {

        //Add Comment
        Comment newComment =new Comment();

    }
}
