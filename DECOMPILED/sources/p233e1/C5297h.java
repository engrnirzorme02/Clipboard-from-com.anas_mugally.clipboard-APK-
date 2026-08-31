package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: renamed from: e1.h */
/* JADX INFO: loaded from: classes.dex */
public class C5297h extends AbstractC5295g {

    /* JADX INFO: renamed from: K */
    private static final SparseIntArray f20237K;

    /* JADX INFO: renamed from: J */
    private long f20238J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20237K = sparseIntArray;
        sparseIntArray.put(R.id.main_card_btns_ops, 2);
        sparseIntArray.put(R.id.view_status_bar, 3);
        sparseIntArray.put(R.id.layout, 4);
        sparseIntArray.put(R.id.app_bar_main, 5);
        sparseIntArray.put(R.id.toolbar_main_activity, 6);
        sparseIntArray.put(R.id.chip_group_categories, 7);
        sparseIntArray.put(R.id.swiper_refresh_layout, 8);
        sparseIntArray.put(R.id.swipe_target, 9);
        sparseIntArray.put(R.id.img_blocking_access_to_nots, 10);
        sparseIntArray.put(R.id.ftb_enable_accessibility, 11);
        sparseIntArray.put(R.id.flt_btn_add_text, 12);
        sparseIntArray.put(R.id.nav_main, 13);
    }

    public C5297h(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 14, null, f20237K));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20238J = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20238J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24306u() {
        synchronized (this) {
            this.f20238J = 1L;
        }
        m10851s();
    }

    private C5297h(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[5], (ChipGroup) objArr[7], (ExtendedFloatingActionButton) objArr[12], (FloatingActionButton) objArr[11], (ImageView) objArr[10], (ConstraintLayout) objArr[1], (CoordinatorLayout) objArr[4], (DrawerLayout) objArr[0], (View) objArr[2], (NavigationView) objArr[13], (RecyclerView) objArr[9], (SwipeRefreshLayout) objArr[8], (Toolbar) objArr[6], (View) objArr[3]);
        this.f20238J = -1L;
        this.f20221A.setTag(null);
        this.f20223C.setTag(null);
        m10852t(view);
        m24306u();
    }
}
