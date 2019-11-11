package Kingdom

import Permissions.Basic

/**
 * Created on 29/10/2019
 * Time 11:00H
 *
 * @author Stefano Mazzuka
 */
class Peasent(name: String) extends Player with Basic {
  player_name = name
  player_type = "Peasent"
}
