package problem3;

public class PauseState implements VideoPlayerState {

    private final VideoPlayer videoPlayer;

    public PauseState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void stop() {
        System.out.println("Video Player now in Stop state from Pause state");
        videoPlayer.setState(videoPlayer.getStopState());
    }

    @Override
    public void play() {
        System.out.println("Video Player now in Play state from Pause state");
        videoPlayer.setState(videoPlayer.getPlayState());
    }

    @Override
    public void pause() {
        System.out.println("Video Player all ready in Pause state.");
    }

    @Override
    public void forward() {
        System.out.println("Video Player now in Forward state from Pause state");
        videoPlayer.setState(videoPlayer.getForwardState());
    }

    @Override
    public void rewind() {
        System.out.println("Video Player now in Rewind state from Pause state");
        videoPlayer.setState(videoPlayer.getRewindState());
    }

}
