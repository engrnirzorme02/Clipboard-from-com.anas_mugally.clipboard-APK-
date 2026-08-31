package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.w0 */
/* JADX INFO: loaded from: classes.dex */
public class C5328w0 extends AbstractC5326v0 {

    /* JADX INFO: renamed from: z */
    private static final SparseIntArray f20410z;

    /* JADX INFO: renamed from: x */
    private final LinearLayout f20411x;

    /* JADX INFO: renamed from: y */
    private long f20412y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20410z = sparseIntArray;
        sparseIntArray.put(R.id.container, 1);
        sparseIntArray.put(R.id.actions, 2);
    }

    public C5328w0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 3, null, f20410z));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20412y = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20412y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24321u() {
        synchronized (this) {
            this.f20412y = 1L;
        }
        m10851s();
    }

    private C5328w0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[2], (LinearLayout) objArr[1]);
        this.f20412y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20411x = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24321u();
    }
}
