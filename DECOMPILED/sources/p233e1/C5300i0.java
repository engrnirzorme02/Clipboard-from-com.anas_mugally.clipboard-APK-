package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C5300i0 extends AbstractC5298h0 {

    /* JADX INFO: renamed from: y */
    private static final SparseIntArray f20250y;

    /* JADX INFO: renamed from: w */
    private final LinearLayout f20251w;

    /* JADX INFO: renamed from: x */
    private long f20252x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20250y = sparseIntArray;
        sparseIntArray.put(R.id.checkbox, 1);
    }

    public C5300i0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 2, null, f20250y));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20252x = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20252x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24307u() {
        synchronized (this) {
            this.f20252x = 1L;
        }
        m10851s();
    }

    private C5300i0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (CheckBox) objArr[1]);
        this.f20252x = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20251w = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24307u();
    }
}
