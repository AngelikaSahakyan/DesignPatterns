package paterns.adapter;

interface MediaPlayer {
    void play(String fileName);
}

interface MediaPackage {
    void playFile(String fileName);
}

class MP3 implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("playing MP3 file " + fileName);
    }
}

class MP4 implements MediaPackage {
    @Override
    public void playFile(String fileName) {
        System.out.println("playing MP4 file " + fileName);
    }
}

class VLC implements MediaPackage {
    @Override
    public void playFile(String fileName) {
        System.out.println("playing VLC file " + fileName);
    }
}

class FormatAdapter implements MediaPlayer {
    MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using adapter -->");
        mediaPackage.playFile(fileName);
    }
}




