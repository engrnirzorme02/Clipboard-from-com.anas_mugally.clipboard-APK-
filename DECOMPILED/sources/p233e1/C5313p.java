package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: renamed from: e1.p */
/* JADX INFO: loaded from: classes.dex */
public class C5313p extends AbstractC5311o {

    /* JADX INFO: renamed from: B */
    private static final SparseIntArray f20315B;

    /* JADX INFO: renamed from: A */
    private long f20316A;

    /* JADX INFO: renamed from: z */
    private final RelativeLayout f20317z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20315B = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_main, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.recycler_category, 3);
        sparseIntArray.put(R.id.flt_btn_add_category, 4);
    }

    public C5313p(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 5, null, f20315B));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20316A = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20316A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24314u() {
        synchronized (this) {
            this.f20316A = 1L;
        }
        m10851s();
    }

    private C5313p(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[1], (ExtendedFloatingActionButton) objArr[4], (RecyclerView) objArr[3], (Toolbar) objArr[2]);
        this.f20316A = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20317z = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24314u();
    }
}
