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

/* JADX INFO: renamed from: e1.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5276T extends AbstractC2474g {

    /* JADX INFO: renamed from: v */
    public final MaterialButton f20112v;

    /* JADX INFO: renamed from: w */
    public final MaterialButton f20113w;

    /* JADX INFO: renamed from: x */
    public final MaterialButton f20114x;

    /* JADX INFO: renamed from: y */
    public final LinearLayout f20115y;

    /* JADX INFO: renamed from: z */
    public final TextView f20116z;

    protected AbstractC5276T(Object obj, View view, int i7, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i7);
        this.f20112v = materialButton;
        this.f20113w = materialButton2;
        this.f20114x = materialButton3;
        this.f20115y = linearLayout;
        this.f20116z = textView;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5276T m24290u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24291v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5276T m24291v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5276T) AbstractC2474g.m10841m(layoutInflater, R.layout.fragment_translation, viewGroup, z7, obj);
    }
}
