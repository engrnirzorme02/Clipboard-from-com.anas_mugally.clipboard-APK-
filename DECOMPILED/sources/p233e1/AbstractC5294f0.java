package p233e1;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.databinding.AbstractC2474g;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5294f0 extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final FrameLayout f20212A;

    /* JADX INFO: renamed from: B */
    public final RelativeLayout f20213B;

    /* JADX INFO: renamed from: C */
    public final TextInputLayout f20214C;

    /* JADX INFO: renamed from: D */
    public final TextView f20215D;

    /* JADX INFO: renamed from: v */
    public final ToggleButton f20216v;

    /* JADX INFO: renamed from: w */
    public final Button f20217w;

    /* JADX INFO: renamed from: x */
    public final Button f20218x;

    /* JADX INFO: renamed from: y */
    public final LinearLayout f20219y;

    /* JADX INFO: renamed from: z */
    public final TextInputEditText f20220z;

    protected AbstractC5294f0(Object obj, View view, int i7, ToggleButton toggleButton, Button button, Button button2, LinearLayout linearLayout, TextInputEditText textInputEditText, FrameLayout frameLayout, RelativeLayout relativeLayout, TextInputLayout textInputLayout, TextView textView) {
        super(obj, view, i7);
        this.f20216v = toggleButton;
        this.f20217w = button;
        this.f20218x = button2;
        this.f20219y = linearLayout;
        this.f20220z = textInputEditText;
        this.f20212A = frameLayout;
        this.f20213B = relativeLayout;
        this.f20214C = textInputLayout;
        this.f20215D = textView;
    }
}
