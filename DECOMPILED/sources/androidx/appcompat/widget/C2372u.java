package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p255h.AbstractC5520a;

/* JADX INFO: renamed from: androidx.appcompat.widget.u */
/* JADX INFO: loaded from: classes.dex */
public class C2372u extends RatingBar {

    /* JADX INFO: renamed from: a */
    private final C2370s f8318a;

    public C2372u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20956G);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap bitmapM10144b = this.f8318a.m10144b();
        if (bitmapM10144b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM10144b.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }

    public C2372u(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2370s c2370s = new C2370s(this);
        this.f8318a = c2370s;
        c2370s.mo10145c(attributeSet, i7);
    }
}
