package org.sam.game.EvolvedPlayers;

import org.sam.game.GPPlayer;
import org.sam.game.Game;

/**
 * Created by samuel on 14/08/14.
 */
public class RampedHigherPopAndGen extends GPPlayer {
    @Override
    protected long evalGame(char playerColour, char enemyColour, Game game) {
        return ((((-3 >= 0 ? 0 : (enemyColour == game.getColourOfStone(3, 4) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(1, 5) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) : (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0)) : (((((-2 >= 0 ? -2 : -3) >= 0 ? -3 : (playerColour == game.getColourOfStone(1, 0) ? 1 : 0)) >= 0 ? -2 : -3) >= 0 ? -3 : (playerColour == game.getColourOfStone(1, 0) ? 1 : 0)) >= 0 ? (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (playerColour == game.getColourOfStone(6, 3) ? 1 : 0)) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  :  playerCanWinInTwoRounds( playerColour, enemyColour, game) ) : ((enemyColour == game.getColourOfStone(5, 2) ? 1 : 0) >= 0 ? -2 : -3))) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (((enemyColour == game.getColourOfStone(3, 4) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(0, 3) ? 1 : 0) : (playerColour == game.getColourOfStone(5, 4) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(1, 0) ? 1 : 0) >= 0 ? ( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : ((playerColour == game.getColourOfStone(1, 5) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) : (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0))) : (enemyColour == game.getColourOfStone(0, 1) ? 1 : 0)) : (playerColour == game.getColourOfStone(6, 3) ? 1 : 0))) >= 0 ? ((( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (playerColour == game.getColourOfStone(1, 0) ? 1 : 0) : (enemyColour == game.getColourOfStone(3, 1) ? 1 : 0)) >= 0 ? ((enemyColour == game.getColourOfStone(1, 3) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(5, 3) ? 1 : 0) : (enemyColour == game.getColourOfStone(4, 1) ? 1 : 0)) : ((1 >= 0 ? 1 : 1) >= 0 ? ((enemyColour == game.getColourOfStone(1, 3) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(5, 3) ? 1 : 0) : ( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? ((enemyColour == game.getColourOfStone(2, 2) ? 1 : 0) >= 0 ? -1 : (((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : -3) >= 0 ? -3 : (playerColour == game.getColourOfStone(1, 0) ? 1 : 0))) : ((enemyColour == game.getColourOfStone(3, 4) ? 1 : 0) >= 0 ? -2 : -3))) : ((enemyColour == game.getColourOfStone(3, 0) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(5, 3) ? 1 : 0) : ((((((((playerColour == game.getColourOfStone(1, 0) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(0, 1) ? 1 : 0) : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)) >= 0 ? ((enemyColour == game.getColourOfStone(0, 1) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0) : -5) : ((enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ? 3 : (enemyColour == game.getColourOfStone(4, 4) ? 1 : 0))) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (enemyColour == game.getColourOfStone(6, 0) ? 1 : 0)) >= 0 ? 0 : (enemyColour == game.getColourOfStone(3, 4) ? 1 : 0)) >= 0 ? (playerColour == game.getColourOfStone(3, 5) ? 1 : 0) : -3) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (playerColour == game.getColourOfStone(0, 0) ? 1 : 0)) >= 0 ? (((playerColour == game.getColourOfStone(1, 2) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0) : -5) >= 0 ? ((-1 >= 0 ? -5 : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)) >= 0 ? (((enemyColour == game.getColourOfStone(3, 4) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(0, 3) ? 1 : 0) : -2) >= 0 ? 3 : -2) : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : -3)) : (((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ? -1 : (playerColour == game.getColourOfStone(6, 4) ? 1 : 0)) >= 0 ? (((playerColour == game.getColourOfStone(1, 2) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0) : -5) >= 0 ? ((-1 >= 0 ? -5 : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)) >= 0 ? (((enemyColour == game.getColourOfStone(3, 4) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(0, 3) ? 1 : 0) : -2) >= 0 ? 3 : -2) : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : 0)) : (((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ? -1 : (playerColour == game.getColourOfStone(6, 4) ? 1 : 0)) >= 0 ? ((enemyColour == game.getColourOfStone(2, 2) ? 1 : 0) >= 0 ? -1 : (playerColour == game.getColourOfStone(0, 0) ? 1 : 0)) : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : -3)))) : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : -3)))) : ((((enemyColour == game.getColourOfStone(3, 4) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(0, 3) ? 1 : 0) : (playerColour == game.getColourOfStone(5, 4) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(1, 0) ? 1 : 0) >= 0 ? ((playerColour == game.getColourOfStone(5, 3) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : ((playerColour == game.getColourOfStone(1, 5) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) : (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0))) : (enemyColour == game.getColourOfStone(0, 1) ? 1 : 0)) : (playerColour == game.getColourOfStone(6, 3) ? 1 : 0)) >= 0 ? (-2 >= 0 ? (-4 >= 0 ? (playerColour == game.getColourOfStone(4, 0) ? 1 : 0) : (playerColour == game.getColourOfStone(6, 3) ? 1 : 0)) : (0 >= 0 ? (playerColour == game.getColourOfStone(1, 0) ? 1 : 0) : (-1 >= 0 ? -5 : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)))) : (((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : ((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ? -2 : -3)) >= 0 ? ((-3 >= 0 ? (playerColour == game.getColourOfStone(0, 1) ? 1 : 0) : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)) >= 0 ? ((enemyColour == game.getColourOfStone(6, 0) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(5, 2) ? 1 : 0) : (playerColour == game.getColourOfStone(2, 0) ? 1 : 0)) : -5) :  playerCanWinInTwoRounds( playerColour, enemyColour, game) )))))) >= 0 ? ((-1 >= 0 ? -5 : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(5, 3) ? 1 : 0) >= 0 ? 3 : -2) : (((((( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (playerColour == game.getColourOfStone(1, 0) ? 1 : 0) : (enemyColour == game.getColourOfStone(3, 1) ? 1 : 0)) >= 0 ? -3 : -5) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  :  playerCanWinInTwoRounds( playerColour, enemyColour, game) ) >= 0 ? ((playerColour == game.getColourOfStone(5, 4) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(6, 4) ? 1 : 0) : (enemyColour == game.getColourOfStone(0, 1) ? 1 : 0)) : (enemyColour == game.getColourOfStone(6, 0) ? 1 : 0)) >= 0 ? 0 : (enemyColour == game.getColourOfStone(3, 4) ? 1 : 0)) >= 0 ? (-3 >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : ((enemyColour == game.getColourOfStone(5, 2) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) : -5)) : -3)) : (-2 >= 0 ? ((enemyColour == game.getColourOfStone(2, 2) ? 1 : 0) >= 0 ? 1 : (playerColour == game.getColourOfStone(0, 0) ? 1 : 0)) : ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : -3))) : ((((enemyColour == game.getColourOfStone(3, 4) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(0, 3) ? 1 : 0) : (enemyColour == game.getColourOfStone(0, 1) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(2, 3) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(4, 0) ? 1 : 0) : (enemyColour == game.getColourOfStone(0, 1) ? 1 : 0)) : (playerColour == game.getColourOfStone(6, 3) ? 1 : 0)) >= 0 ? (((enemyColour == game.getColourOfStone(2, 2) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (enemyColour == game.getColourOfStone(3, 5) ? 1 : 0)) >= 0 ? ((enemyColour == game.getColourOfStone(4, 1) ? 1 : 0) >= 0 ? (playerColour == game.getColourOfStone(4, 0) ? 1 : 0) : (playerColour == game.getColourOfStone(6, 3) ? 1 : 0)) : (0 >= 0 ? ((playerColour == game.getColourOfStone(3, 5) ? 1 : 0) >= 0 ? -2 : -3) : (playerColour == game.getColourOfStone(0, 4) ? 1 : 0))) : (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (playerColour == game.getColourOfStone(4, 0) ? 1 : 0)) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  :  playerCanWinInTwoRounds( playerColour, enemyColour, game) )));
    }
}
