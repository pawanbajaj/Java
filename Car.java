
//Cars

public abstract class Car{
	abstract float getRentalPrice()
	abstract boolean getAvailability()
	abstract void updateAvailability()


	// Observer Code
	public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }


}
