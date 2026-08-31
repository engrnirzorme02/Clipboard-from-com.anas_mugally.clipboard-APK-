package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: e1.C0 */
/* JADX INFO: loaded from: classes.dex */
public class C5260C0 extends AbstractC5258B0 {

    /* JADX INFO: renamed from: D */
    private static final SparseIntArray f20032D;

    /* JADX INFO: renamed from: B */
    private final MaterialCardView f20033B;

    /* JADX INFO: renamed from: C */
    private long f20034C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20032D = sparseIntArray;
        sparseIntArray.put(R.id.text_description, 1);
        sparseIntArray.put(R.id.btn_purchasing_dialog, 2);
        sparseIntArray.put(R.id.btn_watch_ad, 3);
        sparseIntArray.put(R.id.progressbar, 4);
        sparseIntArray.put(R.id.img_state, 5);
        sparseIntArray.put(R.id.btn_censal, 6);
    }

    public C5260C0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 7, null, f20032D));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20034C = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20034C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24271u() {
        synchronized (this) {
            this.f20034C = 1L;
        }
        m10851s();
    }

    private C5260C0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (MaterialButton) objArr[6], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[3], (ImageView) objArr[5], (ProgressBar) objArr[4], (TextView) objArr[1]);
        this.f20034C = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f20033B = materialCardView;
        materialCardView.setTag(null);
        m10852t(view);
        m24271u();
    }
}
