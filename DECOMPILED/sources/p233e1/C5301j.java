package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.j */
/* JADX INFO: loaded from: classes.dex */
public class C5301j extends AbstractC5299i {

    /* JADX INFO: renamed from: G */
    private static final SparseIntArray f20253G;

    /* JADX INFO: renamed from: F */
    private long f20254F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20253G = sparseIntArray;
        sparseIntArray.put(R.id.main_card_btns_ops, 2);
        sparseIntArray.put(R.id.swiper_refresh_layout, 3);
        sparseIntArray.put(R.id.swipe_target, 4);
        sparseIntArray.put(R.id.img_blocking_access_to_nots, 5);
        sparseIntArray.put(R.id.searchLayout, 6);
        sparseIntArray.put(R.id.search, 7);
        sparseIntArray.put(R.id.img_open_app, 8);
        sparseIntArray.put(R.id.ftl_btn_clear_all, 9);
    }

    public C5301j(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 10, null, f20253G));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20254F = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20254F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24308u() {
        synchronized (this) {
            this.f20254F = 1L;
        }
        m10851s();
    }

    private C5301j(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[1], (ExtendedFloatingActionButton) objArr[9], (ImageView) objArr[5], (ImageView) objArr[8], (RelativeLayout) objArr[0], (View) objArr[2], (TextInputEditText) objArr[7], (TextInputLayout) objArr[6], (RecyclerView) objArr[4], (SwipeRefreshLayout) objArr[3]);
        this.f20254F = -1L;
        this.f20245v.setTag(null);
        this.f20249z.setTag(null);
        m10852t(view);
        m24308u();
    }
}
