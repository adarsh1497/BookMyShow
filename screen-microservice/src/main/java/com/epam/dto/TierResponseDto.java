package com.epam.dto;

public class TierResponseDto {

	private String tierId;

	private String tierName;

	private String screenId;

	private int cost;

	public String getTierId() {
		return tierId;
	}

	public void setTierId(String tierId) {
		this.tierId = tierId;
	}

	public String getTierName() {
		return tierName;
	}

	public void setTierName(String tierName) {
		this.tierName = tierName;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "TierResponseDto [tierId=" + tierId + ", tierName=" + tierName + ", screenId=" + screenId + ", cost="
				+ cost + "]";
	}

}
