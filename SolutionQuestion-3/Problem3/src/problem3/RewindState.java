package problem3;

public class RewindState implements VideoPlayerState {

    private final VideoPlayer videoPlayer;

    public RewindState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void stop() {
        System.out.println("Video Player now in Stop state from Rewind state");
        videoPlayer.setState(videoPlayer.getStopState());
    }

    @Override
    public void play() {
        System.out.println("Video Player now in Play state from Rewind state");
        videoPlayer.setState(videoPlayer.getPlayState());
    }

    @Override
    public void pause() {
        System.out.println("Video Player now in Pause state from Rewind state");
        videoPlayer.setState(videoPlayer.getPauseState());
    }

    @Override
    public void forward() {
        System.out.println("Video Player now in Forward state from Rewind state");
        videoPlayer.setState(videoPlayer.getForwardState());
    }

    @Override
    public void rewind() {
        System.out.println("Video Player all ready in Rewind state.");
    }

}
