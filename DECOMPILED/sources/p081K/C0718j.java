package p081K;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: K.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0718j {

    /* JADX INFO: renamed from: b */
    private static final C0718j f2889b = m3471a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    private final InterfaceC0719k f2890a;

    /* JADX INFO: renamed from: K.j$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private static final Locale[] f2891a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* JADX INFO: renamed from: a */
        static Locale m3480a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: K.j$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static LocaleList m3481a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private C0718j(InterfaceC0719k interfaceC0719k) {
        this.f2890a = interfaceC0719k;
    }

    /* JADX INFO: renamed from: a */
    public static C0718j m3471a(Locale... localeArr) {
        return m3474i(b.m3481a(localeArr));
    }

    /* JADX INFO: renamed from: b */
    public static C0718j m3472b(String str) {
        if (str == null || str.isEmpty()) {
            return m3473d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = a.m3480a(strArrSplit[i7]);
        }
        return m3471a(localeArr);
    }

    /* JADX INFO: renamed from: d */
    public static C0718j m3473d() {
        return f2889b;
    }

    /* JADX INFO: renamed from: i */
    public static C0718j m3474i(LocaleList localeList) {
        return new C0718j(new C0720l(localeList));
    }

    /* JADX INFO: renamed from: c */
    public Locale m3475c(int i7) {
        return this.f2890a.get(i7);
    }

    /* JADX INFO: renamed from: e */
    public boolean m3476e() {
        return this.f2890a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0718j) && this.f2890a.equals(((C0718j) obj).f2890a);
    }

    /* JADX INFO: renamed from: f */
    public int m3477f() {
        return this.f2890a.size();
    }

    /* JADX INFO: renamed from: g */
    public String m3478g() {
        return this.f2890a.mo3482a();
    }

    /* JADX INFO: renamed from: h */
    public Object m3479h() {
        return this.f2890a.mo3483b();
    }

    public int hashCode() {
        return this.f2890a.hashCode();
    }

    public String toString() {
        return this.f2890a.toString();
    }
}
