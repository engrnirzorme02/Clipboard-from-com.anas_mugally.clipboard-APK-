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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.L */
/* JADX INFO: loaded from: classes.dex */
public class C5269L extends AbstractC5268K {

    /* JADX INFO: renamed from: I */
    private static final SparseIntArray f20090I;

    /* JADX INFO: renamed from: G */
    private final ScrollView f20091G;

    /* JADX INFO: renamed from: H */
    private long f20092H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20090I = sparseIntArray;
        sparseIntArray.put(R.id.lay_input_topic, 1);
        sparseIntArray.put(R.id.input_topic, 2);
        sparseIntArray.put(R.id.btn_select_text_type, 3);
        sparseIntArray.put(R.id.layout_text_type_selected, 4);
        sparseIntArray.put(R.id.text_selected_type, 5);
        sparseIntArray.put(R.id.btn_change_text_type, 6);
        sparseIntArray.put(R.id.btn_select_text_length, 7);
        sparseIntArray.put(R.id.layout_text_length_selected, 8);
        sparseIntArray.put(R.id.text_selected_length, 9);
        sparseIntArray.put(R.id.btn_change_text_length, 10);
        sparseIntArray.put(R.id.btn_generate_text, 11);
    }

    public C5269L(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 12, null, f20090I));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20092H = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20092H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24282w() {
        synchronized (this) {
            this.f20092H = 1L;
        }
        m10851s();
    }

    private C5269L(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (MaterialButton) objArr[10], (MaterialButton) objArr[6], (MaterialButton) objArr[11], (MaterialButton) objArr[7], (MaterialButton) objArr[3], (TextInputEditText) objArr[2], (TextInputLayout) objArr[1], (LinearLayout) objArr[8], (LinearLayout) objArr[4], (TextView) objArr[9], (TextView) objArr[5]);
        this.f20092H = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f20091G = scrollView;
        scrollView.setTag(null);
        m10852t(view);
        m24282w();
    }
}
