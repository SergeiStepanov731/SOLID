package LiskovSubstitutionPrinciple.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {

    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
