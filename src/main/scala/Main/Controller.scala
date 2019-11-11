package Main

import Kingdom._

/**
 * Created on 29/10/2019
 * Time 10:42H
 *
 * @author Stefano Mazzuka
 */
object Controller {
  def selectName(): Unit = {
    print("Player name: ")
    choosePlayer(scala.io.StdIn.readLine())
  }

  def choosePlayer(name: String): Unit = {
    GUI.cls()
    GUI.choosePlayer()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        GUI.showMessage("Open the gate! is " + name + " the King!")
        outside(new King(name))
      }
      case "2" => {
        GUI.showMessage("Open the gate! is " + name + " the Knight!")
        outside(new Knight(name))
      }
      case "3" => {
        GUI.showMessage("Open the gate! is " + name + " the Bishop!")
        outside(new Bishop(name))
      }
      case "4" => {
        GUI.showMessage("Open the gate! is " + name + " the Guard!")
        outside(new Guard(name))
      }
      case "5" => {
        GUI.showMessage("Open the gate! is " + name + " the Peasent!")
        outside(new Peasent(name))
      }
      case "6" => GUI.showMessage("Fuck off!")
      case _ => {
        GUI.showMessage("Wrong option")
        choosePlayer(name)
      }
    }
  }

  def outside(player: Player): Unit = {
    GUI.cls()
    GUI.outside()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.living_Room) livingRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          outside(player)
        }
      }
      case "2" => {
        if (player.secret_passage) kingsRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          outside(player)
        }
      }
      case "3" => choosePlayer(player.player_name)
      case _ => {
        GUI.showMessage("Wrong option")
        outside(player)
      }
    }
  }
  def livingRoom(player: Player): Unit = {
    GUI.cls()
    GUI.livingRoom()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.dining_room) diningRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          livingRoom(player)
        }
      }
      case "2" => {
        if (player.armoury) armoury(player)
        else {
          GUI.showMessage("You can't enter here!")
          livingRoom(player)
        }
      }
      case "3" => {
        if (player.kitchen) kitchen(player)
        else {
          GUI.showMessage("You can't enter here!")
          livingRoom(player)
        }
      }
      case "4" => {
        if (player.second_floor) secondFloor(player)
        else {
          GUI.showMessage("You can't enter here!")
          livingRoom(player)
        }
      }
      case "5" => outside(player)
      case _ => {
        GUI.showMessage("Wrong option")
        livingRoom(player)
      }
    }
  }
  def diningRoom(player: Player): Unit = {
    GUI.cls()
    GUI.diningRoom()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.living_Room) livingRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          diningRoom(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        diningRoom(player)
      }
    }
  }
  def armoury(player: Player): Unit = {
    GUI.cls()
    GUI.armoury()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1"=> {
        if (player.living_Room) livingRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          armoury(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        armoury(player)
      }
    }
  }
  def kitchen(player: Player): Unit = {
    GUI.cls()
    GUI.kitchen()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.living_Room) livingRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          kitchen(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        kitchen(player)
      }
    }
  }
  def secondFloor(player: Player): Unit = {
    GUI.cls()
    GUI.secondFloor()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.bathroom) bathroom(player)
        else {
          GUI.showMessage("You can't enter here!")
          secondFloor(player)
        }
      }
      case "2" => {
        if (player.chapel) chapel(player)
        else {
          GUI.showMessage("You can't enter here!")
          secondFloor(player)
        }
      }
      case "3" => {
        if (player.kings_room) kingsRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          secondFloor(player)
        }
      }
      case "4" => {
        if (player.first_floor) livingRoom(player)
        else {
          GUI.showMessage("You can't enter here!")
          secondFloor(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        secondFloor(player)
      }
    }
  }
  def bathroom(player: Player): Unit = {
    GUI.cls()
    GUI.bathroom()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.second_floor) secondFloor(player)
        else {
          GUI.showMessage("You can't enter here!")
          bathroom(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        bathroom(player)
      }
    }
  }
  def chapel(player: Player): Unit = {
    GUI.cls()
    GUI.chapel()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.second_floor) secondFloor(player)
        else {
          GUI.showMessage("You can't enter here!")
          chapel(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        chapel(player)
      }
    }
  }
  def kingsRoom(player: Player): Unit = {
    GUI.cls()
    GUI.kingsRoom()

    val op = scala.io.StdIn.readLine()

    op match {
      case "1" => {
        if (player.second_floor) secondFloor(player)
        else {
          GUI.showMessage("You can't enter here!")
          kingsRoom(player)
        }
      }
      case "2" => {
        if (player.secret_passage) outside(player)
        else {
          GUI.showMessage("You can't enter here!")
          kingsRoom(player)
        }
      }
      case _ => {
        GUI.showMessage("Wrong option")
        kingsRoom(player)
      }
    }
  }
}
