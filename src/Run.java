public class Run {

    public static void main(String[] args)
    {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz= new MusicCollection();
        MusicCollection rock= new MusicCollection();
        MusicCollection country= new MusicCollection();
        pop.addFile("101");
        pop.addFile("110");
        pop.addFile("120");
        pop.addFile("130");
        pop.listAllFiles();
        pop.removeFile(2);
        pop.listAllFiles();
        pop.addFave("110");
        pop.search("110");
    }
}
