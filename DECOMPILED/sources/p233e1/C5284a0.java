package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C5284a0 extends AbstractC5282Z {

    /* JADX INFO: renamed from: A */
    private static final SparseIntArray f20163A;

    /* JADX INFO: renamed from: z */
    private long f20164z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20163A = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.description, 2);
        sparseIntArray.put(R.id.btn_op, 3);
    }

    public C5284a0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 4, null, f20163A));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20164z = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20164z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24297u() {
        synchronized (this) {
            this.f20164z = 1L;
        }
        m10851s();
    }

    private C5284a0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (Button) objArr[3], (TextView) objArr[2], (ConstraintLayout) objArr[0], (TextView) objArr[1]);
        this.f20164z = -1L;
        this.f20131x.setTag(null);
        m10852t(view);
        m24297u();
    }
}
