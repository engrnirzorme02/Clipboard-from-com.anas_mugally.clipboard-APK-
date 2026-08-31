package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: e1.W */
/* JADX INFO: loaded from: classes.dex */
public class C5279W extends AbstractC5278V {

    /* JADX INFO: renamed from: y */
    private static final SparseIntArray f20122y;

    /* JADX INFO: renamed from: x */
    private long f20123x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20122y = sparseIntArray;
        sparseIntArray.put(R.id.chip_prompt, 1);
    }

    public C5279W(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 2, null, f20122y));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20123x = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20123x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24295w() {
        synchronized (this) {
            this.f20123x = 1L;
        }
        m10851s();
    }

    private C5279W(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (MaterialButton) objArr[1], (LinearLayout) objArr[0]);
        this.f20123x = -1L;
        this.f20121w.setTag(null);
        m10852t(view);
        m24295w();
    }
}
