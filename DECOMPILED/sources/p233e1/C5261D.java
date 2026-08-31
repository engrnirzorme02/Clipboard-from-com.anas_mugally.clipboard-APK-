package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: renamed from: e1.D */
/* JADX INFO: loaded from: classes.dex */
public class C5261D extends AbstractC5259C {

    /* JADX INFO: renamed from: E */
    private static final SparseIntArray f20035E;

    /* JADX INFO: renamed from: C */
    private final ScrollView f20036C;

    /* JADX INFO: renamed from: D */
    private long f20037D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20035E = sparseIntArray;
        sparseIntArray.put(R.id.progressBar, 1);
        sparseIntArray.put(R.id.developerPhoto, 2);
        sparseIntArray.put(R.id.developerName, 3);
        sparseIntArray.put(R.id.aboutText, 4);
        sparseIntArray.put(R.id.socialMedia, 5);
        sparseIntArray.put(R.id.socialMediaScrollView, 6);
        sparseIntArray.put(R.id.socialMediaRecyclerView, 7);
    }

    public C5261D(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 8, null, f20035E));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20037D = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20037D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24272u() {
        synchronized (this) {
            this.f20037D = 1L;
        }
        m10851s();
    }

    private C5261D(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[2], (LinearProgressIndicator) objArr[1], (TextView) objArr[5], (RecyclerView) objArr[7], (HorizontalScrollView) objArr[6]);
        this.f20037D = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f20036C = scrollView;
        scrollView.setTag(null);
        m10852t(view);
        m24272u();
    }
}
