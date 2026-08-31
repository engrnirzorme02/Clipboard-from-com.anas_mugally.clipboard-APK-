package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.P */
/* JADX INFO: loaded from: classes.dex */
public class C5273P extends AbstractC5272O {

    /* JADX INFO: renamed from: A */
    private static final SparseIntArray f20105A;

    /* JADX INFO: renamed from: y */
    private final RelativeLayout f20106y;

    /* JADX INFO: renamed from: z */
    private long f20107z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20105A = sparseIntArray;
        sparseIntArray.put(R.id.image_logo, 1);
        sparseIntArray.put(R.id.show_text, 2);
        sparseIntArray.put(R.id.like, 3);
    }

    public C5273P(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 4, null, f20105A));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20107z = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20107z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24286u() {
        synchronized (this) {
            this.f20107z = 1L;
        }
        m10851s();
    }

    private C5273P(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ImageView) objArr[1], (RatingBar) objArr[3], (TextView) objArr[2]);
        this.f20107z = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20106y = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24286u();
    }
}
