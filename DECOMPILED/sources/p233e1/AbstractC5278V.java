package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: e1.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5278V extends AbstractC2474g {

    /* JADX INFO: renamed from: v */
    public final MaterialButton f20120v;

    /* JADX INFO: renamed from: w */
    public final LinearLayout f20121w;

    protected AbstractC5278V(Object obj, View view, int i7, MaterialButton materialButton, LinearLayout linearLayout) {
        super(obj, view, i7);
        this.f20120v = materialButton;
        this.f20121w = linearLayout;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5278V m24293u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24294v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5278V m24294v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5278V) AbstractC2474g.m10841m(layoutInflater, R.layout.item_saved_prompt, viewGroup, z7, obj);
    }
}
