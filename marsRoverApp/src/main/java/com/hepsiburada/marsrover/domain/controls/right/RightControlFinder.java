package com.hepsiburada.marsrover.domain.controls.right;

import com.hepsiburada.marsrover.domain.Rover;
import com.hepsiburada.marsrover.domain.RoverDirection;
import com.hepsiburada.marsrover.domain.shared.ControlFinder;

public class RightControlFinder implements ControlFinder<RoverDirection>  {

    @Override
    public RoverDirection get(Rover rover) {
        return RightStrategyContext.apply(rover.getRoverDirection());
    }
}
