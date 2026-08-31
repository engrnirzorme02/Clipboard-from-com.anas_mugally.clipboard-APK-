package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: e1.r */
/* JADX INFO: loaded from: classes.dex */
public class C5317r extends AbstractC5315q {

    /* JADX INFO: renamed from: K */
    private static final SparseIntArray f20340K;

    /* JADX INFO: renamed from: J */
    private long f20341J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20340K = sparseIntArray;
        sparseIntArray.put(R.id.status_bar_space, 1);
        sparseIntArray.put(R.id.btn_close, 2);
        sparseIntArray.put(R.id.title_text, 3);
        sparseIntArray.put(R.id.spacer_right, 4);
        sparseIntArray.put(R.id.scroll_content, 5);
        sparseIntArray.put(R.id.icon_card, 6);
        sparseIntArray.put(R.id.welcome_title, 7);
        sparseIntArray.put(R.id.welcome_subtitle, 8);
        sparseIntArray.put(R.id.benefits_card, 9);
        sparseIntArray.put(R.id.btn_sign_in_google, 10);
        sparseIntArray.put(R.id.progress_bar, 11);
        sparseIntArray.put(R.id.text_error, 12);
        sparseIntArray.put(R.id.btn_skip, 13);
    }

    public C5317r(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 14, null, f20340K));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20341J = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20341J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24316u() {
        synchronized (this) {
            this.f20341J = 1L;
        }
        m10851s();
    }

    private C5317r(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (LinearLayout) objArr[9], (ImageButton) objArr[2], (MaterialButton) objArr[10], (MaterialButton) objArr[13], (MaterialCardView) objArr[6], (ConstraintLayout) objArr[0], (ProgressBar) objArr[11], (ScrollView) objArr[5], (View) objArr[4], (View) objArr[1], (TextView) objArr[12], (TextView) objArr[3], (TextView) objArr[8], (TextView) objArr[7]);
        this.f20341J = -1L;
        this.f20323A.setTag(null);
        m10852t(view);
        m24316u();
    }
}
