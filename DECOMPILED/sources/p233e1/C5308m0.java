package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C5308m0 extends AbstractC5306l0 {

    /* JADX INFO: renamed from: G */
    private static final SparseIntArray f20298G;

    /* JADX INFO: renamed from: E */
    private final FrameLayout f20299E;

    /* JADX INFO: renamed from: F */
    private long f20300F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20298G = sparseIntArray;
        sparseIntArray.put(R.id.card, 1);
        sparseIntArray.put(R.id.layout_coin, 2);
        sparseIntArray.put(R.id.lay_input_text_replaced, 3);
        sparseIntArray.put(R.id.input_text_replaced, 4);
        sparseIntArray.put(R.id.lay_input_text_replaced_to, 5);
        sparseIntArray.put(R.id.input_text_replaced_to, 6);
        sparseIntArray.put(R.id.checkbox_replace_only_first, 7);
        sparseIntArray.put(R.id.btn_replace_text, 8);
        sparseIntArray.put(R.id.btnClose, 9);
    }

    public C5308m0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 10, null, f20298G));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20300F = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20300F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24311u() {
        synchronized (this) {
            this.f20300F = 1L;
        }
        m10851s();
    }

    private C5308m0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (Button) objArr[9], (Button) objArr[8], (CardView) objArr[1], (CheckBox) objArr[7], (TextInputEditText) objArr[4], (TextInputEditText) objArr[6], (TextInputLayout) objArr[3], (TextInputLayout) objArr[5], (LinearLayout) objArr[2]);
        this.f20300F = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f20299E = frameLayout;
        frameLayout.setTag(null);
        m10852t(view);
        m24311u();
    }
}
