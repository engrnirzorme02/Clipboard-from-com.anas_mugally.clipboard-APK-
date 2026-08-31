package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.Y */
/* JADX INFO: loaded from: classes.dex */
public class C5281Y extends AbstractC5280X {

    /* JADX INFO: renamed from: z */
    private static final SparseIntArray f20126z;

    /* JADX INFO: renamed from: x */
    private final LinearLayout f20127x;

    /* JADX INFO: renamed from: y */
    private long f20128y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20126z = sparseIntArray;
        sparseIntArray.put(R.id.socialMediaIcon, 1);
        sparseIntArray.put(R.id.socialMediaName, 2);
    }

    public C5281Y(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 3, null, f20126z));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20128y = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20128y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24296u() {
        synchronized (this) {
            this.f20128y = 1L;
        }
        m10851s();
    }

    private C5281Y(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.f20128y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20127x = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24296u();
    }
}
