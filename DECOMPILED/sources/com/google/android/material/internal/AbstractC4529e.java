package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import p033E.AbstractC0246a;
import p111O.AbstractC1061m0;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.internal.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4529e {
    /* JADX INFO: renamed from: a */
    public static void m20697a(Window window, boolean z7, Integer num, Integer num2) {
        boolean z8 = num == null || num.intValue() == 0;
        boolean z9 = num2 == null || num2.intValue() == 0;
        if (z8 || z9) {
            int iM33171b = AbstractC7539a.m33171b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z8) {
                num = Integer.valueOf(iM33171b);
            }
            if (z9) {
                num2 = Integer.valueOf(iM33171b);
            }
        }
        AbstractC1061m0.m4703b(window, !z7);
        int iM20699c = m20699c(window.getContext(), z7);
        int iM20698b = m20698b(window.getContext(), z7);
        window.setStatusBarColor(iM20699c);
        window.setNavigationBarColor(iM20698b);
        m20702f(window, m20700d(iM20699c, AbstractC7539a.m33177h(num.intValue())));
        m20701e(window, m20700d(iM20698b, AbstractC7539a.m33177h(num2.intValue())));
    }

    /* JADX INFO: renamed from: b */
    private static int m20698b(Context context, boolean z7) {
        if (z7 && Build.VERSION.SDK_INT < 27) {
            return AbstractC0246a.m1182k(AbstractC7539a.m33171b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z7) {
            return 0;
        }
        return AbstractC7539a.m33171b(context, R.attr.navigationBarColor, -16777216);
    }

    /* JADX INFO: renamed from: c */
    private static int m20699c(Context context, boolean z7) {
        if (z7) {
            return 0;
        }
        return AbstractC7539a.m33171b(context, R.attr.statusBarColor, -16777216);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m20700d(int i7, boolean z7) {
        if (AbstractC7539a.m33177h(i7)) {
            return true;
        }
        return i7 == 0 && z7;
    }

    /* JADX INFO: renamed from: e */
    public static void m20701e(Window window, boolean z7) {
        AbstractC1061m0.m4702a(window, window.getDecorView()).m4594c(z7);
    }

    /* JADX INFO: renamed from: f */
    public static void m20702f(Window window, boolean z7) {
        AbstractC1061m0.m4702a(window, window.getDecorView()).m4595d(z7);
    }
}
