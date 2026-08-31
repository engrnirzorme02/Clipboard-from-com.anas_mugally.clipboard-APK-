package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.F */
/* JADX INFO: loaded from: classes.dex */
public class C5263F extends AbstractC5262E {

    /* JADX INFO: renamed from: B */
    private static final SparseIntArray f20042B;

    /* JADX INFO: renamed from: A */
    private long f20043A;

    /* JADX INFO: renamed from: z */
    private final RelativeLayout f20044z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20042B = sparseIntArray;
        sparseIntArray.put(R.id.text_description, 1);
        sparseIntArray.put(R.id.btn_show_video, 2);
        sparseIntArray.put(R.id.btn_op, 3);
        sparseIntArray.put(R.id.btn_cancel, 4);
    }

    public C5263F(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 5, null, f20042B));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20043A = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20043A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24273u() {
        synchronized (this) {
            this.f20043A = 1L;
        }
        m10851s();
    }

    private C5263F(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.f20043A = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20044z = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24273u();
    }
}
