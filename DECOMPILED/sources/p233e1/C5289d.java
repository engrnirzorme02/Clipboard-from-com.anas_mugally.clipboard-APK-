package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.d */
/* JADX INFO: loaded from: classes.dex */
public class C5289d extends AbstractC5287c {

    /* JADX INFO: renamed from: K */
    private static final SparseIntArray f20190K;

    /* JADX INFO: renamed from: J */
    private long f20191J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20190K = sparseIntArray;
        sparseIntArray.put(R.id.lay_child, 1);
        sparseIntArray.put(R.id.appbar, 2);
        sparseIntArray.put(R.id.lay_ad, 3);
        sparseIntArray.put(R.id.text_ad, 4);
        sparseIntArray.put(R.id.view, 5);
        sparseIntArray.put(R.id.save, 6);
        sparseIntArray.put(R.id.actions, 7);
        sparseIntArray.put(R.id.scroll, 8);
        sparseIntArray.put(R.id.img_open_app, 9);
        sparseIntArray.put(R.id.lay_input_text_title, 10);
        sparseIntArray.put(R.id.input_text_title, 11);
        sparseIntArray.put(R.id.lay_input_text_content, 12);
        sparseIntArray.put(R.id.input_text_content, 13);
    }

    public C5289d(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 14, null, f20190K));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20191J = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20191J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24302u() {
        synchronized (this) {
            this.f20191J = 1L;
        }
        m10851s();
    }

    private C5289d(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ActionsLayout) objArr[7], (AppBarLayout) objArr[2], (ImageView) objArr[9], (TextInputEditText) objArr[13], (TextInputEditText) objArr[11], (FrameLayout) objArr[3], (LinearLayout) objArr[1], (TextInputLayout) objArr[12], (TextInputLayout) objArr[10], (ConstraintLayout) objArr[0], (ImageView) objArr[6], (ScrollView) objArr[8], (TextView) objArr[4], (View) objArr[5]);
        this.f20191J = -1L;
        this.f20177E.setTag(null);
        m10852t(view);
        m24302u();
    }
}
