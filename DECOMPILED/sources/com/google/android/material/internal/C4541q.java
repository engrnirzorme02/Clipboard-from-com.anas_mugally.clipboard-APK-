package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p045F3.AbstractC0426f;
import p045F3.C0424d;

/* JADX INFO: renamed from: com.google.android.material.internal.q */
/* JADX INFO: loaded from: classes2.dex */
public class C4541q {

    /* JADX INFO: renamed from: c */
    private float f17370c;

    /* JADX INFO: renamed from: d */
    private float f17371d;

    /* JADX INFO: renamed from: g */
    private C0424d f17374g;

    /* JADX INFO: renamed from: a */
    private final TextPaint f17368a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    private final AbstractC0426f f17369b = new a();

    /* JADX INFO: renamed from: e */
    private boolean f17372e = true;

    /* JADX INFO: renamed from: f */
    private WeakReference f17373f = new WeakReference(null);

    /* JADX INFO: renamed from: com.google.android.material.internal.q$a */
    class a extends AbstractC0426f {
        a() {
        }

        @Override // p045F3.AbstractC0426f
        /* JADX INFO: renamed from: a */
        public void mo1813a(int i7) {
            C4541q.this.f17372e = true;
            b bVar = (b) C4541q.this.f17373f.get();
            if (bVar != null) {
                bVar.mo4068a();
            }
        }

        @Override // p045F3.AbstractC0426f
        /* JADX INFO: renamed from: b */
        public void mo1814b(Typeface typeface, boolean z7) {
            if (z7) {
                return;
            }
            C4541q.this.f17372e = true;
            b bVar = (b) C4541q.this.f17373f.get();
            if (bVar != null) {
                bVar.mo4068a();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.q$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4068a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C4541q(b bVar) {
        m20805j(bVar);
    }

    /* JADX INFO: renamed from: c */
    private float m20798c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f17368a.getFontMetrics().ascent);
    }

    /* JADX INFO: renamed from: d */
    private float m20799d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f17368a.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: i */
    private void m20800i(String str) {
        this.f17370c = m20799d(str);
        this.f17371d = m20798c(str);
        this.f17372e = false;
    }

    /* JADX INFO: renamed from: e */
    public C0424d m20801e() {
        return this.f17374g;
    }

    /* JADX INFO: renamed from: f */
    public float m20802f(String str) {
        if (!this.f17372e) {
            return this.f17371d;
        }
        m20800i(str);
        return this.f17371d;
    }

    /* JADX INFO: renamed from: g */
    public TextPaint m20803g() {
        return this.f17368a;
    }

    /* JADX INFO: renamed from: h */
    public float m20804h(String str) {
        if (!this.f17372e) {
            return this.f17370c;
        }
        m20800i(str);
        return this.f17370c;
    }

    /* JADX INFO: renamed from: j */
    public void m20805j(b bVar) {
        this.f17373f = new WeakReference(bVar);
    }

    /* JADX INFO: renamed from: k */
    public void m20806k(C0424d c0424d, Context context) {
        if (this.f17374g != c0424d) {
            this.f17374g = c0424d;
            if (c0424d != null) {
                c0424d.m1850q(context, this.f17368a, this.f17369b);
                b bVar = (b) this.f17373f.get();
                if (bVar != null) {
                    this.f17368a.drawableState = bVar.getState();
                }
                c0424d.m1849p(context, this.f17368a, this.f17369b);
                this.f17372e = true;
            }
            b bVar2 = (b) this.f17373f.get();
            if (bVar2 != null) {
                bVar2.mo4068a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m20807l(boolean z7) {
        this.f17372e = z7;
    }

    /* JADX INFO: renamed from: m */
    public void m20808m(boolean z7) {
        this.f17372e = z7;
    }

    /* JADX INFO: renamed from: n */
    public void m20809n(Context context) {
        this.f17374g.m1849p(context, this.f17368a, this.f17369b);
    }
}
