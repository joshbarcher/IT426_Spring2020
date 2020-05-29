package factory_method_pattern.ads;

import factory_method_pattern.entities.Advertisement;

import java.util.List;

public interface IRegionalGenerator
{
    public List<Advertisement> getAppropriateAds();
}


