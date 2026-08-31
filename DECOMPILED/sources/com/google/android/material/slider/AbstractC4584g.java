package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4528d;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.AbstractC4546v;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p029D3.AbstractC0196h;
import p041F.AbstractC0400a;
import p045F3.AbstractC0422b;
import p045F3.AbstractC0423c;
import p065I.AbstractC0577a;
import p069I3.C0622i;
import p069I3.C0627n;
import p093L3.AbstractC0842a;
import p101M3.C0895a;
import p111O.AbstractC1030Z;
import p118P.C1170s;
import p153U.AbstractC1648a;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6743d;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.slider.g */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4584g extends View {

    /* JADX INFO: renamed from: g1 */
    private static final String f17608g1 = "g";

    /* JADX INFO: renamed from: h1 */
    static final int f17609h1 = AbstractC6751l.f26532F;

    /* JADX INFO: renamed from: i1 */
    private static final int f17610i1 = AbstractC6742c.f26227L;

    /* JADX INFO: renamed from: j1 */
    private static final int f17611j1 = AbstractC6742c.f26230O;

    /* JADX INFO: renamed from: k1 */
    private static final int f17612k1 = AbstractC6742c.f26234S;

    /* JADX INFO: renamed from: l1 */
    private static final int f17613l1 = AbstractC6742c.f26232Q;

    /* JADX INFO: renamed from: A */
    private ValueAnimator f17614A;

    /* JADX INFO: renamed from: A0 */
    private float[] f17615A0;

    /* JADX INFO: renamed from: B */
    private ValueAnimator f17616B;

    /* JADX INFO: renamed from: B0 */
    private int f17617B0;

    /* JADX INFO: renamed from: C */
    private final int f17618C;

    /* JADX INFO: renamed from: C0 */
    private int f17619C0;

    /* JADX INFO: renamed from: D */
    private int f17620D;

    /* JADX INFO: renamed from: D0 */
    private int f17621D0;

    /* JADX INFO: renamed from: E */
    private int f17622E;

    /* JADX INFO: renamed from: E0 */
    private int f17623E0;

    /* JADX INFO: renamed from: F */
    private int f17624F;

    /* JADX INFO: renamed from: F0 */
    private boolean f17625F0;

    /* JADX INFO: renamed from: G */
    private int f17626G;

    /* JADX INFO: renamed from: G0 */
    private boolean f17627G0;

    /* JADX INFO: renamed from: H */
    private int f17628H;

    /* JADX INFO: renamed from: H0 */
    private boolean f17629H0;

    /* JADX INFO: renamed from: I */
    private int f17630I;

    /* JADX INFO: renamed from: I0 */
    private ColorStateList f17631I0;

    /* JADX INFO: renamed from: J */
    private int f17632J;

    /* JADX INFO: renamed from: J0 */
    private ColorStateList f17633J0;

    /* JADX INFO: renamed from: K */
    private int f17634K;

    /* JADX INFO: renamed from: K0 */
    private ColorStateList f17635K0;

    /* JADX INFO: renamed from: L */
    private int f17636L;

    /* JADX INFO: renamed from: L0 */
    private ColorStateList f17637L0;

    /* JADX INFO: renamed from: M */
    private int f17638M;

    /* JADX INFO: renamed from: M0 */
    private ColorStateList f17639M0;

    /* JADX INFO: renamed from: N */
    private int f17640N;

    /* JADX INFO: renamed from: N0 */
    private final Path f17641N0;

    /* JADX INFO: renamed from: O */
    private int f17642O;

    /* JADX INFO: renamed from: O0 */
    private final RectF f17643O0;

    /* JADX INFO: renamed from: P */
    private int f17644P;

    /* JADX INFO: renamed from: P0 */
    private final RectF f17645P0;

    /* JADX INFO: renamed from: Q */
    private int f17646Q;

    /* JADX INFO: renamed from: Q0 */
    private final RectF f17647Q0;

    /* JADX INFO: renamed from: R */
    private int f17648R;

    /* JADX INFO: renamed from: R0 */
    private final RectF f17649R0;

    /* JADX INFO: renamed from: S */
    private int f17650S;

    /* JADX INFO: renamed from: S0 */
    private final Rect f17651S0;

    /* JADX INFO: renamed from: T */
    private int f17652T;

    /* JADX INFO: renamed from: T0 */
    private final RectF f17653T0;

    /* JADX INFO: renamed from: U */
    private int f17654U;

    /* JADX INFO: renamed from: U0 */
    private final Rect f17655U0;

    /* JADX INFO: renamed from: V */
    private int f17656V;

    /* JADX INFO: renamed from: V0 */
    private final Matrix f17657V0;

    /* JADX INFO: renamed from: W */
    private int f17658W;

    /* JADX INFO: renamed from: W0 */
    private final C0622i f17659W0;

    /* JADX INFO: renamed from: X0 */
    private Drawable f17660X0;

    /* JADX INFO: renamed from: Y0 */
    private List f17661Y0;

    /* JADX INFO: renamed from: Z0 */
    private float f17662Z0;

    /* JADX INFO: renamed from: a */
    private final Paint f17663a;

    /* JADX INFO: renamed from: a0 */
    private int f17664a0;

    /* JADX INFO: renamed from: a1 */
    private int f17665a1;

    /* JADX INFO: renamed from: b */
    private final Paint f17666b;

    /* JADX INFO: renamed from: b0 */
    private int f17667b0;

    /* JADX INFO: renamed from: b1 */
    private final int f17668b1;

    /* JADX INFO: renamed from: c */
    private final Paint f17669c;

    /* JADX INFO: renamed from: c0 */
    private boolean f17670c0;

    /* JADX INFO: renamed from: c1 */
    private final ViewTreeObserver.OnScrollChangedListener f17671c1;

    /* JADX INFO: renamed from: d */
    private final Paint f17672d;

    /* JADX INFO: renamed from: d0 */
    private Drawable f17673d0;

    /* JADX INFO: renamed from: d1 */
    private final ViewTreeObserver.OnGlobalLayoutListener f17674d1;

    /* JADX INFO: renamed from: e */
    private final Paint f17675e;

    /* JADX INFO: renamed from: e0 */
    private boolean f17676e0;

    /* JADX INFO: renamed from: e1 */
    private final Runnable f17677e1;

    /* JADX INFO: renamed from: f */
    private final Paint f17678f;

    /* JADX INFO: renamed from: f0 */
    private Drawable f17679f0;

    /* JADX INFO: renamed from: f1 */
    private boolean f17680f1;

    /* JADX INFO: renamed from: g0 */
    private boolean f17681g0;

    /* JADX INFO: renamed from: h0 */
    private ColorStateList f17682h0;

    /* JADX INFO: renamed from: i0 */
    private Drawable f17683i0;

    /* JADX INFO: renamed from: j0 */
    private boolean f17684j0;

    /* JADX INFO: renamed from: k0 */
    private Drawable f17685k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f17686l0;

    /* JADX INFO: renamed from: m0 */
    private ColorStateList f17687m0;

    /* JADX INFO: renamed from: n0 */
    private int f17688n0;

    /* JADX INFO: renamed from: o0 */
    private int f17689o0;

    /* JADX INFO: renamed from: p0 */
    private int f17690p0;

    /* JADX INFO: renamed from: q0 */
    private float f17691q0;

    /* JADX INFO: renamed from: r */
    private final Paint f17692r;

    /* JADX INFO: renamed from: r0 */
    private float f17693r0;

    /* JADX INFO: renamed from: s */
    private final c f17694s;

    /* JADX INFO: renamed from: s0 */
    private MotionEvent f17695s0;

    /* JADX INFO: renamed from: t */
    private final AccessibilityManager f17696t;

    /* JADX INFO: renamed from: t0 */
    private boolean f17697t0;

    /* JADX INFO: renamed from: u */
    private b f17698u;

    /* JADX INFO: renamed from: u0 */
    private float f17699u0;

    /* JADX INFO: renamed from: v */
    private int f17700v;

    /* JADX INFO: renamed from: v0 */
    private float f17701v0;

    /* JADX INFO: renamed from: w */
    private final List f17702w;

    /* JADX INFO: renamed from: w0 */
    private ArrayList f17703w0;

    /* JADX INFO: renamed from: x */
    private final List f17704x;

    /* JADX INFO: renamed from: x0 */
    private int f17705x0;

    /* JADX INFO: renamed from: y */
    private final List f17706y;

    /* JADX INFO: renamed from: y0 */
    private int f17707y0;

    /* JADX INFO: renamed from: z */
    private boolean f17708z;

    /* JADX INFO: renamed from: z0 */
    private float f17709z0;

    /* JADX INFO: renamed from: com.google.android.material.slider.g$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlay viewOverlayM21135W = AbstractC4584g.this.m21135W();
            if (viewOverlayM21135W == null) {
                return;
            }
            Iterator it = AbstractC4584g.this.f17702w.iterator();
            while (it.hasNext()) {
                viewOverlayM21135W.remove((C0895a) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.g$c */
    public static class c extends AbstractC1648a {

        /* JADX INFO: renamed from: q */
        private final AbstractC4584g f17713q;

        /* JADX INFO: renamed from: r */
        final Rect f17714r;

        c(AbstractC4584g abstractC4584g) {
            super(abstractC4584g);
            this.f17714r = new Rect();
            this.f17713q = abstractC4584g;
        }

        /* JADX INFO: renamed from: Y */
        private String m21207Y(int i7) {
            if (i7 == this.f17713q.getValues().size() - 1) {
                return this.f17713q.getContext().getString(AbstractC6750k.f26510j);
            }
            return i7 == 0 ? this.f17713q.getContext().getString(AbstractC6750k.f26511k) : "";
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: B */
        protected int mo6802B(float f7, float f8) {
            for (int i7 = 0; i7 < this.f17713q.getValues().size(); i7++) {
                this.f17713q.m21204S0(i7, this.f17714r);
                if (this.f17714r.contains((int) f7, (int) f8)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: C */
        protected void mo6803C(List list) {
            for (int i7 = 0; i7 < this.f17713q.getValues().size(); i7++) {
                list.add(Integer.valueOf(i7));
            }
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: L */
        protected boolean mo6808L(int i7, int i8, Bundle bundle) {
            if (!this.f17713q.isEnabled()) {
                return false;
            }
            if (i8 != 4096 && i8 != 8192) {
                if (i8 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.f17713q.m21125Q0(i7, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.f17713q.m21130T0();
                        this.f17713q.postInvalidate();
                        m6804E(i7);
                        return true;
                    }
                }
                return false;
            }
            float fM21194v = this.f17713q.m21194v(20);
            if (i8 == 8192) {
                fM21194v = -fM21194v;
            }
            if (this.f17713q.m21205p0()) {
                fM21194v = -fM21194v;
            }
            if (!this.f17713q.m21125Q0(i7, AbstractC0577a.m2540a(this.f17713q.getValues().get(i7).floatValue() + fM21194v, this.f17713q.getValueFrom(), this.f17713q.getValueTo()))) {
                return false;
            }
            this.f17713q.setActiveThumbIndex(i7);
            this.f17713q.mo21087J0();
            this.f17713q.m21130T0();
            this.f17713q.postInvalidate();
            m6804E(i7);
            return true;
        }

        @Override // p153U.AbstractC1648a
        /* JADX INFO: renamed from: P */
        protected void mo6812P(int i7, C1170s c1170s) {
            c1170s.m5052b(C1170s.a.f4098L);
            List<Float> values = this.f17713q.getValues();
            Float f7 = values.get(i7);
            float fFloatValue = f7.floatValue();
            float valueFrom = this.f17713q.getValueFrom();
            float valueTo = this.f17713q.getValueTo();
            if (this.f17713q.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    c1170s.m5051a(8192);
                }
                if (fFloatValue < valueTo) {
                    c1170s.m5051a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(AbstractC4584g.f17608g1, String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f7, Float.valueOf(valueFrom), Float.valueOf(valueTo)));
            }
            c1170s.m5018E0(C1170s.h.m5113a(1, valueFrom, valueTo, fFloatValue));
            c1170s.m5069m0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f17713q.getContentDescription() != null) {
                sb.append(this.f17713q.getContentDescription());
                sb.append(",");
            }
            String strM21126R = this.f17713q.m21126R(fFloatValue);
            String string = this.f17713q.getContext().getString(AbstractC6750k.f26512l);
            if (values.size() > 1) {
                string = m21207Y(i7);
            }
            CharSequence charSequenceM4434F = AbstractC1030Z.m4434F(this.f17713q);
            if (TextUtils.isEmpty(charSequenceM4434F)) {
                sb.append(String.format(Locale.getDefault(), "%s, %s", string, strM21126R));
            } else {
                c1170s.m5033M0(charSequenceM4434F);
            }
            c1170s.m5076q0(sb.toString());
            this.f17713q.m21204S0(i7, this.f17714r);
            c1170s.m5062i0(this.f17714r);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.g$d */
    private enum d {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.g$e */
    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        float f17720a;

        /* JADX INFO: renamed from: b */
        float f17721b;

        /* JADX INFO: renamed from: c */
        ArrayList f17722c;

        /* JADX INFO: renamed from: d */
        float f17723d;

        /* JADX INFO: renamed from: e */
        boolean f17724e;

        /* JADX INFO: renamed from: com.google.android.material.slider.g$e$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i7) {
                return new e[i7];
            }
        }

        /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeFloat(this.f17720a);
            parcel.writeFloat(this.f17721b);
            parcel.writeList(this.f17722c);
            parcel.writeFloat(this.f17723d);
            parcel.writeBooleanArray(new boolean[]{this.f17724e});
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        private e(Parcel parcel) {
            super(parcel);
            this.f17720a = parcel.readFloat();
            this.f17721b = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f17722c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f17723d = parcel.readFloat();
            this.f17724e = parcel.createBooleanArray()[0];
        }
    }

    public AbstractC4584g(Context context, AttributeSet attributeSet, int i7) {
        super(AbstractC0842a.m3884d(context, attributeSet, i7, f17609h1), attributeSet, i7);
        this.f17702w = new ArrayList();
        this.f17704x = new ArrayList();
        this.f17706y = new ArrayList();
        this.f17708z = false;
        this.f17654U = -1;
        this.f17656V = -1;
        this.f17670c0 = false;
        this.f17676e0 = false;
        this.f17681g0 = false;
        this.f17684j0 = false;
        this.f17686l0 = false;
        this.f17697t0 = false;
        this.f17703w0 = new ArrayList();
        this.f17705x0 = -1;
        this.f17707y0 = -1;
        this.f17709z0 = 0.0f;
        this.f17627G0 = false;
        this.f17641N0 = new Path();
        this.f17643O0 = new RectF();
        this.f17645P0 = new RectF();
        this.f17647Q0 = new RectF();
        this.f17649R0 = new RectF();
        this.f17651S0 = new Rect();
        this.f17653T0 = new RectF();
        this.f17655U0 = new Rect();
        this.f17657V0 = new Matrix();
        C0622i c0622i = new C0622i();
        this.f17659W0 = c0622i;
        this.f17661Y0 = Collections.EMPTY_LIST;
        this.f17665a1 = 0;
        this.f17671c1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.d
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f17605a.m21134V0();
            }
        };
        this.f17674d1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.e
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f17606a.m21134V0();
            }
        };
        this.f17677e1 = new Runnable() { // from class: com.google.android.material.slider.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4584g.m21143a(this.f17607a);
            }
        };
        Context context2 = getContext();
        this.f17680f1 = isShown();
        this.f17663a = new Paint();
        this.f17666b = new Paint();
        Paint paint = new Paint(1);
        this.f17669c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f17672d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f17675e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f17678f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f17692r = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        m21191t0(context2.getResources());
        m21108H0(context2, attributeSet, i7);
        setFocusable(true);
        setClickable(true);
        c0622i.m2726n0(2);
        this.f17618C = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.f17694s = cVar;
        AbstractC1030Z.m4474j0(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f17696t = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f17668b1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.f17668b1 = 120000;
        }
    }

    /* JADX INFO: renamed from: A */
    private void m21094A() {
        if (this.f17702w.size() > this.f17703w0.size()) {
            List<C0895a> listSubList = this.f17702w.subList(this.f17703w0.size(), this.f17702w.size());
            for (C0895a c0895a : listSubList) {
                if (isAttachedToWindow()) {
                    m21096B(c0895a);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f17702w.size() >= this.f17703w0.size()) {
                break;
            }
            C0895a c0895aM4055D0 = C0895a.m4055D0(getContext(), null, 0, this.f17700v);
            this.f17702w.add(c0895aM4055D0);
            if (isAttachedToWindow()) {
                m21182o(c0895aM4055D0);
            }
        }
        int i7 = this.f17702w.size() != 1 ? 1 : 0;
        Iterator it = this.f17702w.iterator();
        while (it.hasNext()) {
            ((C0895a) it.next()).m2732s0(i7);
        }
    }

    /* JADX INFO: renamed from: A0 */
    private boolean m21095A0(int i7) {
        if (m21205p0() || mo21091s0()) {
            i7 = i7 == Integer.MIN_VALUE ? C3553a.e.API_PRIORITY_OTHER : -i7;
        }
        return m21203z0(i7);
    }

    /* JADX INFO: renamed from: B */
    private void m21096B(C0895a c0895a) {
        ViewGroup viewGroupM20830e = AbstractC4546v.m20830e(this);
        if (viewGroupM20830e == null) {
            return;
        }
        viewGroupM20830e.getOverlay().remove(c0895a);
        c0895a.m4062F0(viewGroupM20830e);
    }

    /* JADX INFO: renamed from: B0 */
    private float m21097B0(float f7) {
        float f8 = this.f17699u0;
        float f9 = (f7 - f8) / (this.f17701v0 - f8);
        return (m21205p0() || mo21091s0()) ? 1.0f - f9 : f9;
    }

    /* JADX INFO: renamed from: C */
    private float m21098C(float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        float f8 = (f7 - this.f17644P) / this.f17623E0;
        float f9 = this.f17699u0;
        return (f8 * (f9 - this.f17701v0)) + f9;
    }

    /* JADX INFO: renamed from: C0 */
    private Boolean m21099C0(int i7, KeyEvent keyEvent) {
        if (i7 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(m21203z0(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(m21203z0(-1)) : Boolean.FALSE;
        }
        if (i7 != 66) {
            if (i7 != 81) {
                if (i7 == 69) {
                    m21203z0(-1);
                    return Boolean.TRUE;
                }
                if (i7 != 70) {
                    switch (i7) {
                        case zzbbn.zzt.zzm /* 21 */:
                            m21095A0(-1);
                            return Boolean.TRUE;
                        case 22:
                            m21095A0(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            m21203z0(1);
            return Boolean.TRUE;
        }
        this.f17705x0 = this.f17707y0;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: D */
    private void m21100D(int i7) {
        Iterator it = this.f17704x.iterator();
        while (it.hasNext()) {
            ((InterfaceC4578a) it.next()).mo21092a(this, ((Float) this.f17703w0.get(i7)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f17696t;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        m21110I0(i7);
    }

    /* JADX INFO: renamed from: D0 */
    private void m21101D0() {
        Iterator it = this.f17706y.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: E */
    private void m21102E() {
        for (InterfaceC4578a interfaceC4578a : this.f17704x) {
            Iterator it = this.f17703w0.iterator();
            while (it.hasNext()) {
                interfaceC4578a.mo21092a(this, ((Float) it.next()).floatValue(), false);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m21103E0() {
        Iterator it = this.f17706y.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX INFO: renamed from: F */
    private void m21104F(Canvas canvas, int i7, int i8) {
        int i9;
        float f7;
        float f8;
        AbstractC4584g abstractC4584g = this;
        float[] fArrM21128S = abstractC4584g.m21128S();
        int i10 = abstractC4584g.f17644P;
        float f9 = i7;
        float fM21178m1 = i10 + (fArrM21128S[1] * f9);
        float fM21178m2 = i10 + (fArrM21128S[0] * f9);
        if (fM21178m2 >= fM21178m1) {
            abstractC4584g.f17643O0.setEmpty();
            return;
        }
        d dVar = d.NONE;
        if (abstractC4584g.f17703w0.size() == 1 && !abstractC4584g.mo21089g0()) {
            dVar = (abstractC4584g.m21205p0() || abstractC4584g.mo21091s0()) ? d.RIGHT : d.LEFT;
        }
        d dVar2 = dVar;
        int i11 = 0;
        while (i11 < abstractC4584g.f17703w0.size()) {
            if (abstractC4584g.f17703w0.size() > 1) {
                if (i11 > 0) {
                    fM21178m2 = abstractC4584g.m21178m1(((Float) abstractC4584g.f17703w0.get(i11 - 1)).floatValue());
                }
                fM21178m1 = abstractC4584g.m21178m1(((Float) abstractC4584g.f17703w0.get(i11)).floatValue());
                if (abstractC4584g.m21205p0() || abstractC4584g.mo21091s0()) {
                    fM21178m1 = fM21178m2;
                    fM21178m2 = fM21178m1;
                }
            }
            int trackCornerSize = abstractC4584g.getTrackCornerSize();
            int iOrdinal = dVar2.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fM21178m2 += abstractC4584g.f17652T;
                    fM21178m1 += trackCornerSize;
                } else if (iOrdinal == 3) {
                    if (!abstractC4584g.mo21089g0()) {
                        i9 = abstractC4584g.f17652T;
                        fM21178m2 += i9;
                    } else if (fArrM21128S[1] == 0.5f) {
                        fM21178m2 += abstractC4584g.f17652T;
                    } else if (fArrM21128S[0] == 0.5f) {
                        i9 = abstractC4584g.f17652T;
                    }
                }
                f7 = fM21178m2;
                f8 = fM21178m1;
                if (f7 >= f8) {
                    abstractC4584g.f17643O0.setEmpty();
                } else {
                    RectF rectF = abstractC4584g.f17643O0;
                    float f10 = i8;
                    int i12 = abstractC4584g.f17642O;
                    rectF.set(f7, f10 - (i12 / 2.0f), f8, f10 + (i12 / 2.0f));
                    abstractC4584g.m21145a1(canvas, abstractC4584g.f17666b, abstractC4584g.f17643O0, trackCornerSize, dVar2);
                }
                i11++;
                abstractC4584g = this;
                fM21178m2 = f7;
                fM21178m1 = f8;
            } else {
                fM21178m2 -= trackCornerSize;
                i9 = abstractC4584g.f17652T;
            }
            fM21178m1 -= i9;
            f7 = fM21178m2;
            f8 = fM21178m1;
            if (f7 >= f8) {
                abstractC4584g.f17643O0.setEmpty();
            } else {
                RectF rectF2 = abstractC4584g.f17643O0;
                float f11 = i8;
                int i13 = abstractC4584g.f17642O;
                rectF2.set(f7, f11 - (i13 / 2.0f), f8, f11 + (i13 / 2.0f));
                abstractC4584g.m21145a1(canvas, abstractC4584g.f17666b, abstractC4584g.f17643O0, trackCornerSize, dVar2);
            }
            i11++;
            abstractC4584g = this;
            fM21178m2 = f7;
            fM21178m1 = f8;
        }
    }

    /* JADX INFO: renamed from: G */
    private void m21105G(float f7, float f8, float f9, float f10, Canvas canvas, RectF rectF, d dVar) {
        if (f8 - f7 > getTrackCornerSize() - this.f17652T) {
            rectF.set(f7, f9, f8, f10);
        } else {
            rectF.setEmpty();
        }
        m21145a1(canvas, this.f17663a, rectF, getTrackCornerSize(), dVar);
    }

    /* JADX INFO: renamed from: G0 */
    private void m21106G0(C0895a c0895a, float f7) {
        m21189s(c0895a, f7);
        if (mo21091s0()) {
            RectF rectF = new RectF(this.f17651S0);
            this.f17657V0.mapRect(rectF);
            rectF.round(this.f17651S0);
        }
        AbstractC4528d.m20696c(AbstractC4546v.m20830e(this), this, this.f17651S0);
        c0895a.setBounds(this.f17651S0);
    }

    /* JADX INFO: renamed from: H */
    private void m21107H(Canvas canvas, int i7, int i8) {
        float[] fArrM21128S = m21128S();
        float f7 = i8;
        int i9 = this.f17642O;
        float f8 = f7 - (i9 / 2.0f);
        float f9 = f7 + (i9 / 2.0f);
        float f10 = i7;
        m21105G(this.f17644P - getTrackCornerSize(), (this.f17644P + (fArrM21128S[0] * f10)) - this.f17652T, f8, f9, canvas, this.f17645P0, d.LEFT);
        int i10 = this.f17644P;
        m21105G(i10 + (fArrM21128S[1] * f10) + this.f17652T, i10 + i7 + getTrackCornerSize(), f8, f9, canvas, this.f17647Q0, d.RIGHT);
    }

    /* JADX INFO: renamed from: H0 */
    private void m21108H0(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, attributeSet, AbstractC6752m.f26602D6, i7, f17609h1, new int[0]);
        setOrientation(typedArrayM20818i.getInt(AbstractC6752m.f26624F6, 0));
        this.f17700v = typedArrayM20818i.getResourceId(AbstractC6752m.f26712N6, AbstractC6751l.f26535I);
        this.f17699u0 = typedArrayM20818i.getFloat(AbstractC6752m.f26646H6, 0.0f);
        this.f17701v0 = typedArrayM20818i.getFloat(AbstractC6752m.f26657I6, 1.0f);
        setValues(Float.valueOf(this.f17699u0));
        setCentered(typedArrayM20818i.getBoolean(AbstractC6752m.f26668J6, false));
        this.f17709z0 = typedArrayM20818i.getFloat(AbstractC6752m.f26635G6, 0.0f);
        this.f17632J = (int) Math.ceil(typedArrayM20818i.getDimension(AbstractC6752m.f26723O6, AbstractC0422b.m1821e(context)));
        int i8 = AbstractC6752m.f26896e7;
        boolean zHasValue = typedArrayM20818i.hasValue(i8);
        int i9 = zHasValue ? i8 : AbstractC6752m.f26918g7;
        if (!zHasValue) {
            i8 = AbstractC6752m.f26907f7;
        }
        ColorStateList colorStateListM1825a = AbstractC0423c.m1825a(context, typedArrayM20818i, i9);
        if (colorStateListM1825a == null) {
            colorStateListM1825a = AbstractC5659a.m25174a(context, AbstractC6743d.f26296j);
        }
        setTrackInactiveTintList(colorStateListM1825a);
        ColorStateList colorStateListM1825a2 = AbstractC0423c.m1825a(context, typedArrayM20818i, i8);
        if (colorStateListM1825a2 == null) {
            colorStateListM1825a2 = AbstractC5659a.m25174a(context, AbstractC6743d.f26293g);
        }
        setTrackActiveTintList(colorStateListM1825a2);
        this.f17659W0.m2718g0(AbstractC0423c.m1825a(context, typedArrayM20818i, AbstractC6752m.f26734P6));
        int i10 = AbstractC6752m.f26778T6;
        if (typedArrayM20818i.hasValue(i10)) {
            setThumbStrokeColor(AbstractC0423c.m1825a(context, typedArrayM20818i, i10));
        }
        setThumbStrokeWidth(typedArrayM20818i.getDimension(AbstractC6752m.f26789U6, 0.0f));
        ColorStateList colorStateListM1825a3 = AbstractC0423c.m1825a(context, typedArrayM20818i, AbstractC6752m.f26679K6);
        if (colorStateListM1825a3 == null) {
            colorStateListM1825a3 = AbstractC5659a.m25174a(context, AbstractC6743d.f26294h);
        }
        setHaloTintList(colorStateListM1825a3);
        int i11 = AbstractC6752m.f26874c7;
        this.f17617B0 = typedArrayM20818i.hasValue(i11) ? typedArrayM20818i.getInt(i11, -1) : m21200y(typedArrayM20818i.getBoolean(AbstractC6752m.f26885d7, true));
        int i12 = AbstractC6752m.f26821X6;
        boolean zHasValue2 = typedArrayM20818i.hasValue(i12);
        int i13 = zHasValue2 ? i12 : AbstractC6752m.f26841Z6;
        if (!zHasValue2) {
            i12 = AbstractC6752m.f26831Y6;
        }
        ColorStateList colorStateListM1825a4 = AbstractC0423c.m1825a(context, typedArrayM20818i, i13);
        if (colorStateListM1825a4 == null) {
            colorStateListM1825a4 = AbstractC5659a.m25174a(context, AbstractC6743d.f26295i);
        }
        setTickInactiveTintList(colorStateListM1825a4);
        ColorStateList colorStateListM1825a5 = AbstractC0423c.m1825a(context, typedArrayM20818i, i12);
        if (colorStateListM1825a5 == null) {
            colorStateListM1825a5 = AbstractC5659a.m25174a(context, AbstractC6743d.f26292f);
        }
        setTickActiveTintList(colorStateListM1825a5);
        setThumbTrackGapSize(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26800V6, 0));
        setTrackStopIndicatorSize(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f27039r7, 0));
        setTrackCornerSize(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26929h7, -1));
        setTrackInsideCornerSize(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f27028q7, 0));
        setTrackIconActiveStart(AbstractC0423c.m1828d(context, typedArrayM20818i, AbstractC6752m.f26973l7));
        setTrackIconActiveEnd(AbstractC0423c.m1828d(context, typedArrayM20818i, AbstractC6752m.f26962k7));
        setTrackIconActiveColor(AbstractC0423c.m1825a(context, typedArrayM20818i, AbstractC6752m.f26951j7));
        setTrackIconInactiveStart(AbstractC0423c.m1828d(context, typedArrayM20818i, AbstractC6752m.f27006o7));
        setTrackIconInactiveEnd(AbstractC0423c.m1828d(context, typedArrayM20818i, AbstractC6752m.f26995n7));
        setTrackIconInactiveColor(AbstractC0423c.m1825a(context, typedArrayM20818i, AbstractC6752m.f26984m7));
        setTrackIconSize(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f27017p7, 0));
        int dimensionPixelSize = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26767S6, 0) * 2;
        int dimensionPixelSize2 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26811W6, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26756R6, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26690L6, 0));
        setThumbElevation(typedArrayM20818i.getDimension(AbstractC6752m.f26745Q6, 0.0f));
        setTrackHeight(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26940i7, 0));
        setTickActiveRadius(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26852a7, this.f17658W / 2));
        setTickInactiveRadius(typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26863b7, this.f17658W / 2));
        setLabelBehavior(typedArrayM20818i.getInt(AbstractC6752m.f26701M6, 0));
        if (!typedArrayM20818i.getBoolean(AbstractC6752m.f26613E6, true)) {
            setEnabled(false);
        }
        typedArrayM20818i.recycle();
    }

    /* JADX INFO: renamed from: I */
    private void m21109I(Canvas canvas, float f7, float f8) {
        Iterator it = this.f17703w0.iterator();
        while (it.hasNext()) {
            float fM21178m1 = m21178m1(((Float) it.next()).floatValue());
            float f9 = this.f17652T + (this.f17646Q / 2.0f);
            if (f7 >= fM21178m1 - f9 && f7 <= fM21178m1 + f9) {
                return;
            }
        }
        if (mo21091s0()) {
            canvas.drawPoint(f8, f7, this.f17692r);
        } else {
            canvas.drawPoint(f7, f8, this.f17692r);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m21110I0(int i7) {
        b bVar = this.f17698u;
        if (bVar == null) {
            this.f17698u = new b(this, null);
        } else {
            removeCallbacks(bVar);
        }
        this.f17698u.m21206a(i7);
        postDelayed(this.f17698u, 200L);
    }

    /* JADX INFO: renamed from: J */
    private void m21111J(Canvas canvas, int i7, int i8, float f7, Drawable drawable) {
        canvas.save();
        if (mo21091s0()) {
            canvas.concat(this.f17657V0);
        }
        canvas.translate((this.f17644P + ((int) (m21097B0(f7) * i7))) - (drawable.getBounds().width() / 2.0f), i8 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: K */
    private void m21112K(Canvas canvas, int i7, int i8) {
        Canvas canvas2;
        int i9;
        int i10;
        int i11 = 0;
        while (i11 < this.f17703w0.size()) {
            float fFloatValue = ((Float) this.f17703w0.get(i11)).floatValue();
            Drawable drawable = this.f17660X0;
            if (drawable != null) {
                canvas2 = canvas;
                i9 = i7;
                i10 = i8;
                m21111J(canvas2, i9, i10, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i9 = i7;
                i10 = i8;
                if (i11 < this.f17661Y0.size()) {
                    m21111J(canvas2, i9, i10, fFloatValue, (Drawable) this.f17661Y0.get(i11));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.f17644P + (m21097B0(fFloatValue) * i9), i10, getThumbRadius(), this.f17669c);
                    }
                    m21111J(canvas2, i9, i10, fFloatValue, this.f17659W0);
                }
            }
            i11++;
            canvas = canvas2;
            i7 = i9;
            i8 = i10;
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m21113K0(C0895a c0895a, float f7) {
        c0895a.m4066M0(m21126R(f7));
        m21106G0(c0895a, f7);
        ViewOverlay viewOverlayM21135W = m21135W();
        if (viewOverlayM21135W == null) {
            return;
        }
        viewOverlayM21135W.add(c0895a);
    }

    /* JADX INFO: renamed from: L */
    private void m21114L(int i7, int i8, Canvas canvas, Paint paint) {
        while (i7 < i8) {
            float f7 = mo21091s0() ? this.f17615A0[i7 + 1] : this.f17615A0[i7];
            if (!m21177m0(f7) && (!mo21089g0() || !m21175l0(f7))) {
                float[] fArr = this.f17615A0;
                canvas.drawPoint(fArr[i7], fArr[i7 + 1], paint);
            }
            i7 += 2;
        }
    }

    /* JADX INFO: renamed from: L0 */
    private void m21115L0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f17703w0.size() == arrayList.size() && this.f17703w0.equals(arrayList)) {
            return;
        }
        this.f17703w0 = arrayList;
        this.f17629H0 = true;
        this.f17707y0 = 0;
        m21130T0();
        m21094A();
        m21102E();
        postInvalidate();
    }

    /* JADX INFO: renamed from: M */
    private void m21116M(Canvas canvas, RectF rectF, Drawable drawable) {
        if (mo21091s0()) {
            this.f17657V0.mapRect(rectF);
        }
        rectF.round(this.f17655U0);
        drawable.setBounds(this.f17655U0);
        drawable.draw(canvas);
    }

    /* JADX INFO: renamed from: M0 */
    private boolean m21117M0() {
        return this.f17640N == 3;
    }

    /* JADX INFO: renamed from: N */
    private void m21118N(Canvas canvas, RectF rectF, RectF rectF2) {
        if (m21152d0()) {
            if (this.f17703w0.size() > 1) {
                Log.w(f17608g1, "Track icons can only be used when only 1 thumb is present.");
            }
            m21184p(canvas, rectF, this.f17673d0, true);
            m21184p(canvas, rectF2, this.f17683i0, true);
            m21184p(canvas, rectF, this.f17679f0, false);
            m21184p(canvas, rectF2, this.f17685k0, false);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private boolean m21119N0() {
        return this.f17625F0 || !(getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: O */
    private void m21120O() {
        if (!this.f17708z) {
            this.f17708z = true;
            ValueAnimator valueAnimatorM21202z = m21202z(true);
            this.f17614A = valueAnimatorM21202z;
            this.f17616B = null;
            valueAnimatorM21202z.start();
        }
        Iterator it = this.f17702w.iterator();
        for (int i7 = 0; i7 < this.f17703w0.size() && it.hasNext(); i7++) {
            if (i7 != this.f17707y0) {
                m21113K0((C0895a) it.next(), ((Float) this.f17703w0.get(i7)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f17702w.size()), Integer.valueOf(this.f17703w0.size())));
        }
        m21113K0((C0895a) it.next(), ((Float) this.f17703w0.get(this.f17707y0)).floatValue());
    }

    /* JADX INFO: renamed from: O0 */
    private boolean m21121O0(float f7) {
        return m21125Q0(this.f17705x0, f7);
    }

    /* JADX INFO: renamed from: P */
    private void m21122P() {
        if (this.f17708z) {
            this.f17708z = false;
            ValueAnimator valueAnimatorM21202z = m21202z(false);
            this.f17616B = valueAnimatorM21202z;
            this.f17614A = null;
            valueAnimatorM21202z.addListener(new a());
            this.f17616B.start();
        }
    }

    /* JADX INFO: renamed from: P0 */
    private double m21123P0(float f7) {
        float f8 = this.f17709z0;
        if (f8 <= 0.0f) {
            return f7;
        }
        int i7 = (int) ((this.f17701v0 - this.f17699u0) / f8);
        return ((double) Math.round(f7 * i7)) / ((double) i7);
    }

    /* JADX INFO: renamed from: Q */
    private void m21124Q(int i7) {
        if (i7 == 1) {
            m21203z0(C3553a.e.API_PRIORITY_OTHER);
            return;
        }
        if (i7 == 2) {
            m21203z0(Integer.MIN_VALUE);
        } else if (i7 == 17) {
            m21095A0(C3553a.e.API_PRIORITY_OTHER);
        } else {
            if (i7 != 66) {
                return;
            }
            m21095A0(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public boolean m21125Q0(int i7, float f7) {
        this.f17707y0 = i7;
        if (Math.abs(f7 - ((Float) this.f17703w0.get(i7)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f17703w0.set(i7, Float.valueOf(m21131U(i7, f7)));
        m21100D(i7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public String m21126R(float f7) {
        if (mo21088c0()) {
            throw null;
        }
        return String.format(((float) ((int) f7)) == f7 ? "%.0f" : "%.2f", Float.valueOf(f7));
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m21127R0() {
        return m21121O0(m21144a0());
    }

    /* JADX INFO: renamed from: S */
    private float[] m21128S() {
        float fFloatValue = ((Float) this.f17703w0.get(0)).floatValue();
        ArrayList arrayList = this.f17703w0;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f17703w0.size() == 1) {
            fFloatValue = this.f17699u0;
        }
        float fM21097B0 = m21097B0(fFloatValue);
        float fM21097B1 = m21097B0(fFloatValue2);
        if (mo21089g0()) {
            float fMin = Math.min(0.5f, fM21097B1);
            fM21097B1 = Math.max(0.5f, fM21097B1);
            fM21097B0 = fMin;
        }
        return (mo21089g0() || !(m21205p0() || mo21091s0())) ? new float[]{fM21097B0, fM21097B1} : new float[]{fM21097B1, fM21097B0};
    }

    /* JADX INFO: renamed from: T */
    private static float m21129T(ValueAnimator valueAnimator, float f7) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f7;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public void m21130T0() {
        if (m21119N0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fM21097B0 = (m21097B0(((Float) this.f17703w0.get(this.f17707y0)).floatValue()) * this.f17623E0) + this.f17644P;
            int iM21196w = m21196w();
            int i7 = this.f17650S;
            float[] fArr = {fM21097B0 - i7, iM21196w - i7, fM21097B0 + i7, iM21196w + i7};
            if (mo21091s0()) {
                this.f17657V0.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    /* JADX INFO: renamed from: U */
    private float m21131U(int i7, float f7) {
        float minSeparation = getMinSeparation();
        if (this.f17665a1 == 0) {
            minSeparation = m21098C(minSeparation);
        }
        if (m21205p0() || mo21091s0()) {
            minSeparation = -minSeparation;
        }
        int i8 = i7 + 1;
        int i9 = i7 - 1;
        return AbstractC0577a.m2540a(f7, i9 < 0 ? this.f17699u0 : ((Float) this.f17703w0.get(i9)).floatValue() + minSeparation, i8 >= this.f17703w0.size() ? this.f17701v0 : ((Float) this.f17703w0.get(i8)).floatValue() - minSeparation);
    }

    /* JADX INFO: renamed from: U0 */
    private void m21132U0() {
        float f7;
        boolean zMo21091s0 = mo21091s0();
        boolean zM21205p0 = m21205p0();
        float f8 = 0.5f;
        if (zMo21091s0 && zM21205p0) {
            f7 = 0.5f;
            f8 = -0.2f;
        } else {
            f7 = 1.2f;
            if (zMo21091s0) {
                f8 = 1.2f;
                f7 = 0.5f;
            }
        }
        Iterator it = this.f17702w.iterator();
        while (it.hasNext()) {
            ((C0895a) it.next()).m4063J0(f8, f7);
        }
    }

    /* JADX INFO: renamed from: V */
    private int m21133V(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public void m21134V0() {
        m21132U0();
        int i7 = this.f17640N;
        if (i7 == 0 || i7 == 1) {
            if (this.f17705x0 == -1 || !isEnabled()) {
                m21122P();
                return;
            } else {
                m21120O();
                return;
            }
        }
        if (i7 == 2) {
            m21122P();
            return;
        }
        if (i7 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f17640N);
        }
        if (isEnabled() && m21186q0()) {
            m21120O();
        } else {
            m21122P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public ViewOverlay m21135W() {
        ViewGroup viewGroupM20830e = AbstractC4546v.m20830e(this);
        if (viewGroupM20830e == null) {
            return null;
        }
        return viewGroupM20830e.getOverlay();
    }

    /* JADX INFO: renamed from: W0 */
    private void m21136W0() {
        float fM21196w = m21196w();
        this.f17657V0.reset();
        this.f17657V0.setRotate(90.0f, fM21196w, fM21196w);
    }

    /* JADX INFO: renamed from: X */
    private float[] m21137X(float f7, float f8) {
        return mo21091s0() ? new float[]{f7, f7, f7, f7, f8, f8, f8, f8} : new float[]{f7, f7, f8, f8, f8, f8, f7, f7};
    }

    /* JADX INFO: renamed from: X0 */
    private void m21138X0() {
        if (m21147b0()) {
            int i7 = this.f17646Q;
            this.f17654U = i7;
            this.f17656V = this.f17652T;
            int iRound = Math.round(i7 * 0.5f);
            int i8 = this.f17646Q - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.f17652T - (i8 / 2));
        }
    }

    /* JADX INFO: renamed from: Y */
    private int m21139Y() {
        return (int) (((this.f17701v0 - this.f17699u0) / this.f17709z0) + 1.0f);
    }

    /* JADX INFO: renamed from: Y0 */
    private void m21140Y0() {
        m21164h1();
        int iMin = 0;
        if (this.f17709z0 <= 0.0f) {
            m21142Z0(0);
            return;
        }
        int i7 = this.f17617B0;
        if (i7 == 0) {
            iMin = Math.min(m21139Y(), m21141Z());
        } else if (i7 == 1) {
            int iM21139Y = m21139Y();
            if (iM21139Y <= m21141Z()) {
                iMin = iM21139Y;
            }
        } else if (i7 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f17617B0);
        }
        m21142Z0(iMin);
    }

    /* JADX INFO: renamed from: Z */
    private int m21141Z() {
        return (this.f17623E0 / this.f17630I) + 1;
    }

    /* JADX INFO: renamed from: Z0 */
    private void m21142Z0(int i7) {
        if (i7 == 0) {
            this.f17615A0 = null;
            return;
        }
        float[] fArr = this.f17615A0;
        if (fArr == null || fArr.length != i7 * 2) {
            this.f17615A0 = new float[i7 * 2];
        }
        float f7 = this.f17623E0 / (i7 - 1);
        float fM21196w = m21196w();
        for (int i8 = 0; i8 < i7 * 2; i8 += 2) {
            float[] fArr2 = this.f17615A0;
            fArr2[i8] = this.f17644P + ((i8 / 2.0f) * f7);
            fArr2[i8 + 1] = fM21196w;
        }
        if (mo21091s0()) {
            this.f17657V0.mapPoints(this.f17615A0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21143a(AbstractC4584g abstractC4584g) {
        abstractC4584g.setActiveThumbIndex(-1);
        abstractC4584g.invalidate();
    }

    /* JADX INFO: renamed from: a0 */
    private float m21144a0() {
        double dM21123P0 = m21123P0(this.f17662Z0);
        if (m21205p0() || mo21091s0()) {
            dM21123P0 = 1.0d - dM21123P0;
        }
        float f7 = this.f17701v0;
        float f8 = this.f17699u0;
        return (float) ((dM21123P0 * ((double) (f7 - f8))) + ((double) f8));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX INFO: renamed from: a1 */
    private void m21145a1(Canvas canvas, Paint paint, RectF rectF, float f7, d dVar) {
        int i7;
        RectF rectF2;
        float fMax;
        int iOrdinal;
        if (rectF.isEmpty()) {
            return;
        }
        float fM21190t = m21190t(f7);
        float fM21185q = m21185q(f7);
        int iOrdinal2 = dVar.ordinal();
        if (iOrdinal2 != 1) {
            if (iOrdinal2 == 2) {
                fM21190t = this.f17667b0;
            } else if (iOrdinal2 == 3) {
                i7 = this.f17667b0;
                fM21190t = i7;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (m21147b0()) {
                paint.setAntiAlias(true);
            }
            rectF2 = new RectF(rectF);
            if (mo21091s0()) {
                this.f17657V0.mapRect(rectF2);
            }
            this.f17641N0.reset();
            if (rectF.width() >= fM21190t + fM21185q) {
                this.f17641N0.addRoundRect(rectF2, m21137X(fM21190t, fM21185q), Path.Direction.CW);
                canvas.drawPath(this.f17641N0, paint);
                return;
            }
            float fMin = Math.min(fM21190t, fM21185q);
            fMax = Math.max(fM21190t, fM21185q);
            canvas.save();
            this.f17641N0.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.f17641N0);
            iOrdinal = dVar.ordinal();
            if (iOrdinal != 1) {
                RectF rectF3 = this.f17649R0;
                float f8 = rectF.left;
                rectF3.set(f8, rectF.top, (2.0f * fMax) + f8, rectF.bottom);
            } else if (iOrdinal != 2) {
                this.f17649R0.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF4 = this.f17649R0;
                float f9 = rectF.right;
                rectF4.set(f9 - (2.0f * fMax), rectF.top, f9, rectF.bottom);
            }
            if (mo21091s0()) {
                this.f17657V0.mapRect(this.f17649R0);
            }
            canvas.drawRoundRect(this.f17649R0, fMax, fMax, paint);
            canvas.restore();
        }
        i7 = this.f17667b0;
        fM21185q = i7;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (m21147b0()) {
            paint.setAntiAlias(true);
        }
        rectF2 = new RectF(rectF);
        if (mo21091s0()) {
            this.f17657V0.mapRect(rectF2);
        }
        this.f17641N0.reset();
        if (rectF.width() >= fM21190t + fM21185q) {
            this.f17641N0.addRoundRect(rectF2, m21137X(fM21190t, fM21185q), Path.Direction.CW);
            canvas.drawPath(this.f17641N0, paint);
            return;
        }
        float fMin2 = Math.min(fM21190t, fM21185q);
        fMax = Math.max(fM21190t, fM21185q);
        canvas.save();
        this.f17641N0.addRoundRect(rectF2, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.f17641N0);
        iOrdinal = dVar.ordinal();
        if (iOrdinal != 1) {
            RectF rectF5 = this.f17649R0;
            float f10 = rectF.left;
            rectF5.set(f10, rectF.top, (2.0f * fMax) + f10, rectF.bottom);
        } else if (iOrdinal != 2) {
            this.f17649R0.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            RectF rectF6 = this.f17649R0;
            float f11 = rectF.right;
            rectF6.set(f11 - (2.0f * fMax), rectF.top, f11, rectF.bottom);
        }
        if (mo21091s0()) {
            this.f17657V0.mapRect(this.f17649R0);
        }
        canvas.drawRoundRect(this.f17649R0, fMax, fMax, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21146b(AbstractC4584g abstractC4584g, ValueAnimator valueAnimator) {
        abstractC4584g.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = abstractC4584g.f17702w.iterator();
        while (it.hasNext()) {
            ((C0895a) it.next()).m4065L0(fFloatValue);
        }
        abstractC4584g.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m21147b0() {
        return this.f17652T > 0;
    }

    /* JADX INFO: renamed from: b1 */
    private void m21148b1() {
        Drawable drawable = this.f17679f0;
        if (drawable != null) {
            if (!this.f17681g0 && this.f17682h0 != null) {
                this.f17679f0 = AbstractC0400a.m1712r(drawable).mutate();
                this.f17681g0 = true;
            }
            if (this.f17681g0) {
                this.f17679f0.setTintList(this.f17682h0);
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    private void m21150c1() {
        Drawable drawable = this.f17673d0;
        if (drawable != null) {
            if (!this.f17676e0 && this.f17682h0 != null) {
                this.f17673d0 = AbstractC0400a.m1712r(drawable).mutate();
                this.f17676e0 = true;
            }
            if (this.f17676e0) {
                this.f17673d0.setTintList(this.f17682h0);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    private boolean m21152d0() {
        return (this.f17673d0 == null && this.f17679f0 == null && this.f17683i0 == null && this.f17685k0 == null) ? false : true;
    }

    /* JADX INFO: renamed from: d1 */
    private void m21153d1() {
        Drawable drawable = this.f17685k0;
        if (drawable != null) {
            if (!this.f17686l0 && this.f17687m0 != null) {
                this.f17685k0 = AbstractC0400a.m1712r(drawable).mutate();
                this.f17686l0 = true;
            }
            if (this.f17686l0) {
                this.f17685k0.setTintList(this.f17687m0);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private Drawable m21155e0(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m21179n(drawableNewDrawable);
        return drawableNewDrawable;
    }

    /* JADX INFO: renamed from: e1 */
    private void m21156e1() {
        Drawable drawable = this.f17683i0;
        if (drawable != null) {
            if (!this.f17684j0 && this.f17687m0 != null) {
                this.f17683i0 = AbstractC0400a.m1712r(drawable).mutate();
                this.f17684j0 = true;
            }
            if (this.f17684j0) {
                this.f17683i0.setTintList(this.f17687m0);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m21158f0() {
        this.f17663a.setStrokeWidth(this.f17642O);
        this.f17666b.setStrokeWidth(this.f17642O);
    }

    /* JADX INFO: renamed from: f1 */
    private void m21159f1(int i7) {
        this.f17623E0 = Math.max(i7 - (this.f17644P * 2), 0);
        m21140Y0();
    }

    /* JADX INFO: renamed from: g1 */
    private void m21161g1(boolean z7) {
        boolean zM21201y0 = m21201y0();
        boolean zM21199x0 = m21199x0();
        if (mo21091s0()) {
            m21136W0();
        }
        if (zM21201y0 || z7) {
            requestLayout();
        } else if (zM21199x0) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: h0 */
    private boolean m21163h0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h1 */
    private void m21164h1() {
        if (this.f17629H0) {
            m21173k1();
            m21170j1();
            m21167i1();
            m21181n1();
            this.f17629H0 = false;
        }
    }

    /* JADX INFO: renamed from: i0 */
    private boolean m21166i0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i1 */
    private void m21167i1() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
        }
        float f7 = this.f17709z0;
        if (f7 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f17665a1 != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f17709z0)));
        }
        if (minSeparation < f7 || !m21172k0(minSeparation)) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f17709z0), Float.valueOf(this.f17709z0)));
        }
    }

    /* JADX INFO: renamed from: j0 */
    private static boolean m21169j0(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    /* JADX INFO: renamed from: j1 */
    private void m21170j1() {
        if (this.f17709z0 > 0.0f && !m21176l1(this.f17701v0)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f17709z0), Float.valueOf(this.f17699u0), Float.valueOf(this.f17701v0)));
        }
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m21172k0(double d7) {
        double dDoubleValue = new BigDecimal(Double.toString(d7)).divide(new BigDecimal(Float.toString(this.f17709z0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: k1 */
    private void m21173k1() {
        if (this.f17699u0 >= this.f17701v0) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f17699u0), Float.valueOf(this.f17701v0)));
        }
        for (Float f7 : this.f17703w0) {
            if (f7.floatValue() < this.f17699u0 || f7.floatValue() > this.f17701v0) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f7, Float.valueOf(this.f17699u0), Float.valueOf(this.f17701v0)));
            }
            if (this.f17709z0 > 0.0f && !m21176l1(f7.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f7, Float.valueOf(this.f17699u0), Float.valueOf(this.f17709z0), Float.valueOf(this.f17709z0)));
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m21175l0(float f7) {
        float f8 = this.f17652T + (this.f17646Q / 2.0f);
        float f9 = (this.f17623E0 + (this.f17644P * 2)) / 2.0f;
        return f7 >= f9 - f8 && f7 <= f9 + f8;
    }

    /* JADX INFO: renamed from: l1 */
    private boolean m21176l1(float f7) {
        return m21172k0(new BigDecimal(Float.toString(f7)).subtract(new BigDecimal(Float.toString(this.f17699u0)), MathContext.DECIMAL64).doubleValue());
    }

    /* JADX INFO: renamed from: m0 */
    private boolean m21177m0(float f7) {
        float f8 = this.f17652T + (this.f17646Q / 2.0f);
        Iterator it = this.f17703w0.iterator();
        if (it.hasNext()) {
            float fM21178m1 = m21178m1(((Float) it.next()).floatValue());
            if (f7 >= fM21178m1 - f8 && f7 <= fM21178m1 + f8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m1 */
    private float m21178m1(float f7) {
        return (m21097B0(f7) * this.f17623E0) + this.f17644P;
    }

    /* JADX INFO: renamed from: n */
    private void m21179n(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f17646Q, this.f17648R);
        } else {
            float fMax = Math.max(this.f17646Q, this.f17648R) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m21180n0(MotionEvent motionEvent) {
        return !m21169j0(motionEvent) && m21163h0();
    }

    /* JADX INFO: renamed from: n1 */
    private void m21181n1() {
        float f7 = this.f17709z0;
        if (f7 == 0.0f) {
            return;
        }
        if (((int) f7) != f7) {
            Log.w(f17608g1, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f7)));
        }
        float f8 = this.f17699u0;
        if (((int) f8) != f8) {
            Log.w(f17608g1, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f8)));
        }
        float f9 = this.f17701v0;
        if (((int) f9) != f9) {
            Log.w(f17608g1, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f9)));
        }
    }

    /* JADX INFO: renamed from: o */
    private void m21182o(C0895a c0895a) {
        c0895a.m4064K0(AbstractC4546v.m20830e(this));
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m21183o0(MotionEvent motionEvent) {
        return !m21169j0(motionEvent) && m21166i0();
    }

    /* JADX INFO: renamed from: p */
    private void m21184p(Canvas canvas, RectF rectF, Drawable drawable, boolean z7) {
        if (drawable != null) {
            m21198x(rectF, this.f17653T0, this.f17688n0, this.f17689o0, z7);
            if (this.f17653T0.isEmpty()) {
                return;
            }
            m21116M(canvas, this.f17653T0, drawable);
        }
    }

    /* JADX INFO: renamed from: q */
    private float m21185q(float f7) {
        if (this.f17703w0.isEmpty() || !m21147b0()) {
            return f7;
        }
        float fM21178m1 = m21178m1(((Float) this.f17703w0.get((m21205p0() || mo21091s0()) ? 0 : this.f17703w0.size() - 1)).floatValue()) - this.f17644P;
        int i7 = this.f17623E0;
        return fM21178m1 > ((float) i7) - f7 ? Math.max(i7 - fM21178m1, this.f17667b0) : f7;
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m21186q0() {
        Rect rect = new Rect();
        AbstractC4546v.m20830e(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && m21188r0();
    }

    /* JADX INFO: renamed from: r */
    private Float m21187r(int i7) {
        float fM21194v = this.f17627G0 ? m21194v(20) : m21192u();
        if (i7 == 69) {
            return Float.valueOf(-fM21194v);
        }
        if (i7 == 70 || i7 == 81) {
            return Float.valueOf(fM21194v);
        }
        switch (i7) {
            case 19:
                if (mo21091s0()) {
                    return Float.valueOf(fM21194v);
                }
                return null;
            case 20:
                if (mo21091s0()) {
                    return Float.valueOf(-fM21194v);
                }
                return null;
            case zzbbn.zzt.zzm /* 21 */:
                if (!m21205p0()) {
                    fM21194v = -fM21194v;
                }
                return Float.valueOf(fM21194v);
            case 22:
                if (m21205p0()) {
                    fM21194v = -fM21194v;
                }
                return Float.valueOf(fM21194v);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    private boolean m21188r0() {
        return this.f17680f1;
    }

    /* JADX INFO: renamed from: s */
    private void m21189s(C0895a c0895a, float f7) {
        int iM21097B0;
        int intrinsicWidth;
        int iM21196w;
        int intrinsicHeight;
        int i7;
        if (mo21091s0()) {
            iM21097B0 = (this.f17644P + ((int) (m21097B0(f7) * this.f17623E0))) - (c0895a.getIntrinsicHeight() / 2);
            intrinsicWidth = c0895a.getIntrinsicHeight() + iM21097B0;
            if (m21205p0()) {
                iM21196w = m21196w() - (this.f17690p0 + (this.f17648R / 2));
                intrinsicHeight = c0895a.getIntrinsicWidth();
            } else {
                int iM21196w2 = m21196w() + this.f17690p0 + (this.f17648R / 2);
                iM21196w = c0895a.getIntrinsicWidth() + iM21196w2;
                i7 = iM21196w2;
            }
            this.f17651S0.set(iM21097B0, i7, intrinsicWidth, iM21196w);
        }
        iM21097B0 = (this.f17644P + ((int) (m21097B0(f7) * this.f17623E0))) - (c0895a.getIntrinsicWidth() / 2);
        intrinsicWidth = c0895a.getIntrinsicWidth() + iM21097B0;
        iM21196w = m21196w() - (this.f17690p0 + (this.f17648R / 2));
        intrinsicHeight = c0895a.getIntrinsicHeight();
        i7 = iM21196w - intrinsicHeight;
        this.f17651S0.set(iM21097B0, i7, intrinsicWidth, iM21196w);
    }

    /* JADX INFO: renamed from: t */
    private float m21190t(float f7) {
        if (this.f17703w0.isEmpty() || !m21147b0()) {
            return f7;
        }
        float fM21178m1 = m21178m1(((Float) this.f17703w0.get((m21205p0() || mo21091s0()) ? this.f17703w0.size() - 1 : 0)).floatValue()) - this.f17644P;
        return fM21178m1 < f7 ? Math.max(fM21178m1, this.f17667b0) : f7;
    }

    /* JADX INFO: renamed from: t0 */
    private void m21191t0(Resources resources) {
        this.f17636L = resources.getDimensionPixelSize(AbstractC6744e.f26379x0);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC6744e.f26377w0);
        this.f17620D = dimensionPixelOffset;
        this.f17644P = dimensionPixelOffset;
        this.f17622E = resources.getDimensionPixelSize(AbstractC6744e.f26369s0);
        this.f17624F = resources.getDimensionPixelSize(AbstractC6744e.f26375v0);
        int i7 = AbstractC6744e.f26373u0;
        this.f17626G = resources.getDimensionPixelSize(i7);
        this.f17628H = resources.getDimensionPixelSize(i7);
        this.f17630I = resources.getDimensionPixelSize(AbstractC6744e.f26371t0);
        this.f17690p0 = resources.getDimensionPixelSize(AbstractC6744e.f26367r0);
        this.f17689o0 = resources.getDimensionPixelOffset(AbstractC6744e.f26302A);
    }

    /* JADX INFO: renamed from: u */
    private float m21192u() {
        float f7 = this.f17709z0;
        if (f7 == 0.0f) {
            return 1.0f;
        }
        return f7;
    }

    /* JADX INFO: renamed from: u0 */
    private void m21193u0(Canvas canvas, int i7, int i8) {
        Canvas canvas2;
        if (m21119N0()) {
            float[] fArr = {this.f17644P + (m21097B0(((Float) this.f17703w0.get(this.f17707y0)).floatValue()) * i7), i8};
            if (mo21091s0()) {
                this.f17657V0.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f7 = fArr[0];
                int i9 = this.f17650S;
                float f8 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f7 - i9, f8 - i9, f7 + i9, f8 + i9, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.f17650S, this.f17672d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public float m21194v(int i7) {
        float fM21192u = m21192u();
        float f7 = (this.f17701v0 - this.f17699u0) / fM21192u;
        float f8 = i7;
        return f7 <= f8 ? fM21192u : Math.round(f7 / f8) * fM21192u;
    }

    /* JADX INFO: renamed from: v0 */
    private void m21195v0(Canvas canvas, int i7) {
        if (this.f17658W <= 0 || this.f17703w0.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f17703w0;
        float fFloatValue = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f7 = this.f17701v0;
        if (fFloatValue < f7) {
            m21109I(canvas, m21178m1(f7), i7);
        }
        if (mo21089g0() || (this.f17703w0.size() > 1 && ((Float) this.f17703w0.get(0)).floatValue() > this.f17699u0)) {
            m21109I(canvas, m21178m1(this.f17699u0), i7);
        }
    }

    /* JADX INFO: renamed from: w */
    private int m21196w() {
        return (this.f17638M / 2) + ((this.f17640N == 1 || m21117M0()) ? ((C0895a) this.f17702w.get(0)).getIntrinsicHeight() : 0);
    }

    /* JADX INFO: renamed from: w0 */
    private void m21197w0(Canvas canvas) {
        float[] fArr = this.f17615A0;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] fArrM21128S = m21128S();
        int iCeil = (int) Math.ceil(fArrM21128S[0] * ((this.f17615A0.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(fArrM21128S[1] * ((this.f17615A0.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            m21114L(0, iCeil * 2, canvas, this.f17675e);
        }
        if (iCeil <= iFloor) {
            m21114L(iCeil * 2, (iFloor + 1) * 2, canvas, this.f17678f);
        }
        int i7 = (iFloor + 1) * 2;
        float[] fArr2 = this.f17615A0;
        if (i7 < fArr2.length) {
            m21114L(i7, fArr2.length, canvas, this.f17675e);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m21198x(RectF rectF, RectF rectF2, int i7, int i8, boolean z7) {
        if (rectF.right - rectF.left < (i8 * 2) + i7) {
            rectF2.setEmpty();
            return;
        }
        float f7 = z7 ^ (m21205p0() || mo21091s0()) ? rectF.left + i8 : (rectF.right - i8) - i7;
        float f8 = i7;
        float fM21196w = m21196w() - (f8 / 2.0f);
        rectF2.set(f7, fM21196w, f7 + f8, f8 + fM21196w);
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m21199x0() {
        int iMax = this.f17620D + Math.max(Math.max(Math.max((this.f17646Q / 2) - this.f17622E, 0), Math.max((this.f17642O - this.f17624F) / 2, 0)), Math.max(Math.max(this.f17619C0 - this.f17626G, 0), Math.max(this.f17621D0 - this.f17628H, 0)));
        if (this.f17644P == iMax) {
            return false;
        }
        this.f17644P = iMax;
        if (!isLaidOut()) {
            return true;
        }
        m21159f1(mo21091s0() ? getHeight() : getWidth());
        return true;
    }

    /* JADX INFO: renamed from: y */
    private int m21200y(boolean z7) {
        return z7 ? 0 : 2;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m21201y0() {
        int paddingTop;
        int paddingBottom;
        if (mo21091s0()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i7 = paddingTop + paddingBottom;
        int iMax = Math.max(this.f17636L, Math.max(this.f17642O + i7, this.f17648R + i7));
        if (iMax == this.f17638M) {
            return false;
        }
        this.f17638M = iMax;
        return true;
    }

    /* JADX INFO: renamed from: z */
    private ValueAnimator m21202z(boolean z7) {
        int iM978f;
        TimeInterpolator timeInterpolatorM979g;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m21129T(z7 ? this.f17616B : this.f17614A, z7 ? 0.0f : 1.0f), z7 ? 1.0f : 0.0f);
        if (z7) {
            iM978f = AbstractC0196h.m978f(getContext(), f17610i1, 83);
            timeInterpolatorM979g = AbstractC0196h.m979g(getContext(), f17612k1, AbstractC6826a.f27408e);
        } else {
            iM978f = AbstractC0196h.m978f(getContext(), f17611j1, 117);
            timeInterpolatorM979g = AbstractC0196h.m979g(getContext(), f17613l1, AbstractC6826a.f27406c);
        }
        valueAnimatorOfFloat.setDuration(iM978f);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM979g);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC4584g.m21146b(this.f17604a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: z0 */
    private boolean m21203z0(int i7) {
        int i8 = this.f17707y0;
        int iM2542c = (int) AbstractC0577a.m2542c(((long) i8) + ((long) i7), 0L, this.f17703w0.size() - 1);
        this.f17707y0 = iM2542c;
        if (iM2542c == i8) {
            return false;
        }
        if (this.f17705x0 != -1) {
            this.f17705x0 = iM2542c;
        }
        m21130T0();
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    protected abstract boolean mo21086F0();

    /* JADX INFO: renamed from: J0 */
    public void mo21087J0() {
        removeCallbacks(this.f17677e1);
        postDelayed(this.f17677e1, this.f17668b1);
    }

    /* JADX INFO: renamed from: S0 */
    void m21204S0(int i7, Rect rect) {
        int iM21097B0 = this.f17644P + ((int) (m21097B0(getValues().get(i7).floatValue()) * this.f17623E0));
        int iM21196w = m21196w();
        int iMax = Math.max(this.f17646Q / 2, this.f17632J / 2);
        int iMax2 = Math.max(this.f17648R / 2, this.f17632J / 2);
        RectF rectF = new RectF(iM21097B0 - iMax, iM21196w - iMax2, iM21097B0 + iMax, iM21196w + iMax2);
        if (mo21091s0()) {
            this.f17657V0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX INFO: renamed from: c0 */
    public boolean mo21088c0() {
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f17694s.m6818v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f17663a.setColor(m21133V(this.f17639M0));
        this.f17666b.setColor(m21133V(this.f17637L0));
        this.f17675e.setColor(m21133V(this.f17635K0));
        this.f17678f.setColor(m21133V(this.f17633J0));
        this.f17692r.setColor(m21133V(this.f17635K0));
        for (C0895a c0895a : this.f17702w) {
            if (c0895a.isStateful()) {
                c0895a.setState(getDrawableState());
            }
        }
        if (this.f17659W0.isStateful()) {
            this.f17659W0.setState(getDrawableState());
        }
        this.f17672d.setColor(m21133V(this.f17631I0));
        this.f17672d.setAlpha(63);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean mo21089g0() {
        return this.f17670c0;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.f17694s.m6820x();
    }

    public int getActiveThumbIndex() {
        return this.f17705x0;
    }

    public int getFocusedThumbIndex() {
        return this.f17707y0;
    }

    public int getHaloRadius() {
        return this.f17650S;
    }

    public ColorStateList getHaloTintList() {
        return this.f17631I0;
    }

    public int getLabelBehavior() {
        return this.f17640N;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f17709z0;
    }

    public float getThumbElevation() {
        return this.f17659W0.m2696C();
    }

    public int getThumbHeight() {
        return this.f17648R;
    }

    public int getThumbRadius() {
        return this.f17646Q / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f17659W0.m2704K();
    }

    public float getThumbStrokeWidth() {
        return this.f17659W0.m2705M();
    }

    public ColorStateList getThumbTintList() {
        return this.f17659W0.m2697D();
    }

    public int getThumbTrackGapSize() {
        return this.f17652T;
    }

    public int getThumbWidth() {
        return this.f17646Q;
    }

    public int getTickActiveRadius() {
        return this.f17619C0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f17633J0;
    }

    public int getTickInactiveRadius() {
        return this.f17621D0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f17635K0;
    }

    public ColorStateList getTickTintList() {
        if (this.f17635K0.equals(this.f17633J0)) {
            return this.f17633J0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.f17617B0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f17637L0;
    }

    public int getTrackCornerSize() {
        int i7 = this.f17664a0;
        return i7 == -1 ? this.f17642O / 2 : i7;
    }

    public int getTrackHeight() {
        return this.f17642O;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.f17682h0;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.f17679f0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.f17673d0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f17687m0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.f17685k0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f17683i0;
    }

    public int getTrackIconSize() {
        return this.f17688n0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f17639M0;
    }

    public int getTrackInsideCornerSize() {
        return this.f17667b0;
    }

    public int getTrackSidePadding() {
        return this.f17644P;
    }

    public int getTrackStopIndicatorSize() {
        return this.f17658W;
    }

    public ColorStateList getTrackTintList() {
        if (this.f17639M0.equals(this.f17637L0)) {
            return this.f17637L0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f17623E0;
    }

    public float getValueFrom() {
        return this.f17699u0;
    }

    public float getValueTo() {
        return this.f17701v0;
    }

    List<Float> getValues() {
        return new ArrayList(this.f17703w0);
    }

    /* JADX INFO: renamed from: m */
    public void mo21090m(InterfaceC4578a interfaceC4578a) {
        this.f17704x.add(interfaceC4578a);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17680f1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f17671c1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f17674d1);
        Iterator it = this.f17702w.iterator();
        while (it.hasNext()) {
            m21182o((C0895a) it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        b bVar = this.f17698u;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.f17708z = false;
        Iterator it = this.f17702w.iterator();
        while (it.hasNext()) {
            m21096B((C0895a) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f17671c1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f17674d1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f17629H0) {
            m21164h1();
            m21140Y0();
        }
        super.onDraw(canvas);
        int iM21196w = m21196w();
        m21107H(canvas, this.f17623E0, iM21196w);
        m21104F(canvas, this.f17623E0, iM21196w);
        if (m21205p0() || mo21091s0()) {
            m21118N(canvas, this.f17643O0, this.f17645P0);
        } else {
            m21118N(canvas, this.f17643O0, this.f17647Q0);
        }
        m21197w0(canvas);
        m21195v0(canvas, iM21196w);
        if ((this.f17697t0 || isFocused()) && isEnabled()) {
            m21193u0(canvas, this.f17623E0, iM21196w);
        }
        m21134V0();
        m21112K(canvas, this.f17623E0, iM21196w);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (z7) {
            m21124Q(i7);
            this.f17694s.m6815V(this.f17707y0);
        } else {
            this.f17705x0 = -1;
            this.f17694s.m6817o(this.f17707y0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i7, keyEvent);
        }
        if (this.f17703w0.size() == 1) {
            this.f17705x0 = 0;
        }
        if (this.f17705x0 == -1) {
            Boolean boolM21099C0 = m21099C0(i7, keyEvent);
            return boolM21099C0 != null ? boolM21099C0.booleanValue() : super.onKeyDown(i7, keyEvent);
        }
        this.f17627G0 |= keyEvent.isLongPress();
        Float fM21187r = m21187r(i7);
        if (fM21187r != null) {
            if (m21121O0(((Float) this.f17703w0.get(this.f17705x0)).floatValue() + fM21187r.floatValue())) {
                m21130T0();
                postInvalidate();
            }
            return true;
        }
        if (i7 != 23) {
            if (i7 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m21203z0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m21203z0(-1);
                }
                return false;
            }
            if (i7 != 66) {
                return super.onKeyDown(i7, keyEvent);
            }
        }
        this.f17705x0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        this.f17627G0 = false;
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f17638M + ((this.f17640N == 1 || m21117M0()) ? ((C0895a) this.f17702w.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (mo21091s0()) {
            super.onMeasure(iMakeMeasureSpec, i8);
        } else {
            super.onMeasure(i7, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f17699u0 = eVar.f17720a;
        this.f17701v0 = eVar.f17721b;
        m21115L0(eVar.f17722c);
        this.f17709z0 = eVar.f17723d;
        if (eVar.f17724e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f17720a = this.f17699u0;
        eVar.f17721b = this.f17701v0;
        eVar.f17722c = new ArrayList(this.f17703w0);
        eVar.f17723d = this.f17709z0;
        eVar.f17724e = hasFocus();
        return eVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (mo21091s0()) {
            i7 = i8;
        }
        m21159f1(i7);
        m21130T0();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i7;
        if (!isEnabled()) {
            return false;
        }
        float y7 = mo21091s0() ? motionEvent.getY() : motionEvent.getX();
        float x7 = mo21091s0() ? motionEvent.getX() : motionEvent.getY();
        float f7 = (y7 - this.f17644P) / this.f17623E0;
        this.f17662Z0 = f7;
        float fMax = Math.max(0.0f, f7);
        this.f17662Z0 = fMax;
        this.f17662Z0 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17691q0 = y7;
            this.f17693r0 = x7;
            if ((mo21091s0() || !m21183o0(motionEvent)) && (!mo21091s0() || !m21180n0(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo21086F0()) {
                    requestFocus();
                    this.f17697t0 = true;
                    m21138X0();
                    m21101D0();
                    m21127R0();
                    m21130T0();
                    invalidate();
                }
            }
        } else if (actionMasked == 1) {
            this.f17697t0 = false;
            motionEvent2 = this.f17695s0;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f17695s0.getX() - motionEvent.getX()) <= this.f17618C && Math.abs(this.f17695s0.getY() - motionEvent.getY()) <= this.f17618C && mo21086F0()) {
                m21101D0();
            }
            if (this.f17705x0 != -1) {
                m21127R0();
                m21130T0();
                if (m21147b0() && (i7 = this.f17654U) != -1 && this.f17656V != -1) {
                    setThumbWidth(i7);
                    setThumbTrackGapSize(this.f17656V);
                }
                this.f17705x0 = -1;
                m21103E0();
            }
            invalidate();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f17697t0 = false;
                motionEvent2 = this.f17695s0;
                if (motionEvent2 != null) {
                    m21101D0();
                }
                if (this.f17705x0 != -1) {
                    m21127R0();
                    m21130T0();
                    if (m21147b0()) {
                        setThumbWidth(i7);
                        setThumbTrackGapSize(this.f17656V);
                    }
                    this.f17705x0 = -1;
                    m21103E0();
                }
                invalidate();
            }
        } else if (this.f17697t0) {
            m21127R0();
            m21130T0();
            invalidate();
        } else {
            if (!mo21091s0() && m21183o0(motionEvent) && Math.abs(y7 - this.f17691q0) < this.f17618C) {
                return false;
            }
            if (mo21091s0() && m21180n0(motionEvent) && Math.abs(x7 - this.f17693r0) < this.f17618C * 0.8f) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            if (mo21086F0()) {
                this.f17697t0 = true;
                m21138X0();
                m21101D0();
                m21127R0();
                m21130T0();
                invalidate();
            }
        }
        setPressed(this.f17697t0);
        this.f17695s0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z7) {
        super.onVisibilityAggregated(z7);
        this.f17680f1 = z7;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i7) {
        ViewOverlay viewOverlayM21135W;
        super.onVisibilityChanged(view, i7);
        if (i7 == 0 || (viewOverlayM21135W = m21135W()) == null) {
            return;
        }
        Iterator it = this.f17702w.iterator();
        while (it.hasNext()) {
            viewOverlayM21135W.remove((C0895a) it.next());
        }
    }

    /* JADX INFO: renamed from: p0 */
    final boolean m21205p0() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean mo21091s0() {
        return this.f17634K == 1;
    }

    protected void setActiveThumbIndex(int i7) {
        this.f17705x0 = i7;
    }

    public void setCentered(boolean z7) {
        if (this.f17670c0 == z7) {
            return;
        }
        this.f17670c0 = z7;
        if (z7) {
            setValues(Float.valueOf((this.f17699u0 + this.f17701v0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f17699u0));
        }
        m21161g1(true);
    }

    void setCustomThumbDrawable(int i7) {
        setCustomThumbDrawable(getResources().getDrawable(i7));
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            drawableArr[i7] = getResources().getDrawable(iArr[i7]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        setLayerType(z7 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i7) {
        if (i7 < 0 || i7 >= this.f17703w0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f17707y0 = i7;
        this.f17694s.m6815V(i7);
        postInvalidate();
    }

    public void setHaloRadius(int i7) {
        if (i7 == this.f17650S) {
            return;
        }
        this.f17650S = i7;
        Drawable background = getBackground();
        if (m21119N0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            AbstractC4498d.m20441m((RippleDrawable) background, this.f17650S);
        }
    }

    public void setHaloRadiusResource(int i7) {
        setHaloRadius(getResources().getDimensionPixelSize(i7));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17631I0)) {
            return;
        }
        this.f17631I0 = colorStateList;
        Drawable background = getBackground();
        if (!m21119N0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f17672d.setColor(m21133V(colorStateList));
        this.f17672d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i7) {
        if (this.f17640N != i7) {
            this.f17640N = i7;
            m21161g1(true);
        }
    }

    public void setLabelFormatter(InterfaceC4585h interfaceC4585h) {
    }

    public void setOrientation(int i7) {
        if (this.f17634K == i7) {
            return;
        }
        this.f17634K = i7;
        m21161g1(true);
    }

    protected void setSeparationUnit(int i7) {
        this.f17665a1 = i7;
        this.f17629H0 = true;
        postInvalidate();
    }

    public void setStepSize(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f7), Float.valueOf(this.f17699u0), Float.valueOf(this.f17701v0)));
        }
        if (this.f17709z0 != f7) {
            this.f17709z0 = f7;
            this.f17629H0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f7) {
        this.f17659W0.m2717f0(f7);
    }

    public void setThumbElevationResource(int i7) {
        setThumbElevation(getResources().getDimension(i7));
    }

    public void setThumbHeight(int i7) {
        if (i7 == this.f17648R) {
            return;
        }
        this.f17648R = i7;
        this.f17659W0.setBounds(0, 0, this.f17646Q, i7);
        Drawable drawable = this.f17660X0;
        if (drawable != null) {
            m21179n(drawable);
        }
        Iterator it = this.f17661Y0.iterator();
        while (it.hasNext()) {
            m21179n((Drawable) it.next());
        }
        m21161g1(false);
    }

    public void setThumbHeightResource(int i7) {
        setThumbHeight(getResources().getDimensionPixelSize(i7));
    }

    public void setThumbRadius(int i7) {
        int i8 = i7 * 2;
        setThumbWidth(i8);
        setThumbHeight(i8);
    }

    public void setThumbRadiusResource(int i7) {
        setThumbRadius(getResources().getDimensionPixelSize(i7));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f17659W0.m2731r0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i7) {
        if (i7 != 0) {
            setThumbStrokeColor(AbstractC5659a.m25174a(getContext(), i7));
        }
    }

    public void setThumbStrokeWidth(float f7) {
        this.f17659W0.m2732s0(f7);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i7) {
        if (i7 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i7));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17659W0.m2697D())) {
            return;
        }
        this.f17659W0.m2718g0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(int i7) {
        if (this.f17652T == i7) {
            return;
        }
        this.f17652T = i7;
        invalidate();
    }

    public void setThumbWidth(int i7) {
        if (i7 == this.f17646Q) {
            return;
        }
        this.f17646Q = i7;
        this.f17659W0.setShapeAppearanceModel(C0627n.m2754a().m2805q(0, this.f17646Q / 2.0f).m2802m());
        this.f17659W0.setBounds(0, 0, this.f17646Q, this.f17648R);
        Drawable drawable = this.f17660X0;
        if (drawable != null) {
            m21179n(drawable);
        }
        Iterator it = this.f17661Y0.iterator();
        while (it.hasNext()) {
            m21179n((Drawable) it.next());
        }
        m21161g1(false);
    }

    public void setThumbWidthResource(int i7) {
        setThumbWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setTickActiveRadius(int i7) {
        if (this.f17619C0 != i7) {
            this.f17619C0 = i7;
            this.f17678f.setStrokeWidth(i7 * 2);
            m21161g1(false);
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17633J0)) {
            return;
        }
        this.f17633J0 = colorStateList;
        this.f17678f.setColor(m21133V(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i7) {
        if (this.f17621D0 != i7) {
            this.f17621D0 = i7;
            this.f17675e.setStrokeWidth(i7 * 2);
            m21161g1(false);
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17635K0)) {
            return;
        }
        this.f17635K0 = colorStateList;
        this.f17675e.setColor(m21133V(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i7) {
        if (this.f17617B0 != i7) {
            this.f17617B0 = i7;
            postInvalidate();
        }
    }

    public void setTickVisible(boolean z7) {
        setTickVisibilityMode(m21200y(z7));
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17637L0)) {
            return;
        }
        this.f17637L0 = colorStateList;
        this.f17666b.setColor(m21133V(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(int i7) {
        if (this.f17664a0 == i7) {
            return;
        }
        this.f17664a0 = i7;
        invalidate();
    }

    public void setTrackHeight(int i7) {
        if (this.f17642O != i7) {
            this.f17642O = i7;
            m21158f0();
            m21161g1(false);
        }
    }

    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f17682h0) {
            return;
        }
        this.f17682h0 = colorStateList;
        m21150c1();
        m21148b1();
        invalidate();
    }

    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.f17679f0) {
            return;
        }
        this.f17679f0 = drawable;
        this.f17681g0 = false;
        m21148b1();
        invalidate();
    }

    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.f17673d0) {
            return;
        }
        this.f17673d0 = drawable;
        this.f17676e0 = false;
        m21150c1();
        invalidate();
    }

    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f17687m0) {
            return;
        }
        this.f17687m0 = colorStateList;
        m21156e1();
        m21153d1();
        invalidate();
    }

    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.f17685k0) {
            return;
        }
        this.f17685k0 = drawable;
        this.f17686l0 = false;
        m21153d1();
        invalidate();
    }

    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f17683i0) {
            return;
        }
        this.f17683i0 = drawable;
        this.f17684j0 = false;
        m21156e1();
        invalidate();
    }

    public void setTrackIconSize(int i7) {
        if (this.f17688n0 == i7) {
            return;
        }
        this.f17688n0 = i7;
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f17639M0)) {
            return;
        }
        this.f17639M0 = colorStateList;
        this.f17663a.setColor(m21133V(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i7) {
        if (this.f17667b0 == i7) {
            return;
        }
        this.f17667b0 = i7;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i7) {
        if (this.f17658W == i7) {
            return;
        }
        this.f17658W = i7;
        this.f17692r.setStrokeWidth(i7);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f7) {
        this.f17699u0 = f7;
        this.f17629H0 = true;
        postInvalidate();
    }

    public void setValueTo(float f7) {
        this.f17701v0 = f7;
        this.f17629H0 = true;
        postInvalidate();
    }

    void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m21115L0(arrayList);
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.g$b */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a */
        int f17711a;

        private b() {
            this.f17711a = -1;
        }

        /* JADX INFO: renamed from: a */
        void m21206a(int i7) {
            this.f17711a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4584g.this.f17694s.m6816W(this.f17711a, 4);
        }

        /* synthetic */ b(AbstractC4584g abstractC4584g, a aVar) {
            this();
        }
    }

    void setCustomThumbDrawable(Drawable drawable) {
        this.f17660X0 = m21155e0(drawable);
        this.f17661Y0.clear();
        postInvalidate();
    }

    void setValues(List<Float> list) {
        m21115L0(new ArrayList(list));
    }

    void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f17660X0 = null;
        this.f17661Y0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f17661Y0.add(m21155e0(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i7) {
        setTrackIconActiveEnd(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    public void setTrackIconActiveStart(int i7) {
        setTrackIconActiveStart(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    public void setTrackIconInactiveEnd(int i7) {
        setTrackIconInactiveEnd(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }

    public void setTrackIconInactiveStart(int i7) {
        setTrackIconInactiveStart(i7 != 0 ? AbstractC5659a.m25175b(getContext(), i7) : null);
    }
}
