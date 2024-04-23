package com.spring.course;

public class Pizza {
    
    private PizzaStatus status;

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }
    
    public enum PizzaStatus{
        ORDERED,
        READY, 
        DELIVERED; 

        public boolean isReadyToEat(PizzaStatus status){
            if(status == PizzaStatus.DELIVERED)
                return true;
            return false;
        }
    }
}
