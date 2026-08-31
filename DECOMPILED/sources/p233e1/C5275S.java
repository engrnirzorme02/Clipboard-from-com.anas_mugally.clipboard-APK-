package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: e1.S */
/* JADX INFO: loaded from: classes.dex */
public class C5275S extends AbstractC5274Q {

    /* JADX INFO: renamed from: y */
    private static final SparseIntArray f20109y;

    /* JADX INFO: renamed from: w */
    private final ScrollView f20110w;

    /* JADX INFO: renamed from: x */
    private long f20111x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20109y = sparseIntArray;
        sparseIntArray.put(R.id.btn_sign_in_google, 1);
    }

    public C5275S(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 2, null, f20109y));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20111x = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20111x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24289w() {
        synchronized (this) {
            this.f20111x = 1L;
        }
        m10851s();
    }

    private C5275S(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (MaterialButton) objArr[1]);
        this.f20111x = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f20110w = scrollView;
        scrollView.setTag(null);
        m10852t(view);
        m24289w();
    }
}
