package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p029D3.AbstractC0196h;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p333q3.AbstractC6826a;
import p397y3.AbstractC7539a;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC4604a {

    /* JADX INFO: renamed from: a */
    private TextView f17791a;

    /* JADX INFO: renamed from: b */
    private Button f17792b;

    /* JADX INFO: renamed from: c */
    private final TimeInterpolator f17793c;

    /* JADX INFO: renamed from: d */
    private int f17794d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17793c = AbstractC0196h.m979g(context, AbstractC6742c.f26234S, AbstractC6826a.f27405b);
    }

    /* JADX INFO: renamed from: d */
    private static void m21287d(View view, int i7, int i8) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i7, view.getPaddingEnd(), i8);
        } else {
            view.setPadding(view.getPaddingLeft(), i7, view.getPaddingRight(), i8);
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m21288e(int i7, int i8, int i9) {
        boolean z7;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f17791a.getPaddingTop() == i8 && this.f17791a.getPaddingBottom() == i9) {
            return z7;
        }
        m21287d(this.f17791a, i8, i9);
        return true;
    }

    @Override // com.google.android.material.snackbar.InterfaceC4604a
    /* JADX INFO: renamed from: a */
    public void mo21289a(int i7, int i8) {
        this.f17791a.setAlpha(0.0f);
        long j7 = i8;
        long j8 = i7;
        this.f17791a.animate().alpha(1.0f).setDuration(j7).setInterpolator(this.f17793c).setStartDelay(j8).start();
        if (this.f17792b.getVisibility() == 0) {
            this.f17792b.setAlpha(0.0f);
            this.f17792b.animate().alpha(1.0f).setDuration(j7).setInterpolator(this.f17793c).setStartDelay(j8).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC4604a
    /* JADX INFO: renamed from: b */
    public void mo21290b(int i7, int i8) {
        this.f17791a.setAlpha(1.0f);
        long j7 = i8;
        long j8 = i7;
        this.f17791a.animate().alpha(0.0f).setDuration(j7).setInterpolator(this.f17793c).setStartDelay(j8).start();
        if (this.f17792b.getVisibility() == 0) {
            this.f17792b.setAlpha(1.0f);
            this.f17792b.animate().alpha(0.0f).setDuration(j7).setInterpolator(this.f17793c).setStartDelay(j8).start();
        }
    }

    /* JADX INFO: renamed from: c */
    void m21291c(float f7) {
        if (f7 != 1.0f) {
            this.f17792b.setTextColor(AbstractC7539a.m33179j(AbstractC7539a.m33173d(this, AbstractC6742c.f26262k), this.f17792b.getCurrentTextColor(), f7));
        }
    }

    public Button getActionView() {
        return this.f17792b;
    }

    public TextView getMessageView() {
        return this.f17791a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f17791a = (TextView) findViewById(AbstractC6746g.f26407O);
        this.f17792b = (Button) findViewById(AbstractC6746g.f26406N);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC6744e.f26346h);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC6744e.f26344g);
        Layout layout = this.f17791a.getLayout();
        boolean z7 = layout != null && layout.getLineCount() > 1;
        if (!z7 || this.f17794d <= 0 || this.f17792b.getMeasuredWidth() <= this.f17794d) {
            if (!z7) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m21288e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m21288e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i8);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f17794d = i7;
    }
}
