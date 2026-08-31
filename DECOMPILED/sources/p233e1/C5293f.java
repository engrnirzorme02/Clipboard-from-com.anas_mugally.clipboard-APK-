package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.f */
/* JADX INFO: loaded from: classes.dex */
public class C5293f extends AbstractC5291e {

    /* JADX INFO: renamed from: I */
    private static final SparseIntArray f20210I;

    /* JADX INFO: renamed from: H */
    private long f20211H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20210I = sparseIntArray;
        sparseIntArray.put(R.id.lay_child, 1);
        sparseIntArray.put(R.id.lay_ad, 2);
        sparseIntArray.put(R.id.text_ad, 3);
        sparseIntArray.put(R.id.view, 4);
        sparseIntArray.put(R.id.appbar, 5);
        sparseIntArray.put(R.id.back_btn, 6);
        sparseIntArray.put(R.id.actions, 7);
        sparseIntArray.put(R.id.img_open_app, 8);
        sparseIntArray.put(R.id.lay_input_text, 9);
        sparseIntArray.put(R.id.input_text, 10);
        sparseIntArray.put(R.id.fragment_container, 11);
    }

    public C5293f(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 12, null, f20210I));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20211H = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20211H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24304u() {
        synchronized (this) {
            this.f20211H = 1L;
        }
        m10851s();
    }

    private C5293f(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[7], (ConstraintLayout) objArr[5], (ImageView) objArr[6], (FrameLayout) objArr[11], (ImageView) objArr[8], (TextInputEditText) objArr[10], (FrameLayout) objArr[2], (LinearLayout) objArr[1], (TextInputLayout) objArr[9], (ConstraintLayout) objArr[0], (TextView) objArr[3], (View) objArr[4]);
        this.f20211H = -1L;
        this.f20200E.setTag(null);
        m10852t(view);
        m24304u();
    }
}
