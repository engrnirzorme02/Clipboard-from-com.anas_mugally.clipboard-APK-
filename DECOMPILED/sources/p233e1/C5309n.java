package p233e1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.databinding.AbstractC2474g;
import androidx.databinding.InterfaceC2472e;
import com.anas_mugally.clipboard.R;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.slider.Slider;

/* JADX INFO: renamed from: e1.n */
/* JADX INFO: loaded from: classes.dex */
public class C5309n extends AbstractC5307m {

    /* JADX INFO: renamed from: G */
    private static final SparseIntArray f20301G;

    /* JADX INFO: renamed from: E */
    private final LinearLayout f20302E;

    /* JADX INFO: renamed from: F */
    private long f20303F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20301G = sparseIntArray;
        sparseIntArray.put(R.id.primaryBubbleSwitch, 1);
        sparseIntArray.put(R.id.bubbleSizeSlider, 2);
        sparseIntArray.put(R.id.bubbleAlphaSlider, 3);
        sparseIntArray.put(R.id.bubbleInEdgeSlider, 4);
        sparseIntArray.put(R.id.yPositionSlider, 5);
        sparseIntArray.put(R.id.bubbleEdgeLocationRadioGroup, 6);
        sparseIntArray.put(R.id.radio_left, 7);
        sparseIntArray.put(R.id.radio_right, 8);
        sparseIntArray.put(R.id.changeBubbleLocationByTucheIt, 9);
    }

    public C5309n(InterfaceC2472e interfaceC2472e, View view) {
        this(interfaceC2472e, view, AbstractC2474g.m10844p(interfaceC2472e, view, 10, null, f20301G));
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: g */
    protected void mo10847g() {
        synchronized (this) {
            this.f20303F = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2474g
    /* JADX INFO: renamed from: l */
    public boolean mo10850l() {
        synchronized (this) {
            try {
                return this.f20303F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m24312u() {
        synchronized (this) {
            this.f20303F = 1L;
        }
        m10851s();
    }

    private C5309n(InterfaceC2472e interfaceC2472e, View view, Object[] objArr) {
        super(interfaceC2472e, view, 0, (Slider) objArr[3], (RadioGroup) objArr[6], (Slider) objArr[4], (Slider) objArr[2], (MaterialSwitch) objArr[9], (MaterialSwitch) objArr[1], (MaterialRadioButton) objArr[7], (MaterialRadioButton) objArr[8], (Slider) objArr[5]);
        this.f20303F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20302E = linearLayout;
        linearLayout.setTag(null);
        m10852t(view);
        m24312u();
    }
}
