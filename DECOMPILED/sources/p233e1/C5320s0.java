package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.s0 */
/* JADX INFO: loaded from: classes.dex */
public class C5320s0 extends AbstractC5318r0 {

    /* JADX INFO: renamed from: E */
    private static final SparseIntArray f20365E;

    /* JADX INFO: renamed from: C */
    private final RelativeLayout f20366C;

    /* JADX INFO: renamed from: D */
    private long f20367D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20365E = sparseIntArray;
        sparseIntArray.put(R.id.lay_parent, 1);
        sparseIntArray.put(R.id.img_pin, 2);
        sparseIntArray.put(R.id.select, 3);
        sparseIntArray.put(R.id.text_title, 4);
        sparseIntArray.put(R.id.text_content, 5);
        sparseIntArray.put(R.id.actions, 6);
        sparseIntArray.put(R.id.view, 7);
    }

    public C5320s0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 8, null, f20365E));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20367D = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20367D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24317u() {
        synchronized (this) {
            this.f20367D = 1L;
        }
        m10851s();
    }

    private C5320s0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[6], (ImageView) objArr[2], (ConstraintLayout) objArr[1], (CheckBox) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (View) objArr[7]);
        this.f20367D = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20366C = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24317u();
    }
}
