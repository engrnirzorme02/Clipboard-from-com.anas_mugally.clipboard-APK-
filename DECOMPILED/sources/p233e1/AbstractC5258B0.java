package p233e1;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2474g;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: e1.B0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5258B0 extends AbstractC2474g {

    /* JADX INFO: renamed from: A */
    public final TextView f20019A;

    /* JADX INFO: renamed from: v */
    public final MaterialButton f20020v;

    /* JADX INFO: renamed from: w */
    public final ConstraintLayout f20021w;

    /* JADX INFO: renamed from: x */
    public final ConstraintLayout f20022x;

    /* JADX INFO: renamed from: y */
    public final ImageView f20023y;

    /* JADX INFO: renamed from: z */
    public final ProgressBar f20024z;

    protected AbstractC5258B0(Object obj, View view, int i7, MaterialButton materialButton, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ProgressBar progressBar, TextView textView) {
        super(obj, view, i7);
        this.f20020v = materialButton;
        this.f20021w = constraintLayout;
        this.f20022x = constraintLayout2;
        this.f20023y = imageView;
        this.f20024z = progressBar;
        this.f20019A = textView;
    }
}
