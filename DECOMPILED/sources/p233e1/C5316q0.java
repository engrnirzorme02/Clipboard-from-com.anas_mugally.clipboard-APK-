package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.q0 */
/* JADX INFO: loaded from: classes.dex */
public class C5316q0 extends AbstractC5314p0 {

    /* JADX INFO: renamed from: C */
    private static final SparseIntArray f20337C;

    /* JADX INFO: renamed from: A */
    private final RelativeLayout f20338A;

    /* JADX INFO: renamed from: B */
    private long f20339B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20337C = sparseIntArray;
        sparseIntArray.put(R.id.lay_parent, 1);
        sparseIntArray.put(R.id.select, 2);
        sparseIntArray.put(R.id.text_content, 3);
        sparseIntArray.put(R.id.actions, 4);
        sparseIntArray.put(R.id.view, 5);
    }

    public C5316q0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 6, null, f20337C));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20339B = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20339B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24315u() {
        synchronized (this) {
            this.f20339B = 1L;
        }
        m10851s();
    }

    private C5316q0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[4], (ConstraintLayout) objArr[1], (CheckBox) objArr[2], (TextView) objArr[3], (View) objArr[5]);
        this.f20339B = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20338A = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24315u();
    }
}
