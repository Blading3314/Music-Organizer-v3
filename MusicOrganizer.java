import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
//28. for (Track track : tracks){ }

    
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
    
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
            
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int position = 0; 
        for(String filename : files) {
            // The following modification is the answer for question 24.
            System.out.println(position + ":"+filename);
            position++;
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
    /**
     * List the names of files matching the given search string.
     * @param searchString The string to match.
     */
    public void listMatching(String searchString) {
        for (String filename : files) {
            if (filename.contains(searchString)) {
                // A match.
                System.out.println(filename);
            
            }//25. Nothing is printed if there's no match 
            else { 
                //26. 
                System.out.println("No file names matches the search string"); 
        }  
    }
}
}
/*27. I dont think this is right?
public void playSamplesByArtist(String artist) {
    for (String filename : files) {
        if (filename.contains(artist)) {
             try {
            setupPlayer(filename);
            player.play(500);
        }
        catch(JavaLayerException e) {
            reportProblem(filename);
        }
        finally {
            killPlayer();
        }
        }
    }
}
}
*/
/* 29. boolean found = false 
 * while (found) {
 *     if (the keys are in the next place) {
 *         found = true; 
 *         }
 *         }
 }
 */
/*30. public void multiplesOfFive() {
/*    int number = 10; 
 * while (number >= 95){ 
 * Sytem.out.println(number); 
 * number +=5;
 * }
 * }
 * 
 * 31. 
 * int sum = 0; 
 * ing number = 1;
 * while (number >=10) {
 *     sum+= number;
 *     number++; 
 *     }
 *     System.out.println("Sum:"+sum); 
 */
/* 32. public int sum(int a, b){ 
/*    int number;
 * int sum = 0;
 *
 * while(number>a && number <b) {
 *     sum+=number;
 *     number++
 *     }
 *     return sum; 
 }
 * 
 */
/*  33. public boolean isPrime(int n) {
    if (n < 2) {
        return false; 
    }

    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true; 
 }
 */
/* 34. 
 * public int findFirst(String searchString)
    {
        int index = 0;
        // Record that we will be searching until a match is found.
        int fileCount = files.size(); 
        boolean searching = true;

        while(searching && index < filesCount()) {
            String filename = files.get(index);
            if(filename.contains(searchString)) {
                // A match. We can stop searching.
                searching = false;
            }
            else {
                // Move on.
                index++;
            }
        }
        if(searching) {
            // We didn't find it.
            return -1;
        }
        else {
            // Return where it was found.
            return index;
        }
    }
 * 
 */


