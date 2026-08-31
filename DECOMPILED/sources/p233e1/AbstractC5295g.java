package p233e1;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC2474g;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: renamed from: e1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5295g extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final ConstraintLayout f20221A;

    /* JADX INFO: renamed from: B */
    public final CoordinatorLayout f20222B;

    /* JADX INFO: renamed from: C */
    public final DrawerLayout f20223C;

    /* JADX INFO: renamed from: D */
    public final View f20224D;

    /* JADX INFO: renamed from: E */
    public final NavigationView f20225E;

    /* JADX INFO: renamed from: F */
    public final RecyclerView f20226F;

    /* JADX INFO: renamed from: G */
    public final SwipeRefreshLayout f20227G;

    /* JADX INFO: renamed from: H */
    public final Toolbar f20228H;

    /* JADX INFO: renamed from: I */
    public final View f20229I;

    /* JADX INFO: renamed from: v */
    public final AppBarLayout f20230v;

    /* JADX INFO: renamed from: w */
    public final ChipGroup f20231w;

    /* JADX INFO: renamed from: x */
    public final ExtendedFloatingActionButton f20232x;

    /* JADX INFO: renamed from: y */
    public final FloatingActionButton f20233y;

    /* JADX INFO: renamed from: z */
    public final ImageView f20234z;

    protected AbstractC5295g(Object obj, View view, int i7, AppBarLayout appBarLayout, ChipGroup chipGroup, ExtendedFloatingActionButton extendedFloatingActionButton, FloatingActionButton floatingActionButton, ImageView imageView, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout, DrawerLayout drawerLayout, View view2, NavigationView navigationView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, View view3) {
        super(obj, view, i7);
        this.f20230v = appBarLayout;
        this.f20231w = chipGroup;
        this.f20232x = extendedFloatingActionButton;
        this.f20233y = floatingActionButton;
        this.f20234z = imageView;
        this.f20221A = constraintLayout;
        this.f20222B = coordinatorLayout;
        this.f20223C = drawerLayout;
        this.f20224D = view2;
        this.f20225E = navigationView;
        this.f20226F = recyclerView;
        this.f20227G = swipeRefreshLayout;
        this.f20228H = toolbar;
        this.f20229I = view3;
    }
}
