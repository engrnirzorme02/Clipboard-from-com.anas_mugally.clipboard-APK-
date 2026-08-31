package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: e1.l */
/* JADX INFO: loaded from: classes.dex */
public class C5305l extends AbstractC5303k {

    /* JADX INFO: renamed from: H */
    private static final SparseIntArray f20278H;

    /* JADX INFO: renamed from: G */
    private long f20279G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20278H = sparseIntArray;
        sparseIntArray.put(R.id.main_card_btns_ops, 2);
        sparseIntArray.put(R.id.swiper_refresh_layout, 3);
        sparseIntArray.put(R.id.swipe_target, 4);
        sparseIntArray.put(R.id.img_blocking_access_to_nots, 5);
        sparseIntArray.put(R.id.horizontal, 6);
        sparseIntArray.put(R.id.chip_group_categories, 7);
        sparseIntArray.put(R.id.img_open_app, 8);
        sparseIntArray.put(R.id.ftb_enable_accessibility, 9);
        sparseIntArray.put(R.id.flt_btn_add_text, 10);
    }

    public C5305l(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 11, null, f20278H));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20279G = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20279G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24310u() {
        synchronized (this) {
            this.f20279G = 1L;
        }
        m10851s();
    }

    private C5305l(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[1], (ChipGroup) objArr[7], (ExtendedFloatingActionButton) objArr[10], (FloatingActionButton) objArr[9], (HorizontalScrollView) objArr[6], (ImageView) objArr[5], (ImageView) objArr[8], (RelativeLayout) objArr[0], (View) objArr[2], (RecyclerView) objArr[4], (SwipeRefreshLayout) objArr[3]);
        this.f20279G = -1L;
        this.f20271v.setTag(null);
        this.f20267C.setTag(null);
        m10852t(view);
        m24310u();
    }
}
