/*
Runtime: 6 ms, faster than 99.87% of Java online submissions for Design Parking System.
Memory Usage: 39.5 MB, less than 65.68% of Java online submissions for Design Parking System.
*/
class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        // big
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }
        // medium
        else if (carType == 2  && medium > 0) {
            medium--;
            return true;
        }
        // small
        else if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        else{
            return false;  
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */