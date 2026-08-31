package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p111O.AbstractC1030Z;
import p111O.C1053i0;
import p111O.InterfaceC1055j0;
import p255h.AbstractC5520a;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2341a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final a f8163a;

    /* JADX INFO: renamed from: b */
    protected final Context f8164b;

    /* JADX INFO: renamed from: c */
    protected ActionMenuView f8165c;

    /* JADX INFO: renamed from: d */
    protected C2345c f8166d;

    /* JADX INFO: renamed from: e */
    protected int f8167e;

    /* JADX INFO: renamed from: f */
    protected C1053i0 f8168f;

    /* JADX INFO: renamed from: r */
    private boolean f8169r;

    /* JADX INFO: renamed from: s */
    private boolean f8170s;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    protected class a implements InterfaceC1055j0 {

        /* JADX INFO: renamed from: a */
        private boolean f8171a = false;

        /* JADX INFO: renamed from: b */
        int f8172b;

        protected a() {
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: a */
        public void mo4695a(View view) {
            this.f8171a = true;
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: b */
        public void mo4696b(View view) {
            if (this.f8171a) {
                return;
            }
            AbstractC2341a abstractC2341a = AbstractC2341a.this;
            abstractC2341a.f8168f = null;
            AbstractC2341a.super.setVisibility(this.f8172b);
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: c */
        public void mo4697c(View view) {
            AbstractC2341a.super.setVisibility(0);
            this.f8171a = false;
        }

        /* JADX INFO: renamed from: d */
        public a m9995d(C1053i0 c1053i0, int i7) {
            AbstractC2341a.this.f8168f = c1053i0;
            this.f8172b = i7;
            return this;
        }
    }

    AbstractC2341a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8163a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC5520a.f20963a, typedValue, true) || typedValue.resourceId == 0) {
            this.f8164b = context;
        } else {
            this.f8164b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: d */
    protected static int m9992d(int i7, int i8, boolean z7) {
        return z7 ? i7 - i8 : i7 + i8;
    }

    /* JADX INFO: renamed from: c */
    protected int m9993c(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    /* JADX INFO: renamed from: e */
    protected int m9994e(View view, int i7, int i8, int i9, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z7) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: f */
    public C1053i0 mo9631f(int i7, long j7) {
        C1053i0 c1053i0 = this.f8168f;
        if (c1053i0 != null) {
            c1053i0.m4685c();
        }
        if (i7 != 0) {
            C1053i0 c1053i0M4684b = AbstractC1030Z.m4463e(this).m4684b(0.0f);
            c1053i0M4684b.m4687e(j7);
            c1053i0M4684b.m4689g(this.f8163a.m9995d(c1053i0M4684b, i7));
            return c1053i0M4684b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1053i0 c1053i0M4684b2 = AbstractC1030Z.m4463e(this).m4684b(1.0f);
        c1053i0M4684b2.m4687e(j7);
        c1053i0M4684b2.m4689g(this.f8163a.m9995d(c1053i0M4684b2, i7));
        return c1053i0M4684b2;
    }

    public int getAnimatedVisibility() {
        return this.f8168f != null ? this.f8163a.f8172b : getVisibility();
    }

    public int getContentHeight() {
        return this.f8167e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC5529j.f21225a, AbstractC5520a.f20965c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC5529j.f21270j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C2345c c2345c = this.f8166d;
        if (c2345c != null) {
            c2345c.m10014H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8170s = false;
        }
        if (!this.f8170s) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8170s = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8170s = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8169r = false;
        }
        if (!this.f8169r) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8169r = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8169r = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i7);

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            C1053i0 c1053i0 = this.f8168f;
            if (c1053i0 != null) {
                c1053i0.m4685c();
            }
            super.setVisibility(i7);
        }
    }
}
