package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: e1.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5286b0 extends AbstractC2474g {

    /* JADX INFO: renamed from: v */
    public final CheckBox f20168v;

    /* JADX INFO: renamed from: w */
    public final TextView f20169w;

    /* JADX INFO: renamed from: x */
    public final TextView f20170x;

    /* JADX INFO: renamed from: y */
    public final TextView f20171y;

    /* JADX INFO: renamed from: z */
    public final TextView f20172z;

    protected AbstractC5286b0(Object obj, View view, int i7, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i7);
        this.f20168v = checkBox;
        this.f20169w = textView;
        this.f20170x = textView2;
        this.f20171y = textView3;
        this.f20172z = textView4;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5286b0 m24299u(LayoutInflater layoutInflater) {
        AbstractC2473f.m10828g();
        return m24300v(layoutInflater, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5286b0 m24300v(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC5286b0) AbstractC2474g.m10841m(layoutInflater, R.layout.view_accept_accessibility, null, false, obj);
    }
}
