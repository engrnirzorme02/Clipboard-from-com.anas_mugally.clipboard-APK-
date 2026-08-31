package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: e1.z */
/* JADX INFO: loaded from: classes.dex */
public class C5333z extends AbstractC5331y {

    /* JADX INFO: renamed from: I */
    private static final SparseIntArray f20433I;

    /* JADX INFO: renamed from: H */
    private long f20434H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20433I = sparseIntArray;
        sparseIntArray.put(R.id.btn_back, 1);
        sparseIntArray.put(R.id.imageProfile, 2);
        sparseIntArray.put(R.id.text_user_name, 3);
        sparseIntArray.put(R.id.text_user_email, 4);
        sparseIntArray.put(R.id.icon_verified, 5);
        sparseIntArray.put(R.id.text_account_created, 6);
        sparseIntArray.put(R.id.text_last_sign_in, 7);
        sparseIntArray.put(R.id.text_email_verified, 8);
        sparseIntArray.put(R.id.text_delete_account, 9);
        sparseIntArray.put(R.id.btn_sign_out, 10);
        sparseIntArray.put(R.id.progress_bar, 11);
    }

    public C5333z(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 12, null, f20433I));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20434H = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20434H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24324u() {
        synchronized (this) {
            this.f20434H = 1L;
        }
        m10851s();
    }

    private C5333z(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (ImageButton) objArr[1], (MaterialButton) objArr[10], (ImageView) objArr[5], (ImageView) objArr[2], (LinearLayout) objArr[0], (ProgressBar) objArr[11], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[4], (TextView) objArr[3]);
        this.f20434H = -1L;
        this.f20429z.setTag(null);
        m10852t(view);
        m24324u();
    }
}
