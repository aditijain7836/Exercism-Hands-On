public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutes = 40;
    public int expectedMinutesInOven(){
        return expectedMinutes;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        int res = expectedMinutes - actualMinutes;
        return res;    
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes){
        int prep_time = preparationTimeInMinutes(layers);
        return prep_time + minutes;
    }
    
}
