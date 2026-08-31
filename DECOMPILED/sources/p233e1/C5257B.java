package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.viewpager2.widget.ViewPager2;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: e1.B */
/* JADX INFO: loaded from: classes.dex */
public class C5257B extends AbstractC5255A {

    /* JADX INFO: renamed from: C */
    private static final SparseIntArray f20017C;

    /* JADX INFO: renamed from: B */
    private long f20018B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20017C = sparseIntArray;
        sparseIntArray.put(R.id.main_card_btns_ops, 2);
        sparseIntArray.put(R.id.view_pager, 3);
        sparseIntArray.put(R.id.tab_category_text, 4);
        sparseIntArray.put(R.id.img_open_app, 5);
    }

    public C5257B(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 6, null, f20017C));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20018B = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20018B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24270u() {
        synchronized (this) {
            this.f20018B = 1L;
        }
        m10851s();
    }

    private C5257B(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[1], (ImageView) objArr[5], (RelativeLayout) objArr[0], (View) objArr[2], (TabLayout) objArr[4], (ViewPager2) objArr[3]);
        this.f20018B = -1L;
        this.f20009v.setTag(null);
        this.f20011x.setTag(null);
        m10852t(view);
        m24270u();
    }
}
