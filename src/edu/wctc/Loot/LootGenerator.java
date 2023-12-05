package edu.wctc.Loot;

public class LootGenerator {
    private volatile static LootGenerator uniqueInstance;

    private LootGenerator(){}

    public static LootGenerator getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (LootGenerator.class) {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new LootGenerator();
                }
            }
        }
        return uniqueInstance;
    }
    public Loot getLoot(){
        //TODO: implement RNG loot generation
        return null;
    }
}
