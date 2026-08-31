package p233e1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: e1.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5274Q extends AbstractC2474g {

    /* JADX INFO: renamed from: v */
    public final MaterialButton f20108v;

    protected AbstractC5274Q(Object obj, View view, int i7, MaterialButton materialButton) {
        super(obj, view, i7);
        this.f20108v = materialButton;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC5274Q m24287u(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        AbstractC2473f.m10828g();
        return m24288v(layoutInflater, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC5274Q m24288v(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7, Object obj) {
        return (AbstractC5274Q) AbstractC2474g.m10841m(layoutInflater, R.layout.fragment_google_auth_required, viewGroup, z7, obj);
    }
}
