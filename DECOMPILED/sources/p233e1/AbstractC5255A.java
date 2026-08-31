package p233e1;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: e1.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5255A extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final ViewPager2 f20008A;

    /* JADX INFO: renamed from: v */
    public final AppBarLayout f20009v;

    /* JADX INFO: renamed from: w */
    public final ImageView f20010w;

    /* JADX INFO: renamed from: x */
    public final RelativeLayout f20011x;

    /* JADX INFO: renamed from: y */
    public final View f20012y;

    /* JADX INFO: renamed from: z */
    public final TabLayout f20013z;

    protected AbstractC5255A(Object obj, View view, int i7, AppBarLayout appBarLayout, ImageView imageView, RelativeLayout relativeLayout, View view2, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i7);
        this.f20009v = appBarLayout;
        this.f20010w = imageView;
        this.f20011x = relativeLayout;
        this.f20012y = view2;
        this.f20013z = tabLayout;
        this.f20008A = viewPager2;
    }
}
