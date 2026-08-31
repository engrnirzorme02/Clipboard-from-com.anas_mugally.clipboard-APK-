package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import androidx.recyclerview.widget.RecyclerView;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5264G extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final TextView f20045A;

    /* JADX INFO: renamed from: B */
    public final RecyclerView f20046B;

    /* JADX INFO: renamed from: C */
    public final TextView f20047C;

    /* JADX INFO: renamed from: D */
    public final LinearLayout f20048D;

    /* JADX INFO: renamed from: E */
    public final LinearLayout f20049E;

    /* JADX INFO: renamed from: F */
    public final LinearLayout f20050F;

    /* JADX INFO: renamed from: G */
    public final TextView f20051G;

    /* JADX INFO: renamed from: H */
    public final TextView f20052H;

    /* JADX INFO: renamed from: I */
    public final TextView f20053I;

    /* JADX INFO: renamed from: J */
    public final TextView f20054J;

    /* JADX INFO: renamed from: v */
    public final TextView f20055v;

    /* JADX INFO: renamed from: w */
    public final TextView f20056w;

    /* JADX INFO: renamed from: x */
    public final TextView f20057x;

    /* JADX INFO: renamed from: y */
    public final TextView f20058y;

    /* JADX INFO: renamed from: z */
    public final TextView f20059z;

    protected AbstractC5264G(Object obj, View view, int i7, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, RecyclerView recyclerView, TextView textView7, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        super(obj, view, i7);
        this.f20055v = textView;
        this.f20056w = textView2;
        this.f20057x = textView3;
        this.f20058y = textView4;
        this.f20059z = textView5;
        this.f20045A = textView6;
        this.f20046B = recyclerView;
        this.f20047C = textView7;
        this.f20048D = linearLayout;
        this.f20049E = linearLayout2;
        this.f20050F = linearLayout3;
        this.f20051G = textView8;
        this.f20052H = textView9;
        this.f20053I = textView10;
        this.f20054J = textView11;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5264G m24274u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24275v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5264G m24275v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5264G) AbstractC2474g.m10841m(layoutInflater, R.layout.fragment_ai_options, viewGroup, z7, obj);
    }
}
