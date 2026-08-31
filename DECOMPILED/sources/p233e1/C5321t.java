package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: renamed from: e1.t */
/* JADX INFO: loaded from: classes.dex */
public class C5321t extends AbstractC5319s {

    /* JADX INFO: renamed from: M */
    private static final SparseIntArray f20368M;

    /* JADX INFO: renamed from: L */
    private long f20369L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20368M = sparseIntArray;
        sparseIntArray.put(R.id.progressBar, 1);
        sparseIntArray.put(R.id.lay1, 2);
        sparseIntArray.put(R.id.empty_state_icon, 3);
        sparseIntArray.put(R.id.empty_state_title, 4);
        sparseIntArray.put(R.id.empty_state_message, 5);
        sparseIntArray.put(R.id.recycler_main, 6);
        sparseIntArray.put(R.id.app_bar_main, 7);
        sparseIntArray.put(R.id.chips_scroll_view, 8);
        sparseIntArray.put(R.id.filter_chip_group, 9);
        sparseIntArray.put(R.id.date_range_container, 10);
        sparseIntArray.put(R.id.txt_date_range, 11);
        sparseIntArray.put(R.id.img_clear_date_range, 12);
        sparseIntArray.put(R.id.searchLayout, 13);
        sparseIntArray.put(R.id.input_text_serach, 14);
        sparseIntArray.put(R.id.img_open_app, 15);
    }

    public C5321t(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 16, null, f20368M));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20369L = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20369L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24318u() {
        synchronized (this) {
            this.f20369L = 1L;
        }
        m10851s();
    }

    private C5321t(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[7], (HorizontalScrollView) objArr[8], (LinearLayout) objArr[10], (ImageView) objArr[3], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4], (ChipGroup) objArr[9], (ImageView) objArr[12], (ImageView) objArr[15], (TextInputEditText) objArr[14], (LinearLayout) objArr[2], (RelativeLayout) objArr[0], (LinearProgressIndicator) objArr[1], (RecyclerView) objArr[6], (TextInputLayout) objArr[13], (MaterialTextView) objArr[11]);
        this.f20369L = -1L;
        this.f20355G.setTag(null);
        m10852t(view);
        m24318u();
    }
}
