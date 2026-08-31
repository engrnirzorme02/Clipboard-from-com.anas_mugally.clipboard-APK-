package p233e1;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import androidx.databinding.AbstractC2474g;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5302j0 extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final FrameLayout f20255A;

    /* JADX INFO: renamed from: B */
    public final RelativeLayout f20256B;

    /* JADX INFO: renamed from: C */
    public final TextInputLayout f20257C;

    /* JADX INFO: renamed from: D */
    public final TextInputLayout f20258D;

    /* JADX INFO: renamed from: E */
    public final MaterialSwitch f20259E;

    /* JADX INFO: renamed from: v */
    public final ToggleButton f20260v;

    /* JADX INFO: renamed from: w */
    public final Button f20261w;

    /* JADX INFO: renamed from: x */
    public final LinearLayout f20262x;

    /* JADX INFO: renamed from: y */
    public final TextInputEditText f20263y;

    /* JADX INFO: renamed from: z */
    public final TextInputEditText f20264z;

    protected AbstractC5302j0(Object obj, View view, int i7, ToggleButton toggleButton, Button button, LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, FrameLayout frameLayout, RelativeLayout relativeLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, MaterialSwitch materialSwitch) {
        super(obj, view, i7);
        this.f20260v = toggleButton;
        this.f20261w = button;
        this.f20262x = linearLayout;
        this.f20263y = textInputEditText;
        this.f20264z = textInputEditText2;
        this.f20255A = frameLayout;
        this.f20256B = relativeLayout;
        this.f20257C = textInputLayout;
        this.f20258D = textInputLayout2;
        this.f20259E = materialSwitch;
    }
}
