package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C5288c0 extends AbstractC5286b0 {

    /* JADX INFO: renamed from: C */
    private static final SparseIntArray f20187C;

    /* JADX INFO: renamed from: A */
    private final ScrollView f20188A;

    /* JADX INFO: renamed from: B */
    private long f20189B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20187C = sparseIntArray;
        sparseIntArray.put(R.id.text_show_note, 1);
        sparseIntArray.put(R.id.accept_policy, 2);
        sparseIntArray.put(R.id.btn_privacy_policy, 3);
        sparseIntArray.put(R.id.btn_censal, 4);
        sparseIntArray.put(R.id.btn_continue, 5);
    }

    public C5288c0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 6, null, f20187C));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20189B = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20189B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24301w() {
        synchronized (this) {
            this.f20189B = 1L;
        }
        m10851s();
    }

    private C5288c0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (CheckBox) objArr[2], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[1]);
        this.f20189B = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f20188A = scrollView;
        scrollView.setTag(null);
        m10852t(view);
        m24301w();
    }
}
