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

/* JADX INFO: renamed from: e1.U */
/* JADX INFO: loaded from: classes.dex */
public class C5277U extends AbstractC5276T {

    /* JADX INFO: renamed from: C */
    private static final SparseIntArray f20117C;

    /* JADX INFO: renamed from: A */
    private final ScrollView f20118A;

    /* JADX INFO: renamed from: B */
    private long f20119B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20117C = sparseIntArray;
        sparseIntArray.put(R.id.btn_select_language, 1);
        sparseIntArray.put(R.id.layout_language_selected, 2);
        sparseIntArray.put(R.id.text_selected_language, 3);
        sparseIntArray.put(R.id.btn_change_language, 4);
        sparseIntArray.put(R.id.btn_translate, 5);
    }

    public C5277U(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 6, null, f20117C));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20119B = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20119B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24292w() {
        synchronized (this) {
            this.f20119B = 1L;
        }
        m10851s();
    }

    private C5277U(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (MaterialButton) objArr[4], (MaterialButton) objArr[1], (MaterialButton) objArr[5], (LinearLayout) objArr[2], (TextView) objArr[3]);
        this.f20119B = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f20118A = scrollView;
        scrollView.setTag(null);
        m10852t(view);
        m24292w();
    }
}
