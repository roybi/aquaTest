package BlogFeatures;

import Utils.CurrentDate;
import Utils.RandomGUID;

import java.time.Instant;

public class Comment {

    public void addComment( String author ) {

        final String content;

        //Get current Time
        CurrentDate curDateTime = new CurrentDate();
        Instant dd = curDateTime.curentDateTime();

        //Create GUID
        RandomGUID rndGUI = new RandomGUID();
        String commentGuid = rndGUI.createRandomGUID();
    }
}
