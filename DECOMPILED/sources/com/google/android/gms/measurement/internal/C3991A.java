package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C3991A extends AbstractC4003B3 {

    /* JADX INFO: renamed from: c */
    private long f15058c;

    /* JADX INFO: renamed from: d */
    private String f15059d;

    C3991A(C4164X2 c4164x2) {
        super(c4164x2);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: i */
    protected final boolean mo18416i() {
        Calendar calendar = Calendar.getInstance();
        this.f15058c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f15059d = sb.toString();
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final long m18417o() {
        m18437l();
        return this.f15058c;
    }

    /* JADX INFO: renamed from: p */
    public final String m18418p() {
        m18437l();
        return this.f15059d;
    }
}
