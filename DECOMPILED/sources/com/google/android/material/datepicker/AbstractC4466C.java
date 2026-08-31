package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p325p3.AbstractC6750k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.C */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4466C {

    /* JADX INFO: renamed from: a */
    static AtomicReference f16839a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    static long m20211a(long j7) {
        Calendar calendarM20223m = m20223m();
        calendarM20223m.setTimeInMillis(j7);
        return m20215e(calendarM20223m).getTimeInMillis();
    }

    /* JADX INFO: renamed from: b */
    static DateFormat m20212b(Locale locale) {
        return m20213c("MMMd", locale);
    }

    /* JADX INFO: renamed from: c */
    private static DateFormat m20213c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m20222l());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* JADX INFO: renamed from: d */
    static String m20214d(String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    /* JADX INFO: renamed from: e */
    static Calendar m20215e(Calendar calendar) {
        Calendar calendarM20224n = m20224n(calendar);
        Calendar calendarM20223m = m20223m();
        calendarM20223m.set(calendarM20224n.get(1), calendarM20224n.get(2), calendarM20224n.get(5));
        return calendarM20223m;
    }

    /* JADX INFO: renamed from: f */
    static SimpleDateFormat m20216f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(m20214d(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(m20220j());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: g */
    static String m20217g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(AbstractC6750k.f26491M);
        String string2 = resources.getString(AbstractC6750k.f26490L);
        String string3 = resources.getString(AbstractC6750k.f26489K);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* JADX INFO: renamed from: h */
    static DateFormat m20218h(Locale locale) {
        return m20213c("MMMMEEEEd", locale);
    }

    /* JADX INFO: renamed from: i */
    static C4465B m20219i() {
        C4465B c4465b = (C4465B) f16839a.get();
        return c4465b == null ? C4465B.m20208c() : c4465b;
    }

    /* JADX INFO: renamed from: j */
    private static TimeZone m20220j() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: k */
    static Calendar m20221k() {
        Calendar calendarM20209a = m20219i().m20209a();
        calendarM20209a.set(11, 0);
        calendarM20209a.set(12, 0);
        calendarM20209a.set(13, 0);
        calendarM20209a.set(14, 0);
        calendarM20209a.setTimeZone(m20220j());
        return calendarM20209a;
    }

    /* JADX INFO: renamed from: l */
    private static android.icu.util.TimeZone m20222l() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: m */
    static Calendar m20223m() {
        return m20224n(null);
    }

    /* JADX INFO: renamed from: n */
    static Calendar m20224n(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m20220j());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    /* JADX INFO: renamed from: o */
    static DateFormat m20225o(Locale locale) {
        return m20213c("yMMMd", locale);
    }

    /* JADX INFO: renamed from: p */
    static DateFormat m20226p(Locale locale) {
        return m20213c("yMMMM", locale);
    }

    /* JADX INFO: renamed from: q */
    static DateFormat m20227q(Locale locale) {
        return m20213c("yMMMMEEEEd", locale);
    }
}
