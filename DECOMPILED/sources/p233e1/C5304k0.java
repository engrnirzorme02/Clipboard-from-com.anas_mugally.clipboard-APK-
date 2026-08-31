package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C5304k0 extends AbstractC5302j0 {

    /* JADX INFO: renamed from: G */
    private static final SparseIntArray f20276G;

    /* JADX INFO: renamed from: F */
    private long f20277F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20276G = sparseIntArray;
        sparseIntArray.put(R.id.lay_category_details, 1);
        sparseIntArray.put(R.id.private_category, 2);
        sparseIntArray.put(R.id.lay_input_pass_category, 3);
        sparseIntArray.put(R.id.input_pass_category, 4);
        sparseIntArray.put(R.id.lay_biometric, 5);
        sparseIntArray.put(R.id.biometric, 6);
        sparseIntArray.put(R.id.lay_input_name_category, 7);
        sparseIntArray.put(R.id.input_name_category, 8);
        sparseIntArray.put(R.id.btn_add_or_edit_category, 9);
    }

    public C5304k0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 10, null, f20276G));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20277F = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20277F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24309u() {
        synchronized (this) {
            this.f20277F = 1L;
        }
        m10851s();
    }

    private C5304k0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ToggleButton) objArr[6], (Button) objArr[9], (LinearLayout) objArr[0], (TextInputEditText) objArr[8], (TextInputEditText) objArr[4], (FrameLayout) objArr[5], (RelativeLayout) objArr[1], (TextInputLayout) objArr[7], (TextInputLayout) objArr[3], (MaterialSwitch) objArr[2]);
        this.f20277F = -1L;
        this.f20262x.setTag(null);
        m10852t(view);
        m24309u();
    }
}
