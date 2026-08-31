package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzbzu;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3486m0 {

    /* JADX INFO: renamed from: a */
    private final View f14269a;

    /* JADX INFO: renamed from: b */
    private Activity f14270b;

    /* JADX INFO: renamed from: c */
    private boolean f14271c;

    /* JADX INFO: renamed from: d */
    private boolean f14272d;

    /* JADX INFO: renamed from: e */
    private boolean f14273e;

    /* JADX INFO: renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f14274f;

    public C3486m0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f14270b = activity;
        this.f14269a = view;
        this.f14274f = onGlobalLayoutListener;
    }

    /* JADX INFO: renamed from: f */
    private final void m17536f() {
        if (this.f14271c) {
            return;
        }
        Activity activity = this.f14270b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f14274f;
            ViewTreeObserver viewTreeObserverM17538h = m17538h(activity);
            if (viewTreeObserverM17538h != null) {
                viewTreeObserverM17538h.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f14269a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f14274f;
        C7351t.m32345c();
        zzbzu.zza(view, onGlobalLayoutListener2);
        this.f14271c = true;
    }

    /* JADX INFO: renamed from: g */
    private final void m17537g() {
        Activity activity = this.f14270b;
        if (activity != null && this.f14271c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f14274f;
            ViewTreeObserver viewTreeObserverM17538h = m17538h(activity);
            if (viewTreeObserverM17538h != null) {
                viewTreeObserverM17538h.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f14271c = false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static ViewTreeObserver m17538h(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* JADX INFO: renamed from: a */
    public final void m17539a(Activity activity) {
        this.f14270b = activity;
    }

    /* JADX INFO: renamed from: b */
    public final void m17540b() {
        this.f14273e = true;
        if (this.f14272d) {
            m17536f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17541c() {
        this.f14273e = false;
        m17537g();
    }

    /* JADX INFO: renamed from: d */
    public final void m17542d() {
        this.f14272d = true;
        if (this.f14273e) {
            m17536f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17543e() {
        this.f14272d = false;
        m17537g();
    }
}
