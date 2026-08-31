package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.y0 */
/* JADX INFO: loaded from: classes.dex */
public class C5332y0 extends AbstractC5330x0 {

    /* JADX INFO: renamed from: z */
    private static final SparseIntArray f20430z;

    /* JADX INFO: renamed from: x */
    private final LinearLayout f20431x;

    /* JADX INFO: renamed from: y */
    private long f20432y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20430z = sparseIntArray;
        sparseIntArray.put(R.id.img_lock, 1);
        sparseIntArray.put(R.id.text_name_category, 2);
    }

    public C5332y0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 3, null, f20430z));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20432y = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20432y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24323u() {
        synchronized (this) {
            this.f20432y = 1L;
        }
        m10851s();
    }

    private C5332y0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.f20432y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20431x = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24323u();
    }
}
