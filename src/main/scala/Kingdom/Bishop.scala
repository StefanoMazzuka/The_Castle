package Kingdom

import Permissions.Medium

/**
 * Created on 29/10/2019
 * Time 10:58H
 *
 * @author Stefano Mazzuka
 */
class Bishop(name: String) extends Player with Medium {
  player_name = name
  player_type = "Bishop"
}
