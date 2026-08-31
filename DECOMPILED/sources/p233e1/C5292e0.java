package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: renamed from: e1.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C5292e0 extends AbstractC5290d0 {

    /* JADX INFO: renamed from: A */
    private static final SparseIntArray f20208A;

    /* JADX INFO: renamed from: z */
    private long f20209z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20208A = sparseIntArray;
        sparseIntArray.put(R.id.progress_bar, 1);
        sparseIntArray.put(R.id.recycler_view_pricing, 2);
        sparseIntArray.put(R.id.how_to_cancel, 3);
    }

    public C5292e0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 4, null, f20208A));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20209z = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20209z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24303u() {
        synchronized (this) {
            this.f20209z = 1L;
        }
        m10851s();
    }

    private C5292e0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (TextView) objArr[3], (LinearLayout) objArr[0], (LinearProgressIndicator) objArr[1], (RecyclerView) objArr[2]);
        this.f20209z = -1L;
        this.f20193w.setTag(null);
        m10852t(view);
        m24303u();
    }
}
