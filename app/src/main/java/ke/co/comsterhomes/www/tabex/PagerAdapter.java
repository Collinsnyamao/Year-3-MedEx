package ke.co.comsterhomes.www.tabex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by collinsnyamao on 10/14/17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numtabs;
    public PagerAdapter(FragmentManager fragmentManager,int numtabs){
        super(fragmentManager);
        this.numtabs = numtabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numtabs;
    }
}
