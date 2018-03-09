package coreservlets;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class BidBean2 {
  private String userId, keyword;
  private Double bidAmount;
  private Integer bidDuration;

  public String getUserId() { return(userId); }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getKeyword() { return(keyword); }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public Double getBidAmount() { return(bidAmount); }

  public void setBidAmount(Double bidAmount) {
    this.bidAmount = bidAmount;
  }

  public Integer getBidDuration() { return(bidDuration); }

  public void setBidDuration(Integer bidDuration) {
    this.bidDuration = bidDuration;
  }

  private void doSomeBusinessLogicWithBid() {
    // Update database with bid, etc.
  }

  public String doBid() {
    doSomeBusinessLogicWithBid();
    return("show-bid-2");
  }
  

}
