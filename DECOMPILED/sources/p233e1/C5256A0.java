package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.A0 */
/* JADX INFO: loaded from: classes.dex */
public class C5256A0 extends AbstractC5334z0 {

    /* JADX INFO: renamed from: D */
    private static final SparseIntArray f20014D;

    /* JADX INFO: renamed from: B */
    private final RelativeLayout f20015B;

    /* JADX INFO: renamed from: C */
    private long f20016C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20014D = sparseIntArray;
        sparseIntArray.put(R.id.layout_coin, 1);
        sparseIntArray.put(R.id.text, 2);
        sparseIntArray.put(R.id.biometric, 3);
        sparseIntArray.put(R.id.lay_input_pass_category, 4);
        sparseIntArray.put(R.id.input_pass_category, 5);
        sparseIntArray.put(R.id.btn_add_or_edit_category, 6);
    }

    public C5256A0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 7, null, f20014D));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20016C = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20016C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24269u() {
        synchronized (this) {
            this.f20016C = 1L;
        }
        m10851s();
    }

    private C5256A0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ImageView) objArr[3], (Button) objArr[6], (TextInputEditText) objArr[5], (TextInputLayout) objArr[4], (RelativeLayout) objArr[1], (TextView) objArr[2]);
        this.f20016C = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20015B = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24269u();
    }
}
