package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p104N.C0906c;
import p325p3.AbstractC6750k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4478j {
    /* JADX INFO: renamed from: a */
    static C0906c m20286a(Long l7, Long l8) {
        return m20287b(l7, l8, null);
    }

    /* JADX INFO: renamed from: b */
    static C0906c m20287b(Long l7, Long l8, SimpleDateFormat simpleDateFormat) {
        if (l7 == null && l8 == null) {
            return C0906c.m4129a(null, null);
        }
        if (l7 == null) {
            return C0906c.m4129a(null, m20289d(l8.longValue(), simpleDateFormat));
        }
        if (l8 == null) {
            return C0906c.m4129a(m20289d(l7.longValue(), simpleDateFormat), null);
        }
        Calendar calendarM20221k = AbstractC4466C.m20221k();
        Calendar calendarM20223m = AbstractC4466C.m20223m();
        calendarM20223m.setTimeInMillis(l7.longValue());
        Calendar calendarM20223m2 = AbstractC4466C.m20223m();
        calendarM20223m2.setTimeInMillis(l8.longValue());
        if (simpleDateFormat != null) {
            return C0906c.m4129a(simpleDateFormat.format(new Date(l7.longValue())), simpleDateFormat.format(new Date(l8.longValue())));
        }
        if (calendarM20223m.get(1) == calendarM20223m2.get(1)) {
            return calendarM20223m.get(1) == calendarM20221k.get(1) ? C0906c.m4129a(m20292g(l7.longValue(), Locale.getDefault()), m20292g(l8.longValue(), Locale.getDefault())) : C0906c.m4129a(m20292g(l7.longValue(), Locale.getDefault()), m20299n(l8.longValue(), Locale.getDefault()));
        }
        return C0906c.m4129a(m20299n(l7.longValue(), Locale.getDefault()), m20299n(l8.longValue(), Locale.getDefault()));
    }

    /* JADX INFO: renamed from: c */
    static String m20288c(long j7) {
        return m20289d(j7, null);
    }

    /* JADX INFO: renamed from: d */
    static String m20289d(long j7, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j7));
        }
        return m20302q(j7) ? m20291f(j7) : m20298m(j7);
    }

    /* JADX INFO: renamed from: e */
    static String m20290e(Context context, long j7, boolean z7, boolean z8, boolean z9) {
        String strM20295j = m20295j(j7);
        if (z7) {
            strM20295j = String.format(context.getString(AbstractC6750k.f26492N), strM20295j);
        }
        if (z8) {
            return String.format(context.getString(AbstractC6750k.f26488J), strM20295j);
        }
        return z9 ? String.format(context.getString(AbstractC6750k.f26523w), strM20295j) : strM20295j;
    }

    /* JADX INFO: renamed from: f */
    static String m20291f(long j7) {
        return m20292g(j7, Locale.getDefault());
    }

    /* JADX INFO: renamed from: g */
    static String m20292g(long j7, Locale locale) {
        return AbstractC4466C.m20212b(locale).format(new Date(j7));
    }

    /* JADX INFO: renamed from: h */
    static String m20293h(long j7) {
        return m20294i(j7, Locale.getDefault());
    }

    /* JADX INFO: renamed from: i */
    static String m20294i(long j7, Locale locale) {
        return AbstractC4466C.m20218h(locale).format(new Date(j7));
    }

    /* JADX INFO: renamed from: j */
    static String m20295j(long j7) {
        return m20302q(j7) ? m20293h(j7) : m20300o(j7);
    }

    /* JADX INFO: renamed from: k */
    static String m20296k(Context context, int i7) {
        return AbstractC4466C.m20221k().get(1) == i7 ? String.format(context.getString(AbstractC6750k.f26480B), Integer.valueOf(i7)) : String.format(context.getString(AbstractC6750k.f26481C), Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: l */
    static String m20297l(long j7) {
        return AbstractC4466C.m20226p(Locale.getDefault()).format(new Date(j7));
    }

    /* JADX INFO: renamed from: m */
    static String m20298m(long j7) {
        return m20299n(j7, Locale.getDefault());
    }

    /* JADX INFO: renamed from: n */
    static String m20299n(long j7, Locale locale) {
        return AbstractC4466C.m20225o(locale).format(new Date(j7));
    }

    /* JADX INFO: renamed from: o */
    static String m20300o(long j7) {
        return m20301p(j7, Locale.getDefault());
    }

    /* JADX INFO: renamed from: p */
    static String m20301p(long j7, Locale locale) {
        return AbstractC4466C.m20227q(locale).format(new Date(j7));
    }

    /* JADX INFO: renamed from: q */
    private static boolean m20302q(long j7) {
        Calendar calendarM20221k = AbstractC4466C.m20221k();
        Calendar calendarM20223m = AbstractC4466C.m20223m();
        calendarM20223m.setTimeInMillis(j7);
        return calendarM20221k.get(1) == calendarM20223m.get(1);
    }
}
