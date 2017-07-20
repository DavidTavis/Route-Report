package com.report.route.data.model.registration;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class RegistrationResponse implements Serializable {

    @SerializedName("#result-set-1") @Expose public List<Object> resultSet1 = null;
    @SerializedName("#update-count-1") @Expose public Integer updateCount1;
    @SerializedName("ID_SOURCE_ORDER") @Expose public Integer idSourceOrder;
    @SerializedName("ALL_TRIP_COUNT") @Expose public Integer allTripCount;
    @SerializedName("TODAY_TRIP_COUNT") @Expose public Integer todayTripCount;
    @SerializedName("AMOUNT") @Expose public Float amount;
    @SerializedName("err_code") @Expose public Integer errCode;
    @SerializedName("ORDERS_COUNT") @Expose public Integer orderCount;
    @SerializedName("SESSION_ID_OUT") @Expose public String sessionIdOut;
    @SerializedName("OUT_ACCESS_LEVEL") @Expose public Integer outAccessLevel;
    @SerializedName("ORDER_AMOUNT") @Expose public Float orderAmount;
    @SerializedName("OUT_LANGUAGE_CODE") @Expose public String outLanguageCode;
    @SerializedName("DISCOUNT") @Expose public Float discount;

    public RegistrationResponse() {
    }

    public RegistrationResponse(List<Object> resultSet1, Integer updateCount1,
                                Integer idSourceOrder, Integer allTripCount,
                                Integer todayTripCount, Float amount, Integer errCode,
                                Integer orderCount, String sessionIdOut, Integer outAccessLevel,
                                Float orderAmount, String outLanguageCode, Float discount) {
        this.resultSet1 = resultSet1;
        this.updateCount1 = updateCount1;
        this.idSourceOrder = idSourceOrder;
        this.allTripCount = allTripCount;
        this.todayTripCount = todayTripCount;
        this.amount = amount;
        this.errCode = errCode;
        this.orderCount = orderCount;
        this.sessionIdOut = sessionIdOut;
        this.outAccessLevel = outAccessLevel;
        this.orderAmount = orderAmount;
        this.outLanguageCode = outLanguageCode;
        this.discount = discount;
    }

    public List<Object> getResultSet1() {
        return resultSet1;
    }

    public void setResultSet1(List<Object> resultSet1) {
        this.resultSet1 = resultSet1;
    }

    public Integer getUpdateCount1() {
        return updateCount1;
    }

    public void setUpdateCount1(Integer updateCount1) {
        this.updateCount1 = updateCount1;
    }

    public Integer getIdSourceOrder() {
        return idSourceOrder;
    }

    public void setIdSourceOrder(Integer idSourceOrder) {
        this.idSourceOrder = idSourceOrder;
    }

    public Integer getAllTripCount() {
        return allTripCount;
    }

    public void setAllTripCount(Integer allTripCount) {
        this.allTripCount = allTripCount;
    }

    public Integer getTodayTripCount() {
        return todayTripCount;
    }

    public void setTodayTripCount(Integer todayTripCount) {
        this.todayTripCount = todayTripCount;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getSessionIdOut() {
        return sessionIdOut;
    }

    public void setSessionIdOut(String sessionIdOut) {
        this.sessionIdOut = sessionIdOut;
    }

    public Integer getOutAccessLevel() {
        return outAccessLevel;
    }

    public void setOutAccessLevel(Integer outAccessLevel) {
        this.outAccessLevel = outAccessLevel;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOutLanguageCode() {
        return outLanguageCode;
    }

    public void setOutLanguageCode(String outLanguageCode) {
        this.outLanguageCode = outLanguageCode;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "RegistrationResponse{" +
                "resultSet1=" + resultSet1 +
                ", updateCount1=" + updateCount1 +
                ", idSourceOrder=" + idSourceOrder +
                ", allTripCount=" + allTripCount +
                ", todayTripCount=" + todayTripCount +
                ", amount=" + amount +
                ", errCode=" + errCode +
                ", orderCount=" + orderCount +
                ", sessionIdOut='" + sessionIdOut + '\'' +
                ", outAccessLevel=" + outAccessLevel +
                ", orderAmount=" + orderAmount +
                ", outLanguageCode='" + outLanguageCode + '\'' +
                ", discount=" + discount +
                '}';
    }
}