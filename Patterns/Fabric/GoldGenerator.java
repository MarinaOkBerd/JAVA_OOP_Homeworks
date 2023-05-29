package Patterns.Fabric;

public class GoldGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem()
    {
        return new GoldReward();
    }
}