package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: renamed from: e1.x */
/* JADX INFO: loaded from: classes.dex */
public class C5329x extends AbstractC5327w {

    /* JADX INFO: renamed from: E */
    private static final SparseIntArray f20413E;

    /* JADX INFO: renamed from: C */
    private final LinearLayout f20414C;

    /* JADX INFO: renamed from: D */
    private long f20415D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20413E = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.lay_ad, 2);
        sparseIntArray.put(R.id.text_ad, 3);
        sparseIntArray.put(R.id.lay_parent, 4);
        sparseIntArray.put(R.id.progress_horizontal, 5);
        sparseIntArray.put(R.id.text_content, 6);
        sparseIntArray.put(R.id.actions_layout, 7);
    }

    public C5329x(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 8, null, f20413E));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20415D = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20415D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24322u() {
        synchronized (this) {
            this.f20415D = 1L;
        }
        m10851s();
    }

    private C5329x(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[7], (FrameLayout) objArr[2], (LinearLayout) objArr[4], (LinearProgressIndicator) objArr[5], (TextView) objArr[3], (TextView) objArr[6], (MaterialToolbar) objArr[1]);
        this.f20415D = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20414C = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24322u();
    }
}
