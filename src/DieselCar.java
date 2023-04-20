public class DieselCar extends AFuelCar{
    boolean particaleFilter;

    public boolean hasParticleFilter(){
        return true;
    }
    @Override
    public String toString(){
        return "";
    }

    @Override
    public int getRegistrationFree() {
        return 0;
    }
}
