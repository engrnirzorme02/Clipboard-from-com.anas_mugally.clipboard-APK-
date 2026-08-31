package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C5296g0 extends AbstractC5294f0 {

    /* JADX INFO: renamed from: F */
    private static final SparseIntArray f20235F;

    /* JADX INFO: renamed from: E */
    private long f20236E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20235F = sparseIntArray;
        sparseIntArray.put(R.id.lay_category_details, 1);
        sparseIntArray.put(R.id.text_know_change_password_or_remove, 2);
        sparseIntArray.put(R.id.lay_input_pass_category, 3);
        sparseIntArray.put(R.id.input_pass_category, 4);
        sparseIntArray.put(R.id.lay_biometric, 5);
        sparseIntArray.put(R.id.biometric, 6);
        sparseIntArray.put(R.id.btnSave, 7);
        sparseIntArray.put(R.id.btnRemoveSecurity, 8);
    }

    public C5296g0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 9, null, f20235F));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20236E = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20236E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24305u() {
        synchronized (this) {
            this.f20236E = 1L;
        }
        m10851s();
    }

    private C5296g0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ToggleButton) objArr[6], (Button) objArr[8], (Button) objArr[7], (LinearLayout) objArr[0], (TextInputEditText) objArr[4], (FrameLayout) objArr[5], (RelativeLayout) objArr[1], (TextInputLayout) objArr[3], (TextView) objArr[2]);
        this.f20236E = -1L;
        this.f20219y.setTag(null);
        m10852t(view);
        m24305u();
    }
}
