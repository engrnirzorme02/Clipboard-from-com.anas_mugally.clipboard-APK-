package p233e1;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5299i extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final View f20240A;

    /* JADX INFO: renamed from: B */
    public final TextInputEditText f20241B;

    /* JADX INFO: renamed from: C */
    public final TextInputLayout f20242C;

    /* JADX INFO: renamed from: D */
    public final RecyclerView f20243D;

    /* JADX INFO: renamed from: E */
    public final SwipeRefreshLayout f20244E;

    /* JADX INFO: renamed from: v */
    public final AppBarLayout f20245v;

    /* JADX INFO: renamed from: w */
    public final ExtendedFloatingActionButton f20246w;

    /* JADX INFO: renamed from: x */
    public final ImageView f20247x;

    /* JADX INFO: renamed from: y */
    public final ImageView f20248y;

    /* JADX INFO: renamed from: z */
    public final RelativeLayout f20249z;

    protected AbstractC5299i(Object obj, View view, int i7, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, View view2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i7);
        this.f20245v = appBarLayout;
        this.f20246w = extendedFloatingActionButton;
        this.f20247x = imageView;
        this.f20248y = imageView2;
        this.f20249z = relativeLayout;
        this.f20240A = view2;
        this.f20241B = textInputEditText;
        this.f20242C = textInputLayout;
        this.f20243D = recyclerView;
        this.f20244E = swipeRefreshLayout;
    }
}
