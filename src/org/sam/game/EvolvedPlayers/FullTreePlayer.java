package org.sam.game.EvolvedPlayers;

import org.sam.game.GPPlayer;
import org.sam.game.Game;

/**
 * Created by samuel on 14/08/14.
 */
public class FullTreePlayer extends GPPlayer{
    @Override
    protected long evalGame(char playerColour, char enemyColour, Game game) {
        return ((((playerColour == game.getColourOfStone(2, 5) ? 1 : 0) - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)) >= 0 ? (( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) ) - (2 -  playerCanWinInTwoRounds( playerColour, enemyColour, game) )) :  playerCanWinInTwoRounds( playerColour, enemyColour, game) ) >= 0 ? (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(0, 4) ? 1 : 0) : ( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) )) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : ((enemyColour == game.getColourOfStone(2, 4) ? 1 : 0) + ( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(2, 5) ? 1 : 0) : (playerColour == game.getColourOfStone(0, 0) ? 1 : 0)))) : (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  * (((((playerColour == game.getColourOfStone(2, 5) ? 1 : 0) - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)) >= 0 ? (( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) ) - (2 -  playerCanWinInTwoRounds( playerColour, enemyColour, game) )) : (((enemyColour == game.getColourOfStone(2, 3) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (playerColour == game.getColourOfStone(0, 0) ? 1 : 0)) - ((( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) ) * (enemyColour == game.getColourOfStone(2, 5) ? 1 : 0)) - (2 -  enemyCanWinInTwoRounds( playerColour, enemyColour, game) )))) >= 0 ? ((((enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) * ((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ? (enemyColour == game.getColourOfStone(2, 4) ? 1 : 0) : (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0))) >= 0 ? ((enemyColour == game.getColourOfStone(1, 2) ? 1 : 0) - (2 -  playerCanWinInTwoRounds( playerColour, enemyColour, game) )) : ( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  * (((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) ) *  enemyCanWinInTwoRounds( playerColour, enemyColour, game) )) - (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(2, 5) ? 1 : 0) - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)) : (playerColour == game.getColourOfStone(4, 2) ? 1 : 0))) :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) )) >= 0 ? (( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  * (((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  :  enemyCanWinInTwoRounds( playerColour, enemyColour, game) ) *  enemyCanWinInTwoRounds( playerColour, enemyColour, game) )) - (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)) >= 0 ? ((playerColour == game.getColourOfStone(2, 5) ? 1 : 0) - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)) : (playerColour == game.getColourOfStone(4, 2) ? 1 : 0))) : ((enemyColour == game.getColourOfStone(2, 4) ? 1 : 0) + ( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  + ((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) * (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0))) + ((2 -  playerCanWinInTwoRounds( playerColour, enemyColour, game) ) - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0))) : (playerColour == game.getColourOfStone(5, 2) ? 1 : 0)))) : (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  * ((enemyColour == game.getColourOfStone(0, 0) ? 1 : 0) >= 0 ?  enemyCanWinInTwoRounds( playerColour, enemyColour, game)  : ((playerColour == game.getColourOfStone(6, 5) ? 1 : 0) - (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0)))) >= 0 ? (( playerCanWinInTwoRounds( playerColour, enemyColour, game)  + ((playerColour == game.getColourOfStone(0, 0) ? 1 : 0) * (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0))) + ( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  - (playerColour == game.getColourOfStone(0, 0) ? 1 : 0))) : (enemyColour == game.getColourOfStone(2, 5) ? 1 : 0))) >= 0 ?  enemyCanWinInTwoRounds( playerColour, enemyColour, game)  : (enemyColour == game.getColourOfStone(0, 0) ? 1 : 0))) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (((playerColour == game.getColourOfStone(4, 0) ? 1 : 0) >= 0 ?  playerCanWinInTwoRounds( playerColour, enemyColour, game)  : (playerColour == game.getColourOfStone(1, 4) ? 1 : 0)) - ( enemyCanWinInTwoRounds( playerColour, enemyColour, game)  >= 0 ? (enemyColour == game.getColourOfStone(1, 2) ? 1 : 0) : -3))));
    }
}
