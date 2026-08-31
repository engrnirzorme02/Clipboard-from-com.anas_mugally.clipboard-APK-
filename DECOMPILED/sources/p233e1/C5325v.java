package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: e1.v */
/* JADX INFO: loaded from: classes.dex */
public class C5325v extends AbstractC5323u {

    /* JADX INFO: renamed from: Q */
    private static final SparseIntArray f20398Q;

    /* JADX INFO: renamed from: O */
    private final RelativeLayout f20399O;

    /* JADX INFO: renamed from: P */
    private long f20400P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20398Q = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_main, 1);
        sparseIntArray.put(R.id.toolbar_main_activity, 2);
        sparseIntArray.put(R.id.scroll, 3);
        sparseIntArray.put(R.id.switch_notification, 4);
        sparseIntArray.put(R.id.how_to_use_app, 5);
        sparseIntArray.put(R.id.view_in_app_purchasing, 6);
        sparseIntArray.put(R.id.textview_in_app_purchasing, 7);
        sparseIntArray.put(R.id.in_app_purchasing, 8);
        sparseIntArray.put(R.id.cancelSubscribe, 9);
        sparseIntArray.put(R.id.customizeBubbleLayout, 10);
        sparseIntArray.put(R.id.switch_close_app_after_op, 11);
        sparseIntArray.put(R.id.switch_back_after_op, 12);
        sparseIntArray.put(R.id.text_backup, 13);
        sparseIntArray.put(R.id.text_restore, 14);
        sparseIntArray.put(R.id.text_share_app, 15);
        sparseIntArray.put(R.id.text_rate_app, 16);
        sparseIntArray.put(R.id.text_my_app, 17);
        sparseIntArray.put(R.id.text_error_report, 18);
        sparseIntArray.put(R.id.text_about_devs, 19);
    }

    public C5325v(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 20, null, f20398Q));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20400P = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20400P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24320u() {
        synchronized (this) {
            this.f20400P = 1L;
        }
        m10851s();
    }

    private C5325v(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[1], (MaterialTextView) objArr[9], (MaterialTextView) objArr[10], (MaterialTextView) objArr[5], (LinearLayout) objArr[8], (ScrollView) objArr[3], (MaterialSwitch) objArr[12], (MaterialSwitch) objArr[11], (MaterialSwitch) objArr[4], (MaterialTextView) objArr[19], (MaterialTextView) objArr[13], (MaterialTextView) objArr[18], (MaterialTextView) objArr[17], (MaterialTextView) objArr[16], (MaterialTextView) objArr[14], (MaterialTextView) objArr[15], (MaterialTextView) objArr[7], (MaterialToolbar) objArr[2], (View) objArr[6]);
        this.f20400P = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20399O = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24320u();
    }
}
