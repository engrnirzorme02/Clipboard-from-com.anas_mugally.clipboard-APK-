package p233e1;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC2474g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: renamed from: e1.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5259C extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final RecyclerView f20025A;

    /* JADX INFO: renamed from: B */
    public final HorizontalScrollView f20026B;

    /* JADX INFO: renamed from: v */
    public final TextView f20027v;

    /* JADX INFO: renamed from: w */
    public final TextView f20028w;

    /* JADX INFO: renamed from: x */
    public final ImageView f20029x;

    /* JADX INFO: renamed from: y */
    public final LinearProgressIndicator f20030y;

    /* JADX INFO: renamed from: z */
    public final TextView f20031z;

    protected AbstractC5259C(Object obj, View view, int i7, TextView textView, TextView textView2, ImageView imageView, LinearProgressIndicator linearProgressIndicator, TextView textView3, RecyclerView recyclerView, HorizontalScrollView horizontalScrollView) {
        super(obj, view, i7);
        this.f20027v = textView;
        this.f20028w = textView2;
        this.f20029x = imageView;
        this.f20030y = linearProgressIndicator;
        this.f20031z = textView3;
        this.f20025A = recyclerView;
        this.f20026B = horizontalScrollView;
    }
}
