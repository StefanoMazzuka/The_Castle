package Main

/**
 * Created on 29/10/2019
 * Time 10:41H
 *
 * @author Stefano Mazzuka
 */
object Main extends App {
  GUI.cls()
  GUI.title()
  GUI.castle()
  Controller.selectName()
  Thread.sleep(5000)
}
