package Kingdom

import Permissions.Low

/**
 * Created on 29/10/2019
 * Time 10:59H
 *
 * @author Stefano Mazzuka
 */
class Guard(name: String) extends Player with Low {
  player_name = name
  player_type = "Guard"
}
