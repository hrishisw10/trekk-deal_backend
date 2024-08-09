package com.trek.dto.detail;

public class TrekMap {

	private StartingPoint startingPoint;
	private PickupPoint pickupPoints;
	private DropPoint dropPoints;

	public StartingPoint getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(StartingPoint startingPoint) {
		this.startingPoint = startingPoint;
	}

	public PickupPoint getPickupPoints() {
		return pickupPoints;
	}

	public void setPickupPoints(PickupPoint pickupPoints) {
		this.pickupPoints = pickupPoints;
	}

	public DropPoint getDropPoints() {
		return dropPoints;
	}

	public void setDropPoints(DropPoint dropPoints) {
		this.dropPoints = dropPoints;
	}

}
