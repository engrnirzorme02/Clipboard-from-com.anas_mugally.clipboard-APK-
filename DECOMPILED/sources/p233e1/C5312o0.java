package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C5312o0 extends AbstractC5310n0 {

    /* JADX INFO: renamed from: B */
    private static final SparseIntArray f20312B;

    /* JADX INFO: renamed from: A */
    private long f20313A;

    /* JADX INFO: renamed from: z */
    private final ConstraintLayout f20314z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20312B = sparseIntArray;
        sparseIntArray.put(R.id.img_resort_categories, 1);
        sparseIntArray.put(R.id.text_name_category, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.view, 4);
    }

    public C5312o0(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 5, null, f20312B));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20313A = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20313A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24313u() {
        synchronized (this) {
            this.f20313A = 1L;
        }
        m10851s();
    }

    private C5312o0(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ImageView) objArr[1], (TextView) objArr[2], (ActionsLayout) objArr[3], (View) objArr[4]);
        this.f20313A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20314z = constraintLayout;
        constraintLayout.setTag(null);
        m10852t(view);
        m24313u();
    }
}
