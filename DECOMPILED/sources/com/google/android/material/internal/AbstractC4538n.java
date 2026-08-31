package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.internal.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4538n extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Drawable f17345a;

    /* JADX INFO: renamed from: b */
    Rect f17346b;

    /* JADX INFO: renamed from: c */
    private Rect f17347c;

    /* JADX INFO: renamed from: d */
    private boolean f17348d;

    /* JADX INFO: renamed from: e */
    private boolean f17349e;

    /* JADX INFO: renamed from: f */
    private boolean f17350f;

    /* JADX INFO: renamed from: r */
    private boolean f17351r;

    /* JADX INFO: renamed from: com.google.android.material.internal.n$a */
    class a implements InterfaceC0993G {
        a() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            AbstractC4538n abstractC4538n = AbstractC4538n.this;
            if (abstractC4538n.f17346b == null) {
                abstractC4538n.f17346b = new Rect();
            }
            AbstractC4538n.this.f17346b.set(c0982a0.m4276j(), c0982a0.m4278l(), c0982a0.m4277k(), c0982a0.m4275i());
            AbstractC4538n.this.mo20784e(c0982a0);
            AbstractC4538n.this.setWillNotDraw(!c0982a0.m4279m() || AbstractC4538n.this.f17345a == null);
            AbstractC4538n.this.postInvalidateOnAnimation();
            return c0982a0.m4269c();
        }
    }

    public AbstractC4538n(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17347c = new Rect();
        this.f17348d = true;
        this.f17349e = true;
        this.f17350f = true;
        this.f17351r = true;
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f26906f6, i7, AbstractC6751l.f26546k, new int[0]);
        this.f17345a = typedArrayM20818i.getDrawable(AbstractC6752m.f26917g6);
        typedArrayM20818i.recycle();
        setWillNotDraw(true);
        AbstractC1030Z.m4494t0(this, new a());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f17346b == null || this.f17345a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f17348d) {
            this.f17347c.set(0, 0, width, this.f17346b.top);
            this.f17345a.setBounds(this.f17347c);
            this.f17345a.draw(canvas);
        }
        if (this.f17349e) {
            this.f17347c.set(0, height - this.f17346b.bottom, width, height);
            this.f17345a.setBounds(this.f17347c);
            this.f17345a.draw(canvas);
        }
        if (this.f17350f) {
            Rect rect = this.f17347c;
            Rect rect2 = this.f17346b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f17345a.setBounds(this.f17347c);
            this.f17345a.draw(canvas);
        }
        if (this.f17351r) {
            Rect rect3 = this.f17347c;
            Rect rect4 = this.f17346b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f17345a.setBounds(this.f17347c);
            this.f17345a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e */
    protected abstract void mo20784e(C0982A0 c0982a0);

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f17345a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f17345a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z7) {
        this.f17349e = z7;
    }

    public void setDrawLeftInsetForeground(boolean z7) {
        this.f17350f = z7;
    }

    public void setDrawRightInsetForeground(boolean z7) {
        this.f17351r = z7;
    }

    public void setDrawTopInsetForeground(boolean z7) {
        this.f17348d = z7;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f17345a = drawable;
    }
}
