package BlogFeatures;

import Utils.RandomGUID;

import java.util.ArrayList;

public class Blog {
    public void createNewBlog(String blogOwner){

        //Create GUID
        RandomGUID rndGUI= new RandomGUID();
        String postGuid=rndGUI.createRandomGUID();

        //Add Comment
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add();
    }
}
