package gameobjects.movable.car;

import gameobjects.gamemodel.GameModel;

import static constants.ModelConstants.MOVABLE_COIN_SOURCE;

/**
 * Created by tim on 2016-09-04.
 */
public class CoinCar extends  Car {

    public CoinCar(int x, int y) {
        super(x, y);
        model = new GameModel(MOVABLE_COIN_SOURCE);
    }

    @Override
    public void update(double duration) {

    }
}
