package com.report.route.data.model.authorization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthorizationResponse {

    @SerializedName("#update-count-1") @Expose public int updateCount1;
    @SerializedName("ID_SOURCE_ORDER") @Expose public int idSourceOrder;
    @SerializedName("ALL_TRIP_COUNT") @Expose public int allTripCount;
    @SerializedName("err_code") @Expose public int errCode;
    @SerializedName("OUT_PASS_FAILD_COUNT_MAX") @Expose public int outPassFailedCountMax;
    @SerializedName("ORDERS_COUNT") @Expose public int ordersCount;
    @SerializedName("OUT_ACCESS_LEVEL") @Expose public int outAccessLevel;
    @SerializedName("ORDER_AMOUNT") @Expose public int orderAmount;
    @SerializedName("DISCOUNT") @Expose public int discount;
    @SerializedName("BLOCK_REASON_OUT") @Expose public int blockReasonOut;
    @SerializedName("TODAY_TRIP_COUNT") @Expose public int todayTripCount;
    @SerializedName("INTERFACE_LANG") @Expose public Object interfaceLang;
    @SerializedName("AMOUNT") @Expose public int amount;
    @SerializedName("OUT_LAST_LOGIN") @Expose public int outLastLogin;
    @SerializedName("OUT_PASS_FAILED_COUNT") @Expose public int outPassFailedCount;
    @SerializedName("SESSION_ID_OUT") @Expose public Object sessionIdOut;

    public AuthorizationResponse() {
    }

    public AuthorizationResponse(int updateCount1, int idSourceOrder, int allTripCount, int errCode, int outPassFailedCountMax, int ordersCount, int outAccessLevel, int orderAmount, int discount, int blockReasonOut, int todayTripCount, Object interfaceLang, int amount, int outLastLogin, int outPassFailedCount, Object sessionIdOut) {
        this.updateCount1 = updateCount1;
        this.idSourceOrder = idSourceOrder;
        this.allTripCount = allTripCount;
        this.errCode = errCode;
        this.outPassFailedCountMax = outPassFailedCountMax;
        this.ordersCount = ordersCount;
        this.outAccessLevel = outAccessLevel;
        this.orderAmount = orderAmount;
        this.discount = discount;
        this.blockReasonOut = blockReasonOut;
        this.todayTripCount = todayTripCount;
        this.interfaceLang = interfaceLang;
        this.amount = amount;
        this.outLastLogin = outLastLogin;
        this.outPassFailedCount = outPassFailedCount;
        this.sessionIdOut = sessionIdOut;
    }

    public int getIdSourceOrder() {
        return idSourceOrder;
    }

    public void setIdSourceOrder(int idSourceOrder) {
        this.idSourceOrder = idSourceOrder;
    }

    public int getAllTripCount() {
        return allTripCount;
    }

    public void setAllTripCount(int allTripCount) {
        this.allTripCount = allTripCount;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public int getOutPassFailedCountMax() {
        return outPassFailedCountMax;
    }

    public void setOutPassFailedCountMax(int outPassFailedCountMax) {
        this.outPassFailedCountMax = outPassFailedCountMax;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }

    public int getOutAccessLevel() {
        return outAccessLevel;
    }

    public void setOutAccessLevel(int outAccessLevel) {
        this.outAccessLevel = outAccessLevel;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getBlockReasonOut() {
        return blockReasonOut;
    }

    public void setBlockReasonOut(int blockReasonOut) {
        this.blockReasonOut = blockReasonOut;
    }

    public int getTodayTripCount() {
        return todayTripCount;
    }

    public void setTodayTripCount(int todayTripCount) {
        this.todayTripCount = todayTripCount;
    }

    public Object getInterfaceLang() {
        return interfaceLang;
    }

    public void setInterfaceLang(Object interfaceLang) {
        this.interfaceLang = interfaceLang;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOutLastLogin() {
        return outLastLogin;
    }

    public void setOutLastLogin(int outLastLogin) {
        this.outLastLogin = outLastLogin;
    }

    public int getOutPassFailedCount() {
        return outPassFailedCount;
    }

    public void setOutPassFailedCount(int outPassFailedCount) {
        this.outPassFailedCount = outPassFailedCount;
    }

    public Object getSessionIdOut() {
        return sessionIdOut;
    }

    public void setSessionIdOut(Object sessionIdOut) {
        this.sessionIdOut = sessionIdOut;
    }

    @Override
    public String toString() {
        return "AuthorizationResponce{" +
                "updateCount1=" + updateCount1 +
                ", idSourceOrder=" + idSourceOrder +
                ", allTripCount=" + allTripCount +
                ", errCode=" + errCode +
                ", outPassFailedCountMax=" + outPassFailedCountMax +
                ", ordersCount=" + ordersCount +
                ", outAccessLevel=" + outAccessLevel +
                ", orderAmount=" + orderAmount +
                ", discount=" + discount +
                ", blockReasonOut=" + blockReasonOut +
                ", todayTripCount=" + todayTripCount +
                ", interfaceLang=" + interfaceLang +
                ", amount=" + amount +
                ", outLastLogin=" + outLastLogin +
                ", outPassFailedCount=" + outPassFailedCount +
                ", sessionIdOut=" + sessionIdOut +
                '}';
    }
}
