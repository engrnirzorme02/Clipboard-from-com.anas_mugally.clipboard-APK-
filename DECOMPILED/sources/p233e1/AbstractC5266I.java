package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: renamed from: e1.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5266I extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final LinearLayout f20063A;

    /* JADX INFO: renamed from: B */
    public final LinearLayout f20064B;

    /* JADX INFO: renamed from: C */
    public final ScrollView f20065C;

    /* JADX INFO: renamed from: D */
    public final TextView f20066D;

    /* JADX INFO: renamed from: E */
    public final TextView f20067E;

    /* JADX INFO: renamed from: F */
    public final TextView f20068F;

    /* JADX INFO: renamed from: G */
    public final TextView f20069G;

    /* JADX INFO: renamed from: H */
    public final TextView f20070H;

    /* JADX INFO: renamed from: v */
    public final LinearProgressIndicator f20071v;

    /* JADX INFO: renamed from: w */
    public final MaterialButton f20072w;

    /* JADX INFO: renamed from: x */
    public final MaterialButton f20073x;

    /* JADX INFO: renamed from: y */
    public final MaterialButton f20074y;

    /* JADX INFO: renamed from: z */
    public final TextInputEditText f20075z;

    protected AbstractC5266I(Object obj, View view, int i7, LinearProgressIndicator linearProgressIndicator, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextInputEditText textInputEditText, LinearLayout linearLayout, LinearLayout linearLayout2, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i7);
        this.f20071v = linearProgressIndicator;
        this.f20072w = materialButton;
        this.f20073x = materialButton2;
        this.f20074y = materialButton3;
        this.f20075z = textInputEditText;
        this.f20063A = linearLayout;
        this.f20064B = linearLayout2;
        this.f20065C = scrollView;
        this.f20066D = textView;
        this.f20067E = textView2;
        this.f20068F = textView3;
        this.f20069G = textView4;
        this.f20070H = textView5;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5266I m24277u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24278v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5266I m24278v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5266I) AbstractC2474g.m10841m(layoutInflater, R.layout.fragment_ai_processing, viewGroup, z7, obj);
    }
}
