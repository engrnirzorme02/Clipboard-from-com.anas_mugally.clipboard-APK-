package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.H */
/* JADX INFO: loaded from: classes.dex */
public class C5265H extends AbstractC5264G {

    /* JADX INFO: renamed from: M */
    private static final SparseIntArray f20060M;

    /* JADX INFO: renamed from: K */
    private final ScrollView f20061K;

    /* JADX INFO: renamed from: L */
    private long f20062L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20060M = sparseIntArray;
        sparseIntArray.put(R.id.row_first, 1);
        sparseIntArray.put(R.id.correct_text, 2);
        sparseIntArray.put(R.id.rewrite, 3);
        sparseIntArray.put(R.id.expand_shrink, 4);
        sparseIntArray.put(R.id.row_second, 5);
        sparseIntArray.put(R.id.summarize, 6);
        sparseIntArray.put(R.id.translate, 7);
        sparseIntArray.put(R.id.extract_info, 8);
        sparseIntArray.put(R.id.row_third, 9);
        sparseIntArray.put(R.id.bullet_point, 10);
        sparseIntArray.put(R.id.table, 11);
        sparseIntArray.put(R.id.text_saved_prompts, 12);
        sparseIntArray.put(R.id.recycler_saved_prompts, 13);
        sparseIntArray.put(R.id.custom, 14);
        sparseIntArray.put(R.id.generate, 15);
    }

    public C5265H(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 16, null, f20060M));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20062L = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20062L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24276w() {
        synchronized (this) {
            this.f20062L = 1L;
        }
        m10851s();
    }

    private C5265H(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (TextView) objArr[10], (TextView) objArr[2], (TextView) objArr[14], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[15], (RecyclerView) objArr[13], (TextView) objArr[3], (LinearLayout) objArr[1], (LinearLayout) objArr[5], (LinearLayout) objArr[9], (TextView) objArr[6], (TextView) objArr[11], (TextView) objArr[12], (TextView) objArr[7]);
        this.f20062L = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f20061K = scrollView;
        scrollView.setTag(null);
        m10852t(view);
        m24276w();
    }
}
