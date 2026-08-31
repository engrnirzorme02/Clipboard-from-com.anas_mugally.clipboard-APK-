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

/* JADX INFO: renamed from: e1.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C5324u0 extends AbstractC5322t0 {

    /* JADX INFO: renamed from: D */
    private static final SparseIntArray f20395D;

    /* JADX INFO: renamed from: B */
    private final RelativeLayout f20396B;

    /* JADX INFO: renamed from: C */
    private long f20397C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20395D = sparseIntArray;
        sparseIntArray.put(R.id.lay_parent, 1);
        sparseIntArray.put(R.id.select, 2);
        sparseIntArray.put(R.id.text_title, 3);
        sparseIntArray.put(R.id.text_content, 4);
        sparseIntArray.put(R.id.actions, 5);
        sparseIntArray.put(R.id.view, 6);
    }

    public C5324u0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 7, null, f20395D));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20397C = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20397C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24319u() {
        synchronized (this) {
            this.f20397C = 1L;
        }
        m10851s();
    }

    private C5324u0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[5], (ConstraintLayout) objArr[1], (CheckBox) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (View) objArr[6]);
        this.f20397C = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20396B = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24319u();
    }
}
