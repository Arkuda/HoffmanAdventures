
import net.orangejar.hoffmanadventures.Game
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.ApplicationListener



    //public vars

    var version = "0.0.1"

    var xlenght : Int = 420
    var ylenght : Int = 680

    //end public vars


fun main(args : Array<String>)
{
    var listener : ApplicationListener = Game()
    LwjglApplication( listener, "", ylenght,xlenght, false );
}



///http://steigert.blogspot.ru/2012/03/4-libgdx-tutorial-tablelayout.html - gui tutorial