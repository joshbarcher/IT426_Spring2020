package factory_method_pattern.program;

import factory_method_pattern.entities.Advertisement;
import factory_method_pattern.generation.AdGenerator;
import factory_method_pattern.generation.CaliforniaAds;
import factory_method_pattern.generation.WashingtonAds;

public class AdsTest
{
    public static void main(String[] args)
    {
        AdGenerator adgenerator = new WashingtonAds(); //new CaliforniaAds();
        
        for (Advertisement ad : adgenerator.getAllAds())
        {
            System.out.println(ad);
        }
    }
}



