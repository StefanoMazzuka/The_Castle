package Kingdom

import Permissions.High

/**
 * Created on 29/10/2019
 * Time 10:49H
 *
 * @author Stefano Mazzuka
 */
class Knight(name: String) extends Player with High {
  player_name = name
  player_type = "Knight"
}
