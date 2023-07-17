package polymorphism;

//Suppose we are developing a multimedia player application
// that supports playing different types of media files,
// including audio and video. Each media file type has its own
// specific behavior, but we want to provide a unified interface to play media
// files without worrying about the specific file type.
abstract class MediaFile{
    public abstract void play();
}


class AudioFile extends MediaFile {
    @Override
    public void play() {
        System.out.println("Playing audio file");
    }
}
class VideoFile extends MediaFile{

    @Override
    public void play() {
        System.out.println("Playing video file");
    }
}

class MediaPlayer{
    public void playMedia(MediaFile mediaFile){
        mediaFile.play();
    }
}
public class OverridingDemo {
    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();

        //playing an audio file
        MediaFile audioFile = new AudioFile();
        mediaPlayer.playMedia(audioFile);

        //playing a video file
        MediaFile videoFile = new VideoFile();
        mediaPlayer.playMedia(videoFile);

        //playMedia function will play the type of mediafile(object) it is being passed








        //poly ->many, morphism-> behavious => many behaviour
        // refers to the ability of objects of different classes to respond to the same method call in different ways
        //providing flexibility and extensibility to the code.
        //, providing a generalized way to work with objects. This reduces code duplication and improves maintainability
        //Runtime Binding and Late Binding: Polymorphism involves runtime binding, which means that the appropriate method implementation is determined dynamically at runtime based on the actual object type being referenced. This late binding enables dynamic behavior and promotes code flexibility in scenarios where the specific object type is not known until runtime.

        //advantages:
        //1.code reusability
        //2. Generic code - flexibility
        //3. Late binding -while overriding, appropriate method implementation
        //                is determined dynamically at runtime based on object type
        // this late binding enables code flexibility in scenarious where the specific object type
        //is not know until runtime

        //4. Loose coupling


    }
}
