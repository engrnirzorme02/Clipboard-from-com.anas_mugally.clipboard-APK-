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

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes.dex */
public class C5285b extends AbstractC5283a {

    /* JADX INFO: renamed from: b0 */
    private static final SparseIntArray f20165b0;

    /* JADX INFO: renamed from: Z */
    private final RelativeLayout f20166Z;

    /* JADX INFO: renamed from: a0 */
    private long f20167a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20165b0 = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_main, 1);
        sparseIntArray.put(R.id.toolbar_main_activity, 2);
        sparseIntArray.put(R.id.scroll, 3);
        sparseIntArray.put(R.id.switchAccessibility, 4);
        sparseIntArray.put(R.id.lay_warning_apply_pro_op, 5);
        sparseIntArray.put(R.id.how_to_use_app, 6);
        sparseIntArray.put(R.id.customizeBubbleLayout, 7);
        sparseIntArray.put(R.id.pickTextTypeLayout, 8);
        sparseIntArray.put(R.id.pickTextTypeText, 9);
        sparseIntArray.put(R.id.autoSaveTextsSwitch, 10);
        sparseIntArray.put(R.id.temporaryTextWithPasswordSwitch, 11);
        sparseIntArray.put(R.id.clearTemporaryText, 12);
        sparseIntArray.put(R.id.autoSaveDurationLayout, 13);
        sparseIntArray.put(R.id.autoSaveDurationText, 14);
        sparseIntArray.put(R.id.layTypeOpBack, 15);
        sparseIntArray.put(R.id.text_type_op_dec_back, 16);
        sparseIntArray.put(R.id.text_type_op_back, 17);
        sparseIntArray.put(R.id.layTypeOpHome, 18);
        sparseIntArray.put(R.id.textTypeOpDecHome, 19);
        sparseIntArray.put(R.id.text_type_op_home, 20);
        sparseIntArray.put(R.id.layTypeOpMenu, 21);
        sparseIntArray.put(R.id.textTypeOpDecMenu, 22);
        sparseIntArray.put(R.id.text_type_op_menu, 23);
        sparseIntArray.put(R.id.autoPickBubbleSwitch, 24);
        sparseIntArray.put(R.id.countOfNotesLayout, 25);
        sparseIntArray.put(R.id.countOfNotesText, 26);
        sparseIntArray.put(R.id.clipboardOverlaySwitch, 27);
        sparseIntArray.put(R.id.layOverlayPosition, 28);
        sparseIntArray.put(R.id.text_overlay_position_title, 29);
        sparseIntArray.put(R.id.text_overlay_position_value, 30);
    }

    public C5285b(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 31, null, f20165b0));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20167a0 = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20167a0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24298u() {
        synchronized (this) {
            this.f20167a0 = 1L;
        }
        m10851s();
    }

    private C5285b(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (AppBarLayout) objArr[1], (MaterialSwitch) objArr[24], (LinearLayout) objArr[13], (MaterialTextView) objArr[14], (MaterialSwitch) objArr[10], (MaterialTextView) objArr[12], (MaterialSwitch) objArr[27], (LinearLayout) objArr[25], (MaterialTextView) objArr[26], (MaterialTextView) objArr[7], (MaterialTextView) objArr[6], (LinearLayout) objArr[28], (LinearLayout) objArr[15], (LinearLayout) objArr[18], (LinearLayout) objArr[21], (MaterialTextView) objArr[5], (LinearLayout) objArr[8], (MaterialTextView) objArr[9], (ScrollView) objArr[3], (MaterialSwitch) objArr[4], (MaterialSwitch) objArr[11], (MaterialTextView) objArr[29], (MaterialTextView) objArr[30], (MaterialTextView) objArr[17], (MaterialTextView) objArr[16], (MaterialTextView) objArr[19], (MaterialTextView) objArr[22], (MaterialTextView) objArr[20], (MaterialTextView) objArr[23], (MaterialToolbar) objArr[2]);
        this.f20167a0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f20166Z = relativeLayout;
        relativeLayout.setTag(null);
        m10852t(view);
        m24298u();
    }
}
