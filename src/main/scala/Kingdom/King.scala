package Kingdom

import Permissions.All

/**
 * Created on 29/10/2019
 * Time 10:29H
 *
 * @author Stefano Mazzuka
 */
class King(name: String) extends Player with All {
  player_name = name
  player_type = "King"
}
