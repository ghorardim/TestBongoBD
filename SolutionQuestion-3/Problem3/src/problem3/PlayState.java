package problem3;

public class PlayState implements VideoPlayerState {

    private final VideoPlayer videoPlayer;

    public PlayState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void stop() {
        System.out.println("Video Player now in Stop state from Play state");
        videoPlayer.setState(videoPlayer.getStopState());
    }

    @Override
    public void play() {
        System.out.println("Video Player all ready in Play state.");
    }

    @Override
    public void pause() {
        System.out.println("Video Player now in Pause state from Play state");
        videoPlayer.setState(videoPlayer.getPauseState());
    }

    @Override
    public void forward() {
        System.out.println("Video Player now in Forward state from Play state");
        videoPlayer.setState(videoPlayer.getForwardState());
    }

    @Override
    public void rewind() {
        System.out.println("Video Player now in Rewind state from Play state");
        videoPlayer.setState(videoPlayer.getRewindState());
    }

}
