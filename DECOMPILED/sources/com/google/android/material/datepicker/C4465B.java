package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.google.android.material.datepicker.B */
/* JADX INFO: loaded from: classes2.dex */
class C4465B {

    /* JADX INFO: renamed from: c */
    private static final C4465B f16836c = new C4465B(null, null);

    /* JADX INFO: renamed from: a */
    private final Long f16837a;

    /* JADX INFO: renamed from: b */
    private final TimeZone f16838b;

    private C4465B(Long l7, TimeZone timeZone) {
        this.f16837a = l7;
        this.f16838b = timeZone;
    }

    /* JADX INFO: renamed from: c */
    static C4465B m20208c() {
        return f16836c;
    }

    /* JADX INFO: renamed from: a */
    Calendar m20209a() {
        return m20210b(this.f16838b);
    }

    /* JADX INFO: renamed from: b */
    Calendar m20210b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l7 = this.f16837a;
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        return calendar;
    }
}
