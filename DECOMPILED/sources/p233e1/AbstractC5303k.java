package p233e1;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: e1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5303k extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final ImageView f20265A;

    /* JADX INFO: renamed from: B */
    public final ImageView f20266B;

    /* JADX INFO: renamed from: C */
    public final RelativeLayout f20267C;

    /* JADX INFO: renamed from: D */
    public final View f20268D;

    /* JADX INFO: renamed from: E */
    public final RecyclerView f20269E;

    /* JADX INFO: renamed from: F */
    public final SwipeRefreshLayout f20270F;

    /* JADX INFO: renamed from: v */
    public final AppBarLayout f20271v;

    /* JADX INFO: renamed from: w */
    public final ChipGroup f20272w;

    /* JADX INFO: renamed from: x */
    public final ExtendedFloatingActionButton f20273x;

    /* JADX INFO: renamed from: y */
    public final FloatingActionButton f20274y;

    /* JADX INFO: renamed from: z */
    public final HorizontalScrollView f20275z;

    protected AbstractC5303k(Object obj, View view, int i7, AppBarLayout appBarLayout, ChipGroup chipGroup, ExtendedFloatingActionButton extendedFloatingActionButton, FloatingActionButton floatingActionButton, HorizontalScrollView horizontalScrollView, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, View view2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i7);
        this.f20271v = appBarLayout;
        this.f20272w = chipGroup;
        this.f20273x = extendedFloatingActionButton;
        this.f20274y = floatingActionButton;
        this.f20275z = horizontalScrollView;
        this.f20265A = imageView;
        this.f20266B = imageView2;
        this.f20267C = relativeLayout;
        this.f20268D = view2;
        this.f20269E = recyclerView;
        this.f20270F = swipeRefreshLayout;
    }
}
