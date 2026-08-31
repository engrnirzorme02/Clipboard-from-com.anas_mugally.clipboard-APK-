package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.N */
/* JADX INFO: loaded from: classes.dex */
public class C5271N extends AbstractC5270M {

    /* JADX INFO: renamed from: D */
    private static final SparseIntArray f20100D;

    /* JADX INFO: renamed from: C */
    private long f20101C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20100D = sparseIntArray;
        sparseIntArray.put(R.id.lay_input_title, 1);
        sparseIntArray.put(R.id.input_title, 2);
        sparseIntArray.put(R.id.lay_input_prompt, 3);
        sparseIntArray.put(R.id.input_prompt, 4);
        sparseIntArray.put(R.id.btn_execute_only, 5);
        sparseIntArray.put(R.id.btn_save_and_execute, 6);
    }

    public C5271N(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 7, null, f20100D));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20101C = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20101C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24285w() {
        synchronized (this) {
            this.f20101C = 1L;
        }
        m10851s();
    }

    private C5271N(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (MaterialButton) objArr[5], (MaterialButton) objArr[6], (TextInputEditText) objArr[4], (TextInputEditText) objArr[2], (TextInputLayout) objArr[3], (TextInputLayout) objArr[1], (ScrollView) objArr[0]);
        this.f20101C = -1L;
        this.f20094B.setTag(null);
        m10852t(view);
        m24285w();
    }
}
