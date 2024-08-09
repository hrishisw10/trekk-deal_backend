package com.trek.dto.detail;

import java.util.List;
import java.util.Map;

public class Policies {

	private Map<String, List<String>> confirm;
	private Map<String, List<String>> refund;
	private Map<String, List<String>> booking;
	private Map<String, List<String>> cancellation;
	private Map<String, List<String>> paymentTermPolicy;

	public Map<String, List<String>> getConfirm() {
		return confirm;
	}

	public void setConfirm(Map<String, List<String>> confirm) {
		this.confirm = confirm;
	}

	public Map<String, List<String>> getRefund() {
		return refund;
	}

	public void setRefund(Map<String, List<String>> refund) {
		this.refund = refund;
	}

	public Map<String, List<String>> getBooking() {
		return booking;
	}

	public void setBooking(Map<String, List<String>> booking) {
		this.booking = booking;
	}

	public Map<String, List<String>> getCancellation() {
		return cancellation;
	}

	public void setCancellation(Map<String, List<String>> cancellation) {
		this.cancellation = cancellation;
	}

	public Map<String, List<String>> getPaymentTermPolicy() {
		return paymentTermPolicy;
	}

	public void setPaymentTermPolicy(Map<String, List<String>> paymentTermPolicy) {
		this.paymentTermPolicy = paymentTermPolicy;
	}

}
