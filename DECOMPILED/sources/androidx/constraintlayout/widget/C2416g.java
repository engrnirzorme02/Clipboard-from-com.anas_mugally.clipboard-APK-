package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C2416g extends View {

    /* JADX INFO: renamed from: a */
    private boolean f8805a;

    public C2416g(Context context) {
        super(context);
        this.f8805a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z7) {
        this.f8805a = z7;
    }

    public void setGuidelineBegin(int i7) {
        ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) getLayoutParams();
        if (this.f8805a && c2408b.f8569a == i7) {
            return;
        }
        c2408b.f8569a = i7;
        setLayoutParams(c2408b);
    }

    public void setGuidelineEnd(int i7) {
        ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) getLayoutParams();
        if (this.f8805a && c2408b.f8571b == i7) {
            return;
        }
        c2408b.f8571b = i7;
        setLayoutParams(c2408b);
    }

    public void setGuidelinePercent(float f7) {
        ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) getLayoutParams();
        if (this.f8805a && c2408b.f8573c == f7) {
            return;
        }
        c2408b.f8573c = f7;
        setLayoutParams(c2408b);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }
}
