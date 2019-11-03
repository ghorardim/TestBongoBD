package problem3;

public class ForwardState implements VideoPlayerState {

    private final VideoPlayer videoPlayer;

    public ForwardState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void stop() {
        System.out.println("Video Player now in Stop state from Forward state");
        videoPlayer.setState(videoPlayer.getStopState());
    }

    @Override
    public void play() {
        System.out.println("Video Player now in Play state from Forward state");
        videoPlayer.setState(videoPlayer.getPlayState());
    }

    @Override
    public void pause() {
        System.out.println("Video Player now in Pause state from Forward state");
        videoPlayer.setState(videoPlayer.getPauseState());
    }

    @Override
    public void forward() {
        System.out.println("Video Player all ready in Forward state.");
    }

    @Override
    public void rewind() {
        System.out.println("Video Player now in Rewind state from Forward state");
        videoPlayer.setState(videoPlayer.getRewindState());
    }

}
