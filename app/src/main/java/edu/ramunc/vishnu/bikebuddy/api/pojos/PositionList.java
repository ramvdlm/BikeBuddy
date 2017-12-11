package edu.ramunc.vishnu.bikebuddy.api.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by RamVadlamani on 12/5/17.
 */

public class PositionList extends ApiResponse {
    @SerializedName("positions")
    @Expose
    List<Position> positions;
    Position x;

    public PositionList(int code, String message, List<Position> positions) {
        super(code, message);
        this.positions = positions;
    }

    public PositionList(List<Position> positions) {
        this.positions = positions;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public int size() {return 0;}

    public Position get(int i) {return x;}
}
