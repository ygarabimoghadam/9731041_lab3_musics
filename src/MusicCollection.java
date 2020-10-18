import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
    //an Arraylist for showing fav musics;
    private ArrayList<String > fave;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
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
        for(String f : files){
            boolean n = files.contains(filename);
            if(n)
                System.out.println("Already added.!");
            else
                files.add(filename);
        }
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        int s = files.size();
        return  s;
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        boolean v = validIndex(index);
        if(v){
        String s = files.get(index);
        System.out.println(s);}
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(String s : files){

            System.out.println(s);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        boolean v = validIndex(index);
        if (v) {
            Iterator<String> it = files.iterator();
            while (it.hasNext()) {
                String s = it.next();
                int i = files.indexOf(s);
                if (i == index)
                    it.remove();
                else
                    break;
            }
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        boolean v = validIndex(index);
        if(v){
        String s = files.get(index);
        player.startPlaying(s);

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
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        boolean output ;
        int i = 0;
        while( i<=files.size()){
            i++;
        }
        if(index>i){
            System.out.println("imvalid index");
            output = false;
        }
        else
            output = true;
        // The return value.
        // Set according to whether the index is valid or not.

    return output;
    }

    /**
     * seaerching the name between files of the music.
     * @param name name that to be searched.
     */

    public void search(String name)
    {
        for (String s:files) {
            if(s==name)

                System.out.println("founded");
        }
    }

    /**
     * add fave file to the Arraylist.
     * @param name of the fave music.
     */

    public void addFave(String name)
    {
        for (String s : fave) {
            if(files.contains(name))
                System.out.println("Already added.");
            else
                fave.add(name);
        }
    }

    /**
     * print fave musics.
     */

    public void printFav()
    {
        for (String s : fave) {
            System.out.println(s);
        }
    }
}