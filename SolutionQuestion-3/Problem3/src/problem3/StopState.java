package problem3;

public class StopState implements VideoPlayerState {

    private final VideoPlayer videoPlayer;

    public StopState(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void stop() {
        System.out.println("Video Player all ready in Stop state.");
    }

    @Override
    public void play() {
        System.out.println("Video Player now in Play state from Stop state");
        videoPlayer.setState(videoPlayer.getPlayState());
    }

    @Override
    public void pause() {
        System.out.println("Pause is not working in Stop state.");
    }

    @Override
    public void forward() {
        System.out.println("Forward is not working in Stop state.");
    }

    @Override
    public void rewind() {
        System.out.println("Rewind is not working in Stop state.");
    }

}
