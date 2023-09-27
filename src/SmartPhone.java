
class Phone
{
    public void call()
    {
        System.out.println("Calling xyz person");
    }
    public void sms()
    {
        System.out.println("sms sent to xyz person");
    }
}

interface ICamera    //it is good practice if you use I in starting of a interface name.
                     //this is because Camera can also be used as class. SO to avoid confusion use I.
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void pause();
    void change();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall()
    {
        System.out.println("Video calling xyz person");
    }

    @Override
    public void click() {
        System.out.println("Picture clicked");
    }

    @Override
    public void record() {
        System.out.println("Video recorder");
    }

    @Override
    public void play() {
        System.out.println("Song play");
    }

    @Override
    public void pause() {
        System.out.println("Song paused");
    }

    @Override
    public void change() {
        System.out.println("Change song");
    }
}

class Test1
{
    public static void main(String[] args) {

        SmartPhone s=new SmartPhone();
        Phone p=s;      //this says that a Smartphone can also be used as a normal phone for calling and sms
        ICamera c=s;     //this says that a smartphone can also be used as camera.
        IMusicPlayer m=s;//this says that a smartphone can also be used as a music player.
        p.call();

        //do it yourself and see what methods we can call using the references s,p,c,m.



    }
}
