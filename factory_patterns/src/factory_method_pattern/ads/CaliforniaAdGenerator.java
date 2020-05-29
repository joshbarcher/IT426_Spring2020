package factory_method_pattern.ads;

import factory_method_pattern.entities.Advertisement;

import java.util.List;

public class CaliforniaAdGenerator implements IRegionalGenerator
{
    private List<Advertisement> ads = List.of(
        new Advertisement("Disneyland, where magic comes alive!"),
        new Advertisement("The sunny beaches of CA"),
        new Advertisement("Visit Yosemite")
    );

    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return ads;
    }
}
