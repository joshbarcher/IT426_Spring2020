package factory_method_pattern.generation;

import factory_method_pattern.ads.CaliforniaAdGenerator;
import factory_method_pattern.ads.IRegionalGenerator;

public class CaliforniaAds extends AdGenerator
{
    @Override
    public IRegionalGenerator getGenerator()
    {
        return new CaliforniaAdGenerator();
    }
}
