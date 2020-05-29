package factory_method_pattern.ads;

import factory_method_pattern.ads.IRegionalGenerator;
import factory_method_pattern.entities.Advertisement;

import java.util.List;

public class WashingtonAdGenerator implements IRegionalGenerator
{
    @Override
    public List<Advertisement> getAppropriateAds()
    {
        return null;
    }
}
