package p130Q4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p179X4.C1964K;

/* JADX INFO: renamed from: Q4.a */
/* JADX INFO: loaded from: classes.dex */
public class C1288a {

    /* JADX INFO: renamed from: a */
    private final SimpleDateFormat f4573a;

    /* JADX INFO: renamed from: b */
    private final C1964K f4574b;

    public C1288a(C1964K c1964k) {
        this.f4574b = c1964k;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f4573a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }
}
