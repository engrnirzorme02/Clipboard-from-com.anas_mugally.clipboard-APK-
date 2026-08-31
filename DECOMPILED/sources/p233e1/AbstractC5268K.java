package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5268K extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final TextInputEditText f20079A;

    /* JADX INFO: renamed from: B */
    public final TextInputLayout f20080B;

    /* JADX INFO: renamed from: C */
    public final LinearLayout f20081C;

    /* JADX INFO: renamed from: D */
    public final LinearLayout f20082D;

    /* JADX INFO: renamed from: E */
    public final TextView f20083E;

    /* JADX INFO: renamed from: F */
    public final TextView f20084F;

    /* JADX INFO: renamed from: v */
    public final MaterialButton f20085v;

    /* JADX INFO: renamed from: w */
    public final MaterialButton f20086w;

    /* JADX INFO: renamed from: x */
    public final MaterialButton f20087x;

    /* JADX INFO: renamed from: y */
    public final MaterialButton f20088y;

    /* JADX INFO: renamed from: z */
    public final MaterialButton f20089z;

    protected AbstractC5268K(Object obj, View view, int i7, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, TextInputEditText textInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        super(obj, view, i7);
        this.f20085v = materialButton;
        this.f20086w = materialButton2;
        this.f20087x = materialButton3;
        this.f20088y = materialButton4;
        this.f20089z = materialButton5;
        this.f20079A = textInputEditText;
        this.f20080B = textInputLayout;
        this.f20081C = linearLayout;
        this.f20082D = linearLayout2;
        this.f20083E = textView;
        this.f20084F = textView2;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5268K m24280u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24281v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5268K m24281v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5268K) AbstractC2474g.m10841m(layoutInflater, R.layout.fragment_ai_text_generation, viewGroup, z7, obj);
    }
}
