package p233e1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import com.anas_mugally.clipboard.ActionsLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: renamed from: e1.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5327w extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final TextView f20403A;

    /* JADX INFO: renamed from: B */
    public final MaterialToolbar f20404B;

    /* JADX INFO: renamed from: v */
    public final ActionsLayout f20405v;

    /* JADX INFO: renamed from: w */
    public final FrameLayout f20406w;

    /* JADX INFO: renamed from: x */
    public final LinearLayout f20407x;

    /* JADX INFO: renamed from: y */
    public final LinearProgressIndicator f20408y;

    /* JADX INFO: renamed from: z */
    public final TextView f20409z;

    protected AbstractC5327w(Object obj, View view, int i7, ActionsLayout actionsLayout, FrameLayout frameLayout, LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, TextView textView, TextView textView2, MaterialToolbar materialToolbar) {
        super(obj, view, i7);
        this.f20405v = actionsLayout;
        this.f20406w = frameLayout;
        this.f20407x = linearLayout;
        this.f20408y = linearProgressIndicator;
        this.f20409z = textView;
        this.f20403A = textView2;
        this.f20404B = materialToolbar;
    }
}
