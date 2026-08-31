package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: e1.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5270M extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final TextInputLayout f20093A;

    /* JADX INFO: renamed from: B */
    public final ScrollView f20094B;

    /* JADX INFO: renamed from: v */
    public final MaterialButton f20095v;

    /* JADX INFO: renamed from: w */
    public final MaterialButton f20096w;

    /* JADX INFO: renamed from: x */
    public final TextInputEditText f20097x;

    /* JADX INFO: renamed from: y */
    public final TextInputEditText f20098y;

    /* JADX INFO: renamed from: z */
    public final TextInputLayout f20099z;

    protected AbstractC5270M(Object obj, View view, int i7, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ScrollView scrollView) {
        super(obj, view, i7);
        this.f20095v = materialButton;
        this.f20096w = materialButton2;
        this.f20097x = textInputEditText;
        this.f20098y = textInputEditText2;
        this.f20099z = textInputLayout;
        this.f20093A = textInputLayout2;
        this.f20094B = scrollView;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5270M m24283u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24284v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5270M m24284v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5270M) AbstractC2474g.m10841m(layoutInflater, R.layout.fragment_custom_prompt, viewGroup, z7, obj);
    }
}
