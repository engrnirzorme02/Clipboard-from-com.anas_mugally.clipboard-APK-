package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p255h.AbstractC5520a;

/* JADX INFO: renamed from: androidx.appcompat.widget.w */
/* JADX INFO: loaded from: classes.dex */
public class C2374w extends SeekBar {

    /* JADX INFO: renamed from: a */
    private final C2375x f8319a;

    public C2374w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20957H);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8319a.m10155h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8319a.m10156i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8319a.m10154g(canvas);
    }

    public C2374w(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2375x c2375x = new C2375x(this);
        this.f8319a = c2375x;
        c2375x.mo10145c(attributeSet, i7);
    }
}
