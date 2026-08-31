package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: renamed from: e1.J */
/* JADX INFO: loaded from: classes.dex */
public class C5267J extends AbstractC5266I {

    /* JADX INFO: renamed from: K */
    private static final SparseIntArray f20076K;

    /* JADX INFO: renamed from: I */
    private final LinearLayout f20077I;

    /* JADX INFO: renamed from: J */
    private long f20078J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20076K = sparseIntArray;
        sparseIntArray.put(R.id.layoutLoading, 1);
        sparseIntArray.put(R.id.text_processing, 2);
        sparseIntArray.put(R.id.ai_progress_bar, 3);
        sparseIntArray.put(R.id.text_processing_status, 4);
        sparseIntArray.put(R.id.layout_result, 5);
        sparseIntArray.put(R.id.input_text_result, 6);
        sparseIntArray.put(R.id.text_result_counter, 7);
        sparseIntArray.put(R.id.text_processing_time, 8);
        sparseIntArray.put(R.id.layout_error, 9);
        sparseIntArray.put(R.id.text_error, 10);
        sparseIntArray.put(R.id.btn_retry, 11);
        sparseIntArray.put(R.id.btn_update_app, 12);
        sparseIntArray.put(R.id.in_app_purchasing, 13);
    }

    public C5267J(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 14, null, f20076K));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20078J = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20078J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24279w() {
        synchronized (this) {
            this.f20078J = 1L;
        }
        m10851s();
    }

    private C5267J(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (LinearProgressIndicator) objArr[3], (MaterialButton) objArr[11], (MaterialButton) objArr[12], (MaterialButton) objArr[13], (TextInputEditText) objArr[6], (LinearLayout) objArr[9], (LinearLayout) objArr[1], (ScrollView) objArr[5], (TextView) objArr[10], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[7]);
        this.f20078J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20077I = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24279w();
    }
}
